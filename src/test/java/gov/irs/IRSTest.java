package gov.irs;

import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class IRSTest {

    @Test
    public void register() {
    }

    @Test
    public void computeTotalTaxToCollect_should_compute_correctly_with_multiple_employees_and_corp() {
        // - what is our test target class? IRS
        // - you have to create an object of your test target

        IRS irs = new IRS("USA");

        // add 3 TaxPayer objects 1 salary 1 hourly and 1 corps
        SalariedEmployee kane = new SalariedEmployee("kane", LocalDate.of(2020,12,20), 10000);
        HourlyEmployee jeff = new HourlyEmployee("jeff",LocalDate.of(2019,10,10), 40, 40);
        irs.register(kane);
        // - you are going to invoke the test targets method
        double totalTaxToCollect = irs.computeTotalTaxToCollect();

        // and get the return value and assign to actual value
        // you need to compute expected value
        double expectedTaxToCollect = 0.0;

        // assertEquals with delta
        assertEquals(expectedTaxToCollect, totalTaxToCollect, 0.01);
    }
}