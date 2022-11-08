
/**
 * Décrivez votre classe Robot ici.
 *
 * @author (SEHONOU)
 * @version (1.0)
 */
public class Robot
{
    // Position du robot
    private int X;
    private int Y;
    String name ;
    private static int numero = 0 ;
    private static int MIN_NAME_LENGTH = 3;
    private static int MIN_POSITION = 0; // la personne C met un commentaire
    private static int MAX_POSITION = 10;
    CanvasRobot canvasRobot;
    String colourBody;
    
    /**
     * Constructeur d'objets de classe Robot
     */
    public Robot(String Nom, String color){
        setName(Nom);
        color = color.toUpperCase();
        setColourBody(color);
        canvasRobot = new CanvasRobot(this.colourBody);
        canvasRobot.drawRobot(X,Y);

    }
    public Robot(String Nom, int X , int Y, String color){ 
        setName(Nom);
        setXPosition (X);
        setYPosition (Y);
        color = color.toUpperCase();
        setColourBody(color);
        canvasRobot = new CanvasRobot(this.colourBody);
        canvasRobot.drawRobot(X,Y);
    }

    /**
     * Méthode permettant au robot - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    private void setY (int Y){
        if ( Y <= MAX_POSITION && Y >= MIN_POSITION){
            Y = Y ;   
        }
        else Y = 0;
    }
    private void setX (int X){
        if ( X <= MAX_POSITION && X >= MIN_POSITION){
            X = X ;
         }
        else X = 0 ;
    }
    public int getYPosition (){
        return Yposition ;
    }
    public int getXPosition (){
        return Xposition;
    }
    public void setName(String Nom){
        Nom = Nom.trim() ;
        if ( Nom.length() >= MIN_NAME_LENGTH ){
        name = Nom ;    
        }
        else {
        numero++ ;    
        String tempNom= "iRobot"+ numero ;
        name = tempNom ;
        }
    }
    public String getName(){
        return name ;
    }
}
