package day12.stream.quiz2;

// 여행 목적지
public class Destination {

    private String city; // 도시
    private String country; // 나라

    @Override
    public String toString() {
        return "Destination{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Destination(String city, String country) {
        this.city = city;
        this.country = country;
    }
}
