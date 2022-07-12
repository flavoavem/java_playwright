# Playwright API for Java with Visual Studio Code

## ENVIRONMENT VARIABLES:
* JAVA_HOME
* MAVEN_HOME
* M2_HOME

## LOCATION: 
* ~/.bashrc
* or
* ~/.mavenrc
* or
* /etc/profile.d/maven.sh

## EXAMPLE:
* export JAVA_HOME=/home/linuxbrew/.linuxbrew/Cellar/openjdk/18.0.1.1/libexec
* export M2_HOME=/opt/maven
* export MAVEN_HOME=/opt/maven

## TEST LOCATION:
* /src/main/java/org/example/

## TEST EXECUTION:
* mvn compile 
* mvn exec:java -Dexec.mainClass="org.example.Example"
