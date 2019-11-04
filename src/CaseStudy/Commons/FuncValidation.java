package CaseStudy.Commons;

import java.util.Scanner;

public class FuncValidation {
    private static String regex = "";
    private static Scanner sc;

    public static boolean checkNameService(String str) {
        regex = "^([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,})((\\s)([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,6}$";
        return str.matches(regex);
    }

    public static double checkValidNumberDouble(String content, String errMes) {
        while (true) {
            try {
                sc = new Scanner(System.in);
                System.out.println(content);
                return sc.nextDouble();
            } catch (Exception ex) {
                System.out.println(errMes);
            }
        }
    }

    public static Integer checkValidNumberInteger(String content, String errMes) {
        while (true) {
            try {
                sc = new Scanner(System.in);
                System.out.println(content);
                return sc.nextInt();
            } catch (Exception ex) {
                System.out.println(errMes);
            }
        }
    }
    public static boolean checkNameCustomer(String str) {
        regex = "^([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,})((\\s)([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,6}$";
        return str.matches(regex);
    }
    public static boolean checkEmail(String str) {
        regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        return str.matches(regex);
    }
    public static boolean checkBirthday(String str) {
        regex = "^(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[012])\\/((19|20)\\d\\d)$";
        return str.matches(regex);
    }
    public static boolean checkIdCard(String str) {
        regex = "^[1-9][\\d]{8}$";
        return str.matches(regex);
    }

    public static boolean checkGender(String str) {
        regex = "^[mM][aA][lL][eE]$|^[fF][eE][mM][aA][lL][eE]$|^[uU][nN][kK][nN][oO][wW][nN]$";
        return str.matches(regex);
    }









}

