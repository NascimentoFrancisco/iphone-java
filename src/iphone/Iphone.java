package iphone;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public String modelo;

    public Iphone(String modelo){
        this.modelo = modelo;
    }

    @Override
    public void ligar(String numero) {
        System.out.println("=".repeat(20)+"Ligação de voz"+"=".repeat(20));
        System.out.println("Ligando para o número: "+numero);
        System.out.println("=".repeat(20)+"Fim da Ligação"+"=".repeat(20));
    }

    @Override
    public void atender() {
        System.out.println("=".repeat(20)+"Ligação de voz"+"=".repeat(20));
        System.out.println("Atendendo ligaçao de voz....");
        System.out.println("=".repeat(20)+"Fim da Ligação"+"=".repeat(20));
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("=".repeat(20)+"Correio de voz"+"=".repeat(20));
        System.out.println("Iniciando correio de voz...");
        System.out.println("=".repeat(17)+"Fim do correio de voz"+"=".repeat(17));
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("=".repeat(20)+"Exibir página web"+"=".repeat(20));
        System.out.println("Carregando página web: "+url);
        System.out.println("=".repeat(20)+"Página web carregada"+"=".repeat(20));
    }

    @Override
    public void adcionarNovaApa() {
        System.out.println("=".repeat(20)+"Adcionar página"+"=".repeat(20));
        System.out.println("Nova página adicionada..");
        System.out.println("=".repeat(16)+"Adição de página realizada"+"=".repeat(16));
    }

    @Override
    public void atualizarPagina() {
        System.out.println("=".repeat(20)+"Atualizar página"+"=".repeat(20));
        System.out.println("Atualizando página web...");
        System.out.println("=".repeat(20)+"Página atualizada"+"=".repeat(20));
    }

    @Override
    public void tocar() {
        System.out.println("=".repeat(20)+"Tocarmúsica"+"=".repeat(20));
        System.out.println("Tocando música");
        System.out.println("=".repeat(17)+"Fim tocar música"+"=".repeat(17));
    }

    @Override
    public void pausar() {
        System.out.println("=".repeat(20)+"Pausar música"+"=".repeat(20));
        System.out.println("Pausando música");
        System.out.println("=".repeat(19)+"Música em pause"+"=".repeat(19));
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("=".repeat(20)+"Selecionar música"+"=".repeat(20));
        System.out.println("Selecionando música: "+musica);
        System.out.println("=".repeat(20)+"Música selecionada"+"=".repeat(20));
    }
}
