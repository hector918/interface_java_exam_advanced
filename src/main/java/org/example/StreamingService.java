package org.example;
import java.nio.charset.StandardCharsets;

public class StreamingService implements AudioSource {
    private final String serviceName;
    private boolean connected;

    public StreamingService(String serviceName) {
        this.serviceName = serviceName;

    }

    @Override
    public boolean connect() {
        this.connected = true;
        return true;
    }

    @Override
    public void disconnect() {

        this.connected = false;
    }

    @Override
    public byte[] getAudioData(String trackId) {
        if(!this.connected) throw new IllegalArgumentException("Streaming service is not connected");

        return ("here is some fake data STREAMING_DATA_" + trackId).getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public String getSourceName() {
        return this.serviceName;
    }
}