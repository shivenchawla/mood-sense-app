# mood-sense-app

## Installation

-	Download and unzip / clone the Git repository
-	Install MySQL
-	Install Curl


## Configuration

-	mysql> create database user_mood_location; -- Create the new database
-	mysql> create user 'moodAppMockUser'@'localhost' identified by 'ThePassword';
-	mysql> grant all on user_mood_location.* to ' moodAppMockUser'@'localhost'; -- You can restrict the user privileges*


## Components Chart

This chart gives brief description of the various components used in this app:

|Path            |Item                           |Item Type          |Description                     |
|----------------|-------------------------------|-------------------|--------------------------------|
|src/main/java/moodSense/Application.java|**@SpringBootApplication**<br/> (public class **Application**)|Convenience annotation<br/> (Startup Class)|**@SpringBootApplication**  adds the following to startup class:<br/> - **@EnableAutoConfiguration** sets classpath and component properties.<br/> - **@ComponentScan** tells Spring to scan for components, configurations, and services|
|src/main/java/moodSense/MainController.java|**@RequestMapping**(path="**/demo**")|Convenience annotation|The URL starting with the path “<**application_path**>/demo” invokes the MainController|
||public class **MainController**|Resource controller function|Defines the application logic.|
||**@GetMapping**(path=<**URL_path**>)|Convenience annotation|**@GetMapping**  specifies the https request method is a shortcut for<br/> - **@RequestMapping** (method=GET).<br/> - **@ResponseBody** invokes the response function based on the URL path.|
||public **@ResponseBody**  String <**response_function**>|HTTPS response function|Defines the response for the specific URL path. It contains the logic to access MySQL database and the application logic to manipulate the accessed data.|
|src/main/java/moodSense/<User_type_repository>.java<br/> **Example**: HappyUserRepository.java|public interface <**User_type_repository**> extends **CrudRepository**|Convenience annotation|It is a repository interface which is automatically implemented in Spring.|
||**@Query** <**query_function**>|Repository interface|Contains the design for custom MySQL queries.|
|src/main/java/moodSense/<**User_type**>.java<br/> **Example**: HappyUser.java|**@Entity**|Convenience annotation|Marks the class as a database entity.|
||public class <**User_type_class**>|Entity class|Hibernate use this entity class to create a table.|
|src/main/resources/application.properties|Spring-Boot properties|Spring-Boot properties|Defines properties for DDL creation, database (URL, username, password), path for package hibernate Geometry.|


## Run the JAR
You can run the JAR file:
>	java -jar build/libs/mood-sense-0.1.0.jar


## Test the App
Now that the application is running, you can test it by running the following in terminal/cmd:
> curl 'localhost:8080/demo/addhappy?uid=1&name=abc&x=49.235&y=83.354&coordslabel=home'

The result should be:
> "Saved"
