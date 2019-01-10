package se.atchIT.Connections;

import java.sql.*;


public class DataManager {
    private static void Delete() {
        try {
            String sql = "Delete from students where id =? ";

            PreparedStatement ps = ConnectionConfig.prepareStatement(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static void Insert() {
        try {
            String sql = "insert into users (name, lastname) ";
            PreparedStatement ps = ConnectionConfig.prepareStatement(sql);

            ps.executeUpdate();
            System.out.println("Data inserted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
