package py.edu.facitec.sistema_farmacia.modelo.entidades;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 255)
    private String nombre;

    @Column(nullable = false, length = 255)
    private String apellido;

    @Column(nullable = false, length = 45)
    private String documento;

    @Column(length = 255)
    private String email;

    @Column(length = 45)
    private String telefono;

    @Column(length = 45)
    private String cargo;

    @Column(nullable = false)
    private Boolean estado;

    // Un funcionario puede registrar muchas ventas
    @OneToMany(mappedBy = "funcionario")
    private List<Venta> ventas;

    // Un funcionario puede registrar muchas compras
    @OneToMany(mappedBy = "funcionario")
    private List<Compra> compras;

    // Un funcionario puede registrar muchos movimientos de stock
    @OneToMany(mappedBy = "funcionario")
    private List<MovimientoStock> movimientosStock;

    public Funcionario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public List<MovimientoStock> getMovimientosStock() {
        return movimientosStock;
    }

    public void setMovimientosStock(List<MovimientoStock> movimientosStock) {
        this.movimientosStock = movimientosStock;
    }
}