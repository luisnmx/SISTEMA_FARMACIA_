package py.edu.facitec.sistema_farmacia.modelo.entidades;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "movimiento_stock")
public class MovimientoStock {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tipo", nullable = false, length = 45)
    private String tipoMovimiento;

    @Column(nullable = false)
    private int cantidad;

    @Temporal(TemporalType.TIMESTAMP) // porque en el DER está como DATETIME
    @Column(nullable = false)
    private Date fecha;

    // Muchos movimientos pertenecen a un lote
    @ManyToOne
    @JoinColumn(name = "lote_id")
    private Lote lote;

    // Muchos movimientos pertenecen a un funcionario
    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;

    public MovimientoStock() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}