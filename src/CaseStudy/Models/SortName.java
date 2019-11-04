package CaseStudy.Models;

import java.util.Comparator;

public class SortName implements Comparator<Customer> {
    @Override
    public int compare(Customer s1, Customer s2) {
        return s1.getNameCustomer().compareTo(s2.getNameCustomer());
    }
}
