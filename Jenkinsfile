pipeline {
    agent any

    tools {
        maven 'Maven3'
    }

    stages {

        stage('Clean Workspace') {
            steps {
                deleteDir()
            }
        }

        stage('Checkout Code') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/naval98/ParaBankAutomationproject_Selenium.git'
            }
        }

        stage('Build & Execute Tests') {
            steps {
                bat 'mvn clean test'
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
            junit 'target/surefire-reports/*.xml'
            archiveArtifacts artifacts: 'target/**/*.html', allowEmptyArchive: true
        }

        success {
            echo 'Build Successful - All Tests Passed'
        }

        unstable {
            echo 'Build Unstable - Check Test Results'
        }

        failure {
            echo 'Build Failed'
        }
    }
}