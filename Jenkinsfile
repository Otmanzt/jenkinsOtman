pipeline {
    agent any
    stages {
        stage('init test maven repositories') {
            steps {
                node('Ubuntu_204_agent'){
                    script{
                        final Boolean curl1 = sh(script: "curl -I -X GET https://devops.softproject.de/repository/releases/", returnStdout: true).trim()
                        final Boolean curl2 = sh(script: "curl -I -X GET https://devops.softproject.de/repository/snapshots/", returnStdout: true).trim()
                        final Boolean curl3 = sh(script: "curl -I -X GET https://devops.softproject.de/repository/x1/", returnStdout: true).trim()
                        final Boolean curl4 = sh(script: "curl -I -X GET https://devops.softproject.de/repository/x4/", returnStdout: true).trim()
                        final Boolean curl5 = curl1 && curl2 && curl3 && curl4
                        if (curl5){
                            stage('Correct'){
                                echo 'Correct'
                            }
                        }else {
                            stage('Fail'){
                                echo 'Fail'
                            }
                        }
                    }
                }
            }
        }
    }
}