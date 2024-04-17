package MSHC.com.AssetManagement.Controller;

import MSHC.com.AssetManagement.Dto.AssetManageDto;
import MSHC.com.AssetManagement.Entity.a_assetmanage_t;
import MSHC.com.AssetManagement.Service.AssetManageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<List<AssetManageDto>> findAllCities(){
        return ResponseEntity.ok(assetManageService.findAll() // 전체를 Find 한다.
                .stream() // 스트림으로 바꿔서
                .map(AssetManageDto::from) // DTO 타입으로 모두 변경해서
                .collect(Collectors.toList())); // List형식으로 반환
    }
    @ResponseBody
    @PostMapping("/insert")
    public void insertAsset(@RequestBody a_assetmanage_t  data)
    {
        assetManageService.insertAsset(data.getIp(),data.getUsechk(),data.getAssettype(),data.getHostname(),data.getDepartment(),
                        data.getUsername(), data.getModel(), data.getBuydate(), data.getPrice(), data.getSupplier(), data.getBuyflag(), data.getRemark(),
                        data.getOstype(),data.getOsinstl(),data.getCpu(),data.getMemory(),data.getSsd(),data.getHdd(),data.getVga(),data.getSoftware()); // List형식으로 반환
    }
    //test
    /*
    @GetMapping("/list/{str}")
    public ResponseEntity<List<AssetManageDto>> findCitysStartWith(@PathVariable final String str){
        return ResponseEntity.ok(assetManageService.findCitiesStartWith(str) // 만족하는 전체를 가져와서
                .stream() // 스트림으로
                .map(AssetManageDto::from) // DTO로 변경
                .collect(Collectors.toList())); // List로 반환
    }
     */
}
