package ea.slartibarfast.demo.graphql.domain.model.mapper;

import ea.slartibarfast.demo.graphql.domain.model.entity.InvoiceLine;
import ea.slartibarfast.demo.graphql.domain.model.graphql.InvoiceLineInput;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface InvoiceLineInputMapper {

    @Mapping(target = "invoice", ignore = true)
    InvoiceLine invoiceLineInputToEntity(InvoiceLineInput invoiceLineInput);
}
