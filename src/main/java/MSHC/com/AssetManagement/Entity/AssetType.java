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
public class AssetType {
    @Id
    private Long assettypeid;
    private String assettypename;
}
