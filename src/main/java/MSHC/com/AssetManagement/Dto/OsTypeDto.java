package MSHC.com.AssetManagement.Dto;

import MSHC.com.AssetManagement.Entity.a_ostype_t;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OsTypeDto {
    private Long osid;
    private String osname;
    public OsTypeDto from(a_ostype_t ostype) {
        return OsTypeDto.builder().osid(ostype.getOsid()).osname(ostype.getOsname()).build();
    }
}
