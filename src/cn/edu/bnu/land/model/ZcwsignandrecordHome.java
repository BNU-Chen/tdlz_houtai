package cn.edu.bnu.land.model;

// Generated 2014-4-1 9:37:21 by Hibernate Tools 4.0.0

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
 * Home object for domain model class Zcwsignandrecord.
 * @see cn.edu.bnu.land.model.Zcwsignandrecord
 * @author Hibernate Tools
 */
@Repository
public class ZcwsignandrecordHome {

	private static final Log log = LogFactory
			.getLog(ZcwsignandrecordHome.class);
 @Autowired
	private  SessionFactory sessionFactory ;

	

	public void persist(Zcwsignandrecord transientInstance) {
		log.debug("persisting Zcwsignandrecord instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Zcwsignandrecord instance) {
		log.debug("attaching dirty Zcwsignandrecord instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Zcwsignandrecord instance) {
		log.debug("attaching clean Zcwsignandrecord instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Zcwsignandrecord persistentInstance) {
		log.debug("deleting Zcwsignandrecord instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Zcwsignandrecord merge(Zcwsignandrecord detachedInstance) {
		log.debug("merging Zcwsignandrecord instance");
		try {
			Zcwsignandrecord result = (Zcwsignandrecord) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Zcwsignandrecord findById(java.lang.Integer id) {
		log.debug("getting Zcwsignandrecord instance with id: " + id);
		try {
			Zcwsignandrecord instance = (Zcwsignandrecord) sessionFactory
					.getCurrentSession().get(
							"cn.edu.bnu.land.model.Zcwsignandrecord", id);
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

	public List findByExample(Zcwsignandrecord instance) {
		log.debug("finding Zcwsignandrecord instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("cn.edu.bnu.land.model.Zcwsignandrecord")
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
