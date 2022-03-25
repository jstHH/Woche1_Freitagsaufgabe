package jst.freitagsaufgabe;

public class PasswordValidator {

    //Validator Main Method ---------

    public boolean isValidPassword (String password) {

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
        for (int i = 0; i <= password.length() - 1; i++) {
            for (int j = 0; j <= compareArray.length - 1; j++) {
                if (password.charAt(i) == compareArray[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    //8 Numbers required
    public boolean hasUpperCase (String password){
        return true;

    }

    public boolean hasLowerCase (String password){

        return true;
    }
}
