package MSHC.com.AssetManagement.Service;

import MSHC.com.AssetManagement.Entity.a_assettype_t;
import MSHC.com.AssetManagement.Repository.AssetManageRepository;
import MSHC.com.AssetManagement.Repository.AssetTypeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class AssetTypeService {
    private static final Logger log = LoggerFactory.getLogger(AssetManageService.class);
    private final AssetTypeRepository assetTypeRepository;

    @Autowired
    public AssetTypeService(AssetTypeRepository assetTypeRepository)
    {
        this.assetTypeRepository = assetTypeRepository;
    }

    public List<a_assettype_t> findAll()
    {
        final List<a_assettype_t> assetTypes;
        assetTypes = assetTypeRepository.USP_AssetType("S1", 0L,"");
        return assetTypes.isEmpty() ? Collections.emptyList() : assetTypes;
    }
    public void insert(Long assetTypeId, String assetTypeName)
    {
        assetTypeRepository.USP_AssetType_I("I1", assetTypeId, assetTypeName);
    }
    public void DeleteAll()
    {
        assetTypeRepository.USP_AssetType_I("D2", 0L, "");
    }
    public void Delete(Long assetTypeId)
    {
        assetTypeRepository.USP_AssetType_I("D1", assetTypeId, "");
    }
}
