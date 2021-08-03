package ea.slartibarfast.demo.graphql.domain.repository;

import ea.slartibarfast.demo.graphql.domain.model.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface InvoiceRepository extends JpaRepository<Invoice, Long>, JpaSpecificationExecutor<Invoice> {

    Optional<Invoice> findByInvoiceNumber(String invoiceNumber);
}
