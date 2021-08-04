package ea.slartibarfast.demo.graphql.resolver;

import com.graphql.spring.boot.test.GraphQLResponse;
import com.graphql.spring.boot.test.GraphQLTestTemplate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.IOException;

import static graphql.Assert.assertNotNull;
import static graphql.Assert.assertTrue;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class InvoiceMutableResolverIT {

    @Autowired
    private GraphQLTestTemplate graphQLTestTemplate;

    @Test
    public void should_create_invoice() throws IOException {
        //given

        //when
        GraphQLResponse response = graphQLTestTemplate.postForResource("graphql/createInvoice.graphql");

        //then
        assertNotNull(response);
        assertTrue(response.isOk());
    }
}
