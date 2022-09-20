select  v.EmployeeId, (v.FirstName|| " " || v.LastName) as EmployeeName,
CASE
    WHEN v.ReportsTo is not null then (x.FirstName|| " " || x.LastName)
    WHEN v.ReportsTo is null then null
end as ReportsTo
from employees v
left join employees x on v.ReportsTo = x.EmployeeId



