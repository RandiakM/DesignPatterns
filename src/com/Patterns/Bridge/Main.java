package com.Patterns.Bridge;

import com.Patterns.Bridge.RemoteControl;
import com.Patterns.Bridge.SonyTV;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(new SonyTV());
        remoteControl.turnOn();

        RemoteControl remoteControlAdvanced = new AdvancedRemoteControl(new SonyTV());
        remoteControlAdvanced.turnOn();

        RemoteControl remoteControlSamsung = new AdvancedRemoteControl((new SamsungTV()));
        remoteControlSamsung.turnOn();
    }
}
