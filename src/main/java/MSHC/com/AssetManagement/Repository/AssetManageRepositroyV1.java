package MSHC.com.AssetManagement.Repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.support.JdbcUtils;


import javax.sql.DataSource;
import java.sql.*;

@Slf4j
public class AssetManageRepositroyV1 {

    private final DataSource dataSource;

    public AssetManageRepositroyV1(DataSource dataSource){
        this.dataSource = dataSource;
    }

    private void close(Connection con, Statement stmt, ResultSet rs){
        JdbcUtils.closeResultSet(rs);
        JdbcUtils.closeStatement(stmt);
        JdbcUtils.closeConnection(con);
    }

    private Connection getConnection() throws SQLException{
        Connection con = dataSource.getConnection();
        return con;
    }
}
