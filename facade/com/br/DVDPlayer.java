package facade.com.br;

public class DVDPlayer {


    public void on() {
        System.out.println("Ligando o dvd player...");
    }

    public void play(String movie) {
        System.out.println("Reproduzindo o filme : "+movie);
    }
}
