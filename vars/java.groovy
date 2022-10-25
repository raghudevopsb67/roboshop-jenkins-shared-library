def call() {
  pipeline {

    agent any

    stages {

      stage('Compile Code'){
        steps {
          echo 'Compile Code'
        }
      }

      stage('Code Quality') {
        steps {
          echo 'Code Quality'
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
          echo 'Style Checks'
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

      stage('Build Package') {
        when { tag "*" }
        steps {
          echo 'Download Dependencies'
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