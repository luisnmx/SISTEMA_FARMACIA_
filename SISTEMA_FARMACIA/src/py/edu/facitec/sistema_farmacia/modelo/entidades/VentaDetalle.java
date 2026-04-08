package py.edu.facitec.sistema_farmacia.modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "venta_detalle")
public class VentaDetalle {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private double cantidad;

    @Column(nullable = false)
    private double precio;

    // MUCHOS detalles  UNA venta
    @ManyToOne
    @JoinColumn(name = "venta_id")
    private Venta venta;

    // MUCHOS detalles  UN producto
    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

    // MUCHOS detalles  UN lote
    @ManyToOne
    @JoinColumn(name = "lote_id")
    private Lote lote;

    public VentaDetalle() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }
}