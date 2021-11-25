def call(){
	cleanWs()
	retry(env.retry_opts){
	git_variables = checkout scm
		
		
	}
	
	
	
	
}