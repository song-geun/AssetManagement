package MSHC.com.AssetManagement.Controller;

import MSHC.com.AssetManagement.Dto.AssettypeDto;
import MSHC.com.AssetManagement.Entity.a_assettype_t;
import MSHC.com.AssetManagement.Service.AssetTypeService;
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
@RequestMapping("/AssetType")
public class AssetTypeController {
    private final AssetTypeService assetTypeService;

    @Autowired
    public AssetTypeController(AssetTypeService assetTypeService) {
        this.assetTypeService = assetTypeService;
    }

    @GetMapping("/list")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @Transactional(rollbackOn = {SQLException.class})
    public ResponseEntity<List<AssettypeDto>> findAllCities(){
        return ResponseEntity.ok(assetTypeService.findAll() // 전체를 Find 한다.
                .stream() // 스트림으로 바꿔서
                .map(AssettypeDto::from) // DTO 타입으로 모두 변경해서
                .collect(Collectors.toList())); // List형식으로 반환
    }
    @ResponseBody
    @PostMapping("/insert")
    @Transactional(rollbackOn = {SQLException.class})
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public void insertAsset(@RequestBody a_assettype_t data) {
        assetTypeService.insert(data.getAssettypeid(), data.getAssettypename()); // List형식으로 반환
    }

    @ResponseBody
    @PostMapping("/insertAll")
    @Transactional(rollbackOn = {SQLException.class})
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public void insertAsset(@RequestBody List<a_assettype_t>  dataAll) {
        //TRANS
        for (a_assettype_t data : dataAll) {
            assetTypeService.insert(data.getAssettypeid(),data.getAssettypename());
        }
        //COMMIT
    }

    @ResponseBody
    @PostMapping("/DELETE")
    @Transactional(rollbackOn = {SQLException.class})
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public void DeleteAsset(@RequestBody a_assettype_t data) {
        assetTypeService.Delete(data.getAssettypeid());
    }
}
