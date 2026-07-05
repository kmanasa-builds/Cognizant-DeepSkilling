public class Computer {

    private String cpu;
    private String ram;
    private String storage;
    private boolean graphicsCard;
    private boolean wifi;

    // Private constructor
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.wifi = builder.wifi;
    }

    // Display computer configuration
    public void displayConfiguration() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Graphics Card: " + (graphicsCard ? "Yes" : "No"));
        System.out.println("WiFi: " + (wifi ? "Yes" : "No"));
    }

    // Static Builder class
    public static class Builder {

        private String cpu;
        private String ram;
        private String storage;
        private boolean graphicsCard;
        private boolean wifi;

        public Builder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRAM(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(boolean graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setWiFi(boolean wifi) {
            this.wifi = wifi;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}