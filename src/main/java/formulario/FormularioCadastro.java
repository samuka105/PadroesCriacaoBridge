package formulario;

public class FormularioCadastro extends Formulario {

    public FormularioCadastro(FabricaTema tema) {
        super(tema);
    }

    public String montar() {
        Campo nome = tema.criarCampo();
        Campo email = tema.criarCampo();
        Botao salvar = tema.criarBotao();

        return "Cadastro\n"
                + nome.renderizar() + " nome\n"
                + email.renderizar() + " e-mail\n"
                + salvar.renderizar() + " Salvar";
    }
}
