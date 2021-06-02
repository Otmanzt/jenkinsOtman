pipeline {
    agent Ubuntu_204_agent
    stages {
        stage('init test maven repositories') {
            steps {
                sh 'curl -I -X GET https://devops.softproject.de/repository/releases/'
                sh 'curl -I -X GET https://devops.softproject.de/repository/snapshots/'
                sh 'curl -I -X GET https://devops.softproject.de/repository/x1/'
                sh 'curl -I -X GET https://devops.softproject.de/repository/x4/'
            }
        }
    }
}