package sources;

import sources.Tema;

public interface TemaBo {
 
	void save(Tema cd);
	void update(Tema cd);
	void delete(Tema cd);
	Tema findByTitulo(String titulo);
}
