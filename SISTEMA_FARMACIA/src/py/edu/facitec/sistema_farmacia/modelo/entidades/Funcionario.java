package py.edu.facitec.sistema_farmacia.modelo.entidades;

public class Funcionario {
	
	// ATRIBTUTOS PROPIOS DE LA CLASE 
private int id ;
private String nombre;
private String apellido;
private String documento;
private String email;
private String telefono;
private String cargo;
private Boolean estado;

// SIN PARAMETROS
public Funcionario() {
}


// GETTERS Y SETTERS

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








}
