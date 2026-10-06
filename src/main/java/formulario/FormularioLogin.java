package formulario;

public class FormularioLogin extends Formulario {

    public FormularioLogin(FabricaTema tema) {
        super(tema);
    }

    public String montar() {
        Campo usuario = tema.criarCampo();
        Campo senha = tema.criarCampo();
        Botao entrar = tema.criarBotao();

        return "Login\n"
                + usuario.renderizar() + " usuário\n"
                + senha.renderizar() + " senha\n"
                + entrar.renderizar() + " Entrar";
    }
}
