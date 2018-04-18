import java.util.ArrayList;

/**
 * Muro de nuestra red social.
 * 
 * Pertenece al proyecto 'stalk', una red social un poco cutre.
 * 
 * El muro es el lugar donde los usuarios publicaran sus entradas.
 *
 * @author d4s1ns
 * @version 2018/04/18
 */
public class Wall {
    // Entradas de texto.
    private ArrayList<TextEntry> textEntries;
    // Entradas de imagen.
    private ArrayList<ImageEntry> imageEntries;
    
    /**
     * Constructor - Construye e inicializa un muro vacio.
     */
    public Wall() {
        textEntries = new ArrayList<>();
        imageEntries = new ArrayList<>();
    }
    
    /**
     * Anade una entrada al muro.
     * @param entry La entrada que se va a anadir al muro.
     */
    public void addEntry (TextEntry entry) {
        textEntries.add(entry);
    }
    
    /**
     * Anade una entrada al muro.
     * @param entry La entrada que se va a anadir al muro.
     */
    public void addEntry (ImageEntry entry) {
        imageEntries.add(entry);
    }
    
    /**
     * Devuelve toda la informacion del muro como una cadena de texto.
     * @return Devuelve toda la informacion del muro como una cadena de texto.
     */
    @Override
    public String toString() {
        String refund = "";
        for (TextEntry entry : textEntries) {
            refund += entry + "\n";
        }
        for (ImageEntry entry : imageEntries) {
            refund += entry + "\n";
        }
        return refund;
    }
    
    /**
     * Muestra la informacion del muro por pantalla.
     * @deprecated
     */
    public void print() {
        System.out.println(this);
    }
}

