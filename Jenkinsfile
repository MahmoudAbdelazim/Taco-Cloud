pipeline {
    agent { docker { image 'maven:3.8.6-openjdk-11-slim' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
                sh 'mvn clean'
                sh 'mvn compiler:compile'
                sh 'mvn compiler:testCompile'
                sh 'mvn package'
                sh 'mvn install'
                sh 'mvn test'
                sh 'mvn verify'
            }
        }
    }
}