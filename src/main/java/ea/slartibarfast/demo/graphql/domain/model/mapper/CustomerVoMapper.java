package ea.slartibarfast.demo.graphql.domain.model.mapper;

import ea.slartibarfast.demo.graphql.domain.model.entity.Customer;
import ea.slartibarfast.demo.graphql.domain.model.vo.CustomerVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerVoMapper {

    @Mapping(target = "invoices", ignore = true)
    CustomerVo customerToVo(Customer customer);
}
