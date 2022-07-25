SELECT Name, a.ArtistId FROM artists INNER JOIN albums a on artists.ArtistId = a.ArtistId
     GROUP BY NAME HAVING count(a.title) >= 4 ORDER BY NAME DESC ;
