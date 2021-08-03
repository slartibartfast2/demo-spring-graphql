package ea.slartibarfast.demo.graphql.domain.model.graphql;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceLineInput {

    private int lineNumber;
    private BigDecimal amount;
    private BigDecimal taxAmount;
}
