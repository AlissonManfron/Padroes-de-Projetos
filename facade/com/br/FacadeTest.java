package facade.com.br;

public class FacadeTest {
    public static void main(String[] args) {

        Movie movie = new Movie("Piratas do Caribe - Navegando em aguas perigosas");
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DVDPlayer dvdPlayer = new DVDPlayer();
        CDPlayer cdPlayer = new CDPlayer();
        Projector projector = new Projector();
        TheaterLights theaterLights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popcornPopper = new PopcornPopper();


        HomeTheaterFacade home =
                new HomeTheaterFacade(
                amp,
                tuner,
                dvdPlayer,
                cdPlayer,
                projector,
                theaterLights,
                screen,
                popcornPopper);

        home.watchMovie(movie);


    }
}
