package MSHC.com.AssetManagement.Repository;

import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Slf4j
class AssetManageRepositroyV1Test {
    AssetManageRepositroyV1 repositroyV1;

    @BeforeEach
    void beforeEach() throws Exception {
        HikariDataSource dataSource = new HikariDataSource();
        repositroyV1 = new AssetManageRepositroyV1(dataSource);
    }

    @Test
    void s1()
    {
        log.info("start");

        repositroyV1.
    }
}