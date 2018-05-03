import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Una entrada del muro.
 * 
 * Pertenece al proyecto 'red-social'.
 * 
 * Una entrada es una publicacion en el muro.
 *
 * @author d4s1ns
 * @version 2018/05/03
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
     * Constructor - Construye entradas indicando su autor.
     * Las entradas se crean con un numero prestablecido de likes.
     * La fecha de publicacion coincidira con en el momento en el se crea una 
     * entrada y no sera modificable.
     * @param author Autor de la entrada.
     */
    public Entry(String author) {
        this.author = author;
        likes = INITIAL_LIKES;
        publicationDate = LocalDateTime.now();
    }
    
    /**
     * Anade un 'me gusta' a la entrada.
     */
    public void addLike() {
        likes++;
    }
    
    /**
     * Calcula la diferencia entre la fecha actual y la fecha de publicacion en 
     * minutos o segundos.
     * @return Devuelve una cadena de texto con la diferencia de tiempo, 
     *         expresa en minutos o segundos, entre la fecha actual y la fecha
     *         de creacion de la entrada.
     */
    public String getAntiquity() {
        String refund = "Publicado hace ";
        LocalDateTime now = LocalDateTime.now();
        // Calcula la diferencia en segundos entre la fecha actual y la de publicacion.
        Duration duration = Duration.between(publicationDate, now);
        long timeLapse = Math.abs(duration.getSeconds());
        // Determina si se expresa en segundos o minutos.
        if (timeLapse > 59) {
            timeLapse = Math.abs(duration.toMinutes());
            refund += timeLapse + " minuto" + ((timeLapse != 1) ? "s " : " ");
        }
        else {
            refund += timeLapse + " segundo" + ((timeLapse != 1) ? "s " : " ");
        }
        return refund;
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
     * Imprime por pantalla la informacion de la entrada.
     */
    public abstract void show();
       
    /**
     * Imprime por pantalla la informacion especifica de la entrada.
     */
    public abstract void showExclusiveInfo();
    
    /**
     * Devuelve la informacion de esta entrada como codigo HTML.
     * @return Devuelve la informacion de esta entrada como codigo HTML.
     */
    public String toHTML() {
        String refund = "\t\t\t\t\t<tr>\r\t\t\t\t\t\t<th>Autor: " + author + "</th>\r";
        refund += "\t\t\t\t\t\t<th>" + getAntiquity() + "</th>\r";
        refund += "\t\t\t\t\t\t<th>Me gusta: " + likes + "</th>\r\t\t\t\t\t</tr>\r";
        return refund;
    }
    
    /**
     * Devuelve la informacion sobre la entrada como una cadena de texto.
     * Los datos sobre la fecha de publicacion se devuelven como la diferencia
     * en minutos o segundos entre le fecha actual y la de publicacion.
     * @return Devuelve la informacion sobre la entrada como una cadena.
     */
    @Override
    public String toString() {
        return "Autor: " + author + "\t" + getAntiquity() 
               + "\tMe gusta: " + likes;
    }
}
