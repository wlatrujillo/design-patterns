package org;

public class Light {

    String name;

    public Light() {
        this.name = "";
    }

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.name + " light is On!");
    }

    public void off() {
        System.out.println(this.name + " light is Off");
    }
}
