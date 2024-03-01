import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
public class JavaJDBCinsert {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbcdemo", "root", ""
            );
            PreparedStatement ps = null;
            String sql = "insert into  student values('4','kuldip1','20')";

            ps = connection.prepareStatement(sql);
            int rows;
            rows=ps.executeUpdate();
            if(rows>0)
            {
                System.out.println("record insert sucessfully");
            }else {
                System.out.println("fail");
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
