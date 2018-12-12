pipeline {
 agent any
stages {
 stage('CodeCheckout') {
 steps {
 script {
    checkout scm
     def mvnHome = tool 'maven-3'
     def javaHome = tool 'java8'
     }
    }
   }
   
 stage('build customer app code') { 
 steps {
  script {
       echo "I am here"
    def mvnHome = tool 'maven-3'
     def javaHome = tool 'java8'
        sh 'mvn clean install'
    }
  }
 }
}
}
