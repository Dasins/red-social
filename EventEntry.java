
/**
 * 
 *
 * @author d4s1ns
 * @version 2018/04/20
 */
public class EventEntry extends Entry {
    // Contenido de la entrada
    private String content;

    /**
     * Constructor for objects of class EventEntry
     */
    public EventEntry(String author, String content) {
        super(author);
    }

    /**
     * Devuelve el contenido de la entrada.
     * @return Devuelve el contenido de la entrada.
     */
    public String getContent() {
        return content;
    }
    
    /**
     * Devuelve el autor y el texto del mensaje.
     */
    public void showAuthorAndContent() {
        System.out.println("Autor: " + getAuthor() + "/n" + content);
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
               + getAntiquity() + "\n\n" + content; 
    }
}