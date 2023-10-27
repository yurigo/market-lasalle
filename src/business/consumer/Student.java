package business.consumer;

public class Student extends Consumer{
    String area;

    public Student(String login, String area) {
        super(login);
        this.area = area;
    }
}
