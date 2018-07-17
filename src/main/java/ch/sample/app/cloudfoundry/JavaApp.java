package ch.sample.app.cloudfoundry;

import static spark.Spark.*;

public class JavaApp {
    public static void main(String[] args) {
        get("/", (req, res) -> "Your JavaApp is up and running!");
    }
}