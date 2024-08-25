pipeline {
    agent any

    stages {
        stage('Use artifacts from other job') {
            steps {
                // Copy artifacts from another job
                copyArtifact(
                    projectName: 'OTHER_JOB_NAME',
                    filter: 'artifact.txt'
                )

                // Use the artifacts in your current job
                sh 'cat artifact.txt'
            }
        }
    }
}
