public class GPU extends baseComponent {
    private int memory;

    public GPU(String name, double price, int memory) {
        super(name, price);
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }
}
