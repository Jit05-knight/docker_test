pipeline {
  agent any
  stages {
    stage("Clean up"){
      steps {
        deleteDir()
      }
    }
    stage("Clone Repo"){
      steps {
        sh "git clone https://github.com/Jit05-knight/simple-java-maven-app"
      }
    }
    stage("Build"){
      steps {
        dir("simple-java-maven-app") {
          sh "mvn clean install"
        }
      }
    }
    stage("Test"){
      steps{
        dir("simple-java-maven-app") {
          sh "mvn test"
      }
    }
  }
  stage("Build Remote"){
    steps{
      build job: 'boolPipeline', parameters: [[$class: 'BooleanParameterValue', name: 'myBoolean', value: true ]]
    }
  }
}
}