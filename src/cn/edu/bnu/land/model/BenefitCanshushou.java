package cn.edu.bnu.land.model;

// Generated 2014-3-26 15:08:03 by Hibernate Tools 4.0.0

/**
 * BenefitCanshushou generated by hbm2java
 */
public class BenefitCanshushou implements java.io.Serializable {

	private int dzzcts;
	private Integer cbzgjg;
	private Integer jsbl;
	private Integer zfbl;
	private Integer nhbl;
	private Integer zdqsx;
	private Integer jb;

	public BenefitCanshushou() {
	}

	public BenefitCanshushou(int dzzcts) {
		this.dzzcts = dzzcts;
	}

	public BenefitCanshushou(int dzzcts, Integer cbzgjg, Integer jsbl,
			Integer zfbl, Integer nhbl, Integer zdqsx, Integer jb) {
		this.dzzcts = dzzcts;
		this.cbzgjg = cbzgjg;
		this.jsbl = jsbl;
		this.zfbl = zfbl;
		this.nhbl = nhbl;
		this.zdqsx = zdqsx;
		this.jb = jb;
	}

	public int getDzzcts() {
		return this.dzzcts;
	}

	public void setDzzcts(int dzzcts) {
		this.dzzcts = dzzcts;
	}

	public Integer getCbzgjg() {
		return this.cbzgjg;
	}

	public void setCbzgjg(Integer cbzgjg) {
		this.cbzgjg = cbzgjg;
	}

	public Integer getJsbl() {
		return this.jsbl;
	}

	public void setJsbl(Integer jsbl) {
		this.jsbl = jsbl;
	}

	public Integer getZfbl() {
		return this.zfbl;
	}

	public void setZfbl(Integer zfbl) {
		this.zfbl = zfbl;
	}

	public Integer getNhbl() {
		return this.nhbl;
	}

	public void setNhbl(Integer nhbl) {
		this.nhbl = nhbl;
	}

	public Integer getZdqsx() {
		return this.zdqsx;
	}

	public void setZdqsx(Integer zdqsx) {
		this.zdqsx = zdqsx;
	}

	public Integer getJb() {
		return this.jb;
	}

	public void setJb(Integer jb) {
		this.jb = jb;
	}

}
