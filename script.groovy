def buildApp() {
    echo "building the application..."
    sh 'mvn package'
} 

def testAPP() {
    echo "testing the application..."
    }


def deployApp() {
    echo 'deploying the application...'
} 

return this