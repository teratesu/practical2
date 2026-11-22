package practice13;

public class PhoneFormatter {
    public static String format(String phone) {
        String number = phone.trim();

        if (number.startsWith("8") && number.length() == 11) {
            return "+7-" + formatDigits(number.substring(1));
        }

        if (number.startsWith("+")) {
            String digits = number.substring(1);
            if (digits.length() > 10) {
                String countryCode = digits.substring(0, digits.length() - 10);
                String mainNumber = digits.substring(digits.length() - 10);
                return "+" + countryCode + "-" + formatDigits(mainNumber);
            }
        }

        return "Неверный формат номера: " + phone;
    }

    private static String formatDigits(String digits) {
        if (digits.length() != 10) {
            return digits;
        }
        return digits.substring(0, 3) + "-" + digits.substring(3, 6) + "-" + digits.substring(6);
    }

    public static void main(String[] args) {
        String[] phones = {
                "+79175655655",
                "89175655655",
                "+104289652211"
        };

        for (int i = 0; i < phones.length; i++) {
            System.out.println(phones[i] + " -> " + format(phones[i]));
        }
    }
}
