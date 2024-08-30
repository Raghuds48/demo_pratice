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
        docker rm -f c1
        docker container run -d --rm --name c1 app_image:1.0 /bin/bash
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
