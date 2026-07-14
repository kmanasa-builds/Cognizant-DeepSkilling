-- =====================================================
-- Cognizant Digital Nurture 5.0
-- PL/SQL Mandatory Exercise 1
-- Scenario: Banking System Database
-- Author: Kondapalli Manasa
-- =====================================================

-- =====================================================
-- Create Customers Table
-- =====================================================

CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    DOB DATE,
    Balance NUMBER,
    LastModified DATE
);

-- =====================================================
-- Create Accounts Table
-- =====================================================

CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    AccountType VARCHAR2(20),
    Balance NUMBER,
    LastModified DATE,
    CONSTRAINT fk_accounts_customers
        FOREIGN KEY (CustomerID)
        REFERENCES Customers(CustomerID)
);

-- =====================================================
-- Create Transactions Table
-- =====================================================

CREATE TABLE Transactions (
    TransactionID NUMBER PRIMARY KEY,
    AccountID NUMBER,
    TransactionDate DATE,
    Amount NUMBER,
    TransactionType VARCHAR2(20),
    CONSTRAINT fk_transactions_accounts
        FOREIGN KEY (AccountID)
        REFERENCES Accounts(AccountID)
);

-- =====================================================
-- Create Loans Table
-- =====================================================

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    LoanAmount NUMBER,
    InterestRate NUMBER,
    StartDate DATE,
    EndDate DATE,
    CONSTRAINT fk_loans_customers
        FOREIGN KEY (CustomerID)
        REFERENCES Customers(CustomerID)
);

-- =====================================================
-- Create Employees Table
-- =====================================================

CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    Position VARCHAR2(50),
    Salary NUMBER,
    Department VARCHAR2(50),
    HireDate DATE
);

-- =====================================================
-- Insert Sample Data into Customers
-- =====================================================

INSERT INTO Customers
VALUES (
    1,
    'John Doe',
    TO_DATE('1985-05-15','YYYY-MM-DD'),
    1000,
    SYSDATE
);

INSERT INTO Customers
VALUES (
    2,
    'Jane Smith',
    TO_DATE('1990-07-20','YYYY-MM-DD'),
    1500,
    SYSDATE
);

-- =====================================================
-- Insert Sample Data into Accounts
-- =====================================================

INSERT INTO Accounts
VALUES (
    1,
    1,
    'Savings',
    1000,
    SYSDATE
);

INSERT INTO Accounts
VALUES (
    2,
    2,
    'Checking',
    1500,
    SYSDATE
);

-- =====================================================
-- Insert Sample Data into Transactions
-- =====================================================

INSERT INTO Transactions
VALUES (
    1,
    1,
    SYSDATE,
    200,
    'Deposit'
);

INSERT INTO Transactions
VALUES (
    2,
    2,
    SYSDATE,
    300,
    'Withdrawal'
);

-- =====================================================
-- Insert Sample Data into Loans
-- =====================================================

INSERT INTO Loans
VALUES (
    1,
    1,
    5000,
    5,
    SYSDATE,
    ADD_MONTHS(SYSDATE, 60)
);

-- =====================================================
-- Insert Sample Data into Employees
-- =====================================================

INSERT INTO Employees
VALUES (
    1,
    'Alice Johnson',
    'Manager',
    70000,
    'HR',
    SYSDATE
);

INSERT INTO Employees
VALUES (
    2,
    'Bob Brown',
    'Developer',
    60000,
    'IT',
    SYSDATE
);

COMMIT;

-- =====================================================
-- Verify Data
-- =====================================================

SELECT * FROM Customers;

SELECT * FROM Accounts;

SELECT * FROM Transactions;

SELECT * FROM Loans;

SELECT * FROM Employees;

-- =====================================================
-- End of Exercise 1
-- =====================================================