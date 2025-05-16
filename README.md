 This project demonstrates a one-to-one relationship using Hibernate, with entities Question and Answer. It illustrates 
 how to map these entities, handle their relationships, and persist them in a relational database using Hibernate's ORM capabilities.

#Key Features -
One-to-One Mapping: Demonstrates bidirectional one-to-one relationship mapping between Question and Answer.

Hibernate Configuration: Utilizes hibernate.cfg.xml for database connection and entity mapping.

Data Persistence: Persists data using Hibernate's Session API.

Error Handling: Handles transactions and exceptions effectively.

#Technologies Used -
Java: Programming language

Hibernate: ORM framework

MySQL:

Maven: Dependency management

#Prerequisites
Before running this project, ensure you have:

Java Development Kit (JDK) installed.

A relational database (e.g., MySQL or PostgreSQL) set up.

Maven installed for dependency management.

#Project Structure
src/
├── main/
│   ├── java/com/rocky/app/
│   │   └── LaunchStandardApp.java   # Main application class
│   ├── java/com/rocky/model/
│   │   ├── Question.java            # Entity representing a Question
│   │   └── Answer.java              # Entity representing an Answer
│   ├── resources/
│       └── hibernate.cfg.xml        # Hibernate configuration file


