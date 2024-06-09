public class Computer {
    private CPU cpu;
    private Motherboard motherboard;
    private RAM ram;
    private SuplayUnit psu;
    private Case computerCase;
    private GPU gpu;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.motherboard = builder.motherboard;
        this.ram = builder.ram;
        this.psu = builder.psu;
        this.computerCase = builder.computerCase;
        this.gpu = builder.gpu;
    }

    public static class Builder {
        private CPU cpu;
        private Motherboard motherboard;
        private RAM ram;
        private SuplayUnit psu;
        private Case computerCase;
        private GPU gpu;

        public Builder setCPU(CPU cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setMotherboard(Motherboard motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        public Builder setRAM(RAM ram) {
            this.ram = ram;
            return this;
        }

        public Builder setPSU(SuplayUnit psu) {
            this.psu = psu;
            return this;
        }

        public Builder setCase(Case computerCase) {
            this.computerCase = computerCase;
            return this;
        }

        public Builder setGPU(GPU gpu) {
            this.gpu = gpu;
            return this;
        }

        public Computer build() {
            if (cpu == null || motherboard == null || ram == null || psu == null || computerCase == null || gpu == null) {
                throw new RuntimeException("Missing mandatory components for Computer");
            }
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu.getName() +
                ", motherboard=" + motherboard.getName() +
                ", ram=" + ram.getName() +
                ", psu=" + psu.getName() +
                ", case=" + computerCase.getName() +
                ", gpu=" + gpu.getName() +
                '}';
    }
}

