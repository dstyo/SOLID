package solid;

import solid.dip.BonusImpl;
import solid.dip.Karyawan;
import solid.dip.Probation;
import solid.dip.Tetap;
import solid.lsp.Bicycle;
import solid.lsp.Car;
import solid.lsp.TransportationDevice;

/**
 * @author Dwi Setiyono (dwi.setiyono@dana.id)
 * @version SolidMain, v 0.1 2019-08-28 09:16 by Dwi Setiyono
 */
public class SolidMain {

    public static void main(String[] args) {

//        Inventory inventory = new Inventory();
//        inventory.saveInventory();
//        inventory.updateInventory();
//        inventory.deleteInventory();
//
//        Finance finance = new Finance();
//        System.out.println(finance.checkIncome());
//        System.out.println(finance.checkOutcome());

//        Animal elephant = new Elephant();
//        elephant.getNameAnimal();
//
//        Animal tiger = new Tiger();
//        tiger.getNameAnimal();

//        Kalkulator kalkulator = new Kurang();
//        System.out.println(kalkulator.operasi(2, 1));
//        kalkulator = new Tambah();
//        System.out.println(kalkulator.operasi(2, 1));

//        Kurang kurang = new Kurang();
//        kurang.operasi(2,1);

//        Animals ayam = new Ayam();
//        ayam.makan();
//
//        Mamalia sapi = new Sapi();
//        sapi.menyusui();


//        Karyawan probation = new Probation(new BonusImpl());
//        System.out.println(probation.lihatGaji());
//
//        Karyawan tetap = new Tetap(new BonusImpl());
//        System.out.println(tetap.lihatGaji());

        TransportationDevice bicycle = new Bicycle();
        bicycle.setName("bike");
        bicycle.startEnggine();

        TransportationDevice car = new Car();
        car.setName("car");
        car.startEnggine();

    }
}
