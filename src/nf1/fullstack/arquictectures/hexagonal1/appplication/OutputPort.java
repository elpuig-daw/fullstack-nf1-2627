package nf1.fullstack.arquictectures.hexagonal1.appplication;

public interface OutputPort {
    void send(String message);
}