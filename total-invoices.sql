SELECT FirstName || ' ' || upper(LastName) AS FullName, sum(i.Total) AS AllInvoices
FROM customers INNER JOIN invoices i on customers.CustomerId = i.CustomerId
group by FullName having AllInvoices>=38.00 ORDER BY FullName ASC;