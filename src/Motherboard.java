public class Motherboard extends baseComponent {
    private String type;

    public Motherboard(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}