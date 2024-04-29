package MSHC.com.AssetManagement.Entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class a_assettype_t {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long assettypeid;
    @Column
    private String assettypename;
}