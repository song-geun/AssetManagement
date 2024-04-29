package MSHC.com.AssetManagement.Dto;

import MSHC.com.AssetManagement.Entity.a_assettype_t;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AssettypeDto {
    private Long assettypeid;
    private String assettypename;
    public static AssettypeDto from(a_assettype_t Asset)
    {
        return AssettypeDto.builder().
                    assettypeid(Asset.getAssettypeid()).
                    assettypename(Asset.getAssettypename()).
                    build();
    }
}
