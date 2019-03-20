
public class Persona {

	//Constantes
    /**
     * Sexo por defecto
     */
    private final static char SEXO_DEF = 'H';
 
    /**
     * El peso de la persona esta por debajo del peso ideal
     */
    public static final int INFRAPESO = -1;
 
    /**
     * El peso de la persona esta en su peso ideal
     */
    public static final int PESO_IDEAL = 0;
 
    /**
     * El peso de la persona esta por encima del peso ideal
     */
    public static final int SOBREPESO = 1;
    
    
  //Atributos
    /**
     * Nombre de la persona
     */
    private String nombre;
 
    /**
     * Edad de la persona
     */
    private int edad;
 
    /**
     * DNI de la persona, se genera al construir el objeto
     */
    private String DNI;
 
    /**
     * Sexo de la persona, H hombre M mujer
     */
    private char sexo;
 
    /**
     * Peso de la persona
     */
    private double peso;
 
    /**
     * Altura de la persona
     */
    private double altura;
}
