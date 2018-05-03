import java.util.ArrayList;

/**
 * Una entrada con comentarios.
 * 
 * Pertenece al proyecto 'red-social'.
 * 
 * Una entrada es una publicacion en el muro. Las entradas con comentarios, tienen comentarios.
 *
 * @author d4s1ns
 * @version 2018/05/03
 */
public abstract class EntryWithComments extends Entry {
    // Coleccion con los comentarios de la entrada.
    private ArrayList<String> comments;

    /**
     * Constructor - Construye entradas a partir de un autor.
     * Las entradas se crean con un numero prestablecido de likes y sin comentarios.
     * La fecha de publicacion coincidira con en el momento en el se crea una entrada 
     * y no sera modificable. Por defecto, se crean sin ningun comentario.
     * @param author Autor de la entrada.
     */
    public EntryWithComments(String author) {
        super(author);
        comments = new ArrayList<>();      
    }
    
    /**
     * Anade un comentario.
     * @param comment Contenido del comentario.
     */
    public void addComment(String comment) {
        comments.add(comment);
    }
    
    /**
     * Devuelve los comentarios de la entrada o un mensaje indicando que no 
     * hay comentarios.
     * @return Devuelve los comentarios de la entrada o un mensaje indicando 
     *         que no hay comentarios.
     */
    public String getComments() {
        String refund = "";
        if (comments.size() > 0) {
            refund = "Comentarios:";
            for (String comment : comments) {
                refund += "\r#"+ comment; 
            }
        }
        else {
            refund = "No hay comentarios todavia";
        }
        return refund;
    }
    
}
