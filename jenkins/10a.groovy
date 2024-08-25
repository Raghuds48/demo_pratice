pipeline {
    agent any

    stages {
        stage('Use Artifacts') {
            steps {
                // Copy artifacts from Job 1
                copyArtifact(
                    projectName: '10.groovy',
                    filter: 'artifact.txt, artifact2.txt'
                )

                // Use the artifacts
                sh 'cat artifact.txt'
                sh 'cat artifact2.txt'
            }
        }
    }
}

