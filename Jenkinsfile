pipeline {
    agent any

    tools {
        jdk 'JDK 17'
        maven 'M3'
    }
    
    triggers {
        githubPush()
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean package'
            }
            post {
                always {
                    jacoco execPattern: '**/target/jacoco.exec',
                           classPattern: '**/target/classes',
                           sourcePattern: '**/src/main/java',
                           exclusionPattern: '**/src/test*'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                bat "docker build -t outcome-curr-app:latest ."
            }
        }

        stage('Run Application in Docker') {
            steps {
                bat '''
                    docker run -d --name outcome-curr-container -p 9992:9992 outcome-curr-app:latest
                '''
            }
        }
    }

    post {
        always {
            bat '''
                docker stop outcome-curr-container || exit 0
                docker rm outcome-curr-container || exit 0
                docker rmi ${DOCKER_IMAGE} || exit 0
            '''
        }

        success {
            echo 'Pipeline completado con éxito.'
        }

        failure {
            echo 'Pipeline falló. Revisa los logs para más detalles.'
        }
    }
}
