package main.java.com.passwordmanager.core;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class SecureHashAlgorithm {
    public static String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(password.getBytes());
        byte[] bytes = md.digest();
        return Base64.getEncoder().encodeToString(bytes);
    }

    public static boolean verifyPassword(String originalPassword, String storedPassword) throws NoSuchAlgorithmException {
        String hashed = hashPassword(originalPassword);
        return hashed.equals(storedPassword);
    }
}

