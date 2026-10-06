package formulario;

public class TemaClaro implements FabricaTema {

    public Botao criarBotao() {
        return new BotaoClaro();
    }

    public Campo criarCampo() {
        return new CampoClaro();
    }
}
