package dbpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UptadeCls {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "GR99", "1234");

        String sqlcomand = "UPDATE BOOKS SET BOOK_PUBLISHING_HOUSE = 'DAMLA' WHERE ID = 1063";

        PreparedStatement pst = con.prepareStatement(sqlcomand);

        pst.execute();



    }
}
