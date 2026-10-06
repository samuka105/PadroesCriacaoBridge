package formulario;

public class Main {

    public static void main(String[] args) {
        GerenciadorTemas gerenciador = GerenciadorTemas.getInstance();

        FabricaTema claro = gerenciador.obterTema("claro");
        Formulario login = new FormularioLogin(claro);
        System.out.println(login.montar());
        System.out.println();

        FabricaTema escuro = gerenciador.obterTema("escuro");
        Formulario cadastro = new FormularioCadastro(escuro);
        System.out.println(cadastro.montar());
    }
}
