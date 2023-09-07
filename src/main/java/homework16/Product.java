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

    public Product(ProductType category, double price, boolean canApplyDiscount, LocalDate date) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && canApplyDiscount == product.canApplyDiscount && category == product.category && Objects.equals(date, product.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, price, canApplyDiscount, date);
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
        return productList.stream()
                .filter(product -> product.getCategory() == ProductType.BOOK)
                .filter(product -> product.getPrice() >= 250)
                .toList();
    }


    public static List<Product> getDiscountBook(List<Product> productList) {
        return productList.stream()
                .filter(product -> product.getCategory() == ProductType.BOOK)
                .filter(product -> product.isCanApplyDiscount())
                .map(product -> new Product(product.getCategory(), product.getPrice() * 0.9, product.isCanApplyDiscount(), product.getDate()))
                .toList();
    }


    public static List<Product> getLastThree(List<Product> productList) {
        return productList.stream()
                .sorted(Comparator.comparing(Product::getDate, Comparator.nullsLast(Comparator.reverseOrder())))
                .limit(3)
                .toList();
    }


    public static Product getCheapestBook(List<Product> productList) throws Exception {
        return productList.stream()
                .filter(product -> product.getCategory() == ProductType.BOOK)
                .min(Comparator.comparingDouble(Product::getPrice))
                .orElseThrow(Exception::new);
    }


    public static int getSumCheapBook(List<Product> productList) {
        return productList.stream()
                .filter(product -> product.getCategory() == ProductType.BOOK)
                .filter(product -> product.isWithinRange(product.getDate()))
                .filter(product -> product.getPrice() <= 75)
                .mapToInt(product -> (int) product.getPrice())
                .sum();
    }


    boolean isWithinRange(LocalDate testDate) {
        return !(testDate.isBefore(LocalDate.now().minusYears(1)) || testDate.isAfter(LocalDate.now()));
    }



    public static Map<ProductType, List<Product>> groupProducts(List<Product> productList) {        //Не дуже розумію
        var streamBook = productList.stream()                                                       // як зробити краще
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
        products.add(new Product(ProductType.MILK, 50, false, LocalDate.of(2019, Month.JULY, 12)));
        products.add(new Product(ProductType.BOOK, 300, false, LocalDate.of(2020, Month.JULY, 12)));
        products.add(new Product(ProductType.BOOK, 400, true, LocalDate.of(2021, Month.JULY, 12)));
        products.add(new Product(ProductType.BOOK, 250, true, LocalDate.of(2022, Month.JULY, 12)));
        products.add(new Product(ProductType.BOOK, 60, true, LocalDate.of(1999, Month.APRIL, 2)));
        products.add(new Product(ProductType.BOOK, 25, true, LocalDate.of(2023, Month.JULY, 12)));
        System.out.println(getLastThree(products));
    }
}