# API Automation Framework

## Tech Stack
- Java 17
- Rest Assured
- TestNG
- Maven
- Jackson
- Allure
- GitHub Actions

## Features
- Service Layer Architecture
- Data-driven testing
- Retry mechanism
- Parallel execution
- CI integration
- Test grouping (smoke/regression)

## Run Tests
mvn clean test

## Run Smoke Only
mvn test -Dgroups=smoke