package cl.ferremas.ms.ms_inventario_bff.controller;

import cl.ferremas.ms.ms_inventario_bff.dto.InventarioDto;
import cl.ferremas.ms.ms_inventario_bff.service.InventarioBffService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventarios-bff")
public class InventarioBffController {

    private final InventarioBffService inventarioBffService;

    public InventarioBffController(InventarioBffService inventarioBffService) {
        this.inventarioBffService = inventarioBffService;
    }

    @GetMapping
    public ResponseEntity<List<InventarioDto>> listarInventarios() {
        List<InventarioDto> lista = inventarioBffService.listarInventarios();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InventarioDto> obtenerInventario(@PathVariable Long id) {
        InventarioDto dto = inventarioBffService.obtenerInventario(id);
        return ResponseEntity.ok(dto);
    }

    @PostMapping
    public ResponseEntity<InventarioDto> crearInventario(@RequestBody InventarioDto inventarioDto) {
        InventarioDto creado = inventarioBffService.crearInventario(inventarioDto);
        return new ResponseEntity<>(creado, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<InventarioDto> actualizarInventario(@PathVariable Long id, @RequestBody InventarioDto inventarioDto) {
        InventarioDto actualizado = inventarioBffService.actualizarInventario(id, inventarioDto);
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarInventario(@PathVariable Long id) {
        inventarioBffService.eliminarInventario(id);
        return ResponseEntity.noContent().build();
    }
}
