package ea.slartibarfast.demo.graphql.domain.model.graphql;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceInput {

    private String invoiceNumber;
    private BigDecimal totalAmount;
    private String currencyCode;
    private String issueDate;
    private List<InvoiceLineInput> lines;
    private CustomerInput customer;
}
