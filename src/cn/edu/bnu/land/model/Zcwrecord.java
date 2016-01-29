package cn.edu.bnu.land.model;

// Generated 2014-4-1 17:16:59 by Hibernate Tools 4.0.0

import java.util.Date;

import org.springframework.stereotype.Repository;

/**
 * Zcwrecord generated by hbm2java
 */
@Repository
public class Zcwrecord implements java.io.Serializable {

	private Integer id;
	private String recordid;
	private String ticketid;
	private Date releasedate;
	private Date windate;
	private String winner;
	private String amount;
	private String price;
	private String totalprice;
	private String contractionid;
	private String contractcontent;
	private String certification;
	private String netsignid;
	private String operatorid;
	private String operator;
	private Date recorddate;

	public Zcwrecord() {
	}

	public Zcwrecord(String recordid) {
		this.recordid = recordid;
	}

	public Zcwrecord(String recordid, String ticketid, Date releasedate,
			Date windate, String winner, String amount, String price,
			String totalprice, String contractionid, String contractcontent,
			String certification, String netsignid, String operatorid,
			String operator, Date recorddate) {
		this.recordid = recordid;
		this.ticketid = ticketid;
		this.releasedate = releasedate;
		this.windate = windate;
		this.winner = winner;
		this.amount = amount;
		this.price = price;
		this.totalprice = totalprice;
		this.contractionid = contractionid;
		this.contractcontent = contractcontent;
		this.certification = certification;
		this.netsignid = netsignid;
		this.operatorid = operatorid;
		this.operator = operator;
		this.recorddate = recorddate;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRecordid() {
		return this.recordid;
	}

	public void setRecordid(String recordid) {
		this.recordid = recordid;
	}

	public String getTicketid() {
		return this.ticketid;
	}

	public void setTicketid(String ticketid) {
		this.ticketid = ticketid;
	}

	public Date getReleasedate() {
		return this.releasedate;
	}

	public void setReleasedate(Date releasedate) {
		this.releasedate = releasedate;
	}

	public Date getWindate() {
		return this.windate;
	}

	public void setWindate(Date windate) {
		this.windate = windate;
	}

	public String getWinner() {
		return this.winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getTotalprice() {
		return this.totalprice;
	}

	public void setTotalprice(String totalprice) {
		this.totalprice = totalprice;
	}

	public String getContractionid() {
		return this.contractionid;
	}

	public void setContractionid(String contractionid) {
		this.contractionid = contractionid;
	}

	public String getContractcontent() {
		return this.contractcontent;
	}

	public void setContractcontent(String contractcontent) {
		this.contractcontent = contractcontent;
	}

	public String getCertification() {
		return this.certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getNetsignid() {
		return this.netsignid;
	}

	public void setNetsignid(String netsignid) {
		this.netsignid = netsignid;
	}

	public String getOperatorid() {
		return this.operatorid;
	}

	public void setOperatorid(String operatorid) {
		this.operatorid = operatorid;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Date getRecorddate() {
		return this.recorddate;
	}

	public void setRecorddate(Date recorddate) {
		this.recorddate = recorddate;
	}

}
