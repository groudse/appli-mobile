SELECT  Name, count(a.Title) AS NbAlbums,
case
when count(a.Title)  = 1 THEN 'Unproductive'
when count(a.Title)  > 1  and count(a.Title)  < 10 THEN 'Productive'
when count(a.Title)  >= 10 THEN 'Very Productive'

end as IsProductive
from artists
INNER JOIN albums a on artists.ArtistId = a.ArtistId

group by artists.ArtistId limit 100

