pipelineJob('build_docker_image') {
    displayName('Job DSL for creating pipeline from git Jenkinsfile')
    definition {
        cpsScm {
            scm {
                git('https://github.com/stepanenkoiv/mytest1.git','master')
            }
            scriptPath("Jenkinsfile")
        }
    }
}
