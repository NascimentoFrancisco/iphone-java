import iphone.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone11ProMaxTurbo = new Iphone("Iphone pró max Turbo");

        System.out.println(iphone11ProMaxTurbo.modelo);
        iphone11ProMaxTurbo.ligar("99 9999-9999");
        iphone11ProMaxTurbo.iniciarCorreioVoz();

        iphone11ProMaxTurbo.tocar();
        iphone11ProMaxTurbo.pausar();
        iphone11ProMaxTurbo.selecionarMusica("Nyw York");

        iphone11ProMaxTurbo.exibirPagina("https://www.linkedin.com/in/francisco-leite-nascimento/");
        iphone11ProMaxTurbo.atualizarPagina();
    }
}