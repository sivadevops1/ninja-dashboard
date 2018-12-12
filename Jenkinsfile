pipeline {
    agent any
    stages {
        stage('CodeCheckOut') {
            steps {
                script {
                    checkout scm
                    def mvnHome = tool 'maven-3'
                }
            }
        }
        
		    stage('User Input') {
           steps {
               input ('Do you want to proceed?')
			  }
	   	} 
       stage('Build Customer app code') {
            steps {
                script {

                    
                    checkout scm
                    def mvnHome = tool 'maven-3'
                    try {
                        sh "mvn clean install -U -Dmaven.test.skip=true"
                        currentBuild.result = 'SUCCESS'
                    } catch (Exception err) {
                        currentBuild.result = 'FAILURE'
                        sh "exit 1"
                    }
                    echo "RESULT: ${currentBuild.result}"
                }
            }
        }
}
}
