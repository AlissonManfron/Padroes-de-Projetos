package command.com.br;

public class Stereo {

    public void on(){
        System.out.println("Ligando o som!");
    }

    public void off(){
        System.out.println("Desligando o som!");
    }

    public void setCD(){
        System.out.println("Colocando o CD!");
    }

    public void setVolume(int value){
        System.out.println("volume indo para "+ value);
    }
}
