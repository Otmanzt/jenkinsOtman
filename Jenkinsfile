pipeline {
    agent any
    stages {
        stage('init test maven repositories') {
            steps {
                node('Ubuntu_204_agent'){
                    script{
                        curl1 = sh 'curl -I -X GET https://devops.softproject.de/repository/releases/'
                        curl2 = sh 'curl -I -X GET https://devops.softproject.de/repository/snapshots/'
                        curl3 = sh 'curl -I -X GET https://devops.softproject.de/repository/x1/'
                        curl4 = sh 'curl -I -X GET https://devops.softproject.de/repository/x4/'
                        curl5 = curl1 && curl2 && curl3 && curl4
                        if (curl5){
                            stage('correcto'){
                                echo 'correcto'
                            }
                        }else {
                            stage('fallo'){
                                echo 'Fail'
                            }
                        }
                    }
                }
            }
        }
    }
}