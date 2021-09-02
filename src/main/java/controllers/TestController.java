package controllers;

import daos.TestTableDAO;
import io.javalin.Javalin;
import io.javalin.http.Context;
import models.TestTable;
import utils.ConnectionFactory;

import java.sql.SQLException;

public class TestController {
    private static Javalin javalin;

    public static void init(Javalin app) {
        javalin = app;
        app.get("/test", TestController::testConnection);
        app.post("/test/:id", TestController::insertTestData);

    }

    public static void testConnection(Context ctx) {
        ctx.status(200);
        ctx.result("Test Received!");
    }

    public static void insertTestData(Context ctx) throws SQLException {
        TestTableDAO dao = new TestTableDAO(ConnectionFactory.getConnection());
        TestTable row = ctx.bodyAsClass(TestTable.class);
        dao.save(row);
    }

}
