
import java.io.IOException;
import java.util.Scanner;

public class Controlador 
{
    private final Scanner sc;
    
    public Controlador(Scanner sc)
    {
        this.sc = sc;
    }
    
    public void menu() throws IOException
    {
        int opc;
        do
        {
            System.out.println("\nMenú de opciones");
            System.out.println("1. Calculadora");
            System.out.println("2. Conversor");
            System.out.println("3. Contador");
            System.out.println("4. Banco");
            System.out.println("5. Auto");
            System.out.println("6. Libro");
            System.out.println("7. División");
            System.out.println("8. División con" + " entrada de usuario");
            System.out.println("9. ValidarEdad");
            System.out.println("10. Archivo");
            System.out.println("0. Salir");
            System.out.print("Elija una opcion: ");
            try 
            {
                opc = Integer.parseInt(sc.nextLine());
            } 
            catch (NumberFormatException e)
            {
                opc = -1;
            }
            switch (opc) 
            {
                case 1:
                    demoCalculadora();
                    break;
                case 2:
                    this.demoConversor();
                    break;
                case 5:
                    this.demoAuto();
                    break;
            }

        }
        while(true && !false);
    }
    private void demoCalculadora()
    {
        Calculadora c = new Calculadora();
        System.out.println("Sumar 2 + 3 = " + c.sumar(2,3));
        System.out.println("Sumar 1 + 2 + 3 " + c.sumar(1, 2, 3));
        System.out.println("Sumar 2.3 + 5.9 = " + c.sumar(2.3, 5.9));
    }
    
    private void demoConversor()
    {
        Conversor conv = new Conversor();
        System.out.println("25°C a F -> " + conv.convertir(25) + "°F");
        System.out.println("10 km a millas ->" + conv.convertir(0,"kmAMillas") + "mi");
        System.out.println("Convertit de seg a min y seg");
        int [] mm = conv.convertir(130);
        System.out.println("130 seg -> " + mm [0] + "min" + mm[1] + "seg");
    }
    private void demoAuto()
    {
        Auto a = new Auto("V8");
        a.mostrarTipoMotor();
        Auto cocheElectrico = new Auto("Eléctrico");
        cocheElectrico.mostrarTipoMotor();
    }
}

