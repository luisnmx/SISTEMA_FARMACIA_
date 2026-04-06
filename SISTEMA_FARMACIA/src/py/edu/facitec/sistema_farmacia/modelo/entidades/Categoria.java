package py.edu.facitec.sistema_farmacia.modelo.entidades;

public class Categoria {
    
    private int id;
    private String descripcion;
    private boolean estado;

    // Constructor vacío
    public Categoria() {
    }

  

    // Getters y Setters
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}