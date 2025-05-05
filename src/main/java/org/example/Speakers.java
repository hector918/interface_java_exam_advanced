package org.example;

public class Speakers implements AudioOutput {
    private boolean initialized;

    @Override
    public boolean initialize() {
        this.initialized = true;
        return true;
    }

    @Override
    public void playAudio(byte[] audioData) {
        if(!this.initialized) throw new IllegalArgumentException("Speakers are not initialzed");
        System.out.println("Speakers are playing");

    }

    @Override
    public void stop() {
        System.out.println("Speakers are stopped");
    }

    @Override
    public String getDeviceName() {
        return "Computer Speakers";
    }
}
