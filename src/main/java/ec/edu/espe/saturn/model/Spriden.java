package ec.edu.espe.saturn.model;
// Generated Sep 22, 2017 9:40:41 AM by Hibernate Tools 4.3.1



/**
 * Spriden generated by hbm2java
 */
public class Spriden  implements java.io.Serializable {


     private SpridenId id;

    public Spriden() {
        this.id = new SpridenId();
    }

    public Spriden(SpridenId id) {
       this.id = id;
    }
   
    public SpridenId getId() {
        return this.id;
    }
    
    public void setId(SpridenId id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Spriden{" + "id=" + id + '}';
    }




}


