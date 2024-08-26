pipeline {
    agent any

    stages {
        stage('Create artifacts') {
            steps {
                script {
                    // Set the offset value
                    def offset = "-"

                    // Get the current date and time in the desired format
                    def dateTime = new Date().format("yyyy-MM-dd HH:mm:ss")

                    // Check the current build result
                    if (currentBuild.result == null || currentBuild.result == 'SUCCESS' ) {
                        // Set the display name for a successful build
                        currentBuild.displayName =  (currentBuild.number + offset) + "pass" + " - " + dateTime
                    } else {
                        // Set the display name for a failed build
                        currentBuild.displayName =  (currentBuild.number + offset) + "fail" + " - " + dateTime
                    }
                    
                    // Print the custom display name to the console
                    echo "Custom build display name: ${currentBuild.displayName}"
                    
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
