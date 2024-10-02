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
                sh 'docker compose build'
                sh 'docker images'
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
