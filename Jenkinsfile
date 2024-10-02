pipeline {
    agent any
    stages {
        stage('Build Product Service') {
            steps {
                dir('product-service') {
                    sh 'mvn clean package'
                }
            }
        }
        stage('Build User Service') {
            steps {
                dir('user-service') {
                    sh 'mvn clean package'
                }
            }
        }
        stage('Docker Build') {
            steps {
                script {
                withCredentials([usernamePassword(credentialsId: 'dockerhub-credentials', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
                        sh 'docker login -u $DOCKER_USERNAME -p $DOCKER_PASSWORD'
                        sh 'docker-compose -f path/to/docker-compose.yaml build'
                        sh 'docker images'
                }
            }
        }
        stage('Docker Deploy') {
            steps {
                script {
                    // Ensure you are in the correct directory where docker-compose.yaml is located
                    sh 'docker-compose -f path/to/docker-compose.yaml up -d'
                    sh 'docker ps'
                }
            }
        }
    }
}
