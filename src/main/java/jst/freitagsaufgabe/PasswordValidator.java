package jst.freitagsaufgabe;

import java.util.Locale;

public class PasswordValidator {


    //Validator Main Methods ---------
    public boolean isValidPassword (String password) {

        if (isValidSimple(password)) {
            return true;
        }

        return false;
    }

    public boolean isValidPassword (String password, String group) {

        switch (group) {
            case "simple":
                if (isValidPassword(password)) {
                    return true;
                }
                break;
            case "advanced":
                if (isValidAdvanced(password)) {
                    return true;
                }
                break;
            default:
                if (isValidSimple(password)) {
                    return true;
                }
        }

        return false;
    }

    //Validation Groups (Simple, Advanced ...)

    public boolean isValidSimple(String password) {
        if (hasMinLength(password) && hasNumber(password))
            return true;

        return false;
    }

    public boolean isValidAdvanced(String password) {
        if (isValidSimple(password)) {
            if (hasLowerCase(password) && hasUpperCase(password) && !(isWeak(password))) {
                return true;
            }
        }
        return false;
    }

    //Validation Steps------------

    public boolean hasMinLength(String password) {
        if (password.length() <= 7) {
            return false;
        }
        return true;

    }

    public boolean hasNumber (String password) {
        for (int i = 0; i <= password.length() - 1; i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    //8 Numbers required
    public boolean hasLowerCase(String password){
        for (int i = 0; i <= password.length() - 1; i++ ) {
            if (Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }

        return false;
    }

    public boolean hasUpperCase(String password){
        for (int i = 0; i <= password.length() - 1; i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }

        return false;
    }

    public boolean isWeak(String password) {
        String[] weakPassword = {"123456", "123456789", "12345678", "password", "qwertz"};

        for (int i = 0; i <= weakPassword.length - 1; i++)
            if (password.toLowerCase(Locale.ROOT).equals(weakPassword[i])) {
                return true;
            }

        return false;
    }

    public boolean doesStringContains(String toCheck, char[] compareArray) {

        for (int i = 0; i <= toCheck.length() - 1; i++) {
            for (int j = 0; j <= compareArray.length - 1; j++) {
                if (toCheck.charAt(i) == compareArray[j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
