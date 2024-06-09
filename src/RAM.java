public class RAM extends baseComponent {
    private int size;

    public RAM(String name, double price, int size) {
        super(name, price);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}