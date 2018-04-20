

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
    private ImageEntry imageEnt1;
    private ImageEntry imageEnt2;
    private TextEntry textEntr1;
    private TextEntry textEntr2;
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
        imageEnt1 = new ImageEntry("Diego", "Mis Vacaciones", "www.img.ur/vacaciones");
        imageEnt2 = new ImageEntry("JJ", "Noche en vela", "www.img.ur/noche_en_vela");
        textEntr1 = new TextEntry("Fran", "Otra vez Gian Carlo subiendo una  insta-history");
        textEntr2 = new TextEntry("Gian Carlo", "Eso se llama envidia @Fran");
        wall1 = new Wall();
        wall1.print();
        wall1.addEntry(imageEnt1);
        wall1.addEntry(textEntr1);
        wall1.addEntry(imageEnt2);
        wall1.addEntry(textEntr2);
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
