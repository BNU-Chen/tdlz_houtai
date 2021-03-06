package cn.edu.bnu.land.model;
// Generated 2014-3-2 15:51:45 by Hibernate Tools 4.0.0


import java.util.Date;

import org.springframework.stereotype.Repository;

/**
 * ZSellapply generated by hbm2java
 */
@Repository
public class ZSellapply  implements java.io.Serializable {


     private String ticketid;
     private String loginname;
     private String realname;
     private String typelx;
     private String cardid;
     private String telephone;
     private String drzw;
     private String address;
     private String landid;
     private String dkwz;
     private String area;
     private String fkid;
     private String fkdw;
     private String yyt;
     private Date applydate;
     private Date ysdate;
     private String checkstate;
     private String company;
     private String price;
     private String bz;

    public ZSellapply() {
    }

	
    public ZSellapply(String ticketid) {
        this.ticketid = ticketid;
    }
    public ZSellapply(String ticketid, String loginname, String realname, String typelx, String cardid, String telephone, String drzw, String address, String landid, String dkwz, String area, String fkid, String fkdw, String yyt, Date applydate, Date ysdate, String checkstate, String company, String price, String bz) {
       this.ticketid = ticketid;
       this.loginname = loginname;
       this.realname = realname;
       this.typelx = typelx;
       this.cardid = cardid;
       this.telephone = telephone;
       this.drzw = drzw;
       this.address = address;
       this.landid = landid;
       this.dkwz = dkwz;
       this.area = area;
       this.fkid = fkid;
       this.fkdw = fkdw;
       this.yyt = yyt;
       this.applydate = applydate;
       this.ysdate = ysdate;
       this.checkstate = checkstate;
       this.company = company;
       this.price = price;
       this.bz = bz;
    }
   
    public String getTicketid() {
        return this.ticketid;
    }
    
    public void setTicketid(String ticketid) {
        this.ticketid = ticketid;
    }
    public String getLoginname() {
        return this.loginname;
    }
    
    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }
    public String getRealname() {
        return this.realname;
    }
    
    public void setRealname(String realname) {
        this.realname = realname;
    }
    public String getTypelx() {
        return this.typelx;
    }
    
    public void setTypelx(String typelx) {
        this.typelx = typelx;
    }
    public String getCardid() {
        return this.cardid;
    }
    
    public void setCardid(String cardid) {
        this.cardid = cardid;
    }
    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getDrzw() {
        return this.drzw;
    }
    
    public void setDrzw(String drzw) {
        this.drzw = drzw;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getLandid() {
        return this.landid;
    }
    
    public void setLandid(String landid) {
        this.landid = landid;
    }
    public String getDkwz() {
        return this.dkwz;
    }
    
    public void setDkwz(String dkwz) {
        this.dkwz = dkwz;
    }
    public String getArea() {
        return this.area;
    }
    
    public void setArea(String area) {
        this.area = area;
    }
    public String getFkid() {
        return this.fkid;
    }
    
    public void setFkid(String fkid) {
        this.fkid = fkid;
    }
    public String getFkdw() {
        return this.fkdw;
    }
    
    public void setFkdw(String fkdw) {
        this.fkdw = fkdw;
    }
    public String getYyt() {
        return this.yyt;
    }
    
    public void setYyt(String yyt) {
        this.yyt = yyt;
    }
    public Date getApplydate() {
        return this.applydate;
    }
    
    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }
    public Date getYsdate() {
        return this.ysdate;
    }
    
    public void setYsdate(Date ysdate) {
        this.ysdate = ysdate;
    }
    public String getCheckstate() {
        return this.checkstate;
    }
    
    public void setCheckstate(String checkstate) {
        this.checkstate = checkstate;
    }
    public String getCompany() {
        return this.company;
    }
    
    public void setCompany(String company) {
        this.company = company;
    }
    public String getPrice() {
        return this.price;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }
    public String getBz() {
        return this.bz;
    }
    
    public void setBz(String bz) {
        this.bz = bz;
    }




}


