package ea.slartibarfast.demo.graphql.domain.model.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "invoice_line")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class InvoiceLine {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private Long id;
    private int lineNumber;
    private BigDecimal amount;
    private BigDecimal taxAmount;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "invoice_id", referencedColumnName = "id", nullable = false)
    private Invoice invoice;
}
