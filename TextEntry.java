
/**
 * Una entrada de texto del muro de nuestra red social.
 * 
 * Pertenece al proyecto 'stalk', una red social un poco cutre.
 * 
 * Una entrada de texto representa un contenido textual cuyo autor desea 
 * compartir en la red social.
 * Una entrada de texto tiene un autor y un contenido, la cantidad de 
 * 'me gusta' que tiene la entrada, una coleccion con los comentarios sobre 
 * la entrada y una fecha de publicacion que se establece al crear 
 * la entrada.
 * 
 * @author d4s1ns
 * @version 2018/05/03
 */
public class TextEntry extends EntryWithComments{    
    // Contenido de la entrada.
    private String content;
    
    /**
     * Contructor - Crea una entrada de texto indicando el autor y el contenido.
     * Las entradas se crean con un numero prestablecido de likes y sin comentarios.
     * La fecha de publicacion coincidira con en el momento en el se crea una entrada 
     * y no sera modificable.
     * @param author Autor de la entrada.
     * @param content Contenido de la entrada.
     */
    public TextEntry(String author, String content) {
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
     * Devuelve el autor y el texto del mensaje.
     */
    public void showAuthorAndContent() {
        System.out.println("Autor: " + getAuthor() + "/r" + content);
    }
    
    /**
     * Muestra por pantalla la informacion de la entrada.
     */
    @Override
    public void show() {
        System.out.println(this);
    }
    
    /**
     * Devuelve la informacion única de la entrada.
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
        refund += commentsToHTML();
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
        return super.toString() + "\r" + content + "\r" + getComments(); 
    }
    
}
