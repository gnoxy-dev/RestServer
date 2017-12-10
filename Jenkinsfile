
pipeline {
    agent any
    tools {
            maven 'maven-3.3.9'
            jdk 'jdk1.8.0_144'
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}


