package main.java.com.passwordmanager.core;

import main.java.com.passwordmanager.util.HashTable;
import main.java.com.passwordmanager.util.UnsortedArray;
import main.java.com.passwordmanager.util.LinkedList;
import java.security.NoSuchAlgorithmException;


public class PasswordManager {
    private HashTable<String, String> hashTable;
    private UnsortedArray<String, String> unsortedArray;
    private LinkedList<String, String> linkedList;

    public PasswordManager() {
        hashTable = new HashTable<>(100);
        unsortedArray = new UnsortedArray<>();
        linkedList = new LinkedList<>();
    }

    public void hashtablestore(String username, String password) throws NoSuchAlgorithmException {
        String hashedPassword = SecureHashAlgorithm.hashPassword(password);
        hashTable.put(username, hashedPassword);
    }

    public boolean hashtableverify(String username, String password) throws NoSuchAlgorithmException {
        String storedPassword = hashTable.get(username);
        return SecureHashAlgorithm.verifyPassword(password, storedPassword);
    }

    public void UnsortedArraystore(String username, String password) throws NoSuchAlgorithmException {
        String hashedPassword = SecureHashAlgorithm.hashPassword(password);
        unsortedArray.put(username, hashedPassword);
    }

    public boolean UnsortedArrayverify(String username, String password) throws NoSuchAlgorithmException {
        String storedPassword = unsortedArray.get(username);
        return SecureHashAlgorithm.verifyPassword(password, storedPassword);
    }
    public void LinkedListstore(String username, String password) throws NoSuchAlgorithmException {
        String hashedPassword = SecureHashAlgorithm.hashPassword(password);
        linkedList.put(username, hashedPassword);
    }
    
    public boolean LinkedListverify(String username, String password) throws NoSuchAlgorithmException {
        String storedPassword = linkedList.get(username);
        return storedPassword != null && SecureHashAlgorithm.verifyPassword(password, storedPassword);
    }
}
