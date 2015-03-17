package sources;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.Entity;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;;

@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Cd implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	private Integer id;
	private String titulo;
	private Set<Tema> temas = new HashSet<Tema>(0);
	
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
	
	public Set<Tema> getTemas() {
		return temas;
	}
	public void setTemas(Set<Tema> temas) {
		this.temas = temas;
	}

 

}