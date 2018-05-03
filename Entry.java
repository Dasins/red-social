import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Una entrada del muro.
 * 
 * Pertenece al proyecto 'stalk', una red social un poco cutre.
 * 
 * Una entrada es una publicacion en el muro.
 *
 * @author d4s1ns
 * @version 2018/84/18
 */
public abstract class Entry {
    // Numero de 'me gusta' iniciales.
    private final static int INITIAL_LIKES = 0;
    
    // Autor de la entrada.
    private String author;
    // Numero de 'me gusta".
    private int likes;
    // Fecha de publicacion:
    private LocalDateTime publicationDate;
    
    /**
     * Constructor - Construye entradas a partir de un autor.
     * Las entradas se crean con un numero prestablecido de likes.
     * La fecha de publicacion coincidira con en el momento en el se crea una entrada 
     * y no sera modificable.
     * @param author Autor de la entrada.
     */
    public Entry(String author) {
        this.author = author;
        likes = INITIAL_LIKES;
        publicationDate = LocalDateTime.now();
    }
    
    // INFORMACION DE LA ENTRADA
    /**
     * Calcula la diferencia entre la fecha actual y la fecha de publicacion en minutos o 
     * segundos.
     * @return Devuelve una cadena con la diferencia entre la fecha acutal y la fecha de 
     *         publicacion en minutos o segundos.
     */
    public String getAntiquity() {
        LocalDateTime now = LocalDateTime.now();
        // Calcula la diferencia en segundos entre la fecha actual y la de publicacion.
        Duration duration = Duration.between(publicationDate, now);
        String timeLapse =  (Math.abs(duration.getSeconds()) > 59) ? Math.abs(duration.toMinutes()) + " minutos ":
                                                                     Math.abs(duration.getSeconds()) + " segundos ";
    
        return timeLapse;
    }
    
    /**
     * Devuelve el autor de la entrada.
     * @return Devuelve el autor de la entrada.
     */
    public String getAuthor() {
        return author;
    } 
    
    /**
     * Devuelve el numero de 'me gusta' de la entrada.
     * @return Devuelve el numero de 'me gusta' de la entrada.
     */
    public int getLikes() {
        return likes;
    }
    
    /**
     * Devuelve la fecha de publicacion de la entrada.
     * @return Devuelve la fecha de publicacion de la entrada.
     */
    public LocalDateTime getPublicationDate() {
        return publicationDate;
    }
    
    /**
     * Imprime por pantalla toda la informacion del objeto.
     * @deprecated
     */
    public void print() {
        System.out.println(this);
    }
    
    /**
     * Devuelve la informacion sobre la entrada como una cadena.
     * Los datos sobre la fecha de publicacion se devuelve como la diferencia en minutos y 
     * segundos entre le fecha actual y la de publicacion.
     * @return Devuelve la informacion sobre la entrada como una cadena.
     */
    @Override
    public String toString() {
        return "Autor: " + getAuthor() + "\nMe gusta: " + getLikes() + "\nPublicado hace: " 
               + getAntiquity() + "\r"; 
    }
    
    // OPERACIONES CON LA ENTRADA
    /**
     * Anade un 'me gusta' a la entrada.
     */
    public void addLike() {
        likes++;
    }
    
    /**
     * Imprime por pantalla la informacion de la entrada.
     */
    public abstract void mostrar();
       
    /**
     * Devuelve la informacion única de la entrada.
     */
    public abstract void showExclusiveInfo();
    
    /**
     * Devuelve la informacion de la entrada como filas de una tabla html.
     */
    public String toHTML() {
        String refund = "\t\t\t<tr>\r\t\t\t\t<td class='author'>Autor:" + author + "</td>\r\t\t\t</tr>\r";
        refund += "\t\t\t<tr>\r\t\t\t\t<td class='likes'>Likes " + likes + "</td>\r\t\t\t</tr>\r";
        refund += "\t\t\t<tr>\r\t\t\t\t<td class='date'>Publicado hace" + getAntiquity() + "</td>\r\t\t\t</tr>\r";
        return refund;
    }
}
