package jdbctest.jdbctest2;


import java.sql.*;

public class jdbc {

    private static Connection getConn() {
        String driver = "com.mysql.jdbc.Connection";
        String url = "jdbc:mysql://localhost:3306/runoob";
        String username = "root";
        String password = "yjq9735";
        Connection conn = null;
        try {
            Class.forName(driver); //classLoader,加载对应驱动
            conn = (Connection) DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    private static int insert(Website website) {
        Connection connection = getConn();
        int i = 0;
        String sql = "insert into websites (id,name,url,alexa,country) values(?,?,?,?,?)";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, website.getId());
            preparedStatement.setString(2, website.getName());
            preparedStatement.setString(3, website.getUrl());
            preparedStatement.setString(4, website.getAlexa());
            preparedStatement.setString(5, website.getCountry());
            i = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    private static int update(Website website) {
        Connection connection = getConn();
        int i = 0;
        String sql = "update websites set Name='"+website.getName()+"'where alexa='"+website.getAlexa()+"'";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(sql);
            i = preparedStatement.executeUpdate();
            System.out.println("result: " + i);
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    private static Integer getAll() {
        Connection connection = getConn();
        String sql = "select * from websites";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            int col = rs.getMetaData().getColumnCount();
            System.out.println("==============================");
            while (rs.next()) {
                for (int i = 1; i <= col; i++) {
                    System.out.println(rs.getString(i) + "\t");
                    if ((i == 2) && (rs.getString(i).length() < 18)) {
                        System.out.println("\t");
                    }
                }
                System.out.println("");
            }
            System.out.println("==============================");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static int delete(String name) {
        Connection connection = getConn();
        int i = 0;
        String sql = "delete from websites where name='" + name + "'";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            i = preparedStatement.executeUpdate();
            System.out.println("result: " + i);
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    public static void main(String[] args) {
        jdbc.getAll();
//        jdbc.insert(new Website("ceshi", "ceshi", "11", "ceshi"));
//        jdbc.getAll();
//        jdbc.update(new Website("xiugaiceshi","","11",""));
//        jdbc.getAll();
//        jdbc.delete("ceshi");
//        jdbc.getAll();
    }

}
