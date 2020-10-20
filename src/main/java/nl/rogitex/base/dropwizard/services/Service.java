package nl.rogitex.base.dropwizard.services;

import nl.rogitex.base.dropwizard.config.AppConfigItems;

public class Service {

    private AppConfigItems configItems;

    public Service() {
        configItems = AppConfigItems.getInstance();
    }

    public String info() {
        return configItems.getInfo();
    }

    public String lookup(String json) {
        return json;
    }

}

