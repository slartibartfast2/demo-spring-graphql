package ea.slartibarfast.demo.graphql.resolver;

import ea.slartibarfast.demo.graphql.domain.model.vo.InvoiceVo;
import ea.slartibarfast.demo.graphql.service.InvoiceService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class InvoiceQueryResolver implements GraphQLQueryResolver {

    private final InvoiceService invoiceService;

    public InvoiceVo invoice(String invoiceNumber) {
        return invoiceService.findByInvoiceNumber(invoiceNumber);
    }

    public List<InvoiceVo> invoices() {
        return invoiceService.findAll();
    }

}
