# API Automation Framework

A scalable and modular API Automation Testing Framework built using Java, RestAssured, and TestNG.  
Designed with industry-standard architecture including environment configuration, service-layer abstraction, and CI-ready execution.

---

## 🚀 Tech Stack

- Java 17
- RestAssured
- TestNG
- Maven
- Git
- JSON
- SLF4J Logging

---

## 📌 Key Features

- Environment-based configuration (QA/Dev/Prod support)
- Smoke & Regression test grouping
- Maven-based execution
- Service-layer abstraction design
- Request specification builder (common headers, logging)
- Reusable utility classes
- CI-ready structure
- Clean logging and reporting

---

## 📂 Project Structure

```
src
 ├── main
 │    ├── java
 │    │    └── com.animesh.api
 │    │         ├── config
 │    │         ├── core
 │    │         ├── services
 │    ├── resources
 │         ├── config-qa.properties
 │         ├── config-dev.properties
 │
 ├── test
 │    ├── java
 │         └── com.animesh.api.tests
```

---

## 🧠 Architecture Overview

- ConfigManager → Loads environment-specific properties
- RequestSpecUtil → Builds reusable request specifications
- Service Layer → Handles API endpoint interactions
- Test Layer → Contains test cases using TestNG groups
- Maven Surefire → Executes test suites

---

## ▶️ How To Run Tests

### Run All Tests
```
mvn clean test
```

### Run Specific Test Class
```
mvn -Dtest=UserTests test
```

### Run Smoke Tests
```
mvn test -Dgroups=smoke
```

### Run Regression Tests
```
mvn test -Dgroups=regression
```

### Run With Specific Environment
```
mvn clean test -Denv=dev
```

---

## 🌍 Environment Configuration

Framework supports multiple environments:

- config-qa.properties
- config-dev.properties
- config-prod.properties

Example property file:

```
base.url=https://jsonplaceholder.typicode.com
```

Environment can be switched using:

```
-Denv=dev
```

---

## 🔍 Sample Test Scenario

- Validate GET /users/{id}
- Validate POST /users
- Verify status codes
- Validate response headers
- Grouped under Smoke & Regression suites

---

## 🧪 CI/CD Ready

Framework is Maven-driven and can be integrated easily with:

- GitHub Actions
- Jenkins
- Azure DevOps
- GitLab CI

---

## 🎯 Learning Outcomes

- API automation best practices
- Test architecture design
- Environment management
- Scalable test execution
- Clean separation of concerns
- CI/CD compatibility

---

## 👨‍💻 Author

Animesh Vaish

---
