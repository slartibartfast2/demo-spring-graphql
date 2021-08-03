package ea.slartibarfast.demo.graphql.domain.repository;

import ea.slartibarfast.demo.graphql.domain.model.entity.Customer;
import ea.slartibarfast.demo.graphql.domain.model.entity.Invoice;
import ea.slartibarfast.demo.graphql.domain.model.entity.InvoiceLine;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@Component
public class InvoiceRepositoryInitializer implements ApplicationRunner {

    private final InvoiceRepository invoiceRepository;
    private final CustomerRepository customerRepository;

    @Override
    public void run(ApplicationArguments args) {
        List<Customer> customers = Arrays.asList(
                new Customer(1L, "Akira", "K", "JPY001", null),
                new Customer(1L, "Federico", "F", "IT001", null));
        customerRepository.saveAll(customers);

        List<Invoice> invoices = Arrays.asList(
                new Invoice(-1L, "5", BigDecimal.TEN, "TRY", "2021-08-01", "CREATED", null, customers.get(0)),
                new Invoice(-2L, "6", BigDecimal.TEN, "TRY", "2021-08-02", "CREATED", null, customers.get(0)),
                new Invoice(-3L, "7", new BigDecimal("100"), "USD", "2021-08-03", "CREATED", null, customers.get(1)));
        invoiceRepository.saveAll(invoices);
    }
}