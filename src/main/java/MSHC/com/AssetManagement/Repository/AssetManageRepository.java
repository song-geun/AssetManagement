package MSHC.com.AssetManagement.Repository;

import MSHC.com.AssetManagement.Entity.AssetManage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.expression.spel.ast.NullLiteral;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssetManageRepository extends JpaRepository<AssetManage, Integer> {
    @Procedure("USP_AssetMange")
    List<AssetManage> findAll(String PrsTypePARAM, String IPPARAM,
                              String USECHKPARAM, String AssetTypePARAM,
                              String HostNamePARAM, String departmentPARAM,
                              String ModelPARAM, String UserNamePARAM,
                              String BuyDatePARAM, Double PricePARAM,
                              String SupplierPARAM, String BuyFlagPARAM, String REMARKPARAM, String OsTypePARAM,
                              String OsInstlPARAM, String CPUPARAM,
                              String MemoryPARAM, String SSDPARAM,
                              String HDDPARAM, String VGAPARAM,
                              String SoftWarePARAM);
}
