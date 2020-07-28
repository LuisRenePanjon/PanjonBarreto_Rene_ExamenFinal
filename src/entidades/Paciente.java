package entidades;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Paciente
 *
 */

@NamedQuery(name = "buscarPorCedula", query ="SELECT p FROM  Paciente p WHERE  p.cedula = :cedula")
@Entity
public class Paciente implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo;
	
	@Column(unique=true)
	private String cedula;
	
	private String nombres;
	
	private String apellido;
	
	private String telefono;
	
	private String direccion;
	
	@Column(unique=true)
	private String correo;
	
	/*
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente")
	private Set<CitaMedica> citaMedica = new HashSet<CitaMedica>();
	*/
	
	@OneToMany(cascade = CascadeType.ALL.ALL, mappedBy = "paciente")
	private Set<CitaMedica> citaMedica = new HashSet<CitaMedica>();
	
	public Paciente() {
		
	}




	public Paciente(String cedula, String nombres, String apellido, String telefono, String direccion, String correo) {
		super();
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellido = apellido;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
	}




	public int getCodigo() {
		return codigo;
	}




	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}




	public String getCedula() {
		return cedula;
	}




	public void setCedula(String cedula) {
		this.cedula = cedula;
	}




	public String getNombres() {
		return nombres;
	}




	public void setNombres(String nombres) {
		this.nombres = nombres;
	}




	public String getApellido() {
		return apellido;
	}




	public void setApellido(String apellido) {
		this.apellido = apellido;
	}




	public String getTelefono() {
		return telefono;
	}




	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}




	public String getDireccion() {
		return direccion;
	}




	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}




	public String getCorreo() {
		return correo;
	}




	public void setCorreo(String correo) {
		this.correo = correo;
	}




	public Set<CitaMedica> getCitaMedica() {
		return citaMedica;
	}




	public void setCitaMedica(Set<CitaMedica> citaMedica) {
		this.citaMedica = citaMedica;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	
	
   
}
