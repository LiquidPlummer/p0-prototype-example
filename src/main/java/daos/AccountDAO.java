package daos;

import models.Account;

import java.sql.Connection;
import java.util.LinkedList;
import java.util.List;

public class AccountDAO implements Dao<Account>{
    private List<Account> accounts;
    Connection connection;

    public AccountDAO(Connection conn) {
        accounts = new LinkedList<>();
        connection = conn;
    }

    @Override
    public Account get(int id) {
        return null;
    }

    @Override
    public List<Account> getAll() {
        return null;
    }

    @Override
    public void save(Account account) {

    }

    @Override
    public void update(Account account, String[] params) {

    }

    @Override
    public void delete(Account account) {

    }
}
