package ec.edu.espe.saturn.model;
// Generated Oct 11, 2017 9:11:35 AM by Hibernate Tools 4.3.1

/**
 * GoremalId generated by hbm2java
 */
public class GoremalId implements java.io.Serializable {

    private int goremalPidm;
    private String goremalEmalCode;
    private String goremalEmailAddress;

    public GoremalId() {
    }

    public GoremalId(int goremalPidm, String goremalEmalCode, String goremalEmailAddress) {
        this.goremalPidm = goremalPidm;
        this.goremalEmalCode = goremalEmalCode;
        this.goremalEmailAddress = goremalEmailAddress;
    }

    public int getGoremalPidm() {
        return this.goremalPidm;
    }

    public void setGoremalPidm(int goremalPidm) {
        this.goremalPidm = goremalPidm;
    }

    public String getGoremalEmalCode() {
        return this.goremalEmalCode;
    }

    public void setGoremalEmalCode(String goremalEmalCode) {
        this.goremalEmalCode = goremalEmalCode;
    }

    public String getGoremalEmailAddress() {
        return this.goremalEmailAddress;
    }

    public void setGoremalEmailAddress(String goremalEmailAddress) {
        this.goremalEmailAddress = goremalEmailAddress;
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof GoremalId)) {
            return false;
        }
        GoremalId castOther = (GoremalId) other;

        return (this.getGoremalPidm() == castOther.getGoremalPidm())
                && ((this.getGoremalEmalCode() == castOther.getGoremalEmalCode()) || (this.getGoremalEmalCode() != null && castOther.getGoremalEmalCode() != null && this.getGoremalEmalCode().equals(castOther.getGoremalEmalCode())))
                && ((this.getGoremalEmailAddress() == castOther.getGoremalEmailAddress()) || (this.getGoremalEmailAddress() != null && castOther.getGoremalEmailAddress() != null && this.getGoremalEmailAddress().equals(castOther.getGoremalEmailAddress())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getGoremalPidm();
        result = 37 * result + (getGoremalEmalCode() == null ? 0 : this.getGoremalEmalCode().hashCode());
        result = 37 * result + (getGoremalEmailAddress() == null ? 0 : this.getGoremalEmailAddress().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "GoremalId{" + "goremalPidm=" + goremalPidm + ", goremalEmalCode=" + goremalEmalCode + ", goremalEmailAddress=" + goremalEmailAddress + '}';
    }

}
