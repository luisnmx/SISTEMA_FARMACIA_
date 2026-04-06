package py.edu.facitec.sistema_farmacia.modelo.entidades;


import java.util.Date;

public class CompraDetalle {
    
    private int id;
    private Date fechaVencimiento;
    private int cantidad;
    private double costo;
    private Compra compra;
    private Lote lote;
    private Producto producto;

    // Constructor vacío
    public CompraDetalle() {
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha_vencimiento() {
        return fechaVencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fechaVencimiento = fecha_vencimiento;
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