package Aparelho;

public class Iphone extends Aparelho {


    @java.lang.Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public boolean atenderTelefone() {
        // Implementação do método atenderTelefone
        System.out.println("Atendendo o telefone...");
        return true;
    };

    @Override
    public String correioVoz() {
        // Implementação do método correioVoz
        return "Você enviou uma mensagem de voz";
    };

}