select a.name as ArtistName, b.title as AlbumName,  tracks.name as TrackName, round(Bytes/1000000.0,2) || ' MB' as MegaBytes from tracks
INNER JOIN albums b on tracks.AlbumId = b.AlbumId
inner join artists a on a.ArtistId = b.ArtistId
where tracks.AlbumId=89