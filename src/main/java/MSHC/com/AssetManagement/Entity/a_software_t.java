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
public class a_software_t {
    @Id
    private Long softwareid;
    private String softwarename;
}
