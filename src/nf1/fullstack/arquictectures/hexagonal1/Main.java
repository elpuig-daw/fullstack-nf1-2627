package nf1.fullstack.arquictectures.hexagonal1;

import nf1.fullstack.arquictectures.hexagonal1.adapter.CompositeOutputAdapter;
import nf1.fullstack.arquictectures.hexagonal1.adapter.ConsoleOutputAdapter;
import nf1.fullstack.arquictectures.hexagonal1.adapter.FileOutputAdapter;
import nf1.fullstack.arquictectures.hexagonal1.domain.GreetingService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConsoleOutputAdapter outputAdapter = new ConsoleOutputAdapter();
        FileOutputAdapter fileOutputAdapter = new FileOutputAdapter();
        CompositeOutputAdapter compositeOutputAdapter = new CompositeOutputAdapter(
                List.of(outputAdapter,fileOutputAdapter)
        );
        GreetingService greetingService = new GreetingService(compositeOutputAdapter);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriu el teu nom: ");
        String name = scanner.nextLine();

        greetingService.greet(name);
    }
}