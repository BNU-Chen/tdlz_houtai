package cn.edu.bnu.land.model;

// Generated 2013-8-16 10:11:45 by Hibernate Tools 4.0.0



/**
 * Transinfo generated by hbm2java
 */
public class Crawlurl implements java.io.Serializable {

	private Integer number;
	private String webname;
	private String url;
	


	public Crawlurl() {
	}

	public Crawlurl(String webname, String url) {
		this.webname = webname;
		this.url = url;
		
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getWebname() {
		return webname;
	}

	public void setWebname(String webname) {
		this.webname = webname;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
