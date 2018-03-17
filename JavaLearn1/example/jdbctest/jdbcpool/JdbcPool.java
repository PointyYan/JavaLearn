package jdbctest.jdbcpool;

import com.mysql.jdbc.Driver;

import javax.sql.PooledConnection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

public class JdbcPool {

    private String jdbcDriver = ""; //数据库驱动
    private String dbUrl = ""; //数据URL
    private String dbUsername = ""; //数据库用户名
    private String dbPassword = ""; //数据库用户密码
    private String testTable = ""; //链接测试是否可用的测试表名，默认没有测试表
    private int initialConnections = 10; //连接池的初始大小
    private int incrementalConnections = 5; //连接池自动增长的大小
    private int maxConnections = 50; //连接池最大的大小
    private Vector connections = null; //存放连接池数据库连接的向量，初始时为null

    /**
     * 构造函数
     *
     * @param jdbcDriver String JDBC 驱动类串
     * @param dbUrl      String 数据库 URL
     * @param dbUsername String 连接数据库用户名
     * @param dbPassword String 连接数据库用户的密码
     */
    public JdbcPool(String jdbcDriver, String dbUrl, String dbUsername, String dbPassword) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.dbUsername = dbUsername;
        this.dbPassword = dbPassword;
    }

    /**
     * 返回连接池的初始大小
     *
     * @return 初始连接池中可获得的连接数量
     */
    public int getInitialConnections() {
        return initialConnections;
    }

    /**
     * 设置连接池的初始大小
     *
     * @param initialConnections 用于设置初始连接池中连接的数量
     */
    public void setInitialConnections(int initialConnections) {
        this.initialConnections = initialConnections;
    }

    /**
     * 返回连接池自动增加的大小 、
     *
     * @return 连接池自动增加的大小
     */
    public int getIncrementalConnections() {
        return incrementalConnections;
    }

    /**
     * 设置连接池自动增加的大小
     *
     * @param incrementalConnections 连接池自动增加的大小
     */
    public void setIncrementalConnections(int incrementalConnections) {
        this.incrementalConnections = incrementalConnections;
    }

    /**
     * 返回连接池中最大的可用连接数量
     *
     * @return 连接池中最大的可用连接数量
     */
    public int getMaxConnection() {
        return this.maxConnections;
    }

    /**
     * 设置连接池中最大可用的连接数量
     *
     * @param maxConnections 设置连接池中最大可用的连接数量值
     */
    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }

    /**
     * 获取测试数据库表的名字
     *
     * @return 测试数据库表的名字
     */
    public String getTestTable() {
        return this.testTable;
    }

    /**
     * 设置测试表的名字
     *
     * @param testTable String 测试表的名字
     */

    public void setTestTable(String testTable) {
        this.testTable = testTable;
    }

    /**
     * 创建一个数据库连接池，连接池中的可用连接的数量采用类成员 initialConnections 中设置的值
     */
    public synchronized void createPool() throws Exception {
        //确保连接池没有创建
        //如果连接池已经创建了，保存链接的向量connections不会为空
        if (connections != null) {
            return;//如果已经创建，就返回
        }
        //实例化JDBC Driver中指定的驱动类实例
        Driver driver = (Driver) (Class.forName(this.jdbcDriver).newInstance());
        DriverManager.registerDriver(driver); //注册JDBC驱动程序
        //创建保存链接的向量，初始时有0个元素
        connections = new Vector<>();
        //根据initialConnections中设置的值，创建链接
        createConnections(this.initialConnections);
        //System.out.println("数据库连接池创建成功!");
    }

    /**
     * 创建由 numConnections 指定数目的数据库连接 , 并把这些连接 放入 connections 向量中
     *
     * @param numConnections
     *            要创建的数据库连接的数目
     */
    @SuppressWarnings("unchecked")
    private void createConnections(int numConnections)throws SQLException {
        //循环创建指定书目的数据库连接池
        for (int i = 0; i < numConnections; i++) {
            //是否连接池中的数据库链接的数量已经达到最大？最大值由类成员maxConnections
            //指出，如果maxConnections为0或负数，表示链接数量没有限制
            //如果连接数已经达到最大，则退出
            if (this.maxConnections > 0 && this.connections.size() >= this.maxConnections) {
                break;
            }
            //增加一个连接到连接池中（向量connections中）
            try {
                connections.addElement(new PooledConnection());
            } catch (SQLException e) {
                System.out.println("创建数据库链接失败！" + e.getMessage());
                throw new SQLException();
            }
            //System.out.println("数据库已经创建。。。");
        }
    }
}
