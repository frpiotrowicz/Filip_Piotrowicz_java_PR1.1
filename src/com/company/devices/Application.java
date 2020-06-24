package com.company.devices;

public class Application implements Comparable<Application> {
    public String appName;
    public Double appVersion;
    public Double appValue;

    public Application(String appName, Double appVersion, Double appValue) {
        this.appName = appName;
        this.appVersion = appVersion;
        this.appValue = appValue;
    }

    public int compareTo(Application o) {
        return this.appName.compareTo(o.appName);
    }

}
