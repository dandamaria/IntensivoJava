package academy.devdojo.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
        System.out.println(c);
        System.out.println(d);
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        DiaNoGi();

    }

    private static void DiaNoGi(){
        Calendar calendar = Calendar.getInstance();
        int resp = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        System.out.println("no gi essa semana é: ");
        switch (resp){
            case 1:
            case 4:
                System.out.println("segunda");
                break;
            case 2:
            case 5:
                System.out.println("quarta");
                break;
            case 3:
                System.out.println("sexta");
                break;
            default:
                System.out.println("não sei");
                break;
        }
    }
}
