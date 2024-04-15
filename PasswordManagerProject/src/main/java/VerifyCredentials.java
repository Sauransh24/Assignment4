package main.java;
import main.java.com.passwordmanager.core.PasswordManager;
import main.java.com.passwordmanager.core.PasswordAnalysisImpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class VerifyCredentials {
    public static void main(String[] args) {
        PasswordManager manager = new PasswordManager();
        PasswordAnalysisImpl analysis = new PasswordAnalysisImpl();

        String filePath = "PasswordManagerProject/resources/CredentialsStore.csv";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String username = parts[0];
                    String password = parts[1];

                    if (analysis.isPasswordStrong(password)) {
                        manager.hashtablestore(username, password);
                        boolean verifiedHash = manager.hashtableverify(username, password);

                        manager.LinkedListstore(username, password);
                        boolean verifiedLinkedList = manager.LinkedListverify(username, password);

                        manager.UnsortedArraystore(username, password);
                        boolean verifiedUnsortedArray = manager.UnsortedArrayverify(username, password);

                        System.out.println(username + " - Hash Table Verified: " + verifiedHash + ", Linked List Verified: " + verifiedLinkedList+ ", Unsorted Array Verified: " + verifiedUnsortedArray);
                    } else {
                        System.out.println(username + " - Password doesn't meet th strength requirements.");
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
