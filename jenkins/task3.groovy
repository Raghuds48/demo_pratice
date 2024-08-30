
pipeline {
    agent any

    stages {
        stage('stage1') {
           steps {
                sh 'touch file1.txt'
                }
            }
 stage('stage2') {
                        steps {
                sh 'touch file2.txt'
                }
            } 
stage('stage3') {
            
            steps {
                sh 'touch file3.txt'
                }
            } 
stage('stage4') {
            
            steps {
                sh 'ls'
                }
            } 
stage('stage5') {
            agent {
                label 'NODE1'
                  }
            steps {
                deleteDir()
                }
            } 
   stage('stage6') {
            
            steps {
                sh 'touch file4.txt'
                }
            }
 stage('stage7') {
            agent {
                label 'NODE2'
                  }
            steps {
                sh 'touch file5.txt'
                }
            } 
stage('stage8') {
           steps {
                sh 'touch file6.txt'
                }
}
             
stage('stage9') {
            
            steps {
                sh 'ls'
                }
            } 
stage('stage10') {
            
            steps {
                deleteDir()
                }
            }      
    }
}
