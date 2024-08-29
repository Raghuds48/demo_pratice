pipeline{
   agent any

  stages{
    stage('build') {
      steps{
        sh '''
        echo "Build is successful on build stage"
        '''
         }
      }
    stage('test') {
      steps{
        sh '''
        echo "Test is successful on build stage"
        '''
         }
      }
    stage('Deploy') {
      steps{
        sh '''
        echo "Deploy successful on Deploy stage"
        '''
         }
      }
  }  
  
}
