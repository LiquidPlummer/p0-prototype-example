package daos;


import models.Customer;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO implements Dao<Customer>{

    private List<Customer> customers;
    Connection connection;

    public CustomerDAO(Connection conn) {
        customers = new ArrayList<>();
        connection = conn;
    }

    @Override
    public Customer get(int id) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public void save(Customer customer) {

    }

    @Override
    public void update(Customer customer, String[] params) {

    }

    @Override
    public void delete(Customer customer) {

    }
}
