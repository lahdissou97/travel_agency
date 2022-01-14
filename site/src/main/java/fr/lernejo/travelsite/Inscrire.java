package fr.lernejo.travelsite;

public record Inscrire(String userEmail,String userName,String userCountry,WeatherExpectation weatherExpectation) {
    public enum WeatherExpectation{WARMER,COLDER};
}
