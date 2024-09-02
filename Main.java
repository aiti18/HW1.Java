import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
         String Initializ; //название из нескольких слов не инициализированный

         final int NUM = 7; //“NUM” с типом данных int

         String word = "Nata"; //“word” с типом данных String

         Initializ = NUM + word; //объявление в пункте 1

         System.out.println("Initaliz:" + Initializ); //Распечатка в консоли
         System.out.println("NUM:" + NUM);
         System.out.println("word:" + word);
         // если значение константы “NUM” меньше нуля - “Вы сохранили отрицательное число”,
         // если же значение больше нуля - “Вы сохранили положительное число”,

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
        //вывод в консоль строку
        System.out.print("Введите ваше имя: ");
        //поприветстсвие ползователя 
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Привет, " + userName + "!");
        scanner.close();


    }
}