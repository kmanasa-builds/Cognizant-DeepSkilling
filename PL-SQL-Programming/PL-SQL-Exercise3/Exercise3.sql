-- =====================================================
-- Cognizant Digital Nurture 5.0
-- PL/SQL Exercise 3
-- Topic: Stored Procedures
-- Author: Kondapalli Manasa
-- =====================================================

-- =====================================================
-- Scenario 1
-- Process Monthly Interest for Savings Accounts
-- =====================================================

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
AS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'Savings';

    COMMIT;
END;
/

-- Execute Procedure

BEGIN
    ProcessMonthlyInterest;
END;
/

-- Verify

SELECT * FROM Accounts;

-- =====================================================
-- Scenario 2
-- Update Employee Bonus
-- =====================================================

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus
(
    p_Department IN VARCHAR2,
    p_BonusPercent IN NUMBER
)
AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_BonusPercent / 100)
    WHERE Department = p_Department;

    COMMIT;
END;
/

-- Execute Procedure

BEGIN
    UpdateEmployeeBonus('IT',10);
END;
/

-- Verify

SELECT * FROM Employees;

-- =====================================================
-- Scenario 3
-- Transfer Funds
-- =====================================================

CREATE OR REPLACE PROCEDURE TransferFunds
(
    p_FromAccount IN NUMBER,
    p_ToAccount IN NUMBER,
    p_Amount IN NUMBER
)
AS
    v_Balance NUMBER;
BEGIN

    SELECT Balance
    INTO v_Balance
    FROM Accounts
    WHERE AccountID = p_FromAccount;

    IF v_Balance >= p_Amount THEN

        UPDATE Accounts
        SET Balance = Balance - p_Amount
        WHERE AccountID = p_FromAccount;

        UPDATE Accounts
        SET Balance = Balance + p_Amount
        WHERE AccountID = p_ToAccount;

        COMMIT;

    ELSE

        DBMS_OUTPUT.PUT_LINE('Insufficient Balance');

    END IF;

END;
/

-- Execute Procedure

BEGIN
    TransferFunds(1,2,200);
END;
/

-- Verify

SELECT * FROM Accounts;

-- =====================================================
-- End of Exercise 3
-- =====================================================