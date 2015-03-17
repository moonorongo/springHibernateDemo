package sources;

import sources.Cd;

public interface CdBo {
 
	void save(Cd cd);
	void update(Cd cd);
	void delete(Cd cd);
	Cd findByTitulo(String titulo);
}
