package practice13;

public class Shirt {
    private String id;
    private String description;
    private String color;
    private String size;

    public Shirt(String data) {
        String[] parts = data.split(",");
        id = parts[0].trim();
        description = parts[1].trim();
        color = parts[2].trim();
        size = parts[3].trim();
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Артикул: " + id + System.lineSeparator()
                + "Описание: " + description + System.lineSeparator()
                + "Цвет: " + color + System.lineSeparator()
                + "Размер: " + size;
    }
}
