# Java Hibernate Example

A simple Java application demonstrating basic Hibernate ORM functionality with PostgreSQL database.

## Features

- Basic Hibernate CRUD operations
- PostgreSQL database integration
- Maven build system
- Entity mapping with annotations
- Database connection pooling

## Prerequisites

- Java 17 or higher
- Maven 3.6.0 or higher
- PostgreSQL database

## Setup Instructions

1. Clone the repository:
```bash
git clone https://github.com/charisthedev/java-hibernate.git
```

2. Build the project:
```bash
mvn clean install
```

3. Run the application:
```bash
java -cp target/classes com.example.App
```

## Project Structure

```
src/main/java/com/example/
├── App.java         # Main application class
└── User.java        # Entity class

src/main/resources/
└── hibernate.cfg.xml # Hibernate configuration

```

## Database Configuration

The application uses PostgreSQL database. Update the database connection details in `hibernate.cfg.xml`:

```xml
<property name="hibernate.connection.url">jdbc:postgresql://localhost:5432/postgres</property>
<property name="hibernate.connection.username">charis</property>
<property name="hibernate.connection.password">charis</property>
```

## License

This project is licensed under the MIT License - see the LICENSE file for details.
