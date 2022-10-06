package Q2.Model;

public class Software {
    private String server;
    private String type;
    private String software;
    private String version;

    public Software(String server, String type, String software, String version) {
        this.server = server;
        this.type = type;
        this.software = software;
        this.version = version;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Software{" +
                "server='" + server + '\'' +
                ", type='" + type + '\'' +
                ", software='" + software + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
