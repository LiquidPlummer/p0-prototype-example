import controllers.NonStaticController;
import controllers.TestController;
import daos.TestTableDAO;
import io.javalin.Javalin;
import models.TestTable;
import utils.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EntryPoint {
    public static void main(String[] args) {

        Javalin app = Javalin.create().start(7000);
        Connection conn = ConnectionFactory.getConnection();
        NonStaticController nonStaticController = new NonStaticController(app, conn);
        TestController.init(app);


    }
}
