package nf1.fullstack.arquictectures.hexagonal1.adapter;

import nf1.fullstack.arquictectures.hexagonal1.appplication.OutputPort;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileOutputAdapter implements OutputPort {
    private static final String FILE_PATH = "greetings.txt";

    @Override
    public void send(String message) {
        try {
            Files.write(
                    Paths.get(FILE_PATH),
                    (message + System.lineSeparator()).getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            System.err.println("Error escrivint al fitxer: " + e.getMessage());
        }

    }
}
