package ec.edu.espe.saturn.model;
// Generated 27-oct-2017 9:54:16 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Ptrtenr generated by hbm2java
 */
public class Ptrtenr  implements java.io.Serializable {


     private String ptrtenrCode;
     private String ptrtenrDesc;
     private String ptrtenrDateInd;
     private String ptrtenrReviewDateInd;
     private String ptrtenrEeoTenureInd;
     private Date ptrtenrActivityDate;
     private Set perappts = new HashSet(0);

    public Ptrtenr() {
    }

	
    public Ptrtenr(String ptrtenrCode, String ptrtenrDesc, String ptrtenrDateInd, String ptrtenrReviewDateInd, String ptrtenrEeoTenureInd, Date ptrtenrActivityDate) {
        this.ptrtenrCode = ptrtenrCode;
        this.ptrtenrDesc = ptrtenrDesc;
        this.ptrtenrDateInd = ptrtenrDateInd;
        this.ptrtenrReviewDateInd = ptrtenrReviewDateInd;
        this.ptrtenrEeoTenureInd = ptrtenrEeoTenureInd;
        this.ptrtenrActivityDate = ptrtenrActivityDate;
    }
    public Ptrtenr(String ptrtenrCode, String ptrtenrDesc, String ptrtenrDateInd, String ptrtenrReviewDateInd, String ptrtenrEeoTenureInd, Date ptrtenrActivityDate, Set perappts) {
       this.ptrtenrCode = ptrtenrCode;
       this.ptrtenrDesc = ptrtenrDesc;
       this.ptrtenrDateInd = ptrtenrDateInd;
       this.ptrtenrReviewDateInd = ptrtenrReviewDateInd;
       this.ptrtenrEeoTenureInd = ptrtenrEeoTenureInd;
       this.ptrtenrActivityDate = ptrtenrActivityDate;
       this.perappts = perappts;
    }
   
    public String getPtrtenrCode() {
        return this.ptrtenrCode;
    }
    
    public void setPtrtenrCode(String ptrtenrCode) {
        this.ptrtenrCode = ptrtenrCode;
    }
    public String getPtrtenrDesc() {
        return this.ptrtenrDesc;
    }
    
    public void setPtrtenrDesc(String ptrtenrDesc) {
        this.ptrtenrDesc = ptrtenrDesc;
    }
    public String getPtrtenrDateInd() {
        return this.ptrtenrDateInd;
    }
    
    public void setPtrtenrDateInd(String ptrtenrDateInd) {
        this.ptrtenrDateInd = ptrtenrDateInd;
    }
    public String getPtrtenrReviewDateInd() {
        return this.ptrtenrReviewDateInd;
    }
    
    public void setPtrtenrReviewDateInd(String ptrtenrReviewDateInd) {
        this.ptrtenrReviewDateInd = ptrtenrReviewDateInd;
    }
    public String getPtrtenrEeoTenureInd() {
        return this.ptrtenrEeoTenureInd;
    }
    
    public void setPtrtenrEeoTenureInd(String ptrtenrEeoTenureInd) {
        this.ptrtenrEeoTenureInd = ptrtenrEeoTenureInd;
    }
    public Date getPtrtenrActivityDate() {
        return this.ptrtenrActivityDate;
    }
    
    public void setPtrtenrActivityDate(Date ptrtenrActivityDate) {
        this.ptrtenrActivityDate = ptrtenrActivityDate;
    }
    public Set getPerappts() {
        return this.perappts;
    }
    
    public void setPerappts(Set perappts) {
        this.perappts = perappts;
    }

    @Override
    public String toString() {
        return "Ptrtenr{" + "ptrtenrCode=" + ptrtenrCode + ", ptrtenrDesc=" + ptrtenrDesc + ", ptrtenrDateInd=" + ptrtenrDateInd + ", ptrtenrReviewDateInd=" + ptrtenrReviewDateInd + ", ptrtenrEeoTenureInd=" + ptrtenrEeoTenureInd + ", ptrtenrActivityDate=" + ptrtenrActivityDate + '}';
    }




}


