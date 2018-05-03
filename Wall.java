import java.util.ArrayList;

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
    
}

