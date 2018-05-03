

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class WallTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class WallTest
{
    private TextEntry textEntr1;
    private TextEntry textEntr2;
    private TextEntry textEntr3;
    private EventEntry eventEnt1;
    private EventEntry eventEnt2;
    private EventEntry eventEnt3;
    private ImageEntry imageEnt1;
    private ImageEntry imageEnt2;
    private ImageEntry imageEnt3;
    private Wall wall1;

    /**
     * Default constructor for test class WallTest
     */
    public WallTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        textEntr1 = new TextEntry("Entrada de texto", "Lorem ipsum dolor sit, amet consectetur adipiscing elit, volutpat tempor.\rMi vehicula senectus vel aptent non, euismod tincidunt faucibus.");
        textEntr2 = new TextEntry("Otra entrada de texto", "Lorem ipsum dolor sit, amet consectetur adipiscing elit, volutpat tempor.\rMi vehicula senectus vel aptent non, euismod tincidunt faucibus.");
        textEntr3 = new TextEntry("La mejor entrada de texto", "Lorem ipsum dolor sit, amet consectetur adipiscing elit, volutpat tempor.\rMi vehicula senectus vel aptent non, euismod tincidunt faucibus.");
        eventEnt1 = new EventEntry("Evento: dejar grupo", "El libro de matematicas dejo el grupo por problemas internos");
        eventEnt2 = new EventEntry("Evento: nuevo amigo", "Nadie te agrego a su lista de amigos");
        eventEnt3 = new EventEntry("Evento: invitacion a juego", "Pigsaw quiere jugar a un juego contigo");
        imageEnt1 = new ImageEntry("Imagen", "Asesinato rebozado", "https://ep00.epimg.net/elpais/imagenes/2018/01/28/gastronotas_de_capel/1517140192_447914_1517141038_noticia_normal.jpg");
        imageEnt2 = new ImageEntry("Otra imagen", "Que miedito!", "https://i.blogs.es/ef1960/pantallazo-azul-de-la-muerte-sin-mensaje-optimista/450_1000.png");
        imageEnt3 = new ImageEntry("La mejor imagen", "Deporte extremo", "https://www.absolutviajes.com/wp-content/uploads/2016/03/deporte-extremo-830x525.jpg");
        wall1 = new Wall();
        wall1.addEntry(textEntr1);
        wall1.addEntry(eventEnt1);
        wall1.addEntry(eventEnt2);
        wall1.addEntry(imageEnt3);
        wall1.addEntry(textEntr3);
        wall1.addEntry(imageEnt2);
        wall1.addEntry(imageEnt1);
        wall1.addEntry(eventEnt3);
        wall1.addEntry(textEntr2);
        wall1.addEntry(textEntr3);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
