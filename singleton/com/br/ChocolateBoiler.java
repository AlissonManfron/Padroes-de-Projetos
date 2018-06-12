package singleton.com.br;

public enum  ChocolateBoiler {
    INSTANCE;

    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateBoiler instance;

    ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
            // preencha a caldeira com chocolate e leite
        }
    }
    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty = true;
            // drene o chocolate e o leite fervido
        }
    }
    public void boil(){
        if(isEmpty() && !isBoiled()){
            boiled = true;
            // coloque o conteúdo em ebulição
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
