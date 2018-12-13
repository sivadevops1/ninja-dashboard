pipeline {
 agent any
stages {
 stage('CodeCheckout') {
 steps {
 script {
    checkout scm
     def mvnHome = tool 'maven-3'
     }
    }
   } /* codecheckout stage */
   
 stage('build customer app code') { 
 steps {
  script {
       echo "I am here"
    def mvnHome = tool 'maven-3'
     sh 'mvn clean install'
    }
  }
 } /* build stage */
} /* stages */
} /* pipeline */
