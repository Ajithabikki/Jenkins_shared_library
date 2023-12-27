def call() {
    withSonarQubeEnv('sonar-server') {
                        sh ''' ${scannrHome}/bin/sonar-scanner \
                        -Dsonar.projectName=YouTube \
                        -Dsonar.projectKey=YouTube 
        
                        '''
                    }
}