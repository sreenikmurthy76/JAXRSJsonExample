// Powered by Infostretch 

timestamps {

node () {

	stage ('first - Checkout') {
 	 checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'JenkinsforGit', url: 'https://github.com/sreenikmurthy76/JAXRSJsonExample']]]) 
	}
	stage ('first - Build') {
 	
// Unable to convert a build step referring to "hudson.plugins.sonar.SonarBuildWrapper". Please verify and convert manually if required.		// Maven build step
	withMaven(maven: 'Maven') { 
 			if(isUnix()) {
 				sh "mvn -f JAXRSJsonExample\pom.xml clean install " 
			} else { 
 				bat "mvn -f JAXRSJsonExample\pom.xml clean install " 
			} 
 		}		// Maven build step
	withMaven(maven: 'Maven') { 
 			if(isUnix()) {
 				sh "mvn -f JAXRSJsonExample\pom.xml sonar:sonar   -Dsonar.projectKey=JAXRSJsonExample   -Dsonar.host.url=http://localhost:9000   -Dsonar.login=12bd5a57b6026dc57c10b0289721b5edd730e816 " 
			} else { 
 				bat "mvn -f JAXRSJsonExample\pom.xml sonar:sonar   -Dsonar.projectKey=JAXRSJsonExample   -Dsonar.host.url=http://localhost:9000   -Dsonar.login=12bd5a57b6026dc57c10b0289721b5edd730e816 " 
			} 
 		} 
	}
}
}