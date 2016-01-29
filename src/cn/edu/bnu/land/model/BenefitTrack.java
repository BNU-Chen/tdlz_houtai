package cn.edu.bnu.land.model;

// Generated 2014-3-26 15:08:03 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * BenefitTrack generated by hbm2java
 */
public class BenefitTrack implements java.io.Serializable {

	private Integer xh;
	private String pjh;
	private String htbh;
	private Date jysj;
	private Integer je;
	private String zjlrf;
	private String zjlcf;
	private String yt;
	private String jbr;
	private String dzqr;
	private String scsmj;

	public BenefitTrack() {
	}

	public BenefitTrack(String pjh, String htbh, Date jysj, Integer je,
			String zjlrf, String zjlcf, String yt, String jbr, String dzqr,
			String scsmj) {
		this.pjh = pjh;
		this.htbh = htbh;
		this.jysj = jysj;
		this.je = je;
		this.zjlrf = zjlrf;
		this.zjlcf = zjlcf;
		this.yt = yt;
		this.jbr = jbr;
		this.dzqr = dzqr;
		this.scsmj = scsmj;
	}

	public Integer getXh() {
		return this.xh;
	}

	public void setXh(Integer xh) {
		this.xh = xh;
	}

	public String getPjh() {
		return this.pjh;
	}

	public void setPjh(String pjh) {
		this.pjh = pjh;
	}

	public String getHtbh() {
		return this.htbh;
	}

	public void setHtbh(String htbh) {
		this.htbh = htbh;
	}

	public Date getJysj() {
		return this.jysj;
	}

	public void setJysj(Date jysj) {
		this.jysj = jysj;
	}

	public Integer getJe() {
		return this.je;
	}

	public void setJe(Integer je) {
		this.je = je;
	}

	public String getZjlrf() {
		return this.zjlrf;
	}

	public void setZjlrf(String zjlrf) {
		this.zjlrf = zjlrf;
	}

	public String getZjlcf() {
		return this.zjlcf;
	}

	public void setZjlcf(String zjlcf) {
		this.zjlcf = zjlcf;
	}

	public String getYt() {
		return this.yt;
	}

	public void setYt(String yt) {
		this.yt = yt;
	}

	public String getJbr() {
		return this.jbr;
	}

	public void setJbr(String jbr) {
		this.jbr = jbr;
	}

	public String getDzqr() {
		return this.dzqr;
	}

	public void setDzqr(String dzqr) {
		this.dzqr = dzqr;
	}

	public String getScsmj() {
		return this.scsmj;
	}

	public void setScsmj(String scsmj) {
		this.scsmj = scsmj;
	}

}
