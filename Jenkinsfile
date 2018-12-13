pipeline {
 agent any
stages {
 stage('CodeCheckout') {
 steps {
 script {
    checkout scm
     echo "Executing CodeCheckout Stage"
     sh 'pwd'
     sh 'whoami'
     def mvnHome = tool 'maven-3'
     }
    }
   } /* codecheckout stage */
   
 stage('build customer app code') { 
 steps {
  script {
     echo "I moved to build customer app code"
     sh 'mvn clean install'
    }
  }
 } /* build stage */
} /* stages */
} /* pipeline */
