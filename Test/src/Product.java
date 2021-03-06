public class Product {
    private String name;
    private String categoryTag;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryTag() {
        return categoryTag;
    }

    public void setCategoryTag(String categoryTag) {
        this.categoryTag = categoryTag;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, String categoryTag, double price) {
        this.name = name;
        this.categoryTag = categoryTag;
        this.price = price;
    }
}

