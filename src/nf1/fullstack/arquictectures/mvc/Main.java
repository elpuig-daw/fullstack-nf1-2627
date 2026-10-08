package nf1.fullstack.arquictectures.mvc;


import nf1.fullstack.arquictectures.mvc.controller.GreetingController;
import nf1.fullstack.arquictectures.mvc.model.GreetingService;
import nf1.fullstack.arquictectures.mvc.view.GreetingView;

public class Main {

    public static void main(String[] args) {
        GreetingView view = new GreetingView();
        GreetingService service = new GreetingService();
        GreetingController controller = new GreetingController(view, service);
        controller.run();
    }
}
