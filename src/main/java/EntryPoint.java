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
        TestController.init(app);



        List<TestTable> stub = new ArrayList<>();
        TestTable row1 = new TestTable();
        row1.setStringId(1);
        row1.setString("This is a string");
        TestTable row2 = new TestTable();
        row2.setStringId(1);
        row2.setString("This is a string");
        stub.add(row1);
        stub.add(row2);










//
//
//        TestTableDAO testTable = new TestTableDAO(conn);
//        List<TestTable> resultsList = null;
//        try {
//            resultsList = testTable.getAll();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("================ test_table =================");
//        if(resultsList != null) {
//            for (TestTable row : resultsList) {
//                System.out.println("string_id: ["
//                        + row.getStringId()
//                        + "]   string: ["
//                        + row.getString()
//                        + "]");
//            }
//        }
//        System.out.println("=============== /test_table =================");
//
//

    }
}
