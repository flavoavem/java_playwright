# Playwright API using Java

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
* export PATH=${M2_HOME}/bin:${PATH}

## TEST LOCATION:
* /src/main/java/org/example/*

## TEST EXECUTION:
* mvn compile 
* mvn exec:java -Dexec.mainClass="org.example.Example"
* or
* mvn exec:java -Dexec.mainClass="org.example.ANOTHER TEST]"
