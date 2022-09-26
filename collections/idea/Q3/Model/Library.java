package collections.idea.Q3.Model;

public class Library {
    private String productName;
    private String libraryName;
    private Integer libraryVersion;

    public Library(String productName, String libraryName, Integer libraryVersion) {
        this.productName = productName;
        this.libraryName = libraryName;
        this.libraryVersion = libraryVersion;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public Integer getLibraryVersion() {
        return libraryVersion;
    }

    public void setLibraryVersion(Integer libraryVersion) {
        this.libraryVersion = libraryVersion;
    }

    @Override
    public String toString() {
        return "Library{" +
                "productName='" + productName + '\'' +
                ", libraryName='" + libraryName + '\'' +
                ", libraryVersion=" + libraryVersion +
                '}';
    }
}
