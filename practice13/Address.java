package practice13;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public void parseWithSplit(String address) {
        String[] parts = address.split(",");
        fillParts(parts);
    }

    public void parseWithTokenizer(String address) {
        StringTokenizer tokenizer = new StringTokenizer(address, ",.;");
        String[] parts = new String[tokenizer.countTokens()];
        int index = 0;

        while (tokenizer.hasMoreTokens()) {
            parts[index] = tokenizer.nextToken();
            index++;
        }

        fillParts(parts);
    }

    private void fillParts(String[] parts) {
        country = getPart(parts, 0);
        region = getPart(parts, 1);
        city = getPart(parts, 2);
        street = getPart(parts, 3);
        house = getPart(parts, 4);
        building = getPart(parts, 5);
        apartment = getPart(parts, 6);
    }

    private String getPart(String[] parts, int index) {
        if (index < parts.length) {
            return parts[index].trim();
        }
        return "";
    }

    @Override
    public String toString() {
        return "Страна: " + country + ", регион: " + region + ", город: " + city
                + ", улица: " + street + ", дом: " + house
                + ", корпус: " + building + ", квартира: " + apartment;
    }
}
