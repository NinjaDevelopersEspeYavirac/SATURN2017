package ec.edu.espe.saturn.model;
// Generated 12/10/2017 13:02:22 by Hibernate Tools 4.3.1



/**
 * SprteleId generated by hbm2java
 */
public class SprteleId  implements java.io.Serializable {


     private int sprtelePidm;
     private String sprteleTeleCode;
     private short sprteleSeqno;

    public SprteleId() {
    }

    public SprteleId(int sprtelePidm, String sprteleTeleCode, short sprteleSeqno) {
       this.sprtelePidm = sprtelePidm;
       this.sprteleTeleCode = sprteleTeleCode;
       this.sprteleSeqno = sprteleSeqno;
    }
   
    public int getSprtelePidm() {
        return this.sprtelePidm;
    }
    
    public void setSprtelePidm(int sprtelePidm) {
        this.sprtelePidm = sprtelePidm;
    }
    public String getSprteleTeleCode() {
        return this.sprteleTeleCode;
    }
    
    public void setSprteleTeleCode(String sprteleTeleCode) {
        this.sprteleTeleCode = sprteleTeleCode;
    }
    public short getSprteleSeqno() {
        return this.sprteleSeqno;
    }
    
    public void setSprteleSeqno(short sprteleSeqno) {
        this.sprteleSeqno = sprteleSeqno;
    }

    @Override
    public String toString() {
        return "SprteleId{" + "sprtelePidm=" + sprtelePidm + ", sprteleTeleCode=" + sprteleTeleCode + ", sprteleSeqno=" + sprteleSeqno + '}';
    }




}


