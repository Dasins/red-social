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
     * Devuelve toda la informacion del muro como una cadena de texto.
     * @return Devuelve toda la informacion del muro como una cadena de texto.
     */
    @Override
    public String toString() {
        String refund = "";
        for (Entry entry : entries) {
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
    
    /**
     * Muestra la informacion del muro por pantalla.
     * @deprecated
     */
    public void print2() {
        for (Entry entry : entries) {
            entry.mostrar();
        }
    }
}

