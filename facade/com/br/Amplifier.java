package facade.com.br;

public class Amplifier {
    public void on(){
        System.out.println("Ligando o projetor...");
    }

    public void setDvd(DVDPlayer dvd){
        System.out.println("Colocando o dvd na bandeja...");
    }

    public void setSurroundSound(){
        System.out.println("Som no modo SurroundSound..");
    }

    public void setVolume(int value){
        System.out.println("Aumentando o volume em "+ value);
    }
}
