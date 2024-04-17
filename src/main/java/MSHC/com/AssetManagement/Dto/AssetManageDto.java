package MSHC.com.AssetManagement.Dto;

import MSHC.com.AssetManagement.Entity.a_assetmanage_t;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AssetManageDto {
    private final Long Assetnum;
    private final String IPPARAM;
    private final String USECHKPARAM;
    private final String AssetTypePARAM;
    private final String HostNamePARAM;

    private final String departmentPARAM;
    private final String ModelPARAM;
    private final String UserNamePARAM;
    private final String BuyDatePARAM;
    private final Double PricePARAM;
    private final String SupplierPARAM;
    private final String BuyFlagPARAM; private final String REMARKPARAM; private final String OsTypePARAM;
    private final String OsInstlPARAM; private final String CPUPARAM;
    private final String MemoryPARAM; private final String SSDPARAM;
    private final String HDDPARAM; private final String VGAPARAM;
    private final String SoftWarePARAM;
    public static AssetManageDto from(a_assetmanage_t Asset){
        return AssetManageDto.builder()
                .Assetnum(Asset.getAssetnum())
                .IPPARAM(Asset.getIp()) // 이름과
                .USECHKPARAM(Asset.getUsechk()) // id만
                .AssetTypePARAM(Asset.getAssettype())
                .HostNamePARAM(Asset.getHostname())
                .departmentPARAM(Asset.getDepartment())
                .ModelPARAM(Asset.getModel())
                .UserNamePARAM(Asset.getUsername())
                .BuyDatePARAM(Asset.getBuydate())
                .PricePARAM(Asset.getPrice())
                .SupplierPARAM(Asset.getSupplier())
                .BuyFlagPARAM(Asset.getBuyflag())
                .REMARKPARAM(Asset.getRemark())
                .OsTypePARAM(Asset.getOstype())
                .OsInstlPARAM(Asset.getOsinstl())
                .CPUPARAM(Asset.getCpu())
                .MemoryPARAM(Asset.getMemory())
                .SSDPARAM(Asset.getSsd())
                .HDDPARAM(Asset.getHdd())
                .VGAPARAM(Asset.getVga())
                .SoftWarePARAM(Asset.getSoftware())
                .build();
    }
}
