package ec.edu.espe.saturn.model;
// Generated 12/10/2017 12:38:03 by Hibernate Tools 4.3.1


// Generated 12/10/2017 12:38:03 by Hibernate Tools 4.3.1



/**
 * SgbstdnId generated by hbm2java
 */
public class SgbstdnId  implements java.io.Serializable {


     private int sgbstdnPidm;
     private String sgbstdnTermCodeEff;

    public SgbstdnId() {
    }

    public SgbstdnId(int sgbstdnPidm, String sgbstdnTermCodeEff) {
       this.sgbstdnPidm = sgbstdnPidm;
       this.sgbstdnTermCodeEff = sgbstdnTermCodeEff;
    }
   
    public int getSgbstdnPidm() {
        return this.sgbstdnPidm;
    }
    
    public void setSgbstdnPidm(int sgbstdnPidm) {
        this.sgbstdnPidm = sgbstdnPidm;
    }
    public String getSgbstdnTermCodeEff() {
        return this.sgbstdnTermCodeEff;
    }
    
    public void setSgbstdnTermCodeEff(String sgbstdnTermCodeEff) {
        this.sgbstdnTermCodeEff = sgbstdnTermCodeEff;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SgbstdnId) ) return false;
		 SgbstdnId castOther = ( SgbstdnId ) other; 
         
		 return (this.getSgbstdnPidm()==castOther.getSgbstdnPidm())
 && ( (this.getSgbstdnTermCodeEff()==castOther.getSgbstdnTermCodeEff()) || ( this.getSgbstdnTermCodeEff()!=null && castOther.getSgbstdnTermCodeEff()!=null && this.getSgbstdnTermCodeEff().equals(castOther.getSgbstdnTermCodeEff()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getSgbstdnPidm();
         result = 37 * result + ( getSgbstdnTermCodeEff() == null ? 0 : this.getSgbstdnTermCodeEff().hashCode() );
         return result;
   }   

    @Override
    public String toString() {
        return "SgbstdnId{" + "sgbstdnPidm=" + sgbstdnPidm + ", sgbstdnTermCodeEff=" + sgbstdnTermCodeEff + '}';
    }


}


