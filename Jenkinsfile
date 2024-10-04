pipeline {
    agent any
    stages {
        stage('Build Product Service') {
            steps {
                dir('project-service') {
                    sh 'mvn clean package'
                }
            }
        }
        stage('Build Customer service') {
            steps {
                dir('customer-service') {
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
            }
        }
        
    }
}
