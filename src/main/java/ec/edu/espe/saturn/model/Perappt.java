package ec.edu.espe.saturn.model;
// Generated 27-oct-2017 9:54:16 by Hibernate Tools 4.3.1



/**
 * Perappt generated by hbm2java
 */
public class Perappt  implements java.io.Serializable {


     private PerapptId id;
     private Ptrtenr ptrtenr;

    public Perappt() {
    }

	
    public Perappt(PerapptId id) {
        this.id = id;
    }
    public Perappt(PerapptId id, Ptrtenr ptrtenr) {
       this.id = id;
       this.ptrtenr = ptrtenr;
    }
   
    public PerapptId getId() {
        return this.id;
    }
    
    public void setId(PerapptId id) {
        this.id = id;
    }
    public Ptrtenr getPtrtenr() {
        return this.ptrtenr;
    }
    
    public void setPtrtenr(Ptrtenr ptrtenr) {
        this.ptrtenr = ptrtenr;
    }




}

