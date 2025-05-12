public class DegreeStudent extends  Student{
    public DegreeStudent(String studentNumber, String studName, String surname, String course){
        super(studentNumber, studName, surname, course);
    }

    @Override
    public void study(){
        System.out.println(studName + " " +  surname + " is studying "  + course);
    }

}
