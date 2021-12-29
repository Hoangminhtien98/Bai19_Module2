package BaiTap.valid_number_phone;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final Pattern pattern = Pattern.compile("^[(][0-9]{2}[)]-[(][0][0-9]{9}[)]+$");
    public static boolean validatePhoneNumber(String regex) {

        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(validatePhoneNumber("(84)-(0978489648)"));
        System.out.println(validatePhoneNumber("(a8)-(22222222)"));
    }
}
