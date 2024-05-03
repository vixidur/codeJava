/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlymaytinh;

import java.sql.*;
/**
 *
 * @author Admin
 */
public class Ketnoi {
    public static Connection KetnoiSQL() throws SQLException {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlmaytinh", "root", "");
        return c;
    }
}
