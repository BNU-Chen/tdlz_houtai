package cn.edu.bnu.land.model;

// Generated 2014-3-26 16:49:59 by Hibernate Tools 4.0.0
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class BenefitStatjs.
 * @see cn.edu.bnu.land.model.BenefitStatjs
 * @author Hibernate Tools
 */

@Repository
public class BenefitStatjsHome {

	private static final Log log = LogFactory.getLog(BenefitStatjsHome.class);

	private SessionFactory sessionFactory = null;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void persist(BenefitStatjs transientInstance) {
		log.debug("persisting BenefitStatjs instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void update(BenefitStatjs instance) {
		log.debug("attaching dirty BenefitStatjs instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(BenefitStatjs persistentInstance) {
		log.debug("deleting BenefitStatjs instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BenefitStatjs merge(BenefitStatjs detachedInstance) {
		log.debug("merging BenefitStatjs instance");
		try {
			BenefitStatjs result = (BenefitStatjs) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public BenefitStatjs findById(java.lang.Integer id) {
		log.debug("getting BenefitStatjs instance with id: " + id);
		try {
			BenefitStatjs instance = (BenefitStatjs) sessionFactory
					.getCurrentSession().get(
							"cn.edu.bnu.land.model.BenefitStatjs", id);
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

	public List<BenefitStatjs> findByExample(BenefitStatjs instance) {
		log.debug("finding BenefitStatjs instance by example");
		try {
			List<BenefitStatjs> results = (List<BenefitStatjs>) sessionFactory
					.getCurrentSession()
					.createCriteria("cn.edu.bnu.land.model.BenefitStatjs")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
