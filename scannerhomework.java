import javax.swing.*;
import java.util.Scanner;

public class scannerhomework {

    public static void main(String[] args) {
        // работы выполнил Максим Загородний
        System.out.println("Сколько коробок вы хотите отправить?");
        Scanner x = new Scanner(System.in);
        int boxes = x.nextInt();

        System.out.println("Сколько весит каждая коробка в киллограммах?");
        double weight = x.nextDouble();
        System.out.println("Введите имя получателя");
        Scanner newscanner = new Scanner(System.in);
        String name = newscanner.nextLine();
        System.out.println("Введите фамилию получателя");
        String lastname = newscanner.nextLine();
        System.out.println("Введите адрес получателя");
        String adress = newscanner.nextLine();
        System.out.println("Получатель: " + "\""+name.toUpperCase() +" "+ lastname.toUpperCase() +"\"  "+"\n"+"Адрес доставки : "+"\""+ adress.toUpperCase() + "\"\n"
          + "Общий вес :" +(boxes*weight)+"kg");

        Scanner check = new Scanner(System.in);
        System.out.println("Все значения верны?" + "пожалуйста, введите   \"Yes\" or \"No\" ");
        String checkString = check.next();
        boolean yes = true;
        boolean no = false;

    }
}
