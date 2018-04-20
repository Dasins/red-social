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
public class Entry {
    // Numero de 'me gusta' iniciales.
    private final static int INITIAL_LIKES = 0;
    
    // Autor de la entrada.
    private String author;
    // Coleccion con los comentarios de la entrada.
    private ArrayList<String> comments;
    // Numero de 'me gusta".
    private int likes;
    // Fecha de publicacion:
    private LocalDateTime publicationDate;
    
    /**
     * Constructor - Construye entradas a partir de un autor.
     * Las entradas se crean con un numero prestablecido de likes y sin comentarios.
     * La fecha de publicacion coincidira con en el momento en el se crea una entrada 
     * y no sera modificable.
     * @param author Autor de la entrada.
     * @param content Contenido de la entrada.
     */
    public Entry(String author) {
        this.author = author;
        comments = new ArrayList<>();
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
                                                                     Math.abs(duration.getSeconds()) + "segundos";
    
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
     * Devuelve los comentarios de la entrada o un mensaje indicando que no hay comentarios.
     * @return Devuelve los comentarios de la entrada o un mensaje indicando que no hay 
     *         comentarios.
     */
    public String getComments() {
        String refund = "";
        if (comments.size() > 0) {
            refund = "Comentarios:\n";
            for (String comment : comments) {
                refund += comment + "\n\n"; 
            }
        }
        else {
            refund = "No hay comentarios todavia";
        }
        return refund;
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
    
    // OPERACIONES CON LA ENTRADA
    /**
     * Anade un 'me gusta' a la entrada.
     */
    public void addLike() {
        likes++;
    }
    
    /**
     * Anade un comentario.
     * @param comment Contenido del comentario.
     */
    public void addComment(String comment) {
        comments.add(comment);
    }
       
}
