import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Circumferencia extends FiguraGeometrica {

    private double radio;
    private long id;

    public Circumferencia(double radio, long id) {
        this.radio = radio;
        this.id=id;
    }

    public long getId() {
        return id;
    }

    public double calculaArea() {
        return (Math.PI * (Math.pow(radio, 2)));
    }

    public double calculaPerimetro() {
        return (2 * Math.PI * radio);
    }

    public String toString()
    {
        return "Circumferencia{" +
            "radio=" + radio +
            ", id=" + id +
            '}'+System.lineSeparator();
    }




}