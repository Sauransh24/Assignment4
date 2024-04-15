# Password Management using Hash Tables

## Author
Sauransh Nayyar  
23200301  
sauransh.nayyar@ucdconnect.ie

## Abstract
This project explores how to create and use a secure password manager in Java, focusing on using hash tables for storing and retrieving passwords efficiently. With cybersecurity concerns on the rise, having a reliable and quick-access password management tool is crucial. The project evaluates different data structures like linked lists, unsorted arrays, and hash tables, looking at how they handle insertion and retrieval of passwords. Hash tables are chosen as the primary data structure because they’re good at dealing with collisions and offer consistent performance. The document includes a complete implementation of a hash table class, demonstrates its use in real-world scenarios, and benchmarks its performance against other data structures. The results confirm that hash tables are the best choice for effectively managing passwords, making them ideal for secure password management applications.

## Background
Making sure passwords are safe is super important for keeping data secure in today’s software. We’ve got to have data structures that let us find, add, and get passwords quickly to keep everything running smoothly. With companies focused on securing PII data and users all over the world concerned if their data is safe or not.

## Design Decisions
The decision to use a hash data structure was based on several factors like its ability to efficiently handle password management, where rapid access is critical.

### Benefits:
- **Performance Efficiency:** Hash tables offer an average O(1) time complexity for lookup, insertion, and deletion operations.
- **Security:** Effective collision resolution strategies ensure secure password storage.
- **Scalability and Maintainability:** Dynamic resizing capability ensures efficiency as the user base grows.
- **Security Enhancements:** Use of SHA-256 cryptographic hash function ensures secure password hashing.

## Code Design
The Password Manager project provides secure management of user passwords through various data structures to demonstrate their efficiency and practicality.

### Core Functionality
- **PasswordAnalysis.java:** Interface for assessing password strength.
- **PasswordAnalysisImpl:** Implementation of the PasswordAnalysis interface.
- **PasswordManager.java:** Core functionality for storing, retrieving, and verifying passwords.
- **SecureHashAlgorithm.java:** Provides methods for password hashing and verification.

### Data Structures
- **HashTable.java:** Implements a hash table with separate chaining.
- **UnsortedArray.java:** Implements a simple array-based structure.
- **LinkedList.java:** Implements a singly linked list for storage.

### Utilities and Scripts
- **plot.py:** Python script for plotting benchmark results.
- **CredentialsStore.csv:** CSV file for storing mock user credentials.

## Testing and Benchmarking
- **BenchmarkTest.java:** Conducts performance tests on different data structures.

## Execution and Validation
- **Main.java:** Entry point for demonstrating password manager functionality.
- **VerifyCredentials.java:** Validates credentials against stored data.

## Use Cases
### Use case 1: Secure Password Storage
The password manager leverages the hash table’s efficiency and security features to securely store passwords.

### Use case 2: Efficient Password Retrieval
The system swiftly retrieves hashed passwords using the hash table for user authentication.

## Performance Benchmark
Performance benchmarks demonstrate the hash table's efficiency for storing and retrieving passwords.

## Conclusion
Hash tables are the superior data structure for password verification, offering efficient lookup operations.

