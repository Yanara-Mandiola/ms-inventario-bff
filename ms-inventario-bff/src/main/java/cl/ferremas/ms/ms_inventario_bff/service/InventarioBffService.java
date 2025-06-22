package cl.ferremas.ms.ms_inventario_bff.service;

import cl.ferremas.ms.ms_inventario_bff.dto.InventarioDto;
import cl.ferremas.ms.ms_inventario_bff.feignclient.InventarioMsClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioBffService {

    private final InventarioMsClient inventarioMsClient;

    public InventarioBffService(InventarioMsClient inventarioMsClient) {
        this.inventarioMsClient = inventarioMsClient;
    }

    public List<InventarioDto> listarInventarios() {
        return inventarioMsClient.getAllInventarios();
    }

    public InventarioDto obtenerInventario(Long id) {
        return inventarioMsClient.getInventarioById(id);
    }

    public InventarioDto crearInventario(InventarioDto inventarioDto) {
        return inventarioMsClient.createInventario(inventarioDto);
    }

    public InventarioDto actualizarInventario(Long id, InventarioDto inventarioDto) {
        return inventarioMsClient.updateInventario(id, inventarioDto);
    }

    public void eliminarInventario(Long id) {
        inventarioMsClient.deleteInventario(id);
    }
}
