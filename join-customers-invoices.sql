SELECT FirstName,LastName,Company,Total AS InvoiceTotalPrice FROM customers INNER JOIN invoices on customers.CustomerId = invoices.CustomerId
WHERE Company IS NOT NULL ;