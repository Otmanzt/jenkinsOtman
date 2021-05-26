// CODE_CHANGES = getGitChanges()
def gv
pipeline {

    agent any

    environment {
        NEW_VERSION = '1.3.0'
        SERVER_CREDENTIALS = credentials('otmanzt')
    }

    // tools{
    //     maven 'Maven'
    // }

    parameters {
        // string(name: 'VERSION', defaultvalue: '', description: 'version to deploy on prod')
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0'], description: '')
        booleanParam(name: 'executeTest', defaultValue: true, description: '')
    }

    stages {
        stage("init") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }        
            // when {
            //     expression {
            //         BRANCH_NAME == 'main' && CODE_CHANGES == true
            //     }
            // }
        stage("build") {
            steps {
                script {
                    // echo 'Building the app...'
                    // echo "Building version ${NEW_VERSION}"
                    // echo 'mvn install'
                    gv.buildApp()
                }
            }
        }
        stage("test") {
            when {
                expression {
                    // BRANCH_NAME == 'main' || BRANCH_NAME == 'master'
                    params.executeTest == true
                }
            }
            steps {
                script {
                   gv.testApp()
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                   
                //    echo "Deploying with ${SERVER_CREDENTIALS}"
                //    sh "${SERVER_CREDENTIALS}"
                //    withCrdentials([
                //        usernamePassword(credentials: 'otmanzt', usernameVariable: USER, passwordVariable: PWD)
                //    ]){
                //        sh "some script ${USER} ${PWD}"
                //    }
                    gv.deployApp()

                }
            }
        }
    } 
    // post { // Script to execute after all the stages are done

    //     always {
    //         // It doesn't matter if build failed or passed, always executed
    //     }

    //     success {
    //         // If build succeded
    //     }

    //     failure {
    //         // If build failed
    //     }

    // }  
}
