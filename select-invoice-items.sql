SELECT InvoiceId, Name AS InvoiceItem, t.UnitPrice FROM invoice_items INNER JOIN tracks t on t.TrackId = invoice_items.TrackId
 WHERE InvoiceId='10' ORDER BY Name asc;