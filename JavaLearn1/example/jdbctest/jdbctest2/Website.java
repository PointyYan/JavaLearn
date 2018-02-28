package jdbctest.jdbctest2;

public class Website {
    private String Id;
    private String Name;
    private String Url;
    private String Alexa;
    private String Country;

    Website(String Name,String Url,String Alexa,String Country) {
        this.Id = null;
        this.Name = Name;
        this.Url = Url;
        this.Alexa = Alexa;
        this.Country = Country;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getId() {
        return Id;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getUrl() {
        return Url;
    }

    public void setAlexa(String alexa) {
        Alexa = alexa;
    }

    public String getAlexa() {
        return Alexa;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCountry() {
        return Country;
    }
}

