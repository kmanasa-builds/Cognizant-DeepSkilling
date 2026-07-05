public class EmployeeManagementSystem {

    Employee[] employees = new Employee[10];
    int count = 0;

    public void addEmployee(Employee employee) {

        if (count < employees.length) {
            employees[count] = employee;
            count++;

            System.out.println("Employee Added");
        }
    }

    public void searchEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == id) {

                System.out.println("Employee Found:");
                System.out.println(employees[i]);
                return;
            }
        }

        System.out.println("Employee Not Found");
    }

    public void traverseEmployees() {

        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == id) {

                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                employees[count - 1] = null;
                count--;

                System.out.println("Employee Deleted");
                return;
            }
        }

        System.out.println("Employee Not Found");
    }

    public static void main(String[] args) {

        EmployeeManagementSystem system =
                new EmployeeManagementSystem();

        system.addEmployee(
                new Employee(1, "Karteek",
                        "Developer", 50000));

        system.addEmployee(
                new Employee(2, "Rahul",
                        "Tester", 40000));

        system.addEmployee(
                new Employee(3, "Priya",
                        "Manager", 70000));

        System.out.println("\nAll Employees:");
        system.traverseEmployees();

        System.out.println("\nSearching Employee ID 2");
        system.searchEmployee(2);

        System.out.println("\nDeleting Employee ID 2");
        system.deleteEmployee(2);

        System.out.println("\nEmployees After Deletion:");
        system.traverseEmployees();
    }
}