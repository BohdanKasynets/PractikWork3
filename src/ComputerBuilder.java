import java.util.Scanner;

public class ComputerBuilder {
    private Inventory inventory;

    public ComputerBuilder(Inventory inventory) {
        this.inventory = inventory;
    }

    public Computer buildPC() {
        Computer.Builder builder = new Computer.Builder();

        System.out.println("Select CPU:");
        CPU selectedCPU = selectComponent(inventory.getCPUs());
        builder.setCPU(selectedCPU);

        System.out.println("Select Motherboard:");
        Motherboard selectedMotherboard = selectComponent(inventory.getMotherboards());
        builder.setMotherboard(selectedMotherboard);

        System.out.println("Select RAM:");
        RAM selectedRAM = selectComponent(inventory.getRAMs());
        builder.setRAM(selectedRAM);

        System.out.println("Select PSU:");
        SuplayUnit selectedPSU = selectComponent(inventory.getPSUs());
        builder.setPSU(selectedPSU);

        System.out.println("Select Case:");
        Case selectedCase = selectComponent(inventory.getCases());
        builder.setCase(selectedCase);

        System.out.println("Select GPU:");
        GPU selectedGPU = selectComponent(inventory.getGPUs());
        builder.setGPU(selectedGPU);

        return builder.build();
    }

    private <T extends Components> T selectComponent(T[] components) {
        for (int i = 0; i < components.length; i++) {
            System.out.println((i + 1) + ". " + components[i].getName() + " - $" + components[i].getPrice());
        }
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice < 0 || choice >= components.length) {
            System.out.print("Enter a valid number (1 to " + components.length + "): ");
            choice = scanner.nextInt() - 1; // Перетворення на індекс з нуля
        }
        return components[choice];
    }
}
