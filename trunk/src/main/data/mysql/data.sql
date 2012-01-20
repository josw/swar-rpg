


location Point not null,
type varchar(10),
amount integer,
owner	integer,



insert into map values 
(GeomFromText( ' POINT(4 4) ' ), 'GOLD', 100, null), 
(GeomFromText( ' POINT(5 4) ' ), 'GOLD', 100, null)