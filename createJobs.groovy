pipelineJob('pipelineJob'){
   definition {
       cps {
           script(readFileFromWorkspace('pipelineJob.groovy'))
           sandbox()
       }
   }
}
pipelineJob('springbootJob'){
    definition {
        cpsScm{
            scm{
                git{
                    remote {
                        url "https://github.com/ndahigeze/springdocker.git"
                    }
                    branch 'master'
                }
            }
        }

    }
}