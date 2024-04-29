package MSHC.com.AssetManagement.Controller;

import MSHC.com.AssetManagement.Dto.AssetManageDto;
import MSHC.com.AssetManagement.Entity.a_assetmanage_t;
import MSHC.com.AssetManagement.Service.AssetManageService;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping("/Asset")
public class AssetController {
    private final AssetManageService assetManageService;

    @Autowired
    public AssetController(AssetManageService assetManageService) {
        this.assetManageService = assetManageService;
    }

    @GetMapping("/list")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @Transactional(rollbackOn = {SQLException.class})
    public ResponseEntity<List<AssetManageDto>> findAllCities(){
        return ResponseEntity.ok(assetManageService.findAll() // 전체를 Find 한다.
                .stream() // 스트림으로 바꿔서
                .map(AssetManageDto::from) // DTO 타입으로 모두 변경해서
                .collect(Collectors.toList())); // List형식으로 반환
    }
    @ResponseBody
    @PostMapping("/insert")
    @Transactional(rollbackOn = {SQLException.class})
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public void insertAsset(@RequestBody a_assetmanage_t  data)
    {
        assetManageService.insertAsset(data.getAssetnum(),data.getIp(),data.getUsechk(),data.getAssettype(),data.getHostname(),data.getDepartment(),
                        data.getUsername(), data.getModel(), data.getBuydate(), data.getPrice(), data.getSupplier(), data.getBuyflag(), data.getRemark(),
                        data.getOstype(),data.getOsinstl(),data.getCpu(),data.getMemory(),data.getSsd(),data.getHdd(),data.getVga(),data.getSoftware()); // List형식으로 반환
    }
    @ResponseBody
    @PostMapping("/insertAll")
    @Transactional(rollbackOn = {SQLException.class})
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public void insertAsset(@RequestBody List<a_assetmanage_t>  dataAll) {
        //TRANS
        for (a_assetmanage_t data : dataAll) {
            assetManageService.insertAsset(data.getAssetnum(),data.getIp(), data.getUsechk(), data.getAssettype(), data.getHostname(), data.getDepartment(),
                    data.getUsername(), data.getModel(), data.getBuydate(), data.getPrice(), data.getSupplier(), data.getBuyflag(), data.getRemark(),
                    data.getOstype(), data.getOsinstl(), data.getCpu(), data.getMemory(), data.getSsd(), data.getHdd(), data.getVga(), data.getSoftware()); // List형식으로 반환
        }
        //COMMIT
    }
    @ResponseBody
    @PostMapping("/DELETE")
    @Transactional(rollbackOn = {SQLException.class})
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public void DeleteAsset(@RequestBody a_assetmanage_t  data) {
        assetManageService.Delete(data.getAssetnum());
    }
    @ResponseBody
    @PostMapping("/UPDATE")
    @Transactional(rollbackOn = {SQLException.class})
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public void UPDATEAsset(@RequestBody a_assetmanage_t  data) {
        assetManageService.UpdateAsset(data.getAssetnum(),data.getIp(),data.getUsechk(),data.getAssettype(),data.getHostname(),data.getDepartment(),
                data.getUsername(), data.getModel(), data.getBuydate(), data.getPrice(), data.getSupplier(), data.getBuyflag(), data.getRemark(),
                data.getOstype(),data.getOsinstl(),data.getCpu(),data.getMemory(),data.getSsd(),data.getHdd(),data.getVga(),data.getSoftware());
    }
}
