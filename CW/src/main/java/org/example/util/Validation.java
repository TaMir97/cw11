package org.example.util;

public class Validation {
    public static boolean passwordChecker(String password) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,20}$";
        return password.matches(regex);
    }

    public static boolean phoneNumberChecker(String phoneNumber) {
        String regex = "^\\+98[\\- ]?0?(?:9[0-3|9]\\d{8}|[1-8]\\d{9})$";
        return phoneNumber.matches(regex);
    }

    public static boolean nationalCodeChecker(String nationalCode) {
        String regex = "^(?!(0{10}|1{10}|2{10}|3{10}|4{10}|5{10}|6{10}|7{10}|8{10}|9{10}))[0-9]{10}$";
        return nationalCode.matches(regex);
    }
}
