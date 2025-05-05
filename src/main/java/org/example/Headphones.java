package org.example;

public class Headphones implements AudioOutput {
    private boolean initialized;

    @Override
    public boolean initialize() {
        this.initialized = true;
        return true;
    }

    @Override
    public void playAudio(byte[] audioData) {
        if(!this.initialized) throw new IllegalArgumentException("Headphones are not initialzed");
        System.out.println("Headphones is playing");
    }

    @Override
    public void stop() {
        System.out.println("Headphones is stopped");
    }

    @Override
    public String getDeviceName() {
        return "this is a HeadPhones";
    }
}

