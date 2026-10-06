package formulario;

public class GerenciadorTemas {

    private static GerenciadorTemas instancia;

    private GerenciadorTemas() {
    }

    public static GerenciadorTemas getInstance() {
        if (instancia == null) {
            instancia = new GerenciadorTemas();
        }
        return instancia;
    }

    public FabricaTema obterTema(String nome) {
        if (nome.equalsIgnoreCase("claro")) {
            return new TemaClaro();
        } else if (nome.equalsIgnoreCase("escuro")) {
            return new TemaEscuro();
        }
        throw new IllegalArgumentException("Tema inexistente: " + nome);
    }
}
