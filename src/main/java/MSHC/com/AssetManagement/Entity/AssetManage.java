package MSHC.com.AssetManagement.Entity;

import lombok.*;


@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AssetManage {
    private Long AssetNum;
    private String IP;
    private String USECHK; // Y,N
    private String AssetType;
    private String HOSTNAME;
    private String department;
    private String UserName;
    private String Model;
    private String BuyDate;
    private Double price;
    private String Supplier;
    private String BuyFlag;
    private String REMARK;
    private String Ostype;
    private String Osinstl;
    private String CPU;
    private String Memory;
    private String SSD;
    private String HDD;
    private String VGA;
    private String SoftWare;
}
