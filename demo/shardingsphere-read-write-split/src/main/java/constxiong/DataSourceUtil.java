package constxiong;

import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

public final class DataSourceUtil {

    private static final int PORT = 3306;

    public static DataSource createDataSource(String ip, String username, String password, String dataSourceName) {
        HikariDataSource result = new HikariDataSource();
        result.setDriverClassName(com.mysql.jdbc.Driver.class.getName());
        result.setJdbcUrl(String.format("jdbc:mysql://%s:%s/%s?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF-8", ip, PORT, dataSourceName));
        result.setUsername(username);
        result.setPassword(password);
        return result;
    }
}