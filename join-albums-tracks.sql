SELECT Title as AlbumName, Name AS TrackName,Milliseconds FROM
            albums INNER JOIN tracks on albums.AlbumId = tracks.AlbumId
                                            ORDER BY  Milliseconds ASC LIMIT 50;