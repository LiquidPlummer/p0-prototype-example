package controllers;

import io.javalin.Javalin;
import io.javalin.http.Context;

import java.sql.Connection;

public class NonStaticController {
    private Javalin app;
    private Connection conn;

    public NonStaticController(Javalin app, Connection conn) {
        this.app = app;
        this.conn = conn;

        app.get("/test-non-static", this::test);

    }

    public void test(Context ctx) {
        ctx.status(200);
        ctx.result("Test Received!");
    }
}
