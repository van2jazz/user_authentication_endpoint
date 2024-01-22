# User_Authentication
+ This repository built with Java Spring MVC contains a secure and robust authentication system built using Java Spring Boot. It provides a seamless user registration process through a RESTful API endpoint (/api/auth/signup). It utilizes JSON Web Tokens (JWT) for secure and stateless authentication.  The service ensures data integrity and security using encryption techniques for sensitive user information.

+ The APIs are well-documented and easily accessible through Swagger UI, making it simple for developers to test.

# Key Features:
+   User Registration: Enables users to register with the system securely.
+   Role-based Access Control: Implements role-based access control with predefined roles such as USER, MODERATOR, and ADMIN.
+   Token-based Authentication: Utilizes JSON Web Tokens (JWT) for secure and stateless authentication.
+  Password Encryption: Safeguards user passwords through the use of BCrypt password hashing.



#  Running the app
1. Clone the repository: git clone https://github.com/van2jazz/User_Authentication 
2. Import the project:


+ Click File > Import...
+ Select Maven > Existing Maven Projects and click Next
+ Browse to the project directory and click Finish

3. Update the values in application.properties with your database connection details.
4. Run the app: Right-click the project in the Package Explorer and click Run As > Spring Boot App.

5. Next add some rows into roles-table before assigning any role to User.
  Run following SQL insert statements:

  ``` js
  INSERT INTO roles(name) VALUES('ROLE_USER');
  INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
  INSERT INTO roles(name) VALUES('ROLE_ADMIN');
```

### 6.Then check the tables:

``` js
  SELECT * FROM roles;
```

![role table](https://github.com/van2jazz/User_Authentication/assets/53022905/e25d7a8b-807c-432c-8717-3919f4388533)



### 7.Register some users with /signup API:

``` js
{
 "username": "johnny",
 "email": "john@gmail.com",
 "firstname": "john",
 "lastname": "kelvin",
 "mobile": "08045678931",
 "nin": "1234567849",
 "password": "computer",
 "role": ["user"]
}
```

NOTE: Role could be "user", "mod", "admin".

![role 3](https://github.com/van2jazz/User_Authentication/assets/53022905/cb4c9214-9c88-4f06-a0f4-5ebfdaa54426)






### 8. Login registered user.


![login 1](https://github.com/van2jazz/User_Authentication/assets/53022905/98bdbbb1-3989-432b-8796-9c1dc050a97a)






# API documentation
+ API documentation is available via Swagger UI at http://localhost:8080/swagger-ui/index.html (note: app must be running)

#Swagger UI
![swagger](https://github.com/van2jazz/User_Authentication/assets/53022905/ba6d8e5a-9606-4c4e-a852-ab3cff82f290)

