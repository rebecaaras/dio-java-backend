public class SmartTV {
    boolean ligada;
    int canal;
    int volume = 0;
    public static void main(String[] args) {
        public boolean ligar(){
            ligada = true;

            return ligada;
        }
    
        public void desligar(){
            ligada = false;
        }
    
        public int aumentarVolume(){
            volume = volume + 1;
    
            return volume;
        }
    
        public int diminuirVolume(){
            volume = volume - 1;
    
            return volume;
        }
    
        public int mudarCanal(int canal){
            canal = this.canal;
    
            return canal;
        }
        
    }

}

