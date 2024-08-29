pipeline{
   agent any

  stages{
    stage('build') {
      steps{
        sh '''
        echo "Build Docker image on `hostname`"
        docker image build -t app_image:1.0 ${WORKSPACE}/docker
        '''
         }
      }
    stage('test') {
      steps{
        sh '''
        echo "Test is successful on build stage"
        docker image ls | grep app_image
        '''
         }
      }
    stage('Deploy') {
      steps{
        sh '''
        docker container run -d --name c1 -p 9000:80 app_image:1.0
        echo "Deploy Docker image on `hostname`"
        '''
         }
      }
     stage('verify'){
                         steps{
                                 sh '''
                                        docker container ls | grep c1
                                 '''
                         }
                 }
          }  
  
}
