/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.validation;

/**
 *
 * @author kunwa
 */
public class Validation {

    private static final String NAME_REGEX = "^[a-zA-Z ]*$";
    private static final String ALPHANUMERIC_REGEX = "^[a-zA-Z 0-9_-]+$";
    private static final String PRICE_REGEX = "^(0|[1-9]\\d*)(\\.\\d+)?$";
    private static final String TEN_DIGIT_NUMBER_REGEX = "^\\d{10}$";
    private static final String ADDRESS_REGEX = "^[a-zA-Z0-9,.-_\\/ ]*$";

    public static boolean isValidName(String name) {
        return name.matches(NAME_REGEX);
    }

    public static boolean isValidPrice(String price) {
        return price.matches(PRICE_REGEX);
    }

    public static boolean isValidPhone(String phone) {
        return phone.matches(TEN_DIGIT_NUMBER_REGEX);
    }

    public static boolean isValidAddress(String address) {
        return address.matches(ADDRESS_REGEX);
    }

    public static boolean isValidRestaurantName(String restaurantName) {
        return restaurantName.matches(ALPHANUMERIC_REGEX);
    }
    
    public static boolean isValidUsername(String username) {
        return username.matches(ALPHANUMERIC_REGEX);
    }
    
    public static boolean isValidPassword(String password) {
        return password.matches(ALPHANUMERIC_REGEX);
    }
}
