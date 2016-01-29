package cn.edu.bnu.land.model;

// Generated 2014-3-12 10:33:29 by Hibernate Tools 4.0.0

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Zcwhistoryofdeposit.
 * @see cn.edu.bnu.land.model.Zcwhistoryofdeposit
 * @author Hibernate Tools
 */
public class ZcwhistoryofdepositHome {

	private static final Log log = LogFactory
			.getLog(ZcwhistoryofdepositHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Zcwhistoryofdeposit transientInstance) {
		log.debug("persisting Zcwhistoryofdeposit instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Zcwhistoryofdeposit instance) {
		log.debug("attaching dirty Zcwhistoryofdeposit instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Zcwhistoryofdeposit instance) {
		log.debug("attaching clean Zcwhistoryofdeposit instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Zcwhistoryofdeposit persistentInstance) {
		log.debug("deleting Zcwhistoryofdeposit instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Zcwhistoryofdeposit merge(Zcwhistoryofdeposit detachedInstance) {
		log.debug("merging Zcwhistoryofdeposit instance");
		try {
			Zcwhistoryofdeposit result = (Zcwhistoryofdeposit) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Zcwhistoryofdeposit findById(java.lang.Integer id) {
		log.debug("getting Zcwhistoryofdeposit instance with id: " + id);
		try {
			Zcwhistoryofdeposit instance = (Zcwhistoryofdeposit) sessionFactory
					.getCurrentSession().get(
							"cn.edu.bnu.land.model.Zcwhistoryofdeposit", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Zcwhistoryofdeposit instance) {
		log.debug("finding Zcwhistoryofdeposit instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria("cn.edu.bnu.land.model.Zcwhistoryofdeposit")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
