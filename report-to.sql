select  y.EmployeeId, (y.FirstName|| " " || y.LastName) as EmployeeName,
(x.FirstName|| " " || x.LastName) as ReportsTo
from employees y, employees x
where y.ReportsTo = x.EmployeeId

