package behavioral.observer;

public class Main {
    public static void main(String[] a){
        ControlRoom nasaRoom = new ControlRoom("Nasa control");
        ControlRoom presidentRoom = new ControlRoom("President control");
        Satellite weatherSat = new Satellite("Weather Sat");
        Satellite spySat = new Satellite("Spy Sat");

        weatherSat.addObserver(nasaRoom);
        weatherSat.addObserver(presidentRoom);
        spySat.addObserver(presidentRoom);

        weatherSat.setAlert("Aleta de chuva!");
        spySat.setAlert("Aleta de ataque intercontinental!");
    }
}
