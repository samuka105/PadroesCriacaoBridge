package formulario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FormularioTest {

    @Test
    public void testSingleton() {
        assertSame(GerenciadorTemas.getInstance(), GerenciadorTemas.getInstance());
    }

    @Test
    public void testTemaClaroGeraComponentesClaros() {
        FabricaTema tema = GerenciadorTemas.getInstance().obterTema("claro");
        assertTrue(tema.criarBotao() instanceof BotaoClaro);
        assertTrue(tema.criarCampo() instanceof CampoClaro);
    }

    @Test
    public void testMesmoFormularioComTemasDiferentes() {
        FabricaTema claro = GerenciadorTemas.getInstance().obterTema("claro");
        FabricaTema escuro = GerenciadorTemas.getInstance().obterTema("escuro");

        Formulario a = new FormularioLogin(claro);
        Formulario b = new FormularioLogin(escuro);

        assertTrue(a.montar().contains("Botão claro"));
        assertTrue(b.montar().contains("Botão escuro"));
    }

    @Test
    public void testTemaInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            GerenciadorTemas.getInstance().obterTema("roxo");
        });
    }
}
