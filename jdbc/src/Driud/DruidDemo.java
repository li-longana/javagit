package Driud;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;


//import druid.*;
/*
* Druid数据库连接池演示
* */
public class DruidDemo  {
    public static void main(String[] args) throws Exception {
        //      1、导入JAR包

        //2、定义配置文件

        //3、加载配置文件
        Properties prop=new Properties();
        prop.load(new FileInputStream("jdbc/src/druid.properties"));
        //4、获取连接池对象
        DataSource dataSource= DruidDataSourceFactory.createDataSource(prop);
        //5.获取对象的数据库链接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

    }

}
