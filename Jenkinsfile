// @Library('test-shared-lib')_
// def getVar() {
//   echo "HEllo world from jenkinsfile"
// }
// stage('Print Build Info') {
//     utils(this.&getVar)
// } 
// stage("Static method test"){
//      utils.test(this.&getVar)
// }

@Library('test-shared-lib')_


pipeline {
    agent any
    stages{  
      stage('Demo') {
      steps{
        echo 'Hello world'
        sayHello 'test'
        sayHello.test 'Daniyal'
      
      }
      }
   }
  }

