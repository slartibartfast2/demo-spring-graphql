package ea.slartibarfast.demo.graphql.resolver;

import ea.slartibarfast.demo.graphql.domain.model.graphql.InvoiceInput;
import ea.slartibarfast.demo.graphql.domain.model.vo.InvoiceVo;
import ea.slartibarfast.demo.graphql.service.InvoiceService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class InvoiceMutableResolver implements GraphQLMutationResolver {

    private final InvoiceService invoiceService;

    public InvoiceVo createInvoice(InvoiceInput invoiceInput) {
         return invoiceService.createInvoice(invoiceInput);
    }
}
