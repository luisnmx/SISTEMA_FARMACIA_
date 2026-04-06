package py.edu.facitec.sistema_farmacia.modelo.entidades;


	import java.util.Date;

	public class Compra {
	    
	    private int id;
	    private Date fecha;
	    private double total;
	    private Funcionario funcionario;

	    // Constructor vacío
	    public Compra() {
	    }

	    // Getters y Setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }    

	    public Date getFecha() {
	        return fecha;
	    }

	    public void setFecha(Date fecha) {
	        this.fecha = fecha;
	    }

	    public double getTotal() {
	        return total;
	    }

	    public void setTotal(double total) {
	        this.total = total;
	    }

	    public Funcionario getFuncionario() {
	        return funcionario;
	    }

	    public void setFuncionario(Funcionario funcionario) {
	        this.funcionario = funcionario;
	    }
	}

