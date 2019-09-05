package solid.srp;

/**
 * @author Dwi Setiyono (dwi.setiyono@dana.id)
 * @version Inventory, v 0.1 2019-08-28 12:25 by Dwi Setiyono
 */
public class Inventory implements Service {

    @Override
    public void saveInventory() {
        System.out.println("Save Inventory");
    }

    @Override
    public void updateInventory() {
        System.out.println("Update Inventory");
    }

    @Override
    public void deleteInventory() {
        System.out.println("Delete Inventory");
    }
}
