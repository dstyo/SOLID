package solid.srp;

/**
 * @author Dwi Setiyono (dwi.setiyono@dana.id)
 * @version Finance, v 0.1 2019-08-28 12:26 by Dwi Setiyono
 */
public class Finance implements FinanceService {

    @Override
    public int checkIncome() {
        return 100;
    }

    @Override
    public int checkOutcome() {
        return 1000;
    }
}
