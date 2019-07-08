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

SELECT FIRSTNAME, CITY
FROM Employee
ORDER BY CITY DESC;

-- --SQL 2.3--

-- SQL Error: ORA-00984: column not allowed here
INSERT INTO Genre (GENREID, NAME) VALUES (26, House);

INSERT INTO Employee (EMPLOYEEID, FIRSTNAME, LASTNAME) VALUES (17, 'Todd', 'Helton');

INSERT INTO Customer (CUSTOMERID, FIRSTNAME, LASTNAME, EMAIL) VALUES (555, 'Eric', 'Holder', 'usaj@yahoo.no');

-- --SQL 2.4--

UPDATE Customer 
SET FIRSTNAME = 'Robert',
LASTNAME = 'Walter'
WHERE FIRSTNAME = 'Aaron' AND LASTNAME = 'Mitchell';

UPDATE Artist
SET NAME = 'CCR'
WHERE NAME = 'Creedence Clearwater Revival';

-- --SQL 2.5--

SELECT * FROM Invoice WHERE BILLINGADDRESS LIKE 'T%';

-- --SQL 2.6--

SELECT * 
FROM Invoice
WHERE TOTAL BETWEEN 15 AND 50;

-- --Dates are hard--
--SELECT *
--FROM Employee
--WHERE HIREDATE BETWEEN difficult to input date #1 AND still difficult to input date #2;

--                          --SQL FUNCTIONS

-- --SQL 3.1--


-- SQL NOTES
SELECT * FROM Album;
SELECT * FROM Artist;
SELECT * FROM Customer;
SELECT * FROM Employee;
SELECT * FROM Genre;
SELECT * FROM Invoice;


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

SELECT * FROM Customer;















