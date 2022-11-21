def call() {
  pipeline {
    agent any

    parameters {
      choice(name: 'ENV', choices: ['', 'dev', 'prod'], description: 'Environment')
      choice(name: 'ACTION', choices: ['', 'apply', 'destroy'], description: 'Action')
    }

    stages {

      stage('Terraform') {
        sh '''
          rm -rf .terraform*
          terrafile -f env-${ENV}/Terrafile
          terraform init -backend-config=env-${ENV}/backend.tfvars
          terraform ${ACTION} -auto-approve -var-file=env-${ENV}/main.tfvars
        '''
      }


    }

  }
}

