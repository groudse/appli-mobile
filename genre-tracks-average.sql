SELECT genres.NAME, avg(Milliseconds) AS AverageDuration FROM genres INNER JOIN tracks t on genres.GenreId = t.GenreId
GROUP BY genres.NAME ORDER BY AverageDuration DESC;