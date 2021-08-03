package ea.slartibarfast.demo.graphql.domain.model.mapper;

import ea.slartibarfast.demo.graphql.domain.model.entity.Invoice;
import ea.slartibarfast.demo.graphql.domain.model.vo.InvoiceVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface InvoiceVoMapper {

    @Mapping(target = "customer.invoices", ignore = true)
    InvoiceVo invoiceToVo(Invoice invoice);
}
