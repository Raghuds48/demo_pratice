Library("my-shared-library") _
pipeline {
    agent any
    stages {
        stage('Greetings') {
            steps {
                //define helloWorld using shared library in VAR Directory
                helloWorld()
            }
        }  
     }
}
