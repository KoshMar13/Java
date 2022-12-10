package HT.HT6;

import java.util.*;

/**
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
 * методы. Реализовать в java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий (или
 * критерии) фильтрации и выведет ноутбуки,
 * отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем HHD или SSD
 * 3 - Операционная система
 * 4 - Цвет …
 * Далее нужно запросить минимальные значения для указанных критериев -
 * сохранить параметры фильтрации можно также в Map.
 * Отфильтровать ноутбуки из первоначального множества и вывести проходящие по
 * условиям.
 */

public class ht6 {
    static Scanner sc = new Scanner(System.in, "ibm866");

    public static void main(String[] args) {
        List<Notebook> notebooks = new ArrayList<>();
        System.out.print("Insert quantity:");
        int len = sc.nextInt();
        for (int i = 0; i < len; i++) {
            System.out.println("Insert notebook's data:");
            Notebook nb = new Notebook();
            notebooks.add(nb);
        }
        // for (Notebook x : notebooks) {
        // x.printNb();
        // }
        nbFilter(notebooks);

        sc.close();
    }

    public static void nbFilter(List<Notebook> inp) {
        System.out.print("Insert filter criteria: ");
        sc.nextLine();
        String filCrit = sc.nextLine();
        List<Notebook> nbFiltered = new ArrayList<>();
        if (filCrit.equals("RAM") || filCrit.equals("drive") || filCrit.equals("diagonal")) {
            System.out.print("Insert minimal value: ");
            int min = sc.nextInt();
            sc.nextLine();
            System.out.print("Insert maximal value: ");
            int max = sc.nextInt();
            sc.nextLine();
            for (Notebook x : inp) {
                if (x.getDouble(filCrit) <= max && x.getDouble(filCrit) >= min) {
                    nbFiltered.add(x);
                }
            }
        } else {
            for (Notebook x : inp) {
                if (x.nbContains(filCrit)) {
                    nbFiltered.add(x);
                }
            }
        }
        if (nbFiltered.isEmpty()) {
            System.out.println("No matches");
        }
        for (Notebook x : nbFiltered) {
            x.printNb();
        }
    }
}
