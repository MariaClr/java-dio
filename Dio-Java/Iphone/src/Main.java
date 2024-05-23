import Aparelho.Iphone;

public class Main {

    public static void main(String[] args) {
        Iphone iphoneDeJoao = new Iphone();
        iphoneDeJoao.atenderTelefone();
        iphoneDeJoao.ligar("868545454");
        System.out.println(iphoneDeJoao.correioVoz());
    }
}