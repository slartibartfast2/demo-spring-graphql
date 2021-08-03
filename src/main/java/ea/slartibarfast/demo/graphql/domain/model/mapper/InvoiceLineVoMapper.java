package ea.slartibarfast.demo.graphql.domain.model.mapper;

import ea.slartibarfast.demo.graphql.domain.model.entity.InvoiceLine;
import ea.slartibarfast.demo.graphql.domain.model.vo.InvoiceLineVo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InvoiceLineVoMapper {

    InvoiceLineVo invoiceLineToVo(InvoiceLine invoiceLine);
}
