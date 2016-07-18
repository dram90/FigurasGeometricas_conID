/**
 * Created by Dimple on 14/06/2016.
 */
public class Triangulo extends FiguraGeometrica {

    private double lado1;
    private double lado2;
    private double lado3;
    private double base;
    private double altura;
    private long id;


    public Triangulo(double lado1, double lado2, double base, double altura,long id ) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
        this.id= id;
    }

    public long getId() {
        return id;
    }

    public double calculaArea()
    {
        return base*altura;
    }

    public double calculaPerimetro()
    {
        return base+lado1+lado2;
    }


    public String toString()
    {
        return "Triangulo{" +
                "lado1=" + lado1 +
                ", lado2="+ lado2+
                ", base=" + base+
                ", altura=" +altura+
                ", id=" + id +
                '}'+System.lineSeparator();
    }
}
