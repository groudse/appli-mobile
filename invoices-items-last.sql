SELECT Name FROM tracks JOIN invoice_items ii on tracks.TrackId = ii.TrackId
WHERE ii.InvoiceId = (SELECT InvoiceId from invoices WHERE InvoiceDate =
(SELECT MAX (InvoiceDate) FROM invoices) )
