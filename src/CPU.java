public class CPU extends baseComponent {
    private String type;

    public CPU(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static class Builder {
        private String name;
        private double price;
        private String type;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public CPU build() {
            if (name == null || price <= 0 || type == null) {
                throw new RuntimeException("Missing mandatory fields for CPU");
            }
            return new CPU(name, price, type);
        }
    }
}
