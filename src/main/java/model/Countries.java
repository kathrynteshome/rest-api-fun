package model;

public class Countries {

    private String name;
    private String capital;
    private String population;
    private String languages;
    private String currency;
    private String area;

    public Countries(String name) {
    }

    public Countries(String name, String capital, String population, String languages, String currency, String area) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.languages = languages;
        this.currency = currency;
        this.area = area;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }




}
