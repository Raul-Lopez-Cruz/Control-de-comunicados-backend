package ito.dsos.compras.implement;

import ito.dsos.compras.model.ComunicadoModel;
import ito.dsos.compras.repository.ComunicadoRepository;
import ito.dsos.compras.service.ComunicadoService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComunicadoServiceImplement implements ComunicadoService {

    private final Log LOG = LogFactory.getLog(ComunicadoService.class);

    @Autowired
    private ComunicadoRepository comunicadoRepository;

    @Override
    public List<ComunicadoModel> getAll() {
        return comunicadoRepository.findAll();
    }

    @Override
    public Optional<ComunicadoModel> getById(Integer id) {
        return comunicadoRepository.findById(id);
    }

    @Override
    public ComunicadoModel save(ComunicadoModel comunicado) {
        return comunicadoRepository.save(comunicado);
    }

    @Override
    public ComunicadoModel update(int parseInt, ComunicadoModel comunicado) {
        return comunicadoRepository.save(comunicado);
    }

    @Override
    public void delete(int parseInt) {
        comunicadoRepository.deleteById(parseInt);
    }

    @Override
    public void deleteById(int parseInt) {
        comunicadoRepository.deleteById(parseInt);
    }

    @Override
    public Optional<ComunicadoModel> findById(Integer id) {
        return comunicadoRepository.findById(id);
    }

    @Override
    public List<ComunicadoModel> findAll() {
        return comunicadoRepository.findAll();
    }
}
