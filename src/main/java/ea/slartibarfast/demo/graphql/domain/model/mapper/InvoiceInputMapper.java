package ea.slartibarfast.demo.graphql.domain.model.mapper;

import ea.slartibarfast.demo.graphql.domain.model.entity.Invoice;
import ea.slartibarfast.demo.graphql.domain.model.graphql.InvoiceInput;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface InvoiceInputMapper {

    Invoice invoiceInputToEntity(InvoiceInput invoiceInput);

    @AfterMapping
    default void fillRequiredFieldsForInvoice(@MappingTarget Invoice invoice) {
        invoice.setStatus("CREATED");
        invoice.getLines().forEach(line -> line.setInvoice(invoice));
    }
}
