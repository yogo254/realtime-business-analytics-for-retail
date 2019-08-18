package com.yogo.analytics.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yogo.analytics.domain.Customer;
import com.yogo.analytics.domain.CustomerOrder;
import com.yogo.analytics.domain.OrderItem;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderTransaction {

    private CustomerOrder customerOrder;
    private Customer customer;
    private List<OrderItem>orderItems;

    public OrderTransaction() {
    }

    public OrderTransaction(CustomerOrder customerOrder, Customer customer, List<OrderItem> orderItems) {
        this.customerOrder = customerOrder;
        this.customer = customer;
        this.orderItems = orderItems;
    }

    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "OrderTransaction{" +
                "customerOrder=" + customerOrder +
                ", customer=" + customer +
                ", orderItems=" + orderItems +
                '}';
    }
}