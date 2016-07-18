import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class ProgramaPrincipal {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        List<FiguraGeometrica> arrayList = new ArrayList<>();
        System.out.println("Introduce el numero de  figuras geometricas para cada tipo:  ");
        int numero = sc.nextInt();


        for(int i=1; i<=numero; i++)

        {
            System.out.println("Introduce los datos de la circumferencia "+i);
            System.out.println("Introduce el radio:");
            double radio = sc.nextDouble();

            arrayList.add(new Circumferencia(radio,i));

        }
        for(int i=1; i<=numero; i++)
        {
            System.out.println("Introduce los datos del rectangulo "+i);
            System.out.println("Introduce la base:");
            double base = sc.nextDouble();
            System.out.println("Introduce la altura:");
            double altura = sc.nextDouble();

            Rectangulo rectangulo = new Rectangulo(base,altura, i+numero);
            arrayList.add(rectangulo);
        }

        for(int i=1; i<=numero; i++)
        {
            System.out.println("Introduce los datos del triangulo "+i);
            System.out.println("Introduce la base:");
            double base = sc.nextDouble();
            System.out.println("Introduce la altura:");
            double altura = sc.nextDouble();
            System.out.println("Introduce el lado1:");
            double lado1 = sc.nextDouble();
            System.out.println("Introduce el lado2:");
            double lado2 = sc.nextDouble();


            Triangulo triangulo = new Triangulo (lado1,lado2,base,altura,i+(2*numero));
            arrayList.add(triangulo);
        }


        double maxArea=0;
        String figura=null;

        for(FiguraGeometrica figuraGeometrica : arrayList) // recorremos el array
        {
            double area = figuraGeometrica.calculaArea();
            double perimetro = figuraGeometrica.calculaPerimetro();
            System.out.println("El area de la figura geometrica "  +figuraGeometrica+ " es = " +area);
            System.out.println("El perimetro de la figura geometrica "  +figuraGeometrica+ " es =" +perimetro);

            if(area > maxArea)
            {
                maxArea=area;
                figura=figuraGeometrica.toString();

            }
            else
            {
                continue;
            }

        }

        System.out.println("El area maxima es: " +maxArea + " y pertenece a la figura " +figura);

    }
}
