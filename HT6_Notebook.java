package HT.HT6;

import java.util.*;

public class Notebook {
    static Scanner sc = new Scanner(System.in, "ibm866");
    private Map<String, String> notebook = new HashMap<>();
    Map<String, String> nB = newNb();

    public Map<String, String> newNb() {
        System.out.print("Insert name: ");
        String name = sc.nextLine().toLowerCase();
        notebook.put("name", name);
        System.out.print("Insert RAM's volume: ");
        String ram = sc.nextLine();
        notebook.put("RAM", ram);
        // System.out.print("Insert videocard's mark: ");
        // String video = sc.nextLine().toLowerCase();
        // notebook.put("video", video);
        System.out.print("Insert drive's volume: ");
        String drive = sc.nextLine();
        notebook.put("drive", drive);
        // System.out.print("Insert processor's mark: ");
        // String proc = sc.nextLine().toLowerCase();
        // notebook.put("processor", proc);
        // System.out.print("Insert color: ");
        // String color = sc.nextLine().toLowerCase();
        // notebook.put("color", color);
        System.out.print("Insert diagonal: ");
        String diag = sc.nextLine();
        notebook.put("diagonal", diag);
        return notebook;
    }

    public Set<String> nbChars() {
        Set<String> filter = nB.keySet();
        return filter;
    }

    public void printNb() {
        System.out.println(notebook);
    }

    public boolean nbContains(String str) {
        if (nB.containsValue(str)) {
            return true;
        }
        return false;
    }

    public double getDouble(String str) {
        return Double.parseDouble(nB.get(str));
    }
}
