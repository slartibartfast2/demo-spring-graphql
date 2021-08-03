package ea.slartibarfast.demo.graphql.domain.model.mapper;

import ea.slartibarfast.demo.graphql.domain.model.entity.Customer;
import ea.slartibarfast.demo.graphql.domain.model.graphql.CustomerInput;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerInputMapper {

    Customer customerInputToEntity(CustomerInput customerInput);
}
