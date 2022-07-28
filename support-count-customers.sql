SELECT employees.FirstName || ' ' || upper(employees.LastName) AS FullName, count(SupportRepId) AS NumberOfCustomers FROM employees
INNER JOIN customers c on employees.EmployeeId = c.SupportRepId
WHERE Title='Sales Support Agent' group by FullName order by NumberOfCustomers ASC
