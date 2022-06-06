package ito.dsos.compras.service;

import ito.dsos.compras.model.ComunicadoModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ComunicadoService {

    List<ComunicadoModel> getAll();

    Optional<ComunicadoModel> getById(Integer id);

    ComunicadoModel save(ComunicadoModel comunicado);

    ComunicadoModel update(int parseInt, ComunicadoModel comunicado);

    void delete(int parseInt);

    void deleteById(int parseInt);

    Optional<ComunicadoModel> findById(Integer id);

    List<ComunicadoModel> findAll();
}
