public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Rebeca";
        String segundoNome = "Vieira";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
