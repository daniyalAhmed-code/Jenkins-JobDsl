pipelineJob('example2') {
  definition {
    cpsScm {
      scm {
           git {
          remote {
                url('https://github.com/daniyalAhmed-code/Jenkins-JobDSL.git')
            }
        }
      }
         scriptPath("Jenkins")
      }
  }
  }
