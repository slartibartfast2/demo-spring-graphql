package ea.slartibarfast.demo.graphql.domain.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class InvoiceVo {

    private String invoiceNumber;
    private BigDecimal totalAmount;
    private String currencyCode;
    private String issueDate;
    private String status;
    private List<InvoiceLineVo> lines;
    private CustomerVo customer;
}
