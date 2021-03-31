pipeline{
    agent any
    stages {
        stage ('build'){
            steps {
                echo 'build'
            }
        }
        stage('Test'){
            steps{
                echo 'Test'
            }
        }
    }

}
