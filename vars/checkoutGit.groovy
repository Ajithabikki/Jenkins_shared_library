def call(String gitUrl, String gitBranch) {
    checkout scm: [$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Ajithabikki/Youtube-clone-app.git']]]

}