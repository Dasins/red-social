
/**
 * Notificacion de un evento en nuestro muro.
 * 
 * Pertenece al proyecto 'red-social'.
 * 
 * Un evento es una notificacion de un suceso ocurrido en nuestra red social.
 * Por ejemplo, alguien se ha unido a un grupo.
 *
 * @author d4s1ns
 * @version 2018/05/03
 */
public class EventEntry extends Entry {
    // Contenido de la entrada
    private String content;

    /**
     * Constructor - Construye entradas indicando su autor y el contenido.
     * Las entradas se crean con un numero prestablecido de likes.
     * La fecha de publicacion coincidira con en el momento en el se crea una 
     * entrada y no sera modificable.
     * @param author Autor de la entrada.
     * @param content Contenido de la entrada.
     */
    public EventEntry(String author, String content) {
        super(author);
        this.content = content;
    }

    /**
     * Devuelve el contenido de la entrada.
     * @return Devuelve el contenido de la entrada.
     */
    public String getContent() {
        return content;
    }
    
    /**
     * Muestra por pantalla la informacion de la entrada.
     */
    @Override
    public void show() {
        System.out.println(this);
    }
    
    /**
     * Devuelve el autor y el contenido de la entrada.
     */
    public void showAuthorAndContent() {
        System.out.println("Autor: " + getAuthor() + "/n" + content);
    }
    
    /**
     * Imprime por pantalla la informacion especifica de la entrada.
     */
    @Override
    public void showExclusiveInfo() {
        System.out.println(content);
    }
    
    /**
     * Devuelve la informacion de esta entrada como codigo HTML.
     * @return Devuelve la informacion de esta entrada como codigo HTML.
     */
    @Override
    public String toHTML() {
        String refund = super.toHTML();
        refund += "\t\t\t\t\t<tr>\r\t\t\t\t\t\t<td colspan='3'>" + content.replace("\n","<br/> ") + "</td>\r\t\t\t\t\t</tr>\r";
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
        return super.toString() + "\r" + content;
    }
    
}
