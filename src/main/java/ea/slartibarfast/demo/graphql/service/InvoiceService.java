package ea.slartibarfast.demo.graphql.service;

import ea.slartibarfast.demo.graphql.domain.model.entity.Invoice;
import ea.slartibarfast.demo.graphql.domain.model.graphql.InvoiceInput;
import ea.slartibarfast.demo.graphql.domain.model.mapper.InvoiceInputMapper;
import ea.slartibarfast.demo.graphql.domain.model.mapper.InvoiceVoMapper;
import ea.slartibarfast.demo.graphql.domain.model.vo.InvoiceVo;
import ea.slartibarfast.demo.graphql.domain.repository.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;
    private final InvoiceVoMapper invoiceVoMapper;
    private final InvoiceInputMapper invoiceInputMapper;

    public InvoiceVo findByInvoiceNumber(String invoiceNumber) {
        return invoiceRepository.findByInvoiceNumber(invoiceNumber).map(invoiceVoMapper::invoiceToVo).orElseThrow(NoSuchElementException::new);
    }

    public List<InvoiceVo> findAll() {
        return invoiceRepository.findAll().stream().map(invoiceVoMapper::invoiceToVo).collect(Collectors.toList());
    }

    public InvoiceVo createInvoice(InvoiceInput invoiceInput) {
        final Invoice invoice = invoiceInputMapper.invoiceInputToEntity(invoiceInput);
        invoiceRepository.save(invoice);
        return invoiceVoMapper.invoiceToVo(invoice);
    }
}
