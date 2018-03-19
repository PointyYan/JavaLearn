package jdbctest.jdbcpool;

import java.sql.*;

public class ConnectionPoolTest {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        try {
            //创建数据库链接库对象
            JdbcPool jdbcPool = new JdbcPool(
                    "com.mysql.jdbc.Driver",
                    "jdbc:mysql://localhost:3306/runoob",
                    "root",
                    "yjq9735"
            );
            //新建数据库连接库
            jdbcPool.createPool();
            //sql测试语句
            String sql = "select * from websites";
            //设定程序运行起始时间
            long start = System.currentTimeMillis();
            //循环测试100次数据库连接
            for (int i = 0; i < 100; i++) {
                Connection conn = jdbcPool.getConnection();//从数据库中获取一个可用的连接
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    String name = rs.getString(1);
                    //System.out.println(name);
                }
                rs.close();
                stmt.close();
                jdbcPool.returnConnection(conn); // 连接使用完后释放连接到连接池
            }
            System.out.println("1.经过100次的循环调用，使用连接池花费的时间：" + (System.currentTimeMillis() - start) + "ms");
            // connPool.refreshConnections();
            // 刷新数据库连接池中所有连接，即不管连接是否正在运行，都把所有连接都释放并放回到连接池。注意：这个耗时比较大
            jdbcPool.closeConnectionPool();// 关闭数据库连接池。注意：这个耗时比较大。
            // 设定程序运行起始时间
            start = System.currentTimeMillis();
            //导入驱动
            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("!");
            for (int i = 0; i < 100; i++) {
                //创建连接
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/runoob",
                        "root",
                        "yjq9735");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    String name = rs.getString(2);
                    System.out.println(name);
                }
                rs.close();
                stmt.close();
                conn.close();// 关闭连接
            }
            System.out.println("经过100次的循环调用，不使用连接池花费的时间：" + (System.currentTimeMillis() - start) + "ms");
        }catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
