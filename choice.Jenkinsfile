pipeline {
    agent any

    parameters {
        choice(choices: ["TEST", "DEV", "QA", "PRE-PROD", "PROD"], description: "Which environment to deploy", name: "deployEnv")
    }

    stages {
        stage("Demo"){
            steps {
                echo "Choice is set to: ${params.deployEnv}"
            }
        }
    }
}