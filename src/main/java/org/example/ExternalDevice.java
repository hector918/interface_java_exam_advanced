package org.example;

public class ExternalDevice implements AudioSource {
    private final String deviceName;
    private boolean connected;

    public ExternalDevice(String deviceName) {
        this.deviceName = deviceName;
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
        if(!this.connected){
            throw new IllegalArgumentException("Device is not connected");
        }
        return "from a external device datapoint".getBytes();
    }

    @Override
    public String getSourceName() {
       return this.deviceName;
    }
}
