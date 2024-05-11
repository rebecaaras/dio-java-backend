public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        smartTv.ligar();
        System.out.println("A TV está ligada? " + smartTv.ligada);
        smartTv.aumentarVolume();
        System.out.println("Qual o volume da TV? " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Qual o volume da TV? " + smartTv.volume);
        smartTv.mudarCanal(49);
        System.out.println("Canal: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Canal: " + smartTv.canal);

    }
}
