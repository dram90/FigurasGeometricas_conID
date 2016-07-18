import java.util.Scanner;

public class Rectangulo extends FiguraGeometrica {

    private double base; //private hace que no se pueda acceder externamente
    private double altura;
    private long id;

    public Rectangulo(double base, double altura, long id) {
        this.base = base;
        this.altura = altura;
        this.id=id;
    }

    public long getId() {
        return id;
    }

    public double calculaArea()
    {
        return (base*altura);
    }


    public double calculaPerimetro()
    {
        return (2*base)+(2*altura);
    }

    public String toString()
    {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", id=" + id +
                '}'+System.lineSeparator();
    }

}
