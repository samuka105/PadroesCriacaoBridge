package formulario;

public class TemaEscuro implements FabricaTema {

    public Botao criarBotao() {
        return new BotaoEscuro();
    }

    public Campo criarCampo() {
        return new CampoEscuro();
    }
}
