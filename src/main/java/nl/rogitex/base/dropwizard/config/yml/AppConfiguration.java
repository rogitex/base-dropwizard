package nl.rogitex.base.dropwizard.config.yml;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

public class AppConfiguration extends Configuration {

    private String info;

    @JsonProperty
    public String getInfo() {
        return info;
    }

    @JsonProperty
    public void setInfo(String info) {
        this.info = info;
    }

}
