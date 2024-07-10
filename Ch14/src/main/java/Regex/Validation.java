package Regex;

public class Validation {
    public static boolean validateFirstName(String fN) {
        return fN.matches("[A-Z][a-zA-z]*");
    }
    public static boolean validateLastName(String lName) {
        return lName.matches("[a-zA-Z]+(['-][a-zA-z]+)*");
    }
    public static  boolean validateAddress(String add){
        return add.matches("\\d+\\s+([a-zA-z]+|[a-zA-z]+\\s+[a-zA-z]+)");
    }
    public static boolean validateCity(String city){
        return city.matches("([a-zA-z]+|[a-zA-z]+\\s[a-zA-z]+)");
    }
    public static boolean validateState(String state){
        return state.matches("([a-zA-Z]+|[a-zA-Z]+\\\\s[a-zA-Z]+)");
    }
    public static boolean validatePhoneNumber(String phoneNumber){
        return phoneNumber.matches("[1-9]\\\\d{2}-[1-9]\\\\d{2}-\\\\d{4}");
    }
}
