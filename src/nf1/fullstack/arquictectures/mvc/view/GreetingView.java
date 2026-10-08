package nf1.fullstack.arquictectures.mvc.view;

import java.util.Scanner;

public class GreetingView {
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Prompts the user for a name. Typing "quit" will exit.
     */
    public String readName() {
        System.out.print("Introdueix el teu nom (o 'quit' per sortir): ");
        return scanner.nextLine().trim();
    }

    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }

    public void showGoodbye() {
        System.out.println("Adéu!");
    }
}
