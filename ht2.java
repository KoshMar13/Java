package HT;

// import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ht2 {
    public static void main(String[] args) {
        // Напишите метод, который принимает на вход строку (String)
        // и определяет является ли строка палиндромом (возвращает boolean значение).
        Scanner iScanner = new Scanner(System.in, "ibm866");
        System.out.print("Insert string for checking: ");
        String inp = iScanner.nextLine();
        iScanner.close();
        if (inp.length() == 0) {
            throw new IllegalArgumentException("String must not be empty!");
        }
        System.out.println(palindromeCheck(inp));
        System.out.println(palindromeStream(inp));
        System.out.println(Palindrome(inp));

    }

    public static boolean palindromeCheck(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        char[] inpMod = str.toCharArray();
        // System.out.println(Arrays.toString(inpMod));
        int len = inpMod.length;
        boolean flag = true;
        for (int i = 0; i < len / 2; i++) {
            if (inpMod[i] != inpMod[len - 1 - i]) {
                flag = false;
            }
        }
        return flag;
    }

    public static boolean palindromeStream(String str) {
        String temp = str.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));

    }

    public static boolean Palindrome(String text) {
        String replaced = text.toLowerCase().replaceAll("\\s+", "");
        String reversed = new StringBuffer(replaced).reverse().toString();
        return reversed.equals(replaced);
    }

}
