package facade.com.br;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    DVDPlayer dvdPlayer;
    CDPlayer cdPlayer;
    Projector projector;
    TheaterLights theaterLights;
    Screen screen;
    PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amplifier amp,
                 Tuner tuner,
                 DVDPlayer dvdPlayer,
                 CDPlayer cdPlayer,
                 Projector projector,
                 TheaterLights theaterLights,
                 Screen screen,
                 PopcornPopper popcornPopper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie(Movie movie){
        System.out.println("Vamos assistir um filme...");
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvdPlayer);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie.getTitle());
    }

    public void endMovie(String movie) {
    }






    }
