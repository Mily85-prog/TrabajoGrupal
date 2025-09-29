
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal 
{
public static void main(String[] args)
    {
        
        Controlador controlador = new Controlador(new Scanner (System.in));
        try 
        {
            controlador.menu();
        } 
        catch (IOException e) 
        {
            System.out.println("Ocurrió un error de E/S: " + e.getMessage());
        }
        catch (InputMismatchException e)
        {
            System.out.println("Error no encontrado " + e.getMessage());
        }
    }
    
}
