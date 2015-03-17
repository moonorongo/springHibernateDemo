package sources;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import sources.CdDao;
import sources.Cd;
 
public class TemaDaoImpl extends HibernateDaoSupport implements TemaDao {
 
	public void save(Tema tema){
		getHibernateTemplate().save(tema);
	}
 
	public void update(Tema tema){
		getHibernateTemplate().update(tema);
	}
 
	public void delete(Tema tema){
		getHibernateTemplate().delete(tema);
	}
 
	public Tema findByTitulo(String titulo){
		List list = getHibernateTemplate().find(
                      "from Tema where titulo=?",titulo
                );
		return (Tema)list.get(0);
	}
 
}
