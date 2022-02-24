import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("may tinh xach tay A","mt",12.0));
        products.add(new Product("laptop X","mt",13.0));
        products.add(new Product("pc 2","mt",13.0));
        products.add(new Product("ultrabook EZ","mt",16.0));
        products.add(new Product("tu lanh e","dl",11.5));
        products.add(new Product("dieu hoa nhiet do b","dl",12.0));

        List<Category> categories = new ArrayList<>();
        categories.add(new Category("may tinh","mt"));
        categories.add(new Category("may tinh","mt"));
        categories.add(new Category("may tinh","mt"));
        categories.add(new Category("may tinh","mt"));
        categories.add(new Category("dien lanh","dl"));
        categories.add(new Category("dien lanh","dl"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào bàn phím tên loại sp:");
        String tag = sc.nextLine();
        Collections.sort(products,new PriceComparator());
        for (Product p : products) {
            if(p.getCategoryTag().equals(tag)) {
                System.out.println(p.getPrice() + "," +p.getName());
            }
        }
        sc.close();
    }
}
