select  v.EmployeeId, (v.FirstName|| " " || v.LastName) as EmployeeName,(x.FirstName|| " " || x.LastName) as ReportsTo

from employees v, employees x
where v.ReportsTo = x.EmployeeId

