package MSHC.com.AssetManagement.Entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class a_software_t {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long softwareid;
    @Column
    private String softwarename;
}
