package ito.dsos.compras.repository;

import ito.dsos.compras.model.ComunicadoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Repository
public interface ComunicadoRepository extends JpaRepository<ComunicadoModel, Integer> {

}
