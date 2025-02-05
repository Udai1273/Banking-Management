# User Management System

## Overview
This project provides a simple user management system with functionalities to add, remove, search, and update users. The system consists of a repository for storing user data and a service layer for managing operations.

## Project Structure
```
com.example
│── model
│   ├── Account.java
│   ├── Constants.java
│   ├── Customer.java
│   ├── Employee.java
│   ├── Loan.java
│   ├── Transaction.java
│   ├── User.java
│── repo
│   ├── UserDB.java
│   ├── AccountDB.java
│── services
│   ├── UserManagement.java
│   ├── AccountManagement.java
```

## Components

### 1. Models
- **Account.java**: Represents user accounts.
- **Constants.java**: Stores application-wide constants.
- **Customer.java**: Defines customer-specific attributes.
- **Employee.java**: Defines employee-specific attributes.
- **Loan.java**: Represents loan-related details.
- **Transaction.java**: Handles user transactions.
- **User.java**: Defines the `User` entity with attributes such as `userId` and `isDeleted`.

### 2. Repositories
- **UserDB.java**: Handles user data storage and provides methods for:
  - Viewing a user (`viewUser`)
  - Adding a user (`addUser`)
  - Removing a user (`removeUser`)
  - Updating a user (`updateUser`)

- **AccountDB.java**: Manages account-related data and provides methods for:
  - Viewing an account (`viewAccount`)
  - Adding an account (`addAccount`)
  - Removing an account (`removeAccount`)
  - Updating an account (`updateAccount`)

### 3. Services
- **UserManagement.java**: Provides an interface for user operations, including:
  - Adding a new user (`addUser`)
  - Removing an existing user (`removeUser`)
  - Searching for a user (`searchUser`)
  - Updating user details (`updateUser`)

- **AccountManagement.java**: Provides an interface for account operations, including:
  - Adding a new account (`addAccount`)
  - Removing an existing account (`removeAccount`)
  - Searching for an account (`searchAccount`)
  - Updating account details (`updateAccount`)

## Usage

### Adding a User
```java
UserDB userDB = new UserDB();
UserManagement userService = new UserManagement(userDB);
User newUser = new User("123", "John Doe");
userService.addUser(newUser);
```

### Searching for a User
```java
User foundUser = userService.searchUser(newUser);
if (foundUser != null) {
    System.out.println("User found: " + foundUser.getUserId());
} else {
    System.out.println("User not found");
}
```

### Removing a User
```java
userService.removeUser(newUser);
```

### Updating a User
```java
User updatedUser = new User("123", "John Smith");
userService.updateUser(updatedUser);
```

## Requirements
- Java 8+

## Future Improvements
- Implement persistent storage (e.g., database)
- Add error handling and logging
- Improve efficiency using `Map<String, User>` instead of `List<User>`

