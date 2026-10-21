package nf1.fullstack.arquictectures.hexagonal1.adapter;


import nf1.fullstack.arquictectures.hexagonal1.appplication.OutputPort;

public class ConsoleOutputAdapter implements OutputPort {
    @Override
    public void send(String message) {
        System.out.println(message);
    }
}