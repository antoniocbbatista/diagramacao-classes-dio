import iphone.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Métodos Aparelho Telefônico
        iphone.ligar();

        iphone.atender();

        iphone.iniciarCorreioVoz();

        //Métodos Navegador de Internet

        iphone.atualizarPagina();

        iphone.exibirPagina();

        iphone.adicionarNovaAba();

        // Métodos Reprodutor Musical

        iphone.pausar();

        iphone.tocar();

        iphone.selecionarMusica();
    }
}