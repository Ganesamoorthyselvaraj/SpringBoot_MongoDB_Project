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
            // Ensure you are in the correct directory where docker-compose.yaml is located
            sh 'docker-compose -f path/to/docker-compose.yaml build'
            sh 'docker images'
        }
    }
}

        stage('Docker Deploy') {
            steps {
                sh 'docker compose up -d'
                sh 'docker ps'
            }
        }
    }
}
