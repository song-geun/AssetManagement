package MSHC.com.AssetManagement.Dto;

import MSHC.com.AssetManagement.Entity.a_department_t;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DepartmentDto {
    private Long departmentid;
    private String departmentname;
    public static DepartmentDto from(a_department_t department) {
        return DepartmentDto.builder().
                departmentid(department.getDepartmentid()).
                departmentname(department.getDepartmentname()).
                build();
    }
}
