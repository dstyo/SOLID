package solid.lsp;

/**
 * @author Dwi Setiyono (dwi.setiyono@dana.id)
 * @version TransportationDevice, v 0.1 2019-09-04 12:01 by Dwi Setiyono
 */
public abstract class TransportationDevice {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void startEnggine();

}
