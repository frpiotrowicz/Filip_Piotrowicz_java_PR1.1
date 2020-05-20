package com.company.devices;

import com.company.creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;

public class Phone extends Device {
    Double screenSize;
    String osystem;
    static final String defAppServer = "https://niceapps.com";
    static final String defProtocol = "https";
    static final String defAppVersion = "5.1";

    public Phone(String producer,
                 String model,
                 int yearOfProduction,
                 Double value,
                 Double screenSize,
                 String osystem) {
        super(producer, model, yearOfProduction, value);
        this.screenSize = screenSize;
        this.osystem = osystem;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", osystem='" + osystem + '\'' +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("turn the power on");

    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.getCash() > price)
        {
            if (seller.phone.equals(this))
            {
                buyer.phone = this;
                seller.phone = null;
                seller.setCash(seller.getCash()+price);
                buyer.setCash(buyer.getCash()-price);
                System.out.println("allright you bought " + this + "for " + price);
            }
            else {
                System.out.println("seller do not own this phone");
            }
        } else {
            System.out.println("buyer do not have enough money");
        }

    }

    public void installAnnApp(String appName) throws MalformedURLException {
        installAnnApp(appName, defAppVersion);
    }

    public void installAnnApp(String appName, String version) throws MalformedURLException {
        installAnnApp(appName, version, defAppServer);
    }

    public void installAnnApp(String appName, String version, String appServer) throws MalformedURLException {
        URL url = new URL(defProtocol,
                defAppServer,
                451,
                appName + " " + version);
        installAnnApp(url);
    }

    public void installAnnApp(String[] appList) throws MalformedURLException {
        for (int i = 0; i < appList.length; i++) {
            installAnnApp(appList[i]);
        }
    }

    public void installAnnApp(URL url) {
        System.out.println("app " + url.getFile() + " has been instaled");
    }
}
