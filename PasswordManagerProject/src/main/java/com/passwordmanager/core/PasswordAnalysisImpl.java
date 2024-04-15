package main.java.com.passwordmanager.core;

import java.util.regex.Pattern;

public class PasswordAnalysisImpl implements PasswordAnalysis {

    @Override
    public boolean isPasswordStrong(String password) {
        Pattern strongPasswordPattern = Pattern.compile("^(?=.*[0-9])(?=.*[A-Z]).{8,}$");
        return strongPasswordPattern.matcher(password).matches();
    }
}
