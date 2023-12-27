def call() {
    withSonarQubeEnv('sonar-server') {
                        sh ''' ${scannerHome}/bin/sonar-scanner \
                        -Dsonar.projectName=YouTube \
                        -Dsonar.projectKey=YouTube 
        
                        '''
                    }
}