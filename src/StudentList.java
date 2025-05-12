import java.util.ArrayList;
import java.util.List;

public class StudentList {
    static ArrayList students = new ArrayList();

    public void Initialize(){
        students.add(new DiplomaStudent("601089", "Saziso", "Buthelezi", "Diploma" ));
        students.add(new DiplomaStudent("601078", "Sizwe", "Viviers", "Diploma" ));
        students.add(new DegreeStudent("678977", "Vince", "Collins", "Degree" ));
        students.add(new DegreeStudent("654567", "Tom", "Nhlanzi", "Degree" ));
    }

    public static void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getStudents(){
        return students;
    }
}
