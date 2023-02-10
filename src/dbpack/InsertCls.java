package dbpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertCls {
    public static void main(String[] args) throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "GR99", "1234");

        String sqlcomand = "INSERT INTO BOOKS VALUES (gr99_seq.NEXTVAL,'LEPIRCHI','CEYMS KOPER',480,40,TO_DATE('28.03.2018','DD.MM.YYYY'),'AY')";

        PreparedStatement pst = con.prepareStatement(sqlcomand);

        pst.execute();
    }
}
