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

## User Interface

**ADMIN**

<!-- Center the first image -->
<div style="text-align:center;">
  <img src="https://github.com/user-attachments/assets/5b8fbe7e-8362-40c7-b5fe-4f36fe039348" alt="Screenshot 2025-03-05 214906" width="300" style="margin: 10px;"/>
</div>

<!-- Align the next two images on the same line -->
<div style="text-align:center;">
  <img src="https://github.com/user-attachments/assets/e8de8c6a-f3a3-4b1a-a77d-19c2aeda6e79" alt="Screenshot 2025-03-05 214649" width="300" style="margin: 10px; display:inline-block;"/>
  <img src="https://github.com/user-attachments/assets/e3b74cb2-9299-4db5-98ad-a19070101426" alt="Screenshot 2025-03-05 214717" width="300" style="margin: 10px; display:inline-block;"/>
</div>


**USER**

<!-- Align the next two images on the same line -->
<div style="text-align:center;">
  <img src="https://github.com/user-attachments/assets/8b73a696-6f4d-43e7-8645-bcc20e2ef143" alt="Screenshot 2025-03-05 214959" width="300" style="margin: 10px; display:inline-block;"/>
  <img src="https://github.com/user-attachments/assets/26ce4c85-37a0-4550-9d43-5d97fb770b7a" alt="Screenshot 2025-03-05 214940" width="300" style="margin: 10px; display:inline-block;"/>
</div>















