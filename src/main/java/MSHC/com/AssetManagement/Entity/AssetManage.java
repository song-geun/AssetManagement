package MSHC.com.AssetManagement.Entity;

import jakarta.persistence.*;
import lombok.*;


@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class AssetManage {
    @Id
    @Column
    private Long assetnum;
    @Column
    private String ip;
    @Column
    private String usechk; // Y,N
    @Column
    private String assettype;
    @Column
    private String hostname;
    @Column
    private String department;
    @Column
    private String username;
    @Column
    private String model;
    @Column
    private String buydate;
    @Column
    private Double price;
    @Column
    private String supplier;
    @Column
    private String buyflag;
    @Column
    private String remark;
    @Column
    private String ostype;
    @Column
    private String osinstl;
    @Column
    private String cpu;
    @Column
    private String memory;
    @Column
    private String ssd;
    @Column
    private String hdd;
    @Column
    private String vga;
    @Column
    private String software;
}
