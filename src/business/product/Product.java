package business.product;

public class Product {
    public String getName() {
        return name;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getPrice() {
        return price;
    }

    private String name;
    private Double weight;
    private Double price;

    public Product(String name, Double weight, Double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public Boolean hasName(String name){
        return name.equalsIgnoreCase(this.getName());
    }
}
