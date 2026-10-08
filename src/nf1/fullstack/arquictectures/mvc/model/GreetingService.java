package nf1.fullstack.arquictectures.mvc.model;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class GreetingService {

    public Greeting greet(String name) {
        DayOfWeek dow = LocalDate.now().getDayOfWeek();
        String salutation;
        if (dow == DayOfWeek.SATURDAY) {
            salutation = "Bon cap de setmana";
        } else if (dow == DayOfWeek.SUNDAY) {
            salutation = "Bon diumenge";
        } else {
            salutation = "Bon dia";
        }
        String msg = String.format("%s, %s!", salutation, name);
        return new Greeting(msg);
    }

}
