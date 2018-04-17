import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.Duration;

/**
 * Una entrada de texto del muro de nuestra red social.
 * 
 * Pertenece al proyecto 'stalk', una red social un poco cutre.
 * 
 * Una entrada de texto representa un contenido textual cuyo autor desea compartir en la 
 * red social.
 * Una entrada de texto tiene un autor y un contenido, la cantidad de 'me gusta' que tiene 
 * la entrada, una coleccion con los comentarios sobre la entrada y una fecha de 
 * publicacion que se establece al crear la entrada de texto.
 * 
 * @author d4s1ns
 * @version 2018/04/16
 */
public class TextEntry {    
    // Numero de 'me gusta' iniciales.
    private final static int INITIAL_LIKES = 0;
    
    // Autor de la entrada.
    private String author;
    // Coleccion con los comentarios de la entrada.
    private ArrayList<String> comments;
    // Contenido de la entrada.
    private String content;
    // Numero de 'me gusta".
    private int likes;
    // Fecha de publicacion:
    private LocalDateTime publicationDate;
    
    /**
     * Contructor - Crea una entrada de texto indicando el autor y el contenido.
     * Las entradas se crean con un numero prestablecido de likes y sin comentarios.
     * La fecha de publicacion coincidira con en el momento en el se crea una entrada 
     * y no sera modificable.
     * @param author Autor de la entrada.
     * @param content Contenido de la entrada.
     */
    public TextEntry(String author, String content) {
        this.author = author;
        comments = new ArrayList<>();
        this.content = content;
        likes = INITIAL_LIKES;
        publicationDate = LocalDateTime.now();
    }
    
    // INFORMACION DE LA ENTRADA
    /**
     * Calcula la diferencia entre la fecha actual y la fecha de publicacion en minutos y 
     * segundos.
     * @return Devuelve una cadena con la diferencia entre la fecha acutal y la fecha de 
     *         publicacion en minutos y segundos.
     */
    private String getAntiquity() {
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(publicationDate, now);
        long seconds = Math.abs(duration.getSeconds());
        
        String refund = "";
        if (seconds >= 60){
            long minutes = seconds / 60;
            seconds -= minutes * 60;
            if(seconds != 0) {
                refund += seconds + " segundos ";
            }
            refund = minutes + " minutos " + refund;
        }
        else {
            refund += seconds + " segundos ";
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
     * Devuelve los comentarios de la entrada o un mensaje indicando que no hay comentarios.
     * @return Devuelve los comentarios de la entrada o un mensaje indicando que no hay 
     *         comentarios.
     */
    public String getComments() {
        String refund = "";
        if (comments.size() > 0) {
            refund = "Comentarios :\n";
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
     * Devuelve el contenido de la entrada.
     * @return Devuelve el contenido de la entrada.
     */
    public String getContent() {
        return content;
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
     * Devuelve la informacion sobre la entrada como una cadena.
     * Los datos sobre la fecha de publicacion se devuelve como la diferencia en minutos y 
     * segundos entre le fecha actual y la de publicacion.
     * @return Devuelve la informacion sobre la entrada como una cadena.
     */
    @Override
    public String toString() {
        return "Autor: " + author + "\nMe gusta: " + likes + "\nPublicado hace: " 
               + getAntiquity() + "\n\n" + content + "\n\n" + getComments(); 
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
