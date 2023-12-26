def call(String gitUrl, String gitBranch) {
    checkout([
        $class: 'GitSCM',
        userRemoteConfigs: [[url: gitUrl]],
        branches: [[name: gitBranch]] 
        
    ]
}
