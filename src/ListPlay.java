import java.util.Scanner;
import java.util.ArrayList;

public class ListPlay {
    public static ArrayList<String> list = new ArrayList<>(10);
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String choice;

        for (int i = 0; i < 10; i++) {
            list.add(i,"epic" + i);
        }

        while (true) {

            System.out.println(" ");
            choice = Helper.getRegExString(scan, "Options: \nA - Add item to list \nD - Delete item from list \nP - Print out list \nQ - Quit the program ", "[AaDdPpQq]");

            if (choice.equalsIgnoreCase("a")) {
                add();
            } else if (choice.equalsIgnoreCase("d")) {
                delete();
            } else if (choice.equalsIgnoreCase("p")) {
                printList();
            } else if (choice.equalsIgnoreCase("q")) {
                break;
            }
        }
    }

    // Prompts the user to add a value to the list
    public static void add() {
        String item = Helper.getNonZeroLenString(scan, "What do you want to add?");
        list.add(item);
    }

    // Prompts the user for an index and deletes the value at such index
    public static void delete() {
        int item = Helper.getRangedInt(scan, "What do you want to delete? (# value on the list)", 0, list.size());
        list.remove(item-1);
        scan.nextLine();
    }

    // Prints out the list
    public static void printList() {
        System.out.println(" ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}