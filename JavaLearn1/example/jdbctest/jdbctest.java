package jdbctest;

import java.sql.*;

public class jdbctest {

    // JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB";

    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "root";
    static final String PASS = "yjq9735";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            //注册JDBC驱动
            Class.forName("com.mysql.jdbc.Driver");

            //打开链接
            System.out.println("connecting sql.");
            connection = DriverManager.getConnection(DB_URL, USER, PASS);

            //执行查询
            System.out.println("实例化Statement对...");
            statement = connection.createStatement();
            String sql;
            sql = "SELECT id, name, url FROM websites";
            ResultSet resultSet = statement.executeQuery(sql);

            // 展开结果集数据库
            while(resultSet.next()){
                // 通过字段检索
                int id  = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String url = resultSet.getString("url");

                // 输出数据
                System.out.print("ID: " + id);
                System.out.print(", 站点名称: " + name);
                System.out.print(", 站点 URL: " + url);
                System.out.print("\n");
            }

            resultSet.close();
            statement.close();
            connection.close();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(statement!=null) statement.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(connection!=null) connection.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }

        System.out.println("Goodbye!");
    }

}
