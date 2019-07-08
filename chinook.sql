--                        --SQL 2--

-- --SQL 2.1--

SELECT * FROM Employee;

SELECT DISTINCT FIRSTNAME, LASTNAME, BIRTHDATE
FROM Employee
WHERE LASTNAME = 'King';

-- USING AND  --Note condition does not need to be displayed
SELECT FIRSTNAME, LASTNAME, BIRTHDATE
FROM Employee
WHERE FIRSTNAME = 'Andrew' AND REPORTSTO is null;

-- --SQL 2.2--

SELECT * FROM Album
ORDER BY TITLE DESC;




-- SQL NOTES

SELECT * FROM Employee WHERE LASTNAME LIKE 'K%';

SELECT LASTNAME, FIRSTNAME FROM Employee;

-- Think of DISTINCT a returning a set of this column
SELECT DISTINCT TITLE
FROM Employee;
-- Useful for finding inconsistant and mispelled entries

-- Using ORDER BY
SELECT DISTINCT FIRSTNAME, LASTNAME, BIRTHDATE
FROM Employee
ORDER BY BIRTHDATE DESC;

SELECT DISTINCT FIRSTNAME, LASTNAME, BIRTHDATE
FROM Employee
ORDER BY LASTNAME ASC, BIRTHDATE DESC;

-- Using WHERE
SELECT DISTINCT FIRSTNAME, LASTNAME, BIRTHDATE
FROM Employee
WHERE LASTNAME = 'King';













