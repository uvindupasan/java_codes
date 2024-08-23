package com.example.lightcontrol;

public class LightTest {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light kitchenLight = new Light("Kitchen Room");
        Light livingRoomLight = new Light("Living Room");

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        LightDimCommand kitchenLightDim50 = new LightDimCommand(kitchenLight, 50);
        LightDimCommand kitchenLightDim100 = new LightDimCommand(kitchenLight, 100);

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightDimCommand livingRoomLightDim30 = new LightDimCommand(livingRoomLight, 30);
        LightDimCommand livingRoomLightDim100 = new LightDimCommand(livingRoomLight, 100);

        remote.setCommand(0, kitchenLightOn, kitchenLightOff);
        remote.setCommand(1, livingRoomLightOn, livingRoomLightOff);

        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        remote.onButtonWasPushed(0);
        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);
        remote.onButtonWasPushed(1);

        kitchenLightDim50.execute();
        kitchenLightDim100.execute();
        livingRoomLightDim30.execute();
        livingRoomLightDim100.execute();
    }
}
