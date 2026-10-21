package nf1.fullstack.arquictectures.hexagonal1.domain;

import nf1.fullstack.arquictectures.hexagonal1.appplication.OutputPort;

public class GreetingService {
    private final OutputPort output;

    public GreetingService(OutputPort output) {
        this.output = output;
    }

    public void greet(String name) {
        Greeting greeting = new Greeting("Hola, " + name + "!");
        //String message = "Hola, " + name + "!";
        output.send(greeting.getMessage());
    }
}
