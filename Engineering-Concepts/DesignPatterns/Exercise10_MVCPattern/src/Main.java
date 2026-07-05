public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Manasa");
        student.setId("101");

        StudentView view = new StudentView();

        StudentController controller =
                new StudentController(student, view);

        controller.updateView();

    }

}