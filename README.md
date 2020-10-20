1) Build project
	$ mvn clean package

2) Start the appllication
	$ java -jar target/base-dropwizard-app.jar server config/config.yml

3) Test the info endpoint
    $ curl http://localhost:8080/info
