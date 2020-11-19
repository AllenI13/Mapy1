import java.util.Comparator;

public class Country {
    private final String name;
    private final String countryCode;
    private final int population;

    public Country(String name, String countryCode, int population) {
        this.name = name;
        this.countryCode = countryCode;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", population=" + population +
                '}';
    }
}
