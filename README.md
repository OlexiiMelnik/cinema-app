# 🎥 CINEMA APP 📽
# PROJECT DESCRIPTION
This project was created for people who need help in managing their cinema business. It keeps all the information about cinema halls, movies, movie sessions and customers, who buying tickets.The project helps customers to receive services faster and the owner to manage the cinema in a more balanced and structured manner
# FEATURES
- customer registration;
- customer authentication;
- roles for administrator and customers (different permissions)
- created, update and remove movies;
- created, update and remove movie sessions;
- created, update and remove customers;
- display list of all movies;
- display list of all orders;
- display list of all cinema halls;
- give all info about orders by user;
- give all info about active movie sessions on requirement date.
# PROJECT STRUCTURE🛠
The project follows a 4-tier architecture:

1.Data Access Tier: This tier is responsible for handling data storage and retrieval. It is implemented using Data Access Objects (DAO).

2.Service Tier: This tier is responsible for implementing business logic and processing data received from the Data Access Tier. It is implemented using Service classes.

3.Presentation Tier: This tier is responsible for handling user interactions and presenting the data to the user. It is implemented using Controllers and JSP pages.

4.Security Tier: This tier is responsible for securing the application and handling user authentication and authorization. It is implemented using Spring Security.
# TECHNOLOGIES
• Java 18

• Git

• Apache Maven

• Apache TomCat

• MySQL

• Spring Framework

• Hibernate Framework

• Javax Servlet
# Instructions to run my project
(You need MySQL, TomCat v.9.0.71)

- Clone the project from GitHub;
- Open file src/main/resources/db.properties and fill form with your configuration parameters; After that hibernate build storage in your mentioned place.
- In src/main/java/cinema/config/DataInitializer.java we set test user with administrating permissions. Recommend to change it with your own.
- Set connection with DB by editing ConnectionUtil;
- Set TomCat;
- Run TomCat and enter your email and password.
