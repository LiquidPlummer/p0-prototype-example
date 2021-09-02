
CREATE TABLE IF NOT EXISTS test_table
(
    string_id INT AUTO_INCREMENT,
    string VARCHAR(200),
    CONSTRAINT table_pk PRIMARY KEY (string_id)
    );


CREATE TABLE IF NOT EXISTS accounts
(
    account_id INT,
    balance DECIMAL,
    CONSTRAINT accounts_pk PRIMARY KEY (account_id)
    );


CREATE TABLE IF NOT EXISTS customers
(
    customer_id INT,
    name VARCHAR(200),
    account_id INT,
    CONSTRAINT customers_pk PRIMARY KEY (customer_id),
    CONSTRAINT customers_accounts_fk FOREIGN KEY (account_id) REFERENCES accounts (account_id)
    );



INSERT INTO test_table (string) VALUES ("This is a string!");



#DROP TABLE test_table

select * from test_table

#drop table customers
#drop table accounts
