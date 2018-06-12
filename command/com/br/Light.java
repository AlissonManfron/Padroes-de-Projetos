package command.com.br;

public class Light {
    String name;

    public Light(String name){
        this.name = name;
    }

    public void on(){
        System.out.println(String.format("%s Luz Ligada!", name));
    }

    public void off(){
        System.out.println(String.format("%s Luz Desligada!", name));
    }
}
