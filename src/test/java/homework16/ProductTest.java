package homework16;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import static homework16.Product.getHighPriceBook;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void shouldGetHighPriceBook() {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(ProductType.BOOK, 75, true, LocalDate.now()));
        products.add(new Product(ProductType.MILK, 50, false, LocalDate.now()));
        products.add(new Product(ProductType.BOOK, 300, false, LocalDate.now()));
        products.add(new Product(ProductType.BOOK, 400, true, LocalDate.now()));
        List<Product> expected = new ArrayList<>();
        expected.add(new Product(ProductType.BOOK, 300, false, LocalDate.now()));
        expected.add(new Product(ProductType.BOOK, 400, true, LocalDate.now()));
        assertEquals(getHighPriceBook(products).toString(), expected.toString());
    }

    @Test
    void shouldGetDiscountBook() {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(ProductType.BOOK, 100, true, LocalDate.now()));
        products.add(new Product(ProductType.MILK, 50, false, LocalDate.now()));
        products.add(new Product(ProductType.BOOK, 400, true, LocalDate.now()));
        List<Product> expected = new ArrayList<>();
        expected.add(new Product(ProductType.BOOK, 90, true, LocalDate.now()));
        expected.add(new Product(ProductType.BOOK, 360, true, LocalDate.now()));
        assertEquals(Product.getDiscountBook(products).toString(), expected.toString());
    }

    @Test
    void shouldGetLastThree() {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(ProductType.BOOK, 75, true, LocalDate.now()));
        products.add(new Product(ProductType.MILK, 50, false, LocalDate.now()));
        products.add(new Product(ProductType.BOOK, 300, false, LocalDate.now()));
        products.add(new Product(ProductType.BOOK, 400, true, LocalDate.now()));
        products.add(new Product(ProductType.BOOK, 250, true, LocalDate.now()));
        products.add(new Product(ProductType.BOOK, 60, true, LocalDate.of(1999, Month.APRIL, 2)));
        products.add(new Product(ProductType.BOOK, 25, true, LocalDate.of(2023, Month.JULY, 12)));
        List<Product> expected = new ArrayList<>();
        expected.add(new Product(ProductType.BOOK, 250, true, LocalDate.now()));
        expected.add(new Product(ProductType.BOOK, 60, true, LocalDate.of(1999, Month.APRIL, 2)));
        expected.add(new Product(ProductType.BOOK, 25, true, LocalDate.of(2023, Month.JULY, 12)));
        assertEquals(Product.getLastThree(products).toString(), expected.toString());
    }

    @Test
    void shouldGetCheapestBook() {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(ProductType.BOOK, 75, true, LocalDate.now()));
        products.add(new Product(ProductType.MILK, 50, false, LocalDate.now()));
        products.add(new Product(ProductType.BOOK, 300, false, LocalDate.now()));
        products.add(new Product(ProductType.BOOK, 400, true, LocalDate.now()));
        products.add(new Product(ProductType.BOOK, 250, true, LocalDate.now()));
        products.add(new Product(ProductType.BOOK, 60, true, LocalDate.of(1999, Month.APRIL, 2)));
        products.add(new Product(ProductType.BOOK, 25, true, LocalDate.of(2023, Month.JULY, 12)));
        Product expected = new Product(ProductType.BOOK, 25, true, LocalDate.of(2023, Month.JULY, 12));
        try {
            assertEquals(Product.getCheapestBook(products).toString(), expected.toString().toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void shouldGetSumCheapBook() {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(ProductType.BOOK, 75, true, LocalDate.now()));
        products.add(new Product(ProductType.MILK, 50, false, LocalDate.now()));
        products.add(new Product(ProductType.BOOK, 300, false, LocalDate.now()));
        products.add(new Product(ProductType.BOOK, 400, true, LocalDate.now()));
        products.add(new Product(ProductType.BOOK, 250, true, LocalDate.now()));
        products.add(new Product(ProductType.BOOK, 60, true, LocalDate.of(1999, Month.APRIL, 2)));
        products.add(new Product(ProductType.BOOK, 25, true, LocalDate.of(2023, Month.JULY, 12)));
        int expected = 100;
        assertEquals(expected, Product.getSumCheapBook(products));
    }

    @Test
    void shouldGroupProducts() {
    }
}