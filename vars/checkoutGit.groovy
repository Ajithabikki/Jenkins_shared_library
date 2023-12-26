def call(String gitUrl, String gitBranch) {
    checkout scm: [
        $class: 'GitSCM', 
        branches: [[name: "*/${main}"]], 
        userRemoteConfigs: [[url: gitUrl]]
    ]
}
