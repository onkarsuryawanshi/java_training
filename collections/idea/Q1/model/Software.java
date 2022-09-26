package collections.idea.Q1.model;

public class Software {
    private String server;
    private String type;
    private String software;
    private Integer version;

    public Software() {
    }

    public Software(String server, String type, String software, Integer version) {
        this.server = server;
        this.type = type;
        this.software = software;
        this.version = Integer.valueOf(version);
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = Integer.valueOf(version);
    }


}
