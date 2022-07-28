SELECT FirstName || ' ' || upper(LastName) AS FullName, round(sum(i.Total),2) AS AllInvoices
FROM customers INNER JOIN invoices i on customers.CustomerId = i.CustomerId
group by FullName having AllInvoices>=38.00 ORDER BY FullName ASC;