public class SuplayUnit extends baseComponent {
    private int power;

    public SuplayUnit(String name, double price, int power) {
        super(name, price);
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}