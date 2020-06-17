package ups.edu.ec.modelo;

public class Persona {
   private int cod;
   private String nombreCompleto;
   private String apellidosCompletos;
   private String numeroCedula;
   private String direccion;
   
   
public Persona(int cod, String nombreCompleto, String apellidosCompletos, String numeroCedula, String direccion) {
	super();
	this.cod = cod;
	this.nombreCompleto = nombreCompleto;
	this.apellidosCompletos = apellidosCompletos;
	this.numeroCedula = numeroCedula;
	this.direccion = direccion;
}


public Persona() {
	super();
	// TODO Auto-generated constructor stub
}


public int getCod() {
	return cod;
}


public void setCod(int cod) {
	this.cod = cod;
}


public String getNombreCompleto() {
	return nombreCompleto;
}


public void setNombreCompleto(String nombreCompleto) {
	this.nombreCompleto = nombreCompleto;
}


public String getApellidosCompletos() {
	return apellidosCompletos;
}


public void setApellidosCompletos(String apellidosCompletos) {
	this.apellidosCompletos = apellidosCompletos;
}


public String getNumeroCedula() {
	return numeroCedula;
}


public void setNumeroCedula(String numeroCedula) {
	this.numeroCedula = numeroCedula;
}


public String getDireccion() {
	return direccion;
}


public void setDireccion(String direccion) {
	this.direccion = direccion;
}


@Override
public String toString() {
	return "Persona [cod=" + cod + ", nombreCompleto=" + nombreCompleto + ", apellidosCompletos=" + apellidosCompletos
			+ ", numeroCedula=" + numeroCedula + ", direccion=" + direccion + "]";
}




   


   
   
   
}
