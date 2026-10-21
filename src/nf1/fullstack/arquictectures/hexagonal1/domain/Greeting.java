package nf1.fullstack.arquictectures.hexagonal1.domain;

public class Greeting {
    private final String message;

    public Greeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
