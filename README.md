# MySQL_SIS
A simple desktop application designed to manage student records. This project demonstrates how to connect a Java-based User Interface to a database to perform basic CRUD (Create, Read, Update, Delete) operations.

## Features
* Add Student: Input a student's First Name, Last Name, Age, and Email, and save them directly to the database.
* View Students: Displays all registered students in a real-time, interactive table.
* Update Student: Click on any student in the table to load their information, edit their details, and save the updates.
* Delete Student: Select a student from the table and securely remove their record from the database.

## What Was Used
* Java: The core programming language used for the application logic.
* Java Swing (GUI): Used to build the graphical user interface (buttons, text fields, and tables).
* MySQL: The relational database used to store and manage the student data safely.
* Apache NetBeans: The Integrated Development Environment (IDE) used to write the code and design the drag-and-drop GUI.
* MySQL Connector/J: The JDBC driver library used to bridge the connection between the Java application and the MySQL database.

## How to Run the Project

### Step 1: Set Up the Database
1. Open your MySQL client (like MySQL Workbench, XAMPP, or command line).
2. Create a new database named `student_information_system`.
3. Run the following SQL script to create the necessary table:
   ```sql
   USE student_information_system;

   CREATE TABLE students(
       student_id INT AUTO_INCREMENT PRIMARY KEY,
       first_name VARCHAR(100),
       last_name VARCHAR(100),
       age INT,
       email VARCHAR(100)
   );

### Step 2: Configure the Project in NetBeans

1. Open Apache NetBeans.
2. Go to File > Open Project and select this project folder.
3. In the Projects window on the left, right-click on the Libraries folder for this project and select Add JAR/Folder.
4. Find and select your downloaded mysql-connector-j-x.x.xx.jar file to add it to the project.

### Step 3: Update Database Credentials
1. Open the DBconnection.java file in the studentinformationsystems package.
2. Find the database connection lines and ensure your MySQL username (usually "root") and password match your local machine.

### Step 4: Run the Application
1. In NetBeans, open the Studentinformationsystems.java file.
2. Right-click anywhere in the code and select Run File.


   
   );
