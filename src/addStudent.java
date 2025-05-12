import java.util.ArrayList;
import java.util.Scanner;

public class addStudent {


    StudentList studentList = new StudentList();
    Scanner sc = new Scanner(System.in);


    public void addStudentPrompt(){
        System.out.println("Please enter student Number: ");
        String stdNumber = sc.nextLine();

        System.out.println("Please enter student Name: ");
        String stdName = sc.nextLine();

        System.out.println("Please enter student surname: ");
        String stdSurname = sc.nextLine();

        System.out.println("Please enter student course: ");
        String stdCourse = sc.nextLine();

        if(stdCourse.equalsIgnoreCase("Degree")){
            studentList.addStudent(new DegreeStudent(stdNumber, stdName, stdSurname, stdCourse));
        } else if (stdCourse.equalsIgnoreCase("Diploma")) {
            studentList.addStudent(new DiplomaStudent(stdNumber, stdName, stdSurname, stdCourse));
        }else {
            System.out.println("Invalid course type, student not added");
        }


    }

}
