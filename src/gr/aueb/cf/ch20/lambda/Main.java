package gr.aueb.cf.ch20.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Filters The Products.
 */
public class Main {

    private static final List<Product> products = Arrays.asList(
            new Product("123a", "Lacta", 2.5, 20),
            new Product("123b", "Lion", 4, 50),
            new Product("123c", "Cheetos", 1.4, 10),
            new Product("123d", "3-Bit", 0.5, 200)
    );

    public static void main(String[] args) {
        List<Product> filteredById = getFilteredProducts(products, product -> product.getId().matches("123a"));
        List<Product> filteredByPrice = getFilteredProducts(products, product -> product.getPrice() > 1.5);
        List<Product> filteredByQuantity = getFilteredProducts(products, product -> product.getQuantity() > 12);

        printProducts(filteredById, Product::printProduct);
        printProducts(filteredByPrice, Product::printProduct);
        printProducts(filteredByQuantity, Product::printOnlyTitle);

        checkAndPrintProduct(filteredById, product -> product.getId().matches("123a"), System.out::println);
        checkAndPrintProduct(filteredByPrice, product -> product.getPrice() <= 2, Product::printProduct);
        checkAndPrintProduct(filteredByQuantity, product -> product.getQuantity() > 2, System.out::println);
    }

    public static List<Product> getFilteredProducts(List<Product> products, Predicate<Product> filter) {
        List<Product> productsToReturn = new ArrayList<>();
        for (Product product : products) {
            if (filter.test(product)) {
                productsToReturn.add(product);
            }
        }
        return productsToReturn;
    }

    public static void printProducts (List<Product> products, Consumer<Product> consumer) {
        for (Product product : products) {
            consumer.accept(product);
        }
    }

    public static void checkAndPrintProduct (List<Product> products, Predicate<Product> filter, Consumer<Product> consumer) {
     products.forEach(product -> {
         if (filter.test(product)) {
             consumer.accept(product);
         }
     });
    }
}
