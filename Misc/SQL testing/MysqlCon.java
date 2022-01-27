import java.sql.*;
import java.util.Scanner;

class MysqlCon {
    public static void main(String args[]) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/just_crypto", "root", "K@r11k003");
            // here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your username: ");
            String username = sc.nextLine();
            System.out.println("Enter your email: ");
            String email = sc.nextLine();
            System.out.println("Enter your password: ");
            String password = sc.nextLine();

            stmt.executeUpdate("INSERT INTO user (username, email, password) VALUES ('" + username + "','" + email
                    + "','" + password + "');", Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                System.out.println("Auto Generated Primary Key " + rs.getInt(1));
            }
            rs = stmt.executeQuery("SELECT * from user");

            while (rs.next())
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +
                        rs.getString(3) + " "
                        + rs.getString(4));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}