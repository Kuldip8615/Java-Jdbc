import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
public class JavaJdbcDelete {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbcdemo", "root", ""
            );
            PreparedStatement ps = null;
            String sql = "delete from student  where id='4'";

            ps = connection.prepareStatement(sql);
            int rows;
            rows=ps.executeUpdate();
            if(rows>0)
            {
                System.out.println("Record Delete Sucessfully");
            }else {
                System.out.println(" an NOt Delete Record");
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
