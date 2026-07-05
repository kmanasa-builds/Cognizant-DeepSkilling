public class Main {

    public static void main(String[] args) {

        // Email only
        System.out.println("=== Email Notification ===");
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Your order has been placed.");

        System.out.println();

        // Email + SMS
        System.out.println("=== Email + SMS Notification ===");
        Notifier smsNotifier = new SMSNotifierDecorator(new EmailNotifier());
        smsNotifier.send("Your order has been shipped.");

        System.out.println();

        // Email + SMS + Slack
        System.out.println("=== Email + SMS + Slack Notification ===");
        Notifier fullNotifier = new SlackNotifierDecorator(
                new SMSNotifierDecorator(
                        new EmailNotifier()));

        fullNotifier.send("Your order has been delivered.");
    }
}