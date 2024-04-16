package MSHC.com.AssetManagement.Repository;

import MSHC.com.AssetManagement.Entity.AssetManage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.support.JdbcUtils;


import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;

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
    public ArrayList<AssetManage> find(String IP, String USECHK, String AssetType, String HostName, String department, String UserName, String Model, String BuyDate, String Price, String Supplier, String BuyFlag, String Remark, String OsType, String OsInstl, String CPU, String Memory, String SSD, String HDD, String VGA, String SoftWare) throws SQLException{
        String sql = "exec dbo.USP_AssetMAnage"
    }
}
