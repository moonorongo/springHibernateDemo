package sources;

import java.io.Serializable;
import org.hibernate.annotations.Entity;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;;


@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Tema implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	private Integer id;
	private String titulo;
	private Cd cd;
	
	public Cd getCd() {
		return cd;
	}
	public void setCd(Cd cd) {
		this.cd = cd;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	

}