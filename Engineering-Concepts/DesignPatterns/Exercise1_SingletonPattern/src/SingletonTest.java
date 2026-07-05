public class SingletonTest {

    public static void main(String[] args) {

        // Get the first Logger instance
        Logger logger1 = Logger.getInstance();
        logger1.log("Application started.");

        // Get the second Logger instance
        Logger logger2 = Logger.getInstance();
        logger2.log("User logged in.");

        // Verify that both references point to the same object
        if (logger1 == logger2) {
            System.out.println("\nBoth logger objects are the same instance.");
        } else {
            System.out.println("\nDifferent logger instances created.");
        }
    }
}