package cl.ferremas.ms.ms_inventario_bff.dto;

import java.math.BigDecimal;

public class InventarioDto {
    private Long id;
    private String nombre;
    private Integer stock;
    private BigDecimal precio;

    public InventarioDto() {}

    public InventarioDto(Long id, String nombre, Integer stock, BigDecimal precio) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    // Getters y setters

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public BigDecimal getPrecio() {
        return precio;
    }
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
}
