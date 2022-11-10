pipeline {
    agent any
    stages{
        stage('Example') {
            steps {
                echo "Build number: ${env.Build_Number}"
            }
        }
    }
}