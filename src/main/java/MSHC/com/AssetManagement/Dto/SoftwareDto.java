package MSHC.com.AssetManagement.Dto;

import MSHC.com.AssetManagement.Entity.a_software_t;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SoftwareDto {
    private Long softwareid;
    private String softwarename;
    public SoftwareDto from(a_software_t software) {
        return SoftwareDto.builder().softwareid(software.getSoftwareid()).softwarename(software.getSoftwarename()).build();
    }
}
