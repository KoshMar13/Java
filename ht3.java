package HT.HT3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
import java.util.List;

public class ht3 {
    static Scanner sc = new Scanner(System.in, "ibm866");

    public static void main(String[] args) {
        // 1. Пусть дан произвольный список целых чисел, удалить из него четные числа
        // System.out.print("Insert array's length: ");
        // int arrLen = sc.nextInt();
        // List<Integer> inpList = randomList(arrLen);
        // task1(inpList);
        // // 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и
        // // среднее из этого списка.
        // task2(inpList);
        // 3.* Написать простой класс ТелефонныйСправочник, который хранит в себе список
        // фамилий и телефонных номеров.
        // В этот телефонный справочник с помощью метода add() можно добавлять записи.
        // С помощью метода get() искать номер телефона по фамилии.
        // Следует учесть, что под одной фамилией может быть несколько телефонов (в
        // случае однофамильцев),
        // тогда при запросе такой фамилии должны выводиться все телефоны.
        PhoneBook phB = new PhoneBook();
        System.out.print("Insert phonebook's length: ");
        int len = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < len; i++) {
            String number = inpNum();
            String surname = inpName();
            phB.addPh(surname, number);
        }
        phB.printPhB();
        System.out.print("To find ");
        String surnameFind = inpName();
        System.out.println(surnameFind + " has number(s): " + phB.getPh(surnameFind));

        sc.close();
    }

    public static List<Integer> randomList(int len) {
        List<Integer> numbs = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            numbs.add(random.nextInt(1000));
        }
        return numbs;
    }

    public static void task1(List<Integer> lst) {
        System.out.println("Start list: " + lst.toString());
        lst.removeIf(n -> (n % 2 == 0));
        System.out.println("List without evens: " + lst.toString());

    }

    public static void task2(List<Integer> lst) {
        System.out.println(lst.toString());
        int maxVal = Collections.max(lst);
        int minVal = Collections.min(lst);
        double sum = 0;
        for (int number : lst) {
            sum += number;
        }
        Double midVal = (sum / lst.size());
        System.out.println("Max = " + maxVal);
        System.out.println("Min = " + minVal);
        System.out.println("Mid = " + midVal);
    }

    public static String inpNum() {
        System.out.print("Insert phone number: ");
        String number = sc.nextLine();
        return number;
    }

    public static String inpName() {
        System.out.print("Insert name: ");
        String name = sc.nextLine();
        return name;
    }
}
