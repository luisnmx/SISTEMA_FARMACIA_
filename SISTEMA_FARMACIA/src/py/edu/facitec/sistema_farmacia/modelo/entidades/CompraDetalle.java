package py.edu.facitec.sistema_farmacia.modelo.entidades;

import jakarta.persistence.*;
import java.util.Date;

@Entity // Tabla en BD
@Table(name = "compra_detalle")
public class CompraDetalle {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.DATE) // Solo fecha
    @Column(name = "fecha_vencimiento")
    private Date fechaVencimiento;

    @Column(nullable = false)
    private int cantidad;

    @Column(nullable = false)
    private double costo;

    // MUCHOS detalles pertenecen a UNA compra
    @ManyToOne
    @JoinColumn(name = "compra_id")
    private Compra compra;

    // MUCHOS detalles pueden estar ligados a UN lote
    @ManyToOne
    @JoinColumn(name = "lote_id")
    private Lote lote;

    // MUCHOS detalles son de UN producto
    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

    public CompraDetalle() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}