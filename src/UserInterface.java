public class UserInterface {
    private ComputerBuilder pcBuilder;

    public UserInterface(ComputerBuilder pcBuilder) {
        this.pcBuilder = pcBuilder;
    }

    public void start() {
        Computer computer = pcBuilder.buildPC();
        System.out.println("Готова збірка ПК: " + computer);
    }
}
