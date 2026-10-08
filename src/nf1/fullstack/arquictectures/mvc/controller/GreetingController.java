package nf1.fullstack.arquictectures.mvc.controller;


import nf1.fullstack.arquictectures.mvc.model.Greeting;
import nf1.fullstack.arquictectures.mvc.model.GreetingService;
import nf1.fullstack.arquictectures.mvc.view.GreetingView;

public class GreetingController {
    private final GreetingView view;
    private final GreetingService service;

    public GreetingController(GreetingView view, GreetingService service) {
        this.view = view;
        this.service = service;
    }

    public void run() {
        String name;
        while (!(name = view.readName()).equalsIgnoreCase("quit")) {
            Greeting greeting = service.greet(name);
            view.showGreeting(greeting.getMessage());
        }
        view.showGoodbye();
    }
}
