# Bookstore Management System (Web-Based)

## Description

This is a web-based application to manage a Bookstore with two types of users: **Admin** and **Regular User**, each with specific roles and permissions. 

## Features

- **Admin:**
  - **CRUD** operations on users
  - **CRUD** operations on books
  - **View** books
  - **Create Admin** 
 
- **Regular User:**
  - **CRUD** operations on books
  - **View** books 

## Technologies Used

- **Java**
- **Spring Security**
- **Spring Dependency Injection Framework**
- **Thymeleaf**
- **Hibernate**
- **MySQL**
- **MVC** software architecture 
- **Client-Server** system architecture 
- **SOLID Principles** and **Design Patterns**
- **Gradle**
- **Deployment on Railway**

## SQL Scripts

**Before running the application for the first time, you need to set up the database.**

**First create the database locally, then run the app such that the tables are created (roles, users, users_roles)**

**Then execute the SQL statements:**

INSERT INTO roles(id, role) VALUES (1, 'ADMIN'), (2, 'USER'), (3, 'DEVELOPER');

INSERT INTO users(username, email_address, first_name, last_name, password) VALUES ('Admin', 'admin@admin.com', 'Admin', 'Admin', '$2a$10$FVvZNPIIP3taMKdQqwwWsejbiH1DpT/0/PbBS933b73JewnHag6hK');

INSERT INTO users_roles(users_id, roles_id) VALUES (1, 1);

**Note:** $2a$10$FVvZNPIIP3taMKdQqwwWsejbiH1DpT/0/PbBS933b73JewnHag6hK is the BCrypt hash of password Admin!1234 


