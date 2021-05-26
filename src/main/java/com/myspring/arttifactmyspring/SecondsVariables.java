/*
*
* Сколько Дней в секундах
*
*
*
 */


 com.myspring.arttifactmyspring;

public class SecondsVariables {
    public static void main(String[] args) {
        int seconds = 5000;
        int minutes = seconds / 60;
        int hours = minutes / 60;
        int days = hours / 24;
        //int leftoverdays  = (seconds - minutes * 60) / 60 / 60 / 24 ;
        System.out.println("секунд: " + seconds + "  минут: " + minutes + "  часов: " + hours + "  дней: " + days);
    }
}
