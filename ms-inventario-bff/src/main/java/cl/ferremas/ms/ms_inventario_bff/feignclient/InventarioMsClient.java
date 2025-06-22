package cl.ferremas.ms.ms_inventario_bff.feignclient;

import cl.ferremas.ms.ms_inventario_bff.dto.InventarioDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "ms-inventario-ms", url = "${ms.inventario.ms.url}")
public interface InventarioMsClient {

    @GetMapping("/inventarios")
    List<InventarioDto> getAllInventarios();

    @GetMapping("/inventarios/{id}")
    InventarioDto getInventarioById(@PathVariable Long id);

    @PostMapping("/inventarios")
    InventarioDto createInventario(@RequestBody InventarioDto inventarioDto);

    @PutMapping("/inventarios/{id}")
    InventarioDto updateInventario(@PathVariable Long id, @RequestBody InventarioDto inventarioDto);

    @DeleteMapping("/inventarios/{id}")
    void deleteInventario(@PathVariable Long id);
}
