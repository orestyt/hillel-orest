package homework16;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class Product {
    ProductType category;
    double price;
    boolean canApplyDiscount;
    LocalDate date;

    public Product(ProductType category, float price, boolean canApplyDiscount, LocalDate date) {
        this.category = category;
        this.price = price;
        this.canApplyDiscount = canApplyDiscount;
        this.date = date;
    }

    public ProductType getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public boolean isCanApplyDiscount() {
        return canApplyDiscount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setCategory(ProductType category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCanApplyDiscount(boolean canApplyDiscount) {
        this.canApplyDiscount = canApplyDiscount;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category=" + category +
                ", price=" + price +
                ", canApplyDiscount=" + canApplyDiscount +
                ", date=" + date +
                '}';
    }

    public static List<Product> getHighPriceBook(List<Product> productList) {
        var stream = productList.stream()
                .filter(product -> product.getCategory() == ProductType.BOOK)
                .filter(product -> product.getPrice() >= 250);
        return stream.toList();
    }


    public static List<Product> getDiscountBook(List<Product> productList) {
        var stream = productList.stream()
                .filter(product -> product.getCategory() == ProductType.BOOK)
                .filter(product -> product.isCanApplyDiscount())
                .map(product -> {
                    product.setPrice(product.getPrice() - product.getPrice() / 10);
                    return product;
                });
        return stream.toList();
    }


    public static List<Product> getLastThree(List<Product> productList) {
        var stream = productList.stream()
                .skip(productList.size() - 3);
        return stream.toList();
    }


    public static Product getCheapestBook(List<Product> productList) throws Exception {
        var stream = productList.stream()
                .filter(product -> product.getCategory() == ProductType.BOOK)
                .min(Comparator.comparingDouble(Product::getPrice))
                .orElseThrow(Exception::new);
        return stream;
    }


    public static int getSumCheapBook(List<Product> productList) {
        var stream = (Integer) productList.stream()
                .filter(product -> product.getCategory() == ProductType.BOOK)
                .filter(product -> product.isWithinRange(product.getDate()))
                .filter(product -> product.getPrice() <= 75)
                .mapToInt(product -> (int) product.getPrice()).sum();
        return stream;
    }


    boolean isWithinRange(LocalDate testDate) {
        return !(testDate.isBefore(LocalDate.now().minusYears(1)) || testDate.isAfter(LocalDate.now()));
    }


    public static Map<ProductType, List<Product>> groupProducts(List<Product> productList) {
        var streamBook = productList.stream()
                .filter(product -> product.getCategory() == ProductType.BOOK);
        var streamMilk = productList.stream()
                .filter(product -> product.getCategory() == ProductType.MILK);
        Map<ProductType, List<Product>> map = new HashMap<>();
        map.put(ProductType.BOOK, streamBook.toList());
        map.put(ProductType.MILK, streamMilk.toList());
        return map;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(ProductType.BOOK, 75, true, LocalDate.now()));
        products.add(new Product(ProductType.MILK, 50, false, LocalDate.now()));
        products.add(new Product(ProductType.BOOK, 300, false, LocalDate.now()));
        products.add(new Product(ProductType.BOOK, 400, true, LocalDate.now()));
        products.add(new Product(ProductType.BOOK, 250, true, LocalDate.now()));
        products.add(new Product(ProductType.BOOK, 60, true, LocalDate.of(1999, Month.APRIL, 2)));
        products.add(new Product(ProductType.BOOK, 25, true, LocalDate.of(2023, Month.JULY, 12)));
        System.out.println(groupProducts(products));
    }
}