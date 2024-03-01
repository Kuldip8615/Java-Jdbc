import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
public class JavaJdbcUpdate {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbcdemo", "root", ""
            );
            PreparedStatement ps = null;
            String sql = "update  student set name='kuldip1',age='20' where id='1'";

            ps = connection.prepareStatement(sql);
            int rows;
            rows=ps.executeUpdate();
            if(rows>0)
            {
                System.out.println("record update sucessfully");
            }else {
                System.out.println("fail");
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
