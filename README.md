# Assignment4 Password Management using Hash Tables
Sauransh Nayyar
23200301
sauransh.nayyar@ucdconnect.ie
April 01, 2024

🔗 Video Link 🔗 GitHub Link

Abstract
This project explores how to create and use a secure password manager in Java, focusing on using hash tables for storing and retrieving passwords efficiently. With cybersecurity concerns on the rise, having a reliable and quick-access password management tool is crucial. The project evaluates different data structures liked linked lists, unsorted array, and hash tables, looking at how they handle insertion and retrieval of passwords. Hash tables are chosen as the primary data structure because they’re good at dealing with collisions and offer consistent performance. The document includes a complete implementation of a hash table class, demonstrates its use in real-world scenarios, and benchmarks its performance against other data structures. The results confirm that hash tables are the best choice for effectively managing passwords, making them ideal for secure password management applications.

Background
Making sure passwords are safe is super important for keeping data secure in today’s software. We’ve got to have data structures that let us find, add, and get passwords quickly to keep everything running smoothly. With companies focused on securing PII data and users all over the world are concerned if their data is safe or not.

Design Decisions
A hash table is a data structure that is used to store keys/value pairs. It uses a hash function to compute an index into an array in which an element will be inserted or searched. By using a good hash function, hashing can work well.


The decision to use a hash data structure was based on several factors like its ability to efficiently handle password management, where rapid access is critical.

Benefits:
Performance Efficiency: The need for quick lookup, insertion, and deletion was paramount, making hash tables an ideal choice due to their average O(1) time complexity for these operations.
Security: Hash tables support effective strategies for managing collisions, a common issue when hashing large datasets.
Scalability and Maintainability: The dynamic resizing capability of hash tables ensures that the system remains efficient as the user base grows.
Security Enhancements: Use of a cryptographic hash function like SHA-256, it ensures that the passwords are hashed with a function that is considered secure against collision attacks, making it extremely difficult to reverse-engineer the original password from the hash.

Code Design
The Password Manager project aims to provide secure management of user passwords through various data structures to demonstrate their efficiency and practicality. The code design includes the implementation of core functionality, utilities, and testing mechanisms.


Core Functionality
The core of the application revolves around the password management system, which includes storage, retrieval, and verification of passwords.

PasswordAnalysis.java
Interface: Declares a method to assess password strength.
Methods:
boolean isPasswordStrong(String password): Determines if the password meets certain strength criteria.
PasswordAnalysisImpl
Implementation: Implements the PasswordAnalysis interface.
Methods:
Uses regex to ensure passwords include at least one number and uppercase letter and are at least 8 characters long.
PasswordManager.java
Attributes: Holds instances of data structures (HashTable, UnsortedArray, LinkedList).
Methods:
Storage and Verification: Each data structure has corresponding methods for storing (store) and verifying (verify) passwords, leveraging the SecureHashAlgorithm for encryption and comparison.
SecureHashAlgorithm.java
Provides static methods for password hashing and verification using SHA-256, ensuring secure storage of passwords.
Data Structures
The project uses several data structures to manage passwords, each implemented with generic capabilities to handle various types.

HashTable.java
Implements a hash table with separate chaining to resolve collisions.
Methods:
put(K key, V value): Stores the value associated with the key.
get(K key): Retrieves the value associated with the key.
UnsortedArray.java
Implements a simple array-based structure without sorting.
Methods:
Mimics the hash table’s put and get functionalities but scans the entire array for matching keys.
LinkedList.java
Implements a singly linked list for storage.
Methods:
Provides put and get functionalities similar to the hash table but traverses the list to find keys.
Utilities and Scripts
plot.py
Located in the scripts directory, this Python script is used to plot benchmark results from benchmark_results.csv, illustrating the performance of different data structures in storing and verifying passwords.
CredentialsStore.csv
A CSV file in the resources directory, used to store mock user credentials for testing purposes.
Testing and Benchmarking
BenchmarkTest.java
Conducts performance tests on different data structures by measuring the time taken to store and verify passwords. Outputs results to benchmark_results.csv for analysis.
Execution and Validation
Main.java
Acts as the entry point for demonstrating the functionality of the password manager. Utilizes PasswordAnalysisImpl to ensure passwords are strong before storing them using various data structures.
VerifyCredentials.java
Validates credentials against stored data, showcasing practical usage of the password management system.
Use Cases
Use case 1: Secure Password Storage
In a scenario where the system needs to handle a substantial user base, the password manager leverages the hash table’s efficiency and security features to store passwords. Each user, upon registration, is prompted to create a password that is then evaluated for complexity using the PasswordAnalysisImpl class to ensure it meets predefined strength parameters. Once a password is deemed strong, the SecureHashAlgorithm steps in to hash the password, converting the plain text into an encrypted hash that’s nearly impossible to reverse-engineer. This hashed password, paired with the unique username, is securely stored in the HashTable by the PasswordManager class. The process culminates with the user receiving confirmation that their password is safely stored, providing them peace of mind that their credentials are protected by a system designed with security as a paramount concern.

Use case 2: Efficient Password Retrieval
The essence of the password manager is not only to securely store passwords but also to retrieve them with utmost efficiency, especially during user authentication. As users attempt to access their accounts, the system swiftly engages the hash table to locate the corresponding hashed password associated with the entered username. The PasswordManager class facilitates this retrieval process through its hashtableverify method, which effectively fetches the hashed password in constant time due to the hash table’s optimized lookup performance. This rapid retrieval capability is critical in maintaining a seamless user experience, where the authentication process is completed in the blink of an eye, thereby reinforcing user trust in the application’s efficiency.


Performance Benchmark
Performance benchmarks conducted comparisons between hash tables to linked lists and balanced trees. The hash table demonstrated the quickest access times for both storing and retrieving passwords, highlighting its efficiency.


Store Operation
HashTable demonstrates the lowest time for the 'Store' operation, which indicates the highest efficiency among the three data structures. The constant average time complexity O(1) of hash tables is likely responsible for this performance.
LinkedList takes significantly more time than the HashTable but is still faster than the UnsortedArray for storing data. This could be due to the linear time complexity O(n) involved in traversing the list to insert an element at the end or to find the right position if duplicates are not allowed.
UnsortedArray exhibits the highest time consumption for the storage operation. This might be attributed to the need to check for duplicate keys before insertion, which would involve traversing the entire array in the worst case.
Verify Operation
HashTable performs the best during the 'Verify' operation. This is expected behavior for a hash table; it outperforms the other structures.
LinkedList and UnsortedArray exhibit similar verify operation behavior, showing longer times for verification compared to Hash Table, which is expected.

Conclusion
Given that the HashTable verification time is less than both the LinkedList and UnsortedArray, which have linear search times (O(n)), it reinforces the expectation that hash tables are typically the most efficient for lookup operations when properly implemented. The HashTable’s performance advantage is particularly pronounced in applications where quick access to a large volume of data is necessary, such as in password verification scenarios where immediate feedback is critical.

Therefore, the conclusion is that the HashTable is the superior data structure for the 'Verify' operation within the password manager project, aligning with theoretical expectations and showcasing its practical effectiveness in real-world applications.
