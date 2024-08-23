package com.example.lightcontrol;

public class LivingRoomLight extends Light {
    private int brightness;

    public LivingRoomLight(String location) {
        super(location);
    }

    @Override
    public void on() {
        brightness = 100;
        System.out.println("Living room light is ON");
    }


    @Override
    public void off() {
        brightness = 0;
        System.out.println("Living room light is OFF");
    }

    @Override
    public void dim(int level) {
        brightness = level;
        System.out.println("Living room light dimmed to " + brightness + "%");
    }

    public int getBrightness() {
        return brightness;
    }
}
