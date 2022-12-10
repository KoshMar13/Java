package HT;

import java.util.*;

public class ht5 {
    static Scanner sc = new Scanner(System.in, "ibm866");

    public static void main(String[] args) {
        System.out.print("Insert roman number: ");
        String inp = sc.nextLine().toUpperCase();

        // Map<String, Integer> roman = Map.of("I", 1, "V", 5, "X", 10, "L", 50, "C",
        // 100, "D", 500, "M", 1000);
        // roman.put("IV", 4);
        // roman.put("IX", 9);
        // roman.put("XL", 40);
        // roman.put("XC", 90);
        // roman.put("CD", 400);
        // roman.put("CM", 900);
        int answer = roman2arab(inp);
        System.out.println(inp + " = " + answer);
        // System.out.print("Insert number: ");
        // int inp2 = sc.nextInt();
        // if (inp2 > 3999){
        // throw new IllegalArgumentException("Sorry, I can convert only numbers
        // <4000");
        // }
        String answer2 = arab2roman(answer);
        System.out.println(answer + " = " + answer2);

        // * Написать метод, который переведет число из римского формата записи в
        // арабский. Например, MMXXII = 2022
        // * Написать метод, который переведёт данное целое число в римский формат.
        // *
        // * IV - 4
        // * VII - 7
        // * - I = 1
        // * - V = 5
        // * - X = 10
        // * - L = 50
        // * - C = 100
        // * - D = 500
        // * - M = 1000

    }

    public static int roman2arab(String str) {
        Map<Character, Integer> roman = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && roman.get(str.charAt(i)) > roman.get(str.charAt(i - 1))) {
                ans += roman.get(str.charAt(i)) - 2 * roman.get(str.charAt(i - 1));
            } else {
                ans += roman.get(str.charAt(i));
            }
        }
        return ans;
    }

    public static String arab2roman(int numb) {
        TreeMap<Integer, String> arab = new TreeMap<>(Collections.reverseOrder());
        arab.put(1, "I");
        arab.put(4, "IV");
        arab.put(5, "V");
        arab.put(9, "IX");
        arab.put(10, "X");
        arab.put(40, "XL");
        arab.put(50, "L");
        arab.put(90, "XC");
        arab.put(100, "C");
        arab.put(400, "CD");
        arab.put(500, "D");
        arab.put(900, "CM");
        arab.put(1000, "M");
        StringBuilder ans = new StringBuilder();
        for (Integer i : arab.keySet()) {
            for (int j = 1; j <= numb / i; j++) {
                ans.append(arab.get(i));
            }
            numb %= i;
        }
        return ans.toString();
    }
}
