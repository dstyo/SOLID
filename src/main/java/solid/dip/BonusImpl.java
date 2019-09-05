package solid.dip;

/**
 * @author Dwi Setiyono (dwi.setiyono@dana.id)
 * @version BonusImpl, v 0.1 2019-08-28 13:30 by Dwi Setiyono
 */
public class BonusImpl implements Bonus {

    @Override
    public double hitungBonusTahunan(int tahun, double gaji) {
        double bonusTahunan = tahun * gaji * 2;
        return bonusTahunan;
    }
}
