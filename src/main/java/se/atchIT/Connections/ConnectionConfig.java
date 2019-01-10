package se.atchIT.Connections;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionConfig {
    private static java.sql.Connection myConn = null;
    private static PreparedStatement myStmt = null;
    private static ResultSet myRs = null;

    static {
        try {
            myConn = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost;databaseName=BusReservationSystem;user=Administrator;password=12345");

        } catch (SQLException exc) {
            exc.printStackTrace();
        }
    }
    public static void setAutoCommit(boolean state) throws SQLException {
        myConn.setAutoCommit(state);

    }

    public static void commit() throws SQLException {
        myConn.commit();
    }

    public static void rollback() throws SQLException {
        myConn.rollback();
    }

    public static PreparedStatement prepareStatement(String statement) throws SQLException {
        myStmt = myConn.prepareStatement(statement);
        return myStmt;
    }

    public static ResultSet executeQuery() throws SQLException {
        return myStmt.executeQuery();
    }

    public static void executeUpdate() throws SQLException {
        myStmt.executeUpdate();
    }
}




