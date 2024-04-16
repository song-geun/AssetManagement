package MSHC.com.AssetManagement.Entity;

import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AssetType {
    private Long AssetTypeId;
    private String AssetTypeName;
}
