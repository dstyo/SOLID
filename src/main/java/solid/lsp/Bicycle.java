package solid.lsp;

/**
 * @author Dwi Setiyono (dwi.setiyono@dana.id)
 * @version Bicycle, v 0.1 2019-09-04 12:04 by Dwi Setiyono
 */
public class Bicycle extends TransportationDevice {

    @Override
    public void startEnggine() {
        System.out.println(getName() + " No Enggine");
    }

//    @Override
//    public void startMoving() {
//        System.out.println(getName() + " No Enggine");
//    }
}
