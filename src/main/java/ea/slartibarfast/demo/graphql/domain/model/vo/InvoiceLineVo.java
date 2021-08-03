package ea.slartibarfast.demo.graphql.domain.model.vo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class InvoiceLineVo {

    private int lineNumber;
    private BigDecimal amount;
    private BigDecimal taxAmount;
}
