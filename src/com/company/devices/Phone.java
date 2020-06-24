package com.company.devices;

import com.company.creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Phone extends Device {
    Double screenSize;
    String osystem;
    static final String defAppServer = "https://niceapps.com";
    static final String defProtocol = "https";
    static final String defAppVersion = "5.1";
    private Set<Application> apps;

    public Phone(String producer,
                 String model,
                 int yearOfProduction,
                 Double value,
                 Double screenSize,
                 String osystem) {
        super(producer, model, yearOfProduction, value);
        this.screenSize = screenSize;
        this.osystem = osystem;
        apps = new HashSet<Application>();
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

    public void installNewApp(Human owner, Application app) {
        if (owner.getCash() > app.appValue) {
            System.out.println("congrats! you have installed " + app.appName + " application");
            this.apps.add(app);
            owner.setCash(owner.getCash() - app.appValue);
        } else {
            System.out.println("sorry you are too poor");
        }
    }

    public void isItInstalled(Application app) {
        if (this.apps.contains(app)) {
            System.out.println("yes you have " + app.appName + " installed on your phone");
        } else {
            System.out.println("sorry you dont have it");
        }
    }

    public void isItInstalled(String appName) {
        boolean isIt = false;
        Iterator<Application> i = this.apps.iterator();
        while (i.hasNext()) {

            if (i.next().appName.equals(appName)) {
                System.out.println("yes you have " + appName + " installed on your phone");
                isIt = true;
                break;
            }
        }
        if (isIt == false) {
            System.out.println("nope you dont have it");
        }
    }

    public void freeApps() {
        boolean isIt = false;
        List<Application> freeApp = new ArrayList<>();
        freeApp.addAll(apps);
        System.out.println("these are your free apps: ");
        for (int i = 0; i < freeApp.size(); i++) {
            if (freeApp.get(i).appValue == 0.0) {
                System.out.println(freeApp.get(i).appName + " " + freeApp.get(i).appVersion);
                isIt = true;
            }
        }
        if (isIt == false) {
            System.out.println("no free apps on your phone");
        }
    }

    public double appsValue() {
        double value = 0.0;
        Iterator<Application> i = this.apps.iterator();
        while (i.hasNext()) {
            value += i.next().appValue;
        }
        return value;
    }


    public void sortAlphabetically() {
        List<Application> sortedApps = new ArrayList<>();
        sortedApps.addAll(apps);
        Collections.sort(sortedApps);
        System.out.println("sorted apps: ");
        for (int i = 0; i < sortedApps.size(); i++) {
            System.out.println(sortedApps.get(i).appName);
        }
    }

    public void appsByValue() {
        List<Application> sortedApps = new ArrayList<>();
        sortedApps.addAll(apps);
        Collections.sort(sortedApps, new Comparator<Application>() {
            @Override
            public int compare(Application o1, Application o2) {
                return o1.appValue.intValue() - o2.appValue.intValue();
            }
        });
        System.out.println("sorted by value: ");
        for (int i = 0; i < sortedApps.size(); i++) {
            System.out.println(sortedApps.get(i).appName + " " + sortedApps.get(i).appValue);
        }
    }

}
