package negocio;

public class MainCarro {
    //psvm

    static void main() {
        Carro c1= new Carro();
        Carro c2= new Carro();
        Carro c3= new Carro();

        c1.potencia = 2;
        c1.velocidad = 60;


        c2.potencia = 4;
        c2.velocidad = 110;


        c3.potencia = 6;
        c3.velocidad = 0;


        //sout
        System.out.println("la potencia del carro es " + c1.potencia + " y la velocidad es "+ c1.velocidad);   //mostrar informacion
        System.out.println("la potencia del carro es " + c2.potencia + " y la velocidad es "+ c2.velocidad);
        System.out.println("la potencia del carro es " + c3.potencia + " y la velocidad es "+ c3.velocidad);


    c1.acelerar();
    c1.frenar();

    c2.acelerar();
    c2.frenar();

    c3.acelerar();
    c3.frenar();

        System.out.println("la potencia del carro es " + c1.potencia + " y la velocidad es "+ c1.velocidad);
        System.out.println("la potencia del carro es " + c2.potencia + " y la velocidad es "+ c2.velocidad);
        System.out.println("la potencia del carro es " + c3.potencia + " y la velocidad es "+ c3.velocidad);

    }
}
