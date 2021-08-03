package ea.slartibarfast.demo.graphql.domain.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity(name = "customer")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Customer {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private Long id;
    private String firstName;
    private String lastName;
    private String taxNumber;
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<Invoice> invoices;
}
