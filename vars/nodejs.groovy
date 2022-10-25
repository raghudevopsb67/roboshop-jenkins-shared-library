def call() {
  node {

      sh 'env'
      common.codeQuality()

//      if ( branch == "main" || tag ==~ "*" ) {
//        stage('Style Checks') {
//          echo 'Code Quality'
//        }
//      }

//
//      stage('Unit Tests') {
//        when {
//          anyOf {
//            branch 'main'
//            tag "*"
//          }
//        }
//        steps {
//          echo 'Unit tests'
//        }
//      }
//
//      stage('Download Dependencies') {
//        when { tag "*" }
//        steps {
//          echo 'Download Dependencies'
//        }
//      }
//
//      stage('Prepare Artifact') {
//        when { tag "*" }
//        steps {
//          echo 'Prepare Artifact'
//        }
//      }
//
//      stage('Publish Artifact') {
//        when { tag "*" }
//        steps {
//          echo 'Publish Artifact'
//        }
//      }


  }

}