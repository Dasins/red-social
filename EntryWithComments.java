import java.util.ArrayList;

/**
 * Una entrada con comentarios.
 * 
 * Pertenece al proyecto 'stalk, una red social un poco cutre.
 * 
 * Las entradas con comentarios, tienen comentarios yeah!.
 *
 * @author d4s1ns
 * @version 2018/04/2018
 */
public abstract class EntryWithComments extends Entry {
    // Coleccion con los comentarios de la entrada.
    private ArrayList<String> comments;

    /**
     * Constructor - Construye entradas a partir de un autor.
     * Las entradas se crean con un numero prestablecido de likes y sin comentarios.
     * La fecha de publicacion coincidira con en el momento en el se crea una entrada 
     * y no sera modificable.
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
     * Devuelve la informacion sobre la entrada como una cadena.
     * Los datos sobre la fecha de publicacion se devuelve como la diferencia en minutos y 
     * segundos entre le fecha actual y la de publicacion.
     * @return Devuelve la informacion sobre la entrada como una cadena.
     */
    @Override
    public String toString() {
        return super.toString() + getComments(); 
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
                refund += comment + "\r"; 
            }
        }
        else {
            refund = "No hay comentarios todavia";
        }
        return refund;
    }
    
    /**
     * Devuelve la informacion única de la entrada.
     */
    @Override
    public void showExclusiveInfo() {
        System.out.println(getComments() + "\r");
    }
    
    /**
     * 
     */
    public String commentsToHTML() {
        String refund = "";
        for (String comment : comments) {
            refund = "\t\t\t<tr><td class='comments'>" + comment + "</td></tr>\r";
        }
        return refund;
    }
}
