package net.fernando.salas.composition;

import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class OrderItem {
    private Product product;
    private int quantity;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}

class Order {
    private List<OrderItem> orderItems;
    private String orderNumber;

    public Order(String orderNumber) {
        this.orderNumber = orderNumber;
        this.orderItems = new ArrayList<>();
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void addOrderItem(OrderItem orderItem) {
        orderItems.add(orderItem);
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public double calculateTotal() {
        double total = 0;
        for (OrderItem orderItem : orderItems) {
            total += orderItem.getProduct().getPrice() * orderItem.getQuantity();
        }
        return total;
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }
}

public class ECommerceExample {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 999.99);
        Product phone = new Product("Smartphone", 499.99);

        OrderItem laptopItem = new OrderItem(laptop, 2);
        OrderItem phoneItem = new OrderItem(phone, 1);

        Order firstOrder = new Order("ORDER001");
        firstOrder.addOrderItem(laptopItem);
        firstOrder.addOrderItem(phoneItem);

        Customer fernando = new Customer("Fernando Salas");
        fernando.placeOrder(firstOrder);

        System.out.println("Customer: " + fernando.getName());
        for (Order order : fernando.getOrders()) {
            System.out.println("Order Number: " + order.getOrderNumber());
            for (OrderItem orderItem : order.getOrderItems()) {
                Product product = orderItem.getProduct();
                System.out.println("Product: " + product.getName());
                System.out.println("Quantity:; " + orderItem.getQuantity());
                System.out.println("Price: $" + product.getPrice());
            }
            System.out.println("Total Price: $" + order.calculateTotal());
        }
    }
}
