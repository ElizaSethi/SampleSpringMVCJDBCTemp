# SampleSpringMVCJDBCTemp
A sample Spring MVC application using JdbcTemplate to implement CRUD operations

## Tools and Technologies Used

* Tomcat 9.0.37
* Spring 5.1.1
* Servlet 3.0
* JDK 1.8
* MySQL 8.0.11
* Spring JDBC Framework
* Maven 4.0.0
* Eclipse 2020-06 (4.16.0)

## Steps of Development

1. Create the Database on which you will perform the CRUD operation.
    > Database: *student_db*, Table: *student_record*
    
2. Create a Dynamic Web Project
3. Convert project to Maven Project (Apache Maven is a build automation and dependency management tool)
4. Add dependencies to pom.xml
5. Create new Spring configuration bean student-servlet.xml
    > Configure ViewResolver and Database Connectivity (DataSource).
    
6. Map Spring MVC using web.xml

7. Add all Domain/Model/Entity classes are POJO classes.
    > Which are decided at the begining of the application development and followed by developers to create Relational Database and Domain classes, here Student.java
    
8. Controller class, StudentContoller.java
    > Handles all the requests received from DispatcherServlet. After varifying the URI, respective method is going to execute and returns a view.
  
9. Create Views/JSP files.
10. Build the application 'mvn clean install'
    > You will able to see all jars under **/target** folder
   
11. Start your application. i.e, run your application on temcat serve.
12. Run application on browser 'http://localhost:8080/SpringMVCWithCRUD/'
