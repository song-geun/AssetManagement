package MSHC.com.AssetManagement.Repository;

import MSHC.com.AssetManagement.Entity.a_assetmanage_t;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssetManageRepository extends JpaRepository<a_assetmanage_t, Long> {
    @Procedure("USP_AssetMange")
    List<a_assetmanage_t> USP_AssetMange(@Param("prstypeparam") String prstypeparam, @Param("assetnumpram") Long assetnumpram,@Param("ipparam") String ipparam,
                                         @Param("usechkparam") String usechkparam, @Param("assettypeparam") String assettypeparam,
                                         @Param("hostnameparam") String hostnameparam, @Param("departmentparam") String departmentparam,
                                         @Param("modelparam") String modelparam, @Param("usernameparam") String usernameparam,
                                         @Param("buydateparam") String buydateparam, @Param("priceparam") Double priceparam,
                                         @Param("supplierparam") String supplierparam, @Param("buyflagparam") String buyflagparam,
                                         @Param("remarkparam") String remarkparam, @Param("ostypeparam") String ostypeparam,
                                         @Param("osinstlparam") String OsInstlPARAM, @Param("cpuparam") String CPUPARAM,
                                         @Param("memoryparam") String memoryparam, @Param("ssdparam") String ssdparam,
                                         @Param("hddparam") String hddparam, @Param("vgaparam") String vgaparam,
                                         @Param("softwareparam") String softwareparam);
    @Procedure("USP_AssetMange")
    void USP_AssetMange_I(@Param("prstypeparam") String prstypeparam,@Param("assetnumpram") Long assetnumpram,@Param("ipparam") String ipparam,
                        @Param("usechkparam") String usechkparam, @Param("assettypeparam") String assettypeparam,
                        @Param("hostnameparam") String hostnameparam, @Param("departmentparam") String departmentparam,
                        @Param("modelparam") String modelparam, @Param("usernameparam") String usernameparam,
                        @Param("buydateparam") String buydateparam, @Param("priceparam") Double priceparam,
                        @Param("supplierparam") String supplierparam, @Param("buyflagparam") String buyflagparam,
                        @Param("remarkparam") String remarkparam, @Param("ostypeparam") String ostypeparam,
                        @Param("osinstlparam") String OsInstlPARAM, @Param("cpuparam") String CPUPARAM,
                        @Param("memoryparam") String memoryparam, @Param("ssdparam") String ssdparam,
                        @Param("hddparam") String hddparam, @Param("vgaparam") String vgaparam,
                        @Param("softwareparam") String softwareparam);
}
