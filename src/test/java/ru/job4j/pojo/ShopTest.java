package ru.job4j.pojo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class ShopTest {
    @Test
    public void whenLastNull() {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        int result = Shop.indexOfNull(products);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFirstNull() {
        Product[] products = new Product[5];
        products[1] = new Product("Milk", 10);
        int result = Shop.indexOfNull(products);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenHasNotNull() {
        Product[] products = new Product[1];
        products[0] = new Product("Milk", 10);
        int result = Shop.indexOfNull(products);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}