package nl.rogitex.base.dropwizard.riak;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.dropwizard.lifecycle.Managed;

/**
 * Riak-client-manager for starting and stopping services within the base-dropwizard application
 */
public class RiakClientManager implements Managed {

    private static final Logger LOGGER = LoggerFactory.getLogger(RiakClientManager.class);

    public RiakClientManager() {
    }

    @Override
    public void start() {
        LOGGER.info("*** Starting base-dropwizard application... ***");
        // Do stuff
    }

    @Override
    public void stop() {
        // Do stuff
        LOGGER.info("*** base-dropwizard application stopped. ***");
    }

}
