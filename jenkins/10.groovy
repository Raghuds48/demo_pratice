pipeline {
    agent any

    stages {
        stage('Create artifacts') {
            steps {
                script {
                    // Create some files to archive
                    sh 'echo "Hello World" > artifact.txt'
                    sh 'echo "This is another artifact" > artifact2.txt'

                    // Archive the files
                    archiveArtifacts artifacts: 'artifact.txt, artifact2.txt'
                }
            }
        }
    }
}
