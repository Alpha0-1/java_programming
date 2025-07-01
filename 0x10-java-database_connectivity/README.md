# Java Database Connectivity (JDBC) Guide

This guide provides practical examples of working with Java JDBC for connecting and interacting with relational databases.

## Table of Contents
1. [Introduction](#introduction)
2. [Topics Covered](#topics-covered)
3. [Getting Started](#getting-started)
4. [Running the Examples](#running-the-examples)

---

## Introduction

Java Database Connectivity (JDBC) is an API used in Java programming to connect and execute queries with relational databases such as MySQL, PostgreSQL, Oracle, etc.

This repository includes hands-on code samples demonstrating various aspects of JDBC usage.

---

## Topics Covered

| File                      | Topic                                 |
|---------------------------|----------------------------------------|
| `0-jdbc_setup.java`       | Loading JDBC driver                    |
| `1-database_connection.java` | Connecting to a database           |
| `2-crud_operations.java`  | Performing CRUD operations             |
| `3-prepared_statements.java` | Using prepared statements          |
| `4-result_set_handling.java` | Handling result sets              |
| `5-transaction_management.java` | Managing transactions         |
| `6-connection_pooling.java` | Using connection pools            |
| `7-stored_procedures.java` | Calling stored procedures         |
| `8-batch_processing.java` | Performing batch operations         |
| `9-database_metadata.java` | Retrieving database metadata      |
| `10-dao_pattern.java`     | Implementing DAO design pattern       |

---

## Getting Started

### Prerequisites
- Java 8+
- MySQL server installed and running
- MySQL JDBC driver (`mysql-connector-java`) in classpath
- For connection pooling example, include HikariCP

### Setup Instructions

1. Create a test database:
   ```sql
   CREATE DATABASE testdb;
