pipeline {
    agent { docker { image 'openjdk:11' } }
    stages {
        stage ('Checkout') {
            steps {
                git 'https://github.com/MahmoudAbdelazim/Taco-Cloud'
            }
        }
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