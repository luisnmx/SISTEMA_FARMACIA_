package py.edu.facitec.sistema_farmacia.modelo.entidades;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 255)
    private String descripcion;

    @Column(nullable = false, length = 255)
    private String codigo;

    @Column(name = "principio_activo", length = 255)
    private String principioActivo;

    @Column(length = 100)
    private String concentracion;

    @Column(name = "forma_farmaceutica", length = 100)
    private String formaFarmaceutica;

    @Column(name = "requiere_receta", nullable = false)
    private boolean requiereReceta;

    @Column(name = "tiene_vencimiento", nullable = false)
    private boolean tieneVencimiento;

    @Column(name = "precio_venta", nullable = false)
    private double precioVenta;

    @Column(length = 45)
    private String impuesto;

    // Muchos productos pertenecen a una categoria
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    // Muchos productos pertenecen a una marca
    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;

    // Un producto puede tener muchos lotes
    @OneToMany(mappedBy = "producto")
    private List<Lote> lotes;

    // Un producto puede estar en muchos detalles de compra
    @OneToMany(mappedBy = "producto")
    private List<CompraDetalle> compraDetalles;

    // Un producto puede estar en muchos detalles de venta
    @OneToMany(mappedBy = "producto")
    private List<VentaDetalle> ventaDetalles;

    public Producto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPrincipioActivo() {
        return principioActivo;
    }

    public void setPrincipioActivo(String principioActivo) {
        this.principioActivo = principioActivo;
    }

    public String getConcentracion() {
        return concentracion;
    }

    public void setConcentracion(String concentracion) {
        this.concentracion = concentracion;
    }

    public String getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    public void setFormaFarmaceutica(String formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }

    public boolean isRequiereReceta() {
        return requiereReceta;
    }

    public void setRequiereReceta(boolean requiereReceta) {
        this.requiereReceta = requiereReceta;
    }

    public boolean isTieneVencimiento() {
        return tieneVencimiento;
    }

    public void setTieneVencimiento(boolean tieneVencimiento) {
        this.tieneVencimiento = tieneVencimiento;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(String impuesto) {
        this.impuesto = impuesto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public List<Lote> getLotes() {
        return lotes;
    }

    public void setLotes(List<Lote> lotes) {
        this.lotes = lotes;
    }

    public List<CompraDetalle> getCompraDetalles() {
        return compraDetalles;
    }

    public void setCompraDetalles(List<CompraDetalle> compraDetalles) {
        this.compraDetalles = compraDetalles;
    }

    public List<VentaDetalle> getVentaDetalles() {
        return ventaDetalles;
    }

    public void setVentaDetalles(List<VentaDetalle> ventaDetalles) {
        this.ventaDetalles = ventaDetalles;
    }
}