package org;

public class Stereo {
    int volume;

    String name;

    public Stereo() {
        this.name = "";
    }

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.name + " stereo is ON");
    }

    public void setCD() {
        System.out.println(this.name + " stereo is set for CD input");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(this.name + " stereo volume is set to " + this.volume);
    }

    public void off() {
        System.out.println(this.name + " stereo is OFF");
    }

}
