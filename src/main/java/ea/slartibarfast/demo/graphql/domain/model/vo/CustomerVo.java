package ea.slartibarfast.demo.graphql.domain.model.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CustomerVo {

    private String firstName;
    private String lastName;
    private String taxNumber;
    private List<InvoiceVo> invoices;
}
