package org.designpatterns;

import org.command.app.*;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoorUpCommand garageDoorCommand = new GarageDoorUpCommand(garageDoor);


        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();

        remote.setCommand(garageDoorCommand);
        remote.buttonWasPressed();
    }
}
