package sources;

import sources.Tema;

public interface TemaDao {
 
	void save(Tema tema);
	void update(Tema tema);
	void delete(Tema tema);
	Tema findByTitulo(String titulo);
 
}
