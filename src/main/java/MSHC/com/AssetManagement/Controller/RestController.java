package MSHC.com.AssetManagement.Controller;

import MSHC.com.AssetManagement.Entity.AssetManage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
@Slf4j
@Controller
public class RestController {
    @GetMapping("/s1")
    public ArrayList<AssetManage> getAllAssetManage(){
        ArrayList<AssetManage> assets = new ArrayList<>();

        return assets;
    }
}
