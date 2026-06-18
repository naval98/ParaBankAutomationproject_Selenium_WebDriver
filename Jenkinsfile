pipeline {
    agent any

    tools {
        maven 'Maven3'
    }

    stages {

        stage('Build Project') {
            steps {
                bat 'mvn clean'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvn test -Dmaven.test.failure.ignore=true'
            }
        }

        stage('Generate Allure Report') {
            steps {
                allure includeProperties: false,
                       results: [[path: 'allure-results']]
            }
        }
    }

    post {
        always {
            junit allowEmptyResults: true,
                  testResults: 'target/surefire-reports/*.xml'
        }
    }
}