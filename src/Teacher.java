public class Teacher extends Student{

    public Teacher(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }
}
