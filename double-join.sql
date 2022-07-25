SELECT distinct tracks.Name AS TrackName,pt.Name AS PlaylistName FROM tracks
    INNER JOIN playlist_track p on tracks.TrackId = p.TrackId
    INNER JOIN playlists pt on p.PlaylistId = pt.PlaylistId
    WHERE pt.Name='TV Shows' LIMIT 100;