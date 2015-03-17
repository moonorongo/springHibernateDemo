package sources;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import sources.CdDao;
import sources.Cd;
 
public class CdDaoImpl extends HibernateDaoSupport implements CdDao {
 
	public void save(Cd cd){
		getHibernateTemplate().save(cd);
	}
 
	public void update(Cd cd){
		getHibernateTemplate().saveOrUpdate(cd);
	}
 
	public void delete(Cd cd){
		getHibernateTemplate().delete(cd);
	}
 
	public Cd findByTitulo(String titulo){
		List list = getHibernateTemplate().find(
                      "from Cd where titulo=?",titulo
                );
		return (Cd)list.get(0);
	}
 
}
