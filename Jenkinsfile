pipeline {
    agent any
    stages {
        stage('init test maven repositories') {
            steps {
                node('Ubuntu_204_agent'){
                    sh 'curl -I -X GET https://devops.softproject.de/repository/releases/'
                    sh 'curl -I -X GET https://devops.softproject.de/repository/snapshots/'
                    sh 'curl -I -X GET https://devops.softproject.de/repository/x1/'
                    sh 'curl -I -X GET https://devops.softproject.de/repository/x4/'
                }
            }
        }
    }
}