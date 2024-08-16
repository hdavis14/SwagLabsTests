## Cucumber test framework for the SwagLabs website

###  Prerequisite
- The following much be install to run this project:
````
- Java - openjdk 21.0.4 
- Apache Maven 3.6.3
````

### Tech stack used for this project
This Maven project is written in a cucumber framework based on selenium-java. The following dependencies have been added to the pom.xml
````
- Selenium 4.23.0
- Junit 5.10
- Cucumber 7.18.1
````

### Clone the github project
To clone project locally run the following 
````
git clone https://github.com/hdavis14/SwagLabsTests.git
````
### Build the Maven project
NOTE: This project was written in Intellij IDEA, but should be compatible with any IDE.
1. Ensure POM.xml is link to the Maven project.
````
 Right click on the POM.xml and scoroll down and select Add as Maven Project
````
2. Open a terminal and navigate to the project folder.
3. Run the following command to delete any previously compile code and compile the project.
````
mvn clean install
````
### Project structure
The cucumber project consist of the following:
1. Feature file - The Gherkin formatted test
2. Step Definitions - the Glue code behind test
3. Pages - This is the Page Object Model within the test code
4. TestRunner - Test runner to run the tests

### Running the tests
The tests can be run by either right-clicking on the TestRunner and select 'Run TestRunner' or creating a runtime config in te IDE.




