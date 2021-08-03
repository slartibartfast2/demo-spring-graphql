package ea.slartibarfast.demo.graphql.domain.model.graphql;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerInput {

    private String firstName;
    private String lastName;
    private String taxNumber;
}
