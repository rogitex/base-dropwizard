package nl.rogitex.base.dropwizard.config;

/**
 * Singleton class with configuration items for the base-dropwizard project.
 */
public class AppConfigItems {

    private String info;

    /**
     * Private constructor, use getInstance().
     */
    private AppConfigItems() {
    }

    /**
     * LazyHolder for making the Singleton pattern Thread safe.
     */
    private static class LazyHolder {
        static final AppConfigItems INSTANCE = new AppConfigItems();
    }

    /**
     * @return the instance of this class
     */
    public static AppConfigItems getInstance() {
        return LazyHolder.INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
