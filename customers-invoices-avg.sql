SELECT  FirstName, LastName, AVG(Total) as InvoicesAverage FROM customers
         INNER JOIN invoices i on customers.CustomerId = i.CustomerId
         GROUP BY  i.CustomerId  ORDER BY FirstName ASC;

