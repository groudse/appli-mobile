SELECT FirstName,LastName,Country,
    CASE
        WHEN Country IN ('Chile','Argentina','USA','Canada','Brazil') THEN 'America'
        WHEN Country IN ('United Kingdom','Sweden','Spain','Poland','Netherlands','Italy','Ireland','Hungary','Finland','Portugal','Denmark','Belgium','Austria' ,'Norway','France','Germany','Norway','Czech Republic')  THEN  'Europe'
        WHEN Country IN ('India') THEN 'Asia'
        WHEN Country IN ('Australia') THEN 'Oceania'
    END as Continent
FROM customers;