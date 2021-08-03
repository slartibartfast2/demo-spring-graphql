package ea.slartibarfast.demo.graphql.domain.model.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


@Entity(name = "invoice")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Invoice {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private Long id;
    private String invoiceNumber;
    private BigDecimal totalAmount;
    private String currencyCode;
    private String issueDate;
    private String status;
    @OneToMany(mappedBy = "invoice", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<InvoiceLine> lines;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private Customer customer;
}
