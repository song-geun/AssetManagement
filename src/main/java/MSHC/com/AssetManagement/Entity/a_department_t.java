package MSHC.com.AssetManagement.Entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class a_department_t {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentid;
    @Column
    private String departmentname;
}
