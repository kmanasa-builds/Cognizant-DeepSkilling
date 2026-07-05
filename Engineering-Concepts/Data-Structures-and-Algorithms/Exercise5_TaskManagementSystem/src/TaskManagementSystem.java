public class TaskManagementSystem {

    private TaskNode head;

    // Add Task
    public void addTask(Task task) {

        TaskNode newNode = new TaskNode(task);

        if (head == null) {
            head = newNode;
        } else {

            TaskNode current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        System.out.println("Task Added");
    }

    // Search Task
    public void searchTask(int taskId) {

        TaskNode current = head;

        while (current != null) {

            if (current.task.taskId == taskId) {
                System.out.println("Task Found");
                System.out.println(current.task);
                return;
            }

            current = current.next;
        }

        System.out.println("Task Not Found");
    }

    // Traverse Tasks
    public void displayTasks() {

        if (head == null) {
            System.out.println("No Tasks Available");
            return;
        }

        TaskNode current = head;

        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete Task
    public void deleteTask(int taskId) {

        if (head == null) {
            System.out.println("List Empty");
            return;
        }

        if (head.task.taskId == taskId) {
            head = head.next;
            System.out.println("Task Deleted");
            return;
        }

        TaskNode current = head;

        while (current.next != null &&
               current.next.task.taskId != taskId) {

            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Task Not Found");
        } else {
            current.next = current.next.next;
            System.out.println("Task Deleted");
        }
    }

    public static void main(String[] args) {

        TaskManagementSystem system =
                new TaskManagementSystem();

        system.addTask(
                new Task(
                        101,
                        "Complete Java Assignment",
                        "Pending"));

        system.addTask(
                new Task(
                        102,
                        "Prepare Presentation",
                        "In Progress"));

        system.addTask(
                new Task(
                        103,
                        "Submit Report",
                        "Completed"));

        System.out.println("\nAll Tasks:");

        system.displayTasks();

        System.out.println("\nSearching Task ID 102");

        system.searchTask(102);

        System.out.println("\nDeleting Task ID 102");

        system.deleteTask(102);

        System.out.println("\nTasks After Deletion:");

        system.displayTasks();
    }
}