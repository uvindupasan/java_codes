package com.example.lightcontrol;

public class KitchenRoomLight extends Light {
    private int brightness;

    public KitchenRoomLight(String location) {
        super(location);
    }

    @Override
    public void on() {
        brightness = 100;
        System.out.println("Kitchen light is ON");
    }

    @Override
    public void off() {
        brightness = 0;
        System.out.println("Kitchen light is OFF");
    }

    @Override
    public void dim(int level) {
        brightness = level;
        System.out.println("Kitchen light dimmed to " + brightness + "%");
    }

    public int getBrightness() {
        return brightness;
    }
}