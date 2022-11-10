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
        sh "git clone https://github.com/Jit05-knight/docker_test"
      }
    }
    stage("Build"){
      steps {
        dir("docker_test") {
          sh ".jenkins.yml"
        }
      }
    }
  }
}