# Spock Framework Maven Archetype

## Overview

Spock Framework aims to make testing code for the JVM simple. It is based on Gherkin and allows for a very expressive
way of writing test specifications using the Groovy programming language. This archetype sets up a Maven project for 
writing Java and using Spock for tests. More information about SpockFramework can be found at:

* [Setting Up Maven For Spock](http://goo.gl/eZsnJW)
* [An Introduction To Specifications with Spock](http://goo.gl/UYZa9M)
* [More about Spock Specifications](http://goo.gl/Aghn9f)

## Usage
```
mvn archetype:generate -DarchetypeGroupId=com.zanclus -DarchetypeArtifactId=spock-bootstrap
```

## Download and install the archetype locally
```
git clone https://github.com/JUGGL/spock-bootstrap.git
cd spock-bootstrap
mvn clean package install
```
