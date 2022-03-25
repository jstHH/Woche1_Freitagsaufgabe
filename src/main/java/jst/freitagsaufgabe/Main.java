package jst.freitagsaufgabe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        typeInPassword();

    }

    public static void typeInPassword() {
        PasswordValidator myValidator = new PasswordValidator();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Hallo.\nGib ein Passwort ein:");
        String password = myScanner.nextLine();

        if (myValidator.isValidPassword(password, "advanced")) {
            System.out.println(buildStringToDisplay(true, password));
            endApp();
        } else {
            System.out.println(buildStringToDisplay(false, password));
            System.out.println("Nochmal versuchen? [ja/nein]");
            if (myScanner.nextLine().equals("ja")) {
                typeInPassword();
            } else {
                endApp();
            }
        }
    }

    public static String buildStringToDisplay(boolean valid, String password) {
        if (valid) {
            return "Das Passwort " + password + " ist sicher";
        } else {
            return "Das Passwort " + password + " ist nicht sicher.\nDas Passwort muss " + "Groß- und Kleinbuchstaben dund Zahlen enthalten und darf nicht zu einfach sein.";
        }

    }

    public static void endApp() {
        System.out.println("Und Tschüss!");
        System.exit(0);
    }
}
