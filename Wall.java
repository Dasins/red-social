import java.util.ArrayList;
import java.nio.file.Files;
import java.io.File;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

/**
 * Muro de nuestra red social.
 * 
 * Pertenece al proyecto 'red-social'.
 * 
 * El muro es el lugar donde los usuarios publicaran sus entradas.
 *
 * @author d4s1ns
 * @version 2018/05/03
 */
public class Wall { 
    // Ruta al documento html de la web.
    private final static String PATH = "web/index.html";

    // Entradas de texto.
    private ArrayList<Entry> entries;

    /**
     * Constructor - Construye e inicializa un muro vacio.
     */
    public Wall() {
        entries = new ArrayList<>();
    }

    /**
     * Anade una entrada al muro.
     * @param entry La entrada que se va a anadir al muro.
     */
    public void addEntry (Entry entry) {
        entries.add(entry);
    }
    
    /**
     * Abre el muro en el navegador.
     */
    public void launch() {
        createWeb();
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + PATH);
        }
        catch (Exception e) {
            
        }
    }   
    
    /**
     * Anade una entrada al muro en la web.
     */
    private void createWeb() {
        File file = new File(PATH);
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(file));
            bw.write(toHTML());
            bw.close();
        }
        catch (IOException e) {}    
    }

    /**
     * Devuelve toda la informacion del muro como una cadena de texto.
     * @return Devuelve toda la informacion del muro como una cadena de texto.
     */
    @Override
    public String toString() {
        String refund = "";
        for (Entry entry : entries) {
            refund += entry + "\r==============================\r";
        }
        return refund;
    }

    /**
     * Muestra la informacion del muro por pantalla.
     * @deprecated
     */
    public void show() {
        System.out.println(this);
    }

    /**
     * Muestra la informacion del muro por pantalla.
     * @deprecated
     */
    public void print() {
        for (Entry entry : entries) {
            entry.show();
        }
    }

    /**
     * Imprime por pantalla la informacion unica del tipo de entrada
     * introducida por parametro. Con un valor 'null' imprime la informacion
     * de todas las entradas.
     * @param entryType Tipo de entrada buscada.
     */
    public void filter(String entryType) {
        for (Entry entry : entries) {
            String entryClass = entry.getClass().getSimpleName();
            if (entryClass.equals(entryType) || entryType == null ){
                entry.showExclusiveInfo();
            }
        }
    }

    /**
     * COnvierte el muro en un archivo html.
     * @return Devuelve una entrada convertida en un articule html5 valido
     *         insertable en un documento html.
     */
    private String toHTML() {
        String total = "";
        total += "<html>\r\t<head>\r\t\t<meta charset='UTF-8' />\r\t\t<meta charset='UTF-8'/>\r\t\t<title>STALK</title>";
        total += "\r\t\t<link rel='icon' href='https://cdn3.iconfinder.com/data/icons/crime-and-criminal-part-3-of-3/366/crime-criminal-004-512.png'>";
        total += "\r\t\t<link href='css/css.css' rel='stylesheet' type='text/css'>";
        total += "\r\t\t<link href='https://fonts.googleapis.com/css?family=Alegreya|Gentium+Basic|Source+Sans+Pro' rel='stylesheet'>";
        total += "\r\t</head>\r\t<body>\r\t\t<header>\r\t\t\t<h1>STALK</h1>";
        total += "\r\t\t\t<p class='setoff'>Espía a tus amigos</p>\r\t\t</header>";
        total += "\r\t\t<section id='wall'>";
        for (Entry entry : entries) {
            total += "\t\t\t<article class='" + entry.getClass().getSimpleName() + "'>\r";
            total += "\t\t\t\t<table>\r" + entry.toHTML();
        }
        total += "\t\t\t\t</table>\r\t\t\t</article>\r";
        total += "\r\t\t</section>\r\t</body>\r</html>";
        return total;
    }
}

