public class BuilderPatternTest {

    public static void main(String[] args) {

        Computer computer1 = new Computer.Builder()
                .setCPU("Intel Core i7")
                .setRAM("16 GB")
                .setStorage("512 GB SSD")
                .setGraphicsCard(true)
                .setWiFi(true)
                .build();

        Computer computer2 = new Computer.Builder()
                .setCPU("AMD Ryzen 5")
                .setRAM("8 GB")
                .setStorage("256 GB SSD")
                .setGraphicsCard(false)
                .setWiFi(true)
                .build();

        System.out.println("Computer 1 Configuration");
        computer1.displayConfiguration();

        System.out.println();

        System.out.println("Computer 2 Configuration");
        computer2.displayConfiguration();
    }
}