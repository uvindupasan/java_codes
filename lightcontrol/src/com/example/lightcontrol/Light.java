package com.example.lightcontrol;

public class Light {
    private String location;
    private int brightness;

    public Light(String location) {
        this.location = location;
        this.brightness = 0;
    }

    public void on() {
        brightness = 100;
        System.out.println(location + " light is ON at full brightness.");
    }

    public void off() {
        brightness = 0;
        System.out.println(location + " light is OFF.");
    }

    public void dim(int level) {
        brightness = level;
        System.out.println(location + " light dimmed to " + level + "%.");
    }

    public int getBrightness() {
        return brightness;
    }
}
