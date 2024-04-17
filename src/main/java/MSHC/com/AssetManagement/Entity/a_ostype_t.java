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
public class a_ostype_t {
    @Id
    private Long osid;
    private String osname;
}
