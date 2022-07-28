SELECT upper(LastName) AS LastNameUpper, FirstName AS FirstName FROM customers
WHERE length(LastName)>5 AND length(FirstName)>5 ORDER BY LastName asc;