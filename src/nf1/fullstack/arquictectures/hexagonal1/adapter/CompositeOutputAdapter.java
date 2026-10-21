package nf1.fullstack.arquictectures.hexagonal1.adapter;



import nf1.fullstack.arquictectures.hexagonal1.appplication.OutputPort;

import java.util.List;

public class CompositeOutputAdapter implements OutputPort {
    private final List<OutputPort> adapters;

    public CompositeOutputAdapter(List<OutputPort> adapters) {
        this.adapters = adapters;
    }

    @Override
    public void send(String message) {
        for (OutputPort adapter : adapters) {
            adapter.send(message);
        }
    }
}
