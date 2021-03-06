import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("This program lets you search for a string within a phrase.\n");

        System.out.print("Please enter a phrase: ");
        String phrase = scn.nextLine().toLowerCase();
        System.out.print("What would you like to search the phrase for? ");
        String search = scn.nextLine().toLowerCase();
        if (phrase.contains(search)) {
            System.out.println("Your program contains at least one instance of '" + search + "'!\n");
        } else {
            System.out.println("Your program does not contain '" + search + "'.");
        }
    }
}