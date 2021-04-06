pipeline {
  agent any
  stages {
    stage('compile') {
      steps {
        bat 'mvn compile'
      }
    }
	stage('Build') {
	steps {echo 'Building..'}
}
    stage('Test')
 {steps 
 {
	echo 'Testing..'}
}
    stage('unit test') {
      steps {
        bat 'mvn test'
      }
    }
	stage('Deploy'){
steps{
echo 'Deploying...'
}
}

    stage('sonar analysis') {
      steps {
        withSonarQubeEnv('Default') {
          bat(script: 'mvn sonar:sonar', label: 'upload analysis to sonar')
        }
      }
    }

    stage('sonar gate check') {
      steps {
        waitForQualityGate true
      }
    }
    
    stage('push to artifactory') {
      steps {
        bat(script: 'mvn deploy')
      }
    }
    
  }
}
