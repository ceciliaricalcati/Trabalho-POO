import java.awt.Color;

public class Circulo implements ElementoMapa {
    private Color cor;
    private Character simbolo;

    public Circulo(Character simbolo, Color cor)  {
        this.simbolo = simbolo;
        this.cor = cor;
    }

    @Override
    public Character getSimbolo() {
        return simbolo;
    }

    @Override
    public Color getCor() {
        return cor;
    }
    
    @Override
    public boolean podeSerAtravessado() {
        return true;
    }

    @Override
    public boolean podeInteragir() {
        return true;
    }

    @Override
    public String interage() {
        return null;
    }
}
