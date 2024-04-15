package main.java;

import main.java.com.passwordmanager.core.PasswordManager;
import main.java.com.passwordmanager.core.PasswordAnalysisImpl;

public class Main {
    public static void main(String[] args) {
        try {
            PasswordManager manager = new PasswordManager();
            PasswordAnalysisImpl analysis = new PasswordAnalysisImpl();

            String username = "user1";
            String password = "Password123";

            if (analysis.isPasswordStrong(password)) {
                manager.hashtablestore(username, password);
                boolean verifiedHash = manager.hashtableverify(username, password);
                System.out.println("Password verified in Hash Table: " + verifiedHash);

                manager.UnsortedArraystore(username, password);
                boolean verifiedArray = manager.UnsortedArrayverify(username, password);
                System.out.println("Password verified in Unsorted Array: " + verifiedArray);

                manager.LinkedListstore(username, password);
                boolean verifiedLinkedList = manager.LinkedListverify(username, password);
                System.out.println("Password verified in Unsorted Array: " + verifiedLinkedList);

            } else {
                System.out.println("Password does not meet strength requirements.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
