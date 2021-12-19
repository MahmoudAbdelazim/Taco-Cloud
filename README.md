# Taco Cloud
This is a fictional taco restaurant online ordering
project that I built as a practice while studying
the Spring in action book.


![image](https://user-images.githubusercontent.com/43009893/146694835-cc323419-9b4d-47f0-9b38-4655f802f770.png | width=100)


## Features:
- Sign-up and sign-in to the website.
- Design taco creations from a list of available ingredients.
- Make orders for your taco creations.
- Edit your orders or add more taco designs to it.

## Project Packages:
This is the package structure for the project: 

### 1- Domain:
Contains all the domain classes used in the project, Which are User, Taco, Order and Ingredient.

### 2- Web:
Contains all the Web MVC Controllers, with controllers for
designing and ordering tacos and using Thymeleaf templates as views.


![image](https://user-images.githubusercontent.com/43009893/146694849-50fea46a-84d7-43b3-b710-0a9c21b6c22e.png)


### 3- Data:
Contains two packages, one containing the classes for storing
data using the JdbcTemplate provided by Spring Data framework, 
and the other containing Repository interfaces that 
use the Spring JPA for storing data.


![image](https://user-images.githubusercontent.com/43009893/146694723-1022d15f-a9d1-486a-850e-034f57919346.png)


### 4- Security:
Contains the security configuration classes for handling user registration, sign-in and authentication, using the Spring Security framework.


![image](https://user-images.githubusercontent.com/43009893/146694732-423f9800-f8ed-4255-9db8-55b647840452.png)


### 5- API:
Contains all the REST Controllers created for providing 
REST APIs for domains classes, while using 
HATEOAS hypermedia representation models for providing self hyperlinks for the returned JSON objects, 
and also using the Spring Data Rest dependency for 
auto-creating REST APIs for the domain classes that have
data repositories.


![image](https://user-images.githubusercontent.com/43009893/146694818-b56c477e-0874-431b-9ccb-a0f6f1e54ffe.png)

