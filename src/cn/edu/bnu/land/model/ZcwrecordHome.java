package cn.edu.bnu.land.model;

// Generated 2014-4-1 17:16:59 by Hibernate Tools 4.0.0

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Home object for domain model class Zcwrecord.
 * @see cn.edu.bnu.land.model.Zcwrecord
 * @author Hibernate Tools
 */
@Repository
public class ZcwrecordHome {

	private static final Log log = LogFactory.getLog(ZcwrecordHome.class);
@Autowired
	private  SessionFactory sessionFactory ;


	public void persist(Zcwrecord transientInstance) {
		log.debug("persisting Zcwrecord instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Zcwrecord instance) {
		log.debug("attaching dirty Zcwrecord instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Zcwrecord instance) {
		log.debug("attaching clean Zcwrecord instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Zcwrecord persistentInstance) {
		log.debug("deleting Zcwrecord instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Zcwrecord merge(Zcwrecord detachedInstance) {
		log.debug("merging Zcwrecord instance");
		try {
			Zcwrecord result = (Zcwrecord) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Zcwrecord findById(java.lang.Integer id) {
		log.debug("getting Zcwrecord instance with id: " + id);
		try {
			Zcwrecord instance = (Zcwrecord) sessionFactory.getCurrentSession()
					.get("cn.edu.bnu.land.model.Zcwrecord", id);
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

	public List findByExample(Zcwrecord instance) {
		log.debug("finding Zcwrecord instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("cn.edu.bnu.land.model.Zcwrecord")
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
