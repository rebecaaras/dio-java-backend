public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume = volume + 1;
    }

    public void diminuirVolume(){
        volume = volume - 1;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarCanal(){
        canal++;
    }
}
