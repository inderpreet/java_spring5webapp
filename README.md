# An Experimental Repo for Spring5, Springboot and Java

This is an experimental repository with lots of buggy code. I am using this as my personal playground to stretch my legs with Spring and Java.


### Code Experiment brief

Here is a breakdown of the code and commits
1. Experiments with JPA and Hibernate 
   - Repository Interfaces are created as prototypes and
   - Model Classes are used to create and save data objects.
   - Using Publisher class to do some RDBMS Stuff. 
   - Author and book controller classes are used for accessing the views.
   - Views are stored in the templates folder. 
     - three different templates with JSP like code are used to access stored data
   - Bootstrap class is used to populate the H2 Database for the experiment (enable console using the application.properties.)

2. Testing Dependency injection using Spring (Code for Constructor Injection only checked in)
    - Greeting Service is the interface for the prototype
    - two services are implemented and annotated to create Spring Beans
    - A controller: Dependency Injection Controller is used to access the bean using the @Autowired property.
    - ! Try and use @Qualifier to clarify intent.
    - The controller is invoked in the Spring app.
    - Spring Profiles are selected via the application.profile
    - PrimaryGreetingService is set to default by @Service @Primary @Profile({"pr", "default"})
3. 

## License

GPLv2: In summary:
* I own the code
* use it at your own risk
* you can't pass it on as your own