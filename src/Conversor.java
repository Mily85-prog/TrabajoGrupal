public class Conversor 
{
    //"a Farenheit
    public double convertir (double celsius)
    {
        return(celsius*1.8 + 32);
    }
    //km a millas
    public double convertir (double valor, String tipo)
    {
        if("KmAMillas".equalsIgnoreCase(tipo))
        {
            return valor*0.621371;
        }
        throw new IllegalArgumentException ("Tipo" + "de conversion no soportada");
    }
    //segundos a [min, seg]
    public int [] convertir (int segundos)
    {
        int min = segundos / 60;
        int seg = segundos % 60;
        return new int[]{min,seg};
    }
}
