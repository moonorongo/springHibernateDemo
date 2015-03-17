package sources;

import sources.CdBo;
import sources.CdDao;
import sources.Cd;
 
public class CdBoImpl implements CdBo{
 
	CdDao cdDao;
 
	public void setCdDao(CdDao cdDao) {
		this.cdDao = cdDao;
	}
 
	public void save(Cd cd){
		cdDao.save(cd);
	}
 
	public void update(Cd cd){
		cdDao.update(cd);
	}
 
	public void delete(Cd cd){
		cdDao.delete(cd);
	}
 
	public Cd findByTitulo(String titulo){
		return cdDao.findByTitulo(titulo);
	}
}