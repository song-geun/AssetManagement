package MSHC.com.AssetManagement.Repository;

import MSHC.com.AssetManagement.Entity.a_assettype_t;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssetTypeRepository extends JpaRepository<a_assettype_t, Long> {
    @Procedure("USP_AssetType")
    List<a_assettype_t> USP_AssetType(@Param("prstypeparam") String prstypeparam, @Param("assettypeidparam") Long assettypeidparam,
                                      @Param("assettypenameparam") String assettypenameparam);

    @Procedure("USP_AssetType")
    void USP_AssetType_I(@Param("prstypeparam") String prstypeparam, @Param("assettypeidparam") Long assettypeidparam,
                                      @Param("assettypenameparam") String assettypenameparam);
}
