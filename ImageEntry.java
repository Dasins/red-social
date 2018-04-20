
/**
 * Una entrada de imagen del muro de nuestra red social.
 * 
 * Pertenece al proyecto 'stalk', una red social un poco cutre.
 * 
 * Una entrada de imagen representa un imagen y un contenido textual cuyo autor desea compartir 
 * en la red social.
 * Una entrada de imagen tiene un autor, un contenido y una imagen, la cantidad de 'me gusta' 
 * que tiene la entrada, una coleccion con los comentarios sobre la entrada y una fecha de 
 * publicacion que se establece al crear la entrada de imagen.
 * 
 * @author d4s1ns
 * @version 2018/04/16
 */
public class ImageEntry extends Entry{    
    // Titulo de la imagen.
    private String imgTitle;
    // URL de la imagen de la entrada.
    private String imgURL;
    
    /**
     * Contructor - Crea una entrada de imagen indicando el autor, el titulo de la imagen y la URl de la imagen.
     * Las entradas se crean con un numero prestablecido de likes y sin comentarios.
     * La fecha de publicacion coincidira con en el momento en el se crea una entrada 
     * y no sera modificable.
     * @param author Autor de la entrada.
     * @param imgTitle Titulo de la imagen.
     * @param urlImage URL de la imagen de la entrada.
     */
    public ImageEntry(String author, String imgTitle, String imgURL) {
        super(author);
        this.imgTitle = imgTitle;
        this.imgURL = imgURL;
    }
    
    // INFORMACION DE LA ENTRADA
    /**
     * Devuelve el titulo de la imagen.
     * @return Devuelve el titulo de la imagen.
     */
    public String getImgTitle() {
        return imgTitle;
    }
    
    /**
     * Devuelve  URL de la imagen.
     * @return Devuelve el URL de la imagen.
     */
    public String getImgURL() {
        return imgURL;
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
               + getAntiquity() + "\n\n" + "Titulo Imagen: " + imgTitle + "\nURL imagen: " 
               + imgURL + "\n\n" + "\n\n" + getComments(); 
    }
    
}