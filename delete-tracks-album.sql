delete from tracks where AlbumId = (select AlbumId from albums where Title='Facelift')