package entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * Entity implementation class for Entity: SignosVitales
 *
 */
@Entity

public class SignosVitales implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo;
	
	private String presion;
	
	private String frecuenciCardiaca;
	
	private String frecuenciaRespiratoria;
	
	private String temperatura;
	
	private String saturacion;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "signosVitales")
	private CitaMedica citaMedica;
	
	
	public SignosVitales() {
		super();
	}
	
	


	public SignosVitales(String presion, String frecuenciCardiaca, String frecuenciaRespiratoria, String temperatura,
			String saturacion, CitaMedica citaMedica) {
		super();
		this.presion = presion;
		this.frecuenciCardiaca = frecuenciCardiaca;
		this.frecuenciaRespiratoria = frecuenciaRespiratoria;
		this.temperatura = temperatura;
		this.saturacion = saturacion;
		this.citaMedica = citaMedica;
	}




	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getPresion() {
		return presion;
	}


	public void setPresion(String presion) {
		this.presion = presion;
	}


	public String getFrecuenciCardiaca() {
		return frecuenciCardiaca;
	}


	public void setFrecuenciCardiaca(String frecuenciCardiaca) {
		this.frecuenciCardiaca = frecuenciCardiaca;
	}


	public String getFrecuenciaRespiratoria() {
		return frecuenciaRespiratoria;
	}


	public void setFrecuenciaRespiratoria(String frecuenciaRespiratoria) {
		this.frecuenciaRespiratoria = frecuenciaRespiratoria;
	}


	public String getTemperatura() {
		return temperatura;
	}


	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}


	public String getSaturacion() {
		return saturacion;
	}


	public void setSaturacion(String saturacion) {
		this.saturacion = saturacion;
	}


	public CitaMedica getCitaMedica() {
		return citaMedica;
	}


	public void setCitaMedica(CitaMedica citaMedica) {
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
		SignosVitales other = (SignosVitales) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "SignosVitales [codigo=" + codigo + ", presion=" + presion + ", frecuenciCardiaca=" + frecuenciCardiaca
				+ ", frecuenciaRespiratoria=" + frecuenciaRespiratoria + ", temperatura=" + temperatura
				+ ", saturacion=" + saturacion + ", citaMedica=" + citaMedica + "]";
	}
	
	
   
}
