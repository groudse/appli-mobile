SELECT FirstName,LastName, round((julianday(HireDate)-julianday(BirthDate))/360) AS ApproximateAge FROM employees
order by ApproximateAge ASC