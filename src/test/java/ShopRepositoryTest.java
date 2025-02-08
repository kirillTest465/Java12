import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShopRepositoryTest {


    @Test

    public void removeWhenProductExitTest() {
        ShopRepository repo = new ShopRepository();

        Product product1 = new Product(1, "планшет", 20000);
        Product product2 = new Product(2, "умные часы", 30000);
        Product product3 = new Product(3, "стиральная машина", 40000);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);

        repo.remove(2);

        Product[] expected = {product1, product3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void removeWhenProductExitTest2() {
        ShopRepository repo = new ShopRepository();

        Product product1 = new Product(1, "планшет", 20000);
        Product product2 = new Product(2, "умные часы", 30000);
        Product product3 = new Product(3, "стиральная машина", 40000);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);

        Assertions.assertThrows(NotFoundException.class,
                () -> repo.remove(2222)
        );

    }


    @Test

    public void addProductTest() {
        ShopRepository repo = new ShopRepository();

        Product product1 = new Product(1, "планшет", 20000);
        Product product2 = new Product(2, "умные часы", 30000);
        Product product3 = new Product(3, "стиральная машина", 40000);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);


        Product[] expected = {product1, product2, product3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);


    }


    @Test

    public void addProductTest2() {
        ShopRepository repo = new ShopRepository();

        Product product1 = new Product(1, "планшет", 20000);
        Product product2 = new Product(2, "умные часы", 30000);
        Product product3 = new Product(3, "стиральная машина", 40000);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);


        Assertions.assertThrows(AlreadyExistsException.class,
                () -> repo.add(product1));


    }
}




