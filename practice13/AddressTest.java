package practice13;

public class AddressTest {
    public static void main(String[] args) {
        String[] addresses = {
                "Россия, Московская область, Москва, Тверская улица, 12, корпус 2, 45",
                "Россия, Ленинградская область, Санкт-Петербург, Невский проспект, 28, 1, 10",
                "Беларусь, Минская область, Минск, улица Ленина, 5, 3, 22",
                "Казахстан, Алматинская область, Алматы, проспект Абая, 100, 1, 7"
        };

        System.out.println("Разбор через split(','):");
        for (int i = 0; i < addresses.length; i++) {
            Address address = new Address();
            address.parseWithSplit(addresses[i]);
            System.out.println((i + 1) + ") " + address);
        }

        System.out.println();
        System.out.println("Разбор через StringTokenizer (разделители ',', '.', ';'):");
        String mixed = "Россия. Московская область; Москва, Арбат, 15. корпус 1; 8";
        Address address = new Address();
        address.parseWithTokenizer(mixed);
        System.out.println(address);

        for (int i = 0; i < addresses.length; i++) {
            Address parsed = new Address();
            parsed.parseWithTokenizer(addresses[i]);
            System.out.println((i + 1) + ") " + parsed);
        }
    }
}
