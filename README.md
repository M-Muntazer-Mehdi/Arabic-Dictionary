<table align="center">
  <tr>
    <td align="center">
     <img src="https://i.ibb.co/nwk2sZF/main.png" alt="main" border="0" width="400" height="100">
    </td>
  </tr>
</table>

# Table of Contents

1. [Project Description](#arabic-urdu-dictionary-application)
2. [Features](#features)
   - [Import Files](#1-import-files)
   - [View Dictionary](#2-view-dictionary)
   - [Search Functionality](#3-search-functionality)
   - [Manage Dictionary Entries](#4-manage-dictionary-entries)
3. [Concepts and Design Patterns](#concepts-and-design-patterns)
4. [Prerequisites](#prerequisites)
5. [How to Run the Project](#how-to-run-the-project)
6. [Contribution Guidelines](#contribution-guidelines)

# Arabic-Urdu Dictionary Application

This project is a desktop application for an Arabic-Urdu dictionary. The application allows users to import CSV files containing Arabic-Urdu word meanings, view the dictionary, search by Arabic word or meaning, and update the dictionary entries. The project adheres to a three-layered architecture and incorporates various software design patterns and principles discussed during classes. 

## Features

#### 1. Import Files
   - Import CSV files containing Arabic-Urdu word meanings.
   - The code generates a database and table in the localhost.
<table align="center">
  <tr>
    <td align="center">
     <img src="https://i.ibb.co/Vpcf4BF/1.png" alt="1" border="0" width="400" height="200">
    </td>
    <td align="center">
     <img src="https://i.ibb.co/st05Qpc/2.png" alt="2" border="0" width="200" height="200">
    </td>
    <td align="center">
     <img src="https://i.ibb.co/KVCNSvs/3.png" alt="3" border="0" width="400" height="200">
    </td>
  </tr>
</table>

#### 2. View Dictionary
   - View all dictionary entries in the application.
  <table align="center">
  <tr>
    <td align="center">
     <img src="https://i.ibb.co/56Hkp2b/4.png" alt="4" border="0" width="450" height="250">
    </td>
  </tr>
</table>

#### 3. Search Functionality
   - **By Arabic Word:** Search by an Arabic word and retrieve a single matching entry.
   - **All Matches:** Search by an Arabic word and retrieve all matching entries.
   - **By Meaning:** Search by meaning and retrieve matching entries.
<table align="center">
  <tr>
    <td align="center">
     <img src="https://i.ibb.co/DgySZXd/5.png" alt="5" border="0" width="300" height="200">
    </td>
    <td align="center">
     <img src="https://i.ibb.co/rmWSQcs/6.png" alt="6" border="0" width="180" height="300">
    </td>
    </tr>
    <tr>
    <td align="center">
    <img src="https://i.ibb.co/qCZLF9V/7.png" alt="7" border="0" width="300" height="200">
    </td>
    <td align="center">
    <img src="https://i.ibb.co/LRhx0xc/8.png" alt="8" border="0" width="300" height="200">
    </td>
  </tr>
</table>

#### 4. Manage Dictionary Entries
   - Add new meanings to Arabic words.
   - Update existing dictionary entries.
<table align="center">
  <tr>
    <td align="center">
    <img src="https://i.ibb.co/8zBYWCw/9.png" alt="9" border="0" width="180" height="300">
    </td>
    </tr>
</table>

## Concepts and Design Patterns

This project uses the following major concepts and design patterns:

- **Three-Layered Architecture**: Presentation Layer, Business Logic Layer, Data Access Layer.
- **Design Patterns**: Singleton, Facade and Observer Pattern
- **SOLID Principles**: Interface Segregation Principle
- **Unit Testing**: JUnit5 annotations and test cases for DataAccessLayer and BusinessLogicLayer.
- **Java-Specific Concepts**:
  - Inheritance & Polymorphism
  - Interfaces
  - Exception Handling (try, catch, throw, throws, finally)
  - Generics and Collections Framework
  - Event-Driven Programming: Events and Event Handlers, Callbacks
  - AWT and Swing for GUI

## Prerequisites

- Java Development Kit (JDK)
- Eclipse IDE
- MySQL (XAMPP)

## How to Run the Project

1. **Clone the Repository**
   `git clone <repository_url>`

2. **Open Eclipse and Import Project**
   - Open Eclipse.
   - Go to `File` > `Open Project From File System`.
   - Select `Existing Projects into Workspace` under `General`.
   - Browse to the project directory and import.

3. **Run the Application**
   - In Eclipse, navigate to `src/presentationlayer`.
   - Right-click on the `Welcome` file and select `Run As` > `Java Application`.

4. **Import CSV Files**
   - On the first run, the application will prompt you to import CSV files.
   - Import the [CSV files](https://github.com/M-Muntazer-Mehdi/Arabic-Dictionary/tree/main/Import%20Files%20-%20CSV) containing Arabic-Urdu word meanings.

5. **Use the Application**
   - After importing the CSV files, you can start using the dictionary application.
   - View, search, add, and update dictionary entries as needed.


## Contribution Guidelines

- Fork the repository.
- Create a new branch (`git checkout -b feature-branch`).
- Make your changes.
- Commit your changes (`git commit -am 'Add new feature'`).
- Push to the branch (`git push origin feature-branch`).
- Create a new Pull Request.
