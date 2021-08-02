public class CompraFlota {


    //-------------------------------------------------
    // Atributos
    //-------------------------------------------------

    /** 
     *  Nombre del proyecto
    */
    private String proyecto;

        /** 
     *  Nombre del proyecto
    */
    private int tiempo;

        /** 
     *  Nombre del proyecto
    */
    private double capital;

        /** 
     *  Nombre del proyecto
    */
    private double interes;

    //-----------------------------------------------------
    // Metodos
    //------------------------------------------------------

    /**
     *  Construye el proyecto. <br>
     * <b>post: </b> se creo un nuevo proyecto con los siguientes valores
     * Proyecto UTP
     */

    public CompraFlota()
    {
        proyecto = "UTP ciclo 2 Java";
        tiempo = 0;
        capital = 0;
        interes = 0;
    }

    /**
     * RETORNA EL NOMBRE DEL PROYECTO
     * @return nombre del proyecto
     */
    public String getNombreProyecto()
    {
        return proyecto;
    }

    /**
     * Retorna el interes simple, monto, capital, en una cadena de texto.
     * @return El total de interes simples generados en numero
     */
    public double calcularInteresSimple ()
    {
        double interesSimple = capital * interes * tiempo;
        return interesSimple;
    }

        /**
     * Retorna el interes compuesto, monto, capital, en una cadena de texto.
     * @return El total de interes compuestos generados en numero
     */
    public double calcularInteresCompuesto()
    {
        double interesCompuesto = capital * (Math.pow (1 + interes, tiempo )- 1);
        return interesCompuesto;
    }

    /**
     * Metodo para comparar la diferencia en el total de intereses generados para el proyecto
     * @return Respuesta al reto
     */
    public String compararCompra ( int pTiempo, double pCapital, double pInteres)
    {
        tiempo = pTiempo;
        capital = pCapital;
        interes = pInteres;

        /* calculo de la diferecnia entre tipos de tasas*/
        double respuesta = calcularInteresCompuesto( ) - calcularInteresSimple( );

        if ( respuesta > 0 )

        {
            return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + respuesta; 
        }
        else 
        {
            return "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
        }
        
    }
    
}

