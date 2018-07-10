package SQLQuery;

public class BDD {
    private String name;
    private String url;
    private String[] keys;
    private Type[] types;



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
