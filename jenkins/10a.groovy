pipeline {
    agent any

    stages {
        stage('Use Artifacts') {
            steps {
                // Copy artifacts from Job 1
            
copyArtifacts ( filter:
               'artifact.txt ,artifact2.txt', fingerprintArtifacts: true, projectName: 'task10.groovy', selector: lastSuccessful()
              )
                // Use the artifacts
                sh 'cat artifact.txt'
                sh 'cat artifact2.txt'
            }
        }
    }
}

