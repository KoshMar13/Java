package HT;

import java.util.*;

public class ht4 {
    static Scanner sc = new Scanner(System.in, "ibm866");

    public static void main(String[] args) {
        // System.out.print("Insert array's length: ");
        // int arrLen = sc.nextInt();
        // List<String> inpList = randomList(arrLen);
        // System.out.println("Input list: " + inpList.toString());

        // 0.1) Написать метод, который принимает массив элементов, помещает их в стэк и
        // выводит на консоль содержимое стэка.
        // task01(inpList);
        // 0.2) Написать метод, который принимает массив элементов, помещает их в
        // очередь и выводит на консоль содержимое очереди.
        // task02(inpList);
        // 1 Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
        // вернет “перевернутый” список.
        // LinkedList<String> ans = task3(inpList);
        // System.out.println("Reversed: " + ans.toString());
        // * 2 Реализовать консольное приложение, которое:
        // * Принимает от пользователя строку вида
        // * text~num
        // * Нужно рассплитить строку по ~, сохранить text в связный список на позицию
        // num.
        // * Если введено print~num, выводит строку из позиции num в связном списке и
        // удаляет её из списка.
        // * Если ввод не содержит символа ~, то завершает программу с ошибкой.
        // * Если введено -1, то выходим
        task4();
        // System.out.println(task4());
        sc.close();
    }

    public static List<String> randomList(int len) {
        List<String> numbs = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            numbs.add(Integer.toString(random.nextInt(1000)));
        }
        return numbs;
    }

    public static void task01(List<String> lst) {
        Stack<String> stack = new Stack<>();
        stack.addAll(lst);
        System.out.println(stack);
        // System.out.println(Arrays.toString(stack.toArray()));
    }

    public static void task02(List<String> lst) {
        Queue<String> queue = new LinkedList<>();
        queue.addAll(lst);
        System.out.println(queue);
    }

    public static <T> LinkedList<T> task3(List<T> lst) {
        LinkedList<T> lList = new LinkedList<>();
        lList.addAll(lst);
        LinkedList<T> outList = new LinkedList<>();
        for (int i = lList.size() - 1; i >= 0; i--) {
            outList.add(lList.get(i));
        }
        return outList;
    }

    public static LinkedList<String> task4() {
        Map<Integer, String> temp = new HashMap<>();
        LinkedList<String> list = new LinkedList<>();
        String word = "";
        while (true) {
            System.out.print("Insert string (formated as string~number): ");
            word = sc.nextLine();
            if (word.equals("-1")) {
                break;
            }
            if (!word.contains("~")) {
                throw new IllegalArgumentException("Incorrect format");
            }
            if (word.contains("print~")) {
                String[] print = word.split("~");
                int printIndex = Integer.parseInt(print[1]);
                // String ans = list.get(printIndex);
                System.out.println(list.get(printIndex));
                list.remove(list.get(printIndex));
            }
            String[] words = word.split("~");
            String str = words[0];
            Integer num = Integer.parseInt(words[1]);
            temp.put(num, str);
            // }

            int listLen = Collections.max(temp.keySet());
            for (int i = 0; i < listLen; i++) {
                list.add(null);
            }
            for (Map.Entry<Integer, String> entry : temp.entrySet()) {
                list.add(entry.getKey(), entry.getValue());
            }
        }
        return list;

    }

}
