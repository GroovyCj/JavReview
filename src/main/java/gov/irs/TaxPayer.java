package gov.irs;

public interface TaxPayer {
    static final double salaryTaxRate = .30;
    static final double hourlyTaxRate = .25;
    static final double CORP_TAX_RATE = .10;
    double computeMonthlyTaxToPay();

}
