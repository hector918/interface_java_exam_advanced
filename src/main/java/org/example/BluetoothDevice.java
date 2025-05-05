package org.example;

public class BluetoothDevice implements AudioOutput {
    private final String deviceName;
    private boolean initialized;

    public BluetoothDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public boolean initialize() {
        return true;
    }

    @Override
    public void playAudio(byte[] audioData) {
        System.out.println(this.deviceName + " is playing");
    }

    @Override
    public void stop() {
        System.out.println(this.deviceName + " is stopped");
    }

    @Override
    public String getDeviceName() {
        return "Bluetooth: TestSpeaker";
    }
}
