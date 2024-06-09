public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        ComputerBuilder pcBuilder = new ComputerBuilder(inventory);
        UserInterface ui = new UserInterface(pcBuilder);
        ui.start();
    }
}