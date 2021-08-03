package ea.slartibarfast.demo.graphql.query;

import com.graphql.spring.boot.test.GraphQLResponse;
import com.graphql.spring.boot.test.GraphQLTestTemplate;
import ea.slartibarfast.demo.graphql.domain.model.vo.CustomerVo;
import ea.slartibarfast.demo.graphql.domain.model.vo.InvoiceVo;
import ea.slartibarfast.demo.graphql.service.InvoiceService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Collections;

import static graphql.Assert.assertNotNull;
import static graphql.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class InvoiceQueryIT {

    @Autowired
    private GraphQLTestTemplate graphQLTestTemplate;

    @MockBean
    private InvoiceService invoiceServiceMock;

    @Test
    public void should_find_all_invoices() throws IOException {
        //given
        CustomerVo customerVo = new CustomerVo();
        customerVo.setFirstName("Akira");
        customerVo.setLastName("K");
        customerVo.setTaxNumber("JPY-001");

        InvoiceVo invoiceVo = new InvoiceVo();
        invoiceVo.setInvoiceNumber("5");
        invoiceVo.setCustomer(customerVo);
        invoiceVo.setCurrencyCode("TRY");
        invoiceVo.setStatus("CREATED");
        invoiceVo.setIssueDate("2021-08-03");
        invoiceVo.setLines(null);
        invoiceVo.setTotalAmount(BigDecimal.TEN);
        when(invoiceServiceMock.findAll()).thenReturn(Collections.singletonList(invoiceVo));

        //when
        GraphQLResponse response = graphQLTestTemplate.postForResource("graphql/findAllInvoices.graphql");

        //then
        assertNotNull(response);
        assertTrue(response.isOk());
        assertEquals("5", response.get("$.data.invoices[0].invoiceNumber"));
    }
}
