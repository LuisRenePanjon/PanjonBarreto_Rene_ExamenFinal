package entidades;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: CitaMedica
 *
 */
@Entity

public class CitaMedica implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo;
	
	private Date hora;
	
	private Time fecha;
	
	private String sintomas;
	
	private String alergias;
	
	private String enfermedadesPrevias;
	
	@ManyToOne
	@JoinColumn
	private Paciente paciente;
	
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "citaMedica")
	private SignosVitales signosVitales;
	
	public CitaMedica() {
		super();
	}
	
	

	public SignosVitales getSignosVitales() {
		return signosVitales;
	}



	public void setSignosVitales(SignosVitales signosVitales) {
		this.signosVitales = signosVitales;
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public Time getFecha() {
		return fecha;
	}

	public void setFecha(Time fecha) {
		this.fecha = fecha;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public String getEnfermedadesPrevias() {
		return enfermedadesPrevias;
	}

	public void setEnfermedadesPrevias(String enfermedadesPrevias) {
		this.enfermedadesPrevias = enfermedadesPrevias;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
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
		CitaMedica other = (CitaMedica) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CitaMedica [codigo=" + codigo + ", hora=" + hora + ", fecha=" + fecha + ", sintomas=" + sintomas
				+ ", alergias=" + alergias + ", enfermedadesPrevias=" + enfermedadesPrevias + ", paciente=" + paciente
				+ ", signosVitales=" + signosVitales + "]";
	}
	
	
	
   
}
