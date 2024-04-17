package MSHC.com.AssetManagement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class a_assettype_t {
    @Id
    private Long assettypeid;
    private String assettypename;
}
