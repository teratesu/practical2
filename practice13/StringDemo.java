package practice13;

public class StringDemo {
    public static void main(String[] args) {
        String text = "I like Java!!!";
        System.out.println("Исходная строка: " + text);

        analyzeString(text);
    }

    public static void analyzeString(String str) {
        System.out.println("Последний символ: " + str.charAt(str.length() - 1));
        System.out.println("Заканчивается на \"!!!\": " + str.endsWith("!!!"));
        System.out.println("Начинается на \"I like\": " + str.startsWith("I like"));
        System.out.println("Содержит \"Java\": " + str.contains("Java"));
        System.out.println("Позиция \"Java\": " + str.indexOf("Java"));
        System.out.println("Замена \"а\" на \"о\": " + str.replace('а', 'о'));
        System.out.println("Замена \"a\" на \"o\": " + str.replace('a', 'o'));
        System.out.println("Верхний регистр: " + str.toUpperCase());
        System.out.println("Нижний регистр: " + str.toLowerCase());
        System.out.println("Подстрока \"Java\": " + str.substring(str.indexOf("Java"), str.indexOf("Java") + 4));
    }
}
