pipeline {
    agent any
    tools {
        maven 'Maven_Add'
    }
    stages {
        stage('Get maven version from pom') {
            steps {
                sh 'mvn --version'
            }
        }
        stage('build Real') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('package') {
            steps {
                sh 'mvn package -DskipTests' 
            }
        }
    }

}
