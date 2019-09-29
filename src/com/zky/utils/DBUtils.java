package com.zky.utils;

import java.sql.*;

/**
 * JDBC工具类
 */
public class DBUtils {
    public static final String DERIVERNAME = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/news";
    public static final String USER = "root";
    public static final String PASSWORD = "1234";

    static {
        try {
            //注册驱动
            Class.forName(DERIVERNAME);
        } catch (ClassNotFoundException e) {
            System.out.println("数据库驱动注册失败");
        }
    }

    /**
     * 提供获取连接的方法
     *
     * @return
     */
    public static Connection getConnection() {
        //获取连接
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //返回连接
        return conn;
    }

    /**
     * 增删改的功能封装
     *
     * @param sql
     * @return
     */
    public static int cudMethods(String sql) {
        Connection conn = null;
        Statement statement = null;
        int result = 0;
        try {
            //获取数据库连接对象
            conn = getConnection();
            //获取执行SQL的对象
            statement = conn.createStatement();
            //执行SQL
            result = statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭数据库连接对象
            close(conn, statement, null);
        }
        return result;
    }

    /**
     * 预编译形式的增删改功能封装
     *
     * @param sql
     * @param objects
     * @return
     */
    public static int cudMethods(String sql, Object... objects) {
        Connection conn = null;
        PreparedStatement ps = null;
        int result = 0;
        try {
            //获取数据库连接对象
            conn = getConnection();
            //获取执行SQL的对象
            ps = conn.prepareStatement(sql);
            //设置传递过来的参数
            for (int i = 0; i < objects.length; i++) {
                //数组下标是从零开始的，目的是为了取数组中的数据
                //占位符(?)从 1 开始，标识的是占位符的位置
                ps.setObject(i + 1, objects[i]);
            }
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭数据库连接对象
            close(conn, ps, null);
        }
        return result;
    }


    /**
     * 关闭资源的方法
     *
     * @param conn
     * @param statement
     * @param rs
     */
    public static void close(Connection conn, Statement statement, ResultSet rs) {
        //先判断再关闭，避免之前操作失败导致为空的异常发生
        try {
            //若不需要ResultSet rs，可以将参数传入null
            if (rs != null) {
                rs.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}