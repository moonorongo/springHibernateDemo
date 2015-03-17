package sources;

import sources.TemaBo;
import sources.TemaDao;
import sources.Tema;
 
public class TemaBoImpl implements TemaBo{
 
	TemaDao temaDao;
 
	public void setTemaDao(TemaDao temaDao) {
		this.temaDao = temaDao;
	}
 
	public void save(Tema tema){
		temaDao.save(tema);
	}
 
	public void update(Tema tema){
		temaDao.update(tema);
	}
 
	public void delete(Tema tema){
		temaDao.delete(tema);
	}
 
	public Tema findByTitulo(String titulo){
		return temaDao.findByTitulo(titulo);
	}
}