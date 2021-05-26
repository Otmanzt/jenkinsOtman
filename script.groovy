def buildApp() {
    echo 'Building the app...'
    echo "Building version ${params.VERSION}"
}

def testApp() {
    echo 'testing the app...'
}

def deployApp() {
    echo 'Deploying the app...'
    echo "Deploying version ${params.VERSION}"
}

return this