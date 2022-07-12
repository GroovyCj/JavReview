package gov.irs;

public class IRS {
    private TaxPayer[] taxPayers = new TaxPayer[100];
    private int currentIndex = 0;



    public IRS(String nation){

    }
    public void register(TaxPayer taxPayer){
        /*
         - receive TaxPayer Object as an argument
         - place that TaxPayer object into the first empty bucket of the array
         - Increment the currentIndex so that next time this method is called, it will use the next empty bucket
         */
        taxPayers[currentIndex++] = taxPayer;



    }

    public double computeTotalTaxToCollect(){
        double totalMonthlyTaxToCollect = 0.0;

        // for every TaxPayer object in the array, call
        // computeMonthlyTaxToPay() Method

        for (int i = 0; i < currentIndex; i++){
            double monthlyTaxToPay = taxPayers[i].computeMonthlyTaxToPay();
            totalMonthlyTaxToCollect += monthlyTaxToPay;
        }



        return totalMonthlyTaxToCollect;
    }
}
