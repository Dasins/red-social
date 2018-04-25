
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
    
    // INFORMACION DE LA ENTRADA
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
               + getAntiquity() + "\n\n" + content + "\n\n" + getComments(); 
    }
    
    /**
     * Muestra por pantalla la informacion de la entrada.
     */
    @Override
    public void mostrar() {
        System.out.println(this);
    }
}
