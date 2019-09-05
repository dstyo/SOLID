package solid.dip;

/**
 * @author Dwi Setiyono (dwi.setiyono@dana.id)
 * @version Probation, v 0.1 2019-08-28 13:37 by Dwi Setiyono
 */
public class Probation extends Karyawan {

    private Bonus bonus;

    public Probation(Bonus bonus) {
        super(1, 1000000, bonus);
    }
}
