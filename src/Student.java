public class Student {

    protected String firstName;
    protected String lastName;
    protected int id;
    protected int grade;

    public Student(){

    }

    public Student(String firstName, String lastName, Integer id, Integer grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void lastName() {
    }
}
