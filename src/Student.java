public abstract class Student {

    protected String studentNumber;
    protected String studName;
    protected String surname;
    protected String course;

    public Student(String studentNumber, String studName, String surname, String course){
        this.studentNumber = studentNumber;
        this.studName = studName;
        this.surname = surname;
        this.course =  course;
    }

    public abstract void study();

    @Override
    public String toString(){
        return "Student Number: " + studentNumber + "\n" +
                "Student Name:"  + studName + "\n " +
                "Surname:    " + surname + "\n" +
                "course:    "  + course;

    }
}
