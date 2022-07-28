SELECT FirstName,LastName, strftime('%Y',HireDate)-strftime('%Y',BirthDate) AS ApproximateAge
FROM employees order by ApproximateAge ASC