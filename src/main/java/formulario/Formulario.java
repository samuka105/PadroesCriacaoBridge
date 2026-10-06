package formulario;

public abstract class Formulario {

    protected FabricaTema tema;

    public Formulario(FabricaTema tema) {
        this.tema = tema;
    }

    public abstract String montar();
}
