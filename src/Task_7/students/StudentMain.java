package Task_7.students;

public class StudentMain {
    protected int age;
    protected String name;
    protected String email;

    StudentMain(int age, String name, String email) {
        this.age = age;
        this.name = name;
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
}
