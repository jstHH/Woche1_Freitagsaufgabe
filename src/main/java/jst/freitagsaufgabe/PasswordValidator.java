package jst.freitagsaufgabe;

public class PasswordValidator {

    //Validator Main Method ---------

    public boolean isValidPassword (String password, String group) {

        switch (group) {
            case "simple":
                isValidSimple(password);
                break;
            default:
                isValidSimple(password);
        }

        return true;
    }

    //Validation Groups (Simple, Advanced ...)

    public boolean isValidSimple(String password) {
        if (hasLength(password) && hasNumber(password))
            return true;

        return false;
    }

    //Validation Steps------------

    public boolean hasLength(String password) {
        if (password.length() <= 7) {
            return false;
        }
        return true;

    }

    public boolean hasNumber (String password) {
        char[] compareArray = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        if (doesStringContains(password, compareArray))
            return true;
        return false;
    }

    //8 Numbers required
    public boolean hasLowerCase(String password){
        char[] compareArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        if (doesStringContains(password, compareArray)) {
            return true;
        }

        return false;
    }

    public boolean hasUpperCase(String password){
        char[] compareArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        if (doesStringContains(password, compareArray))
            return true;

        return false;
    }

    public boolean isWeak(String password) {
        String[] weakPassword = {"123456", "123456789", "12345678", "password", "qwertz"};

        for (int i = 0; i <= weakPassword.length - 1; i++)
            if (password.equals(weakPassword[i])) {
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
