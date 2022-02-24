import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    public int compare(Product s1, Product s2) {
        if (s1.getPrice() == s2.getPrice())
            return new NameComparator().compare(s1,s2);
        else if (s1.getPrice() < s2.getPrice())
            return 1;
        else
            return -1;
    }

}
