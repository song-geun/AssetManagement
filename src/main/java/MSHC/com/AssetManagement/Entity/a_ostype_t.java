package MSHC.com.AssetManagement.Entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class a_ostype_t {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long osid;
    @Column
    private String osname;
}
