import java.util.Arrays;
import java.util.List;

public class TaxStrategyMain {

    public static void main(String [] args) {

        //Create a List of Tax strategies for different scenarios
        List<TaxStrategy> taxStrategyList =
                Arrays.asList(
                        new PersonalTaxStrategy(),
                        new PersonalTaxPenaltyStrategy(),
                        new PersonalTaxRebateStrategy());

        //Calculate Tax for different scenarios with corresponding strategies
        for (TaxStrategy taxStrategy : taxStrategyList) {
            System.out.println(taxStrategy.calculateTax(30000.0));
        }
    }
}