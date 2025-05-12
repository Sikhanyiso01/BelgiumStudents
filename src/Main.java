import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            StudentList studentList = new StudentList();
            studentList.Initialize();

        System.out.println("Displaying Students");

        for (Student student : studentList.getStudents()){
            System.out.println(student);
            System.out.println("------------------------------------");
            System.out.println();
        }

        System.out.println("-----------------------------------------------------------");
        Scanner sc = new Scanner(System.in);

        System.out.println("How many students you want to add? ");
        int numberOfStudent = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= numberOfStudent; i++) {
            addStudent add = new addStudent();
            add.addStudentPrompt();
        }

        System.out.println("---------------------------------------------------------------");
        for (Student student : studentList.getStudents()){
            student.study();
        }

    }
}