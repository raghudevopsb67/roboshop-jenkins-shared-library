def call() {
  pipeline {

    agent any

    stages {

      stage('Code Quality') {
        steps {
          echo 'Code Quality'
          sh 'env'
        }
      }

      stage('Style Checks') {
        when {
          anyOf {
            branch 'main'
            tag "*"
          }
        }
        steps {
          echo 'Code Quality'
        }
      }

      stage('Unit Tests') {
        when {
          anyOf {
            branch 'main'
            tag "*"
          }
        }
        steps {
          echo 'Unit tests'
        }
      }

      stage('Prepare Artifact') {
        when { tag "*" }
        steps {
          echo 'Prepare Artifact'
        }
      }

      stage('Publish Artifact') {
        when { tag "*" }
        steps {
          echo 'Publish Artifact'
        }
      }


    }

  }


}