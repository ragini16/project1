pipeline { 
    agent any 
    stages {
         stage('Checkout') {
                steps {
                //sh "git config --global http.sslverify false"
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '5e1ca622-6e58-4c9f-b29b-2d5ea7c09aab', url: 'https://github.com/ragini16/project1.git']]])
            }
        }
        stage('Build & Test'){
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Deploy') {
            steps {
                sh 'make publish'
            }
        }
    }
}
