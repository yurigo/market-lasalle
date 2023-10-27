package business.consumer;

import java.time.LocalDate;

public class Teacher extends Consumer  {

    //Integer expertiseYears;
    LocalDate initDate;

//    public Teacher(String login) {
//        super(login);
//    }

    public Teacher(String login, LocalDate initDate) {
        super(login);
        this.initDate = initDate;
    }
}
