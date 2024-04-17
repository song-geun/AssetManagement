package MSHC.com.AssetManagement.Service;

import MSHC.com.AssetManagement.Entity.AssetManage;
import MSHC.com.AssetManagement.Repository.AssetManageRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class AssetManageService {
    private final AssetManageRepository assetManageRepository;

    @Autowired
    public AssetManageService(AssetManageRepository assetManageRepository) {
        this.assetManageRepository = assetManageRepository;
    }
    @Transactional
    public List<AssetManage> findAllCities() {
        final List<AssetManage> cities;
        cities = assetManageRepository.findAll("S2", "", "","","","","","","", 0.0,"","","","","","","","","","","");
        return cities.isEmpty() ? Collections.emptyList() : cities;
    }
}
