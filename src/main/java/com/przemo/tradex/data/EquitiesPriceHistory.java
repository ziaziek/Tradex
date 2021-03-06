package com.przemo.tradex.data;
// Generated 2014-02-13 15:12:34 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * EquitiesPriceHistory generated by hbm2java
 */
public class EquitiesPriceHistory  implements java.io.Serializable {


     private long id;
     private Equities equities;
     private double bidPrice;
     private double askPrice;
     private Date recordDate;

    public EquitiesPriceHistory() {
    }

	
    public EquitiesPriceHistory(long id, double bidPrice, double askPrice) {
        this.id = id;
        this.bidPrice = bidPrice;
        this.askPrice = askPrice;
    }
    public EquitiesPriceHistory(long id, Equities equities, double bidPrice, double askPrice, Date recordDate) {
       this.id = id;
       this.equities = equities;
       this.bidPrice = bidPrice;
       this.askPrice = askPrice;
       this.recordDate = recordDate;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public Equities getEquities() {
        return this.equities;
    }
    
    public void setEquities(Equities equities) {
        this.equities = equities;
    }
    public double getBidPrice() {
        return this.bidPrice;
    }
    
    public void setBidPrice(double bidPrice) {
        this.bidPrice = bidPrice;
    }
    public double getAskPrice() {
        return this.askPrice;
    }
    
    public void setAskPrice(double askPrice) {
        this.askPrice = askPrice;
    }
    public Date getRecordDate() {
        return this.recordDate;
    }
    
    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }




}


