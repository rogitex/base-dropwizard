package nl.rogitex.base.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import nl.rogitex.base.dropwizard.health.HealthCheckService;
import nl.rogitex.base.dropwizard.mappers.ExceptionHandler;
import nl.rogitex.base.dropwizard.mappers.ValidationHandler;
import nl.rogitex.base.dropwizard.rest.controlers.Controller;
import nl.rogitex.base.dropwizard.riak.RiakClientManager;
import nl.rogitex.base.dropwizard.config.AppConfigItems;
import nl.rogitex.base.dropwizard.config.yml.AppConfiguration;

public class App extends Application<AppConfiguration> {

    public static void main(String[] args) throws Exception {
        new App().run(args);
    }

    @Override
    public void run(AppConfiguration configuration, Environment environment) {

        initConfig(configuration);

        // For handle start and stop procedures
        RiakClientManager riakClientManager = new RiakClientManager();
        environment.lifecycle().manage(riakClientManager);

        // Registration of the handlers / mappings
        environment.jersey().register(new ExceptionHandler());
        environment.jersey().register(new ValidationHandler());

        // Registration of the REST controllers
        environment.jersey().register(new Controller());

        // Registration of the required Dropwizard health checks
        environment.healthChecks().register("HEALTH", new HealthCheckService());

    }

    private void initConfig(AppConfiguration configuration) {
        AppConfigItems configItems = AppConfigItems.getInstance();

        // Store value from the yml file
        configItems.setInfo(configuration.getInfo());
    }

}
