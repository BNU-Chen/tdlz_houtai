package cn.edu.bnu.land.model;

// Generated 2013-8-16 10:11:46 by Hibernate Tools 4.0.0

import java.util.List;


import java.util.Map;
import java.util.TreeMap;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.edu.bnu.land.common.SpringContextHolder;
import static org.hibernate.criterion.Example.create;
/**
 * Home object for domain model class Transinfo.
 * @see dao.Transinfo
 * @author Hibernate Tools
 */
@Repository
public class TransinfoHome {

	private static final Log log = LogFactory.getLog(TransinfoHome.class);

	
	private SessionFactory sessionFactory;
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
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

	public void persist(Transinfo transientInstance) {
		log.debug("persisting Transinfo instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Transinfo instance) {
		log.debug("attaching dirty Transinfo instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Transinfo instance) {
		log.debug("attaching clean Transinfo instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Transinfo persistentInstance) {
		log.debug("deleting Transinfo instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Transinfo merge(Transinfo detachedInstance) {
		log.debug("merging Transinfo instance");
		try {
			Transinfo result = (Transinfo) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Transinfo findById(java.lang.Integer id) {
		log.debug("getting Transinfo instance with id: " + id);
		try {
			Transinfo instance = (Transinfo) sessionFactory.getCurrentSession()
					.get("dao.Transinfo", id);
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
	
	public void find(Transinfo transinfo) {
		Session session = sessionFactory.getCurrentSession();
		
//		session.createSQLQuery(transinfo.getArea());

	}

	
	
	public List findByExample(Transinfo instance) {
		log.debug("finding Transinfo instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("cn.edu.bnu.land.model.Transinfo")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			System.out.println(results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	
	}
	
	public List<Transinfo> selectTb(){		
		System.out.print("Home_before");
		String hql="from Transinfo as transinfo";
	    List<Transinfo> results=null;
	    try{
	    	org.hibernate.Query query=sessionFactory.getCurrentSession().createQuery(hql);
	    	results=query.list();
	    	for(Transinfo transinfo:results){
	    		System.out.println(transinfo.getLandid());
	    	}	    
	    }
		catch(Exception e){
			e.printStackTrace();
		}	
	    return results;
	}

	public Map<String,Object> queryData(String start,String limit,String outArea,String outAcre,String outTranstyle,String outYear){
		System.out.println("Home_before");
		System.out.println("outArea"+outArea);
		String totalCount =  new String();
		List<Transinfo> results = null;
		Session session =sessionFactory.getCurrentSession(); 
		DetachedCriteria dc = DetachedCriteria.forClass(Transinfo.class); 
		

		//对区域进行判断查询
		if (outArea != ""){
			dc.add(Restrictions.ilike("area", outArea,MatchMode.ANYWHERE));
		}

		//对流转方式进行判断查询
		if (outTranstyle != ""){
			dc.add(Restrictions.eq("transtyle", outTranstyle));
		}	
		
		//对面积进行判断查询
		if (outAcre != null){

			if (outAcre.equals("1")){
				dc.add(Restrictions.between("acre",new Integer(1),new Integer(10)));
			}
			if (outAcre.equals("2")){
				dc.add(Restrictions.between("acre",new Integer(11),new Integer(100)));
			}
			if (outAcre.equals("3")){
				dc.add(Restrictions.between("acre",new Integer(101),new Integer(1000)));
			}
			if (outAcre.equals("4")){
				dc.add(Restrictions.between("acre",new Integer(1001),new Integer(5000)));
			}
			if (outAcre.equals("5")){
				dc.add(Restrictions.ge("acre",new Integer(5001)));
			}
		}
		//对年限进行判断查询
		if (outYear != null){
			if (outYear.equals("1")){
				dc.add(Restrictions.between("year",new Integer(1),new Integer(5)));
			}else if (outYear.equals("2")){
				dc.add(Restrictions.between("year",new Integer(6),new Integer(10)));
			}else if (outYear.equals("3")){
				dc.add(Restrictions.between("year",new Integer(11),new Integer(15)));
			}else if (outYear.equals("4")){
				dc.add(Restrictions.between("year",new Integer(16),new Integer(20)));
			}else if (outYear.equals("5")){
				dc.add(Restrictions.between("year",new Integer(21),new Integer(30)));
			}else if (outYear.equals("6")){
				dc.add(Restrictions.between("year",new Integer(31),new Integer(40)));
			}else if (outYear.equals("7")){
				dc.add(Restrictions.between("year",new Integer(41),new Integer(50)));
			}else if (outYear.equals("8")){
				dc.add(Restrictions.ge("year",new Integer(51)));
			}
		}
		
		
		Criteria c = dc.getExecutableCriteria(session); 
		
		
		if (!c.list().isEmpty())
			totalCount= String.valueOf(c.list().size());
		c.setFirstResult(Integer.parseInt(start));
		c.setMaxResults(Integer.parseInt(limit));
		
		results = (List<Transinfo>)c.list(); 
//		for (Transinfo i : results) { 
//			System.out.println(i.getLandid()+"  " + i.getArea()+"  " + i.getTranstyle()+"  " + i.getAcre()); 
//		} 
		
		Map<String,Object> myMapResult = new TreeMap<String,Object>();
		System.out.println("记录总数："+ totalCount);
		myMapResult.put("total", new String(totalCount));
		myMapResult.put("root", results);
		return myMapResult;	
	}
	
}
