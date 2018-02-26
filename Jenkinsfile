pipeline { 
    agent any 
    stages {
         stage('Checkout') {
            agent { label 'jenkinsslave' }
                steps {
                //sh "export GIT_SSL_NO_VERIFY=1"
                //sh "git config --global http.sslverify false"
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'olam', url: 'https://github.com/ragini16/project1.git']]])
            }
        }
        stage('Build & Test'){
            steps {
                sh 'mvnn clean install -f project1/pom.xml'

            }
        }
        stage('Deploy') {
            steps {
                sh 'make publish'
            }
        }
    }
}