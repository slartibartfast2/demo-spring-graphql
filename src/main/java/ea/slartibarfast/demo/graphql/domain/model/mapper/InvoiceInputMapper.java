package ea.slartibarfast.demo.graphql.domain.model.mapper;

import ea.slartibarfast.demo.graphql.domain.model.entity.Invoice;
import ea.slartibarfast.demo.graphql.domain.model.graphql.InvoiceInput;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InvoiceInputMapper {

    Invoice invoiceInputToEntity(InvoiceInput invoiceInput);
}
