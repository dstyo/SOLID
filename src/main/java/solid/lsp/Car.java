package solid.lsp;

/**
 * @author Dwi Setiyono (dwi.setiyono@dana.id)
 * @version Car, v 0.1 2019-09-04 12:02 by Dwi Setiyono
 */
public class Car extends TransportationDevice {

    @Override
    public void startEnggine() {
        System.out.println(getName() + " Enggine Start");
    }
}
