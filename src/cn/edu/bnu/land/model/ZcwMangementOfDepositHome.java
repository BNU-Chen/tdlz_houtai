package cn.edu.bnu.land.model;

// Generated 2014-3-12 7:26:18 by Hibernate Tools 4.0.0

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class ZcwMangementOfDeposit.
 * @see cn.edu.bnu.land.model.ZcwMangementOfDeposit
 * @author Hibernate Tools
 */
public class ZcwMangementOfDepositHome {

	private static final Log log = LogFactory
			.getLog(ZcwMangementOfDepositHome.class);

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

	public void persist(ZcwMangementOfDeposit transientInstance) {
		log.debug("persisting ZcwMangementOfDeposit instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ZcwMangementOfDeposit instance) {
		log.debug("attaching dirty ZcwMangementOfDeposit instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ZcwMangementOfDeposit instance) {
		log.debug("attaching clean ZcwMangementOfDeposit instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ZcwMangementOfDeposit persistentInstance) {
		log.debug("deleting ZcwMangementOfDeposit instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ZcwMangementOfDeposit merge(ZcwMangementOfDeposit detachedInstance) {
		log.debug("merging ZcwMangementOfDeposit instance");
		try {
			ZcwMangementOfDeposit result = (ZcwMangementOfDeposit) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ZcwMangementOfDeposit findById(java.lang.Integer id) {
		log.debug("getting ZcwMangementOfDeposit instance with id: " + id);
		try {
			ZcwMangementOfDeposit instance = (ZcwMangementOfDeposit) sessionFactory
					.getCurrentSession().get(
							"cn.edu.bnu.land.model.ZcwMangementOfDeposit", id);
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

	public List findByExample(ZcwMangementOfDeposit instance) {
		log.debug("finding ZcwMangementOfDeposit instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"cn.edu.bnu.land.model.ZcwMangementOfDeposit")
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
