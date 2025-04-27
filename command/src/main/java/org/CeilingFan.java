package org;

public class CeilingFan {
    String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.name + " ceiling fan is on");
    }

    public void off() {
        System.out.println(this.name + " ceiling fan is off");
    }

}
