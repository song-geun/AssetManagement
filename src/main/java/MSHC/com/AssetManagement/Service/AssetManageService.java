package MSHC.com.AssetManagement.Service;

import MSHC.com.AssetManagement.Entity.a_assetmanage_t;
import MSHC.com.AssetManagement.Repository.AssetManageRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Service
public class AssetManageService {
    private static final Logger log = LoggerFactory.getLogger(AssetManageService.class);
    private final AssetManageRepository assetManageRepository;

    @Autowired
    public AssetManageService(AssetManageRepository assetManageRepository) {
        this.assetManageRepository = assetManageRepository;
    }
    @Transactional
    public List<a_assetmanage_t> findAll() {
        final List<a_assetmanage_t> Assets;
        Assets = assetManageRepository.USP_AssetMange("S1", "", "","","","","","","", 0.0,"","","","","","","","","","","");
        return Assets.isEmpty() ? Collections.emptyList() : Assets;
    }
    @Transactional
    public List<a_assetmanage_t> insertAsset(String IPPARAM,
                              String USECHKPARAM, String AssetTypePARAM,
                              String HostNamePARAM, String departmentPARAM,
                              String ModelPARAM, String UserNamePARAM,
                              String BuyDatePARAM, Double PricePARAM,
                              String SupplierPARAM, String BuyFlagPARAM, String REMARKPARAM, String OsTypePARAM,
                              String OsInstlPARAM, String CPUPARAM,
                              String MemoryPARAM, String SSDPARAM,
                              String HDDPARAM, String VGAPARAM,
                              String SoftWarePARAM)
    {
        final List<a_assetmanage_t> Assets = new ArrayList<>();
        assetManageRepository.USP_AssetMange_I("I1", IPPARAM, USECHKPARAM, AssetTypePARAM,
                HostNamePARAM, departmentPARAM, ModelPARAM, UserNamePARAM, BuyDatePARAM, PricePARAM, SupplierPARAM, BuyFlagPARAM, REMARKPARAM,
                OsTypePARAM, OsInstlPARAM, CPUPARAM, MemoryPARAM, SSDPARAM, HDDPARAM, VGAPARAM, SoftWarePARAM);
        return  Assets.isEmpty() ? Collections.emptyList() : Assets;
    }
}
