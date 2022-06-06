package ito.dsos.compras.controller;

import ito.dsos.compras.model.ComunicadoModel;
import ito.dsos.compras.service.ComunicadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/comunicados")
@CrossOrigin(origins = "*")
public class ComunicadoController {

    @Autowired
    private ComunicadoService comunicadoService;

    @GetMapping("/")
    public List<ComunicadoModel> getAll() {
        return comunicadoService.getAll();
    }

    @GetMapping("/{id}")
    public ComunicadoModel get(@PathVariable String id) {
        return comunicadoService.getById(Integer.parseInt(id)).orElseThrow(() -> new NoSuchElementException("No existe el comunicado"));
    }

    @PostMapping("/")
    public ComunicadoModel post(@RequestBody ComunicadoModel comunicado) {
        return comunicadoService.save(comunicado);
    }

    @PutMapping("/{id}")
    public ComunicadoModel put(@PathVariable String id, @RequestBody ComunicadoModel comunicado) {
        return comunicadoService.update(Integer.parseInt(id), comunicado);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        comunicadoService.delete(Integer.parseInt(id));
    }

}
