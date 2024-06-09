public class Inventory {
    private CPU[] cpus;
    private Motherboard[] Motherboards;
    private RAM[] rams;
    private SuplayUnit[] psus;
    private Case[] cases;
    private GPU[] gpus;

    public Inventory() {
        cpus = new CPU[] {
                new CPU("Intel i5", 200, "Intel"),
                new CPU("AMD Ryzen 5", 180, "AMD")
        };

        Motherboards = new Motherboard[] {
                new Motherboard("ASUS Intel Motherboard", 100, "Intel"),
                new Motherboard("MSI AMD Motherboard", 90, "AMD")
        };

        rams = new RAM[] {
                new RAM("Corsair 8GB", 50, 8),
                new RAM("G.Skill 16GB", 100, 16)
        };

        psus = new SuplayUnit[] {
                new SuplayUnit("Corsair 550W", 70, 550),
                new SuplayUnit("EVGA 650W", 90, 650)
        };

        cases = new Case[] {
                new Case("NZXT H510", 70),
                new Case("Cooler Master Q300L", 50)
        };

        gpus = new GPU[] {
                new GPU("NVIDIA GTX 1660", 220, 6),
                new GPU("AMD RX 580", 200, 8)
        };
    }

    public CPU[] getCPUs() {
        return cpus;
    }

    public Motherboard[] getMotherboards() {
        return Motherboards;
    }

    public RAM[] getRAMs() {
        return rams;
    }

    public SuplayUnit[] getPSUs() {
        return psus;
    }

    public Case[] getCases() {
        return cases;
    }

    public GPU[] getGPUs() {
        return gpus;
    }
}