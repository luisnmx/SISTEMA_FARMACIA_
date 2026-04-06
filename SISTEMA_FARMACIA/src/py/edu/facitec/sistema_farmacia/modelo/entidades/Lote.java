package py.edu.facitec.sistema_farmacia.modelo.entidades;
import java.util.Date;
public class Lote {	    
	    private int id;
	    private String numeroLote;
	    private Date fechaVencimiento;
	    private int stockActual;
	    private Producto producto;

	    // Constructor vacío
	    public Lote() {
	    }

	    // Getters y Setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }    

	    public String getNumeroLote() {
	        return numeroLote;
	    }

	    public void setNumeroLote(String numeroLote) {
	        this.numeroLote = numeroLote;
	    }

	    public Date getFechaVencimiento() {
	        return fechaVencimiento;
	    }

	    public void setFechaVencimiento(Date fechaVencimiento) {
	        this.fechaVencimiento = fechaVencimiento;
	    }

	    public int getStockActual() {
	        return stockActual;
	    }

	    public void setStockActual(int stockActual) {
	        this.stockActual = stockActual;
	    }

	    public Producto getProducto() {
	        return producto;
	    }

	    public void setProducto(Producto producto) {
	        this.producto = producto;
	    }
	}

