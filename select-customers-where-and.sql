SELECT FirstName,LastName FROM customers WHERE Country='USA' AND
                                               SupportRepId=(SELECT EmployeeId FROM employees WHERE
                                            FirstName='Jane' AND LastName='Peacock');
