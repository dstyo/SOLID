package solid.dip;

/**
 * @author Dwi Setiyono (dwi.setiyono@dana.id)
 * @version Karyawan, v 0.1 2019-08-28 12:37 by Dwi Setiyono
 */
public abstract class Karyawan {

    private Bonus bonus;

    private int tahun;

    private double gaji;

    public Karyawan(int tahun, double gaji, Bonus bonus) {
        this.bonus = bonus;
        this.tahun = tahun;
        this.gaji = gaji;
    }

    public double lihatGaji() {
        return bonus.hitungBonusTahunan(tahun, gaji);
    }
}
