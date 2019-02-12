pipeline {
    agent {docker { image 'gradle:jdk8-slim' } }
           stages {
                   stage('clean build'){
                     steps{
                       sh './gradlew clean build'
                     }
                   }
                   stage('SonarQube analysis') {
                      steps{
                       withSonarQubeEnv('Sonar Qube') {
                         sh './gradlew --info sonarqube'
                       }
                      }
                   }

           }
}