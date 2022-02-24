import java.util.Comparator;

public class NameComparator implements Comparator<Product> {
    public int compare(Product s1, Product s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
