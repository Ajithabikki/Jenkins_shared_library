def call() {
    withSonarQubeEnv('sonar-server') {
                    sh ''' sonar-scanner \
              -Dsonar.projectKey=YouTube \
              -Dsonar.sources=. \
              -Dsonar.host.url=http://3.145.197.142 \
              -Dsonar.login=570ba31141becd93962cc25170fc8634588b2c1f '''
                }
}