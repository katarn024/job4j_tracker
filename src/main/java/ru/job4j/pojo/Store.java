package ru.job4j.pojo;

public class Store {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product eggs = new Product("Egg", 19);
        Product[] products = new Product[3];
        products[0] = milk;
        products[1] = bread;
        products[2] = eggs;
        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            System.out.println(product.getName() + " - " + product.getCount());
        }
        System.out.println("Replace milt to oil");
        Product oil = new Product("Oil", 11);
        products[0] = oil;
        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            if (product.getCount() > 10) {
            System.out.println(product.getName() + " - " + product.getCount());
            }
        }
    }
}
