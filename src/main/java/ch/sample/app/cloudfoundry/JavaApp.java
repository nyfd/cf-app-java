package ch.sample.app.cloudfoundry;

import static spark.Spark.*;

public class JavaApp {
    public static void main(String[] args) {
        port(8080);
        get("/", (req, res) -> "Your JavaApp is up and running!");
    }
}