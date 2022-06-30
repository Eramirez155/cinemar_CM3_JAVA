use cinemark2;

  INSERT INTO Tipo_Pelicula
VALUES
('1', 'Castellano', '2D', '0'), --Spiderman 
('2', 'Castellano','3D', '0'), --Lightyear
('3', 'Ingles', '2D', '1'),  -- El telefono negro (Terror) 
('4', 'Castellano', '3D', '0'),  --Thor amor y trueno
('5', 'Castellano', '3D', '0'),  -- Minios nace un villano
('6', 'Ingles', '2D', '1');    --Dog un salvaje viaje (Drama)


INSERT INTO Clasificacion
VALUES
('1','ATP','Apta para todo publico'),
('2','ATP','Apta para todo publico'),
('3','+16','Para mayores de 16'),
('4','+13','Para mayores de 13'),
('5','ATP','Apta para todo publico'),
('6','+13','Para mayores de 13');


INSERT INTO Pelicula
VALUES
('1', 'Spiderman','Tras descubrirse la identidad secreta de Peter Parker como Spider-Man, la vida del joven se vuelve una locura', 'Aventura','2h 28m','Tom Holland, Tobey Maguire, Andrew Garfield','Jon Watts', id_Tipo_Pelicula, id_clasificacion),
('2', 'Lightyear', 'Buzz Lightyear se embarca en una aventura intergaláctica con un grupo de reclutas ambiciosos y su compañero robot.', 'Accion','1h 45m','Reparto: Chris Evans, Keke Palmer, Efren Ramirez', 'Angus MacLane',id_Tipo_Pelicula,id_clasificacion),
('3', 'El telefono negro', 'Un homicida sádico y enmascarado mantiene a Finney, un niño de 13 años, secuestrado en un sótano incomunicado', 'Terror', '1h 42m','Mason Thames,Finney Shaw, Madeleine McGraw','Scott Derrickson', id_Tipo_Pelicula, id_clasificacion),
('4', 'Secuela de "Thor: Ragnarok" en la que el Dios del Trueno contará con Lady Thor como acompañante', 'Ciencia ficción', '2hs','Chris Hemsworth, Christian Bale, Natalie Portman', id_Tipo_Pelicula, id_clasificacion),
('5', 'En los años 70, Gru crece siendo un gran admirador de "Los salvajes seis", un supergrupo de villanos.', 'Animación', '1h 30m','Steve Carell, Jean-Claude Van Damme, Taraji P. Henson','Kyle Balda', id_Tipo_Pelicula, id_clasificacion),
('6', 'Dog un salvaje viaje', 'Un miembro del Ejército, junto a una perra llamada Lulu, recorre la costa del Pacífico para llegar al funeral de un soldado.', 'Drama', '1h 41m','Channing Tatum, Jane Adams, Qorianka Kilcher','Reid Carolin', id_Tipo_Pelicula, id_clasificacion)
;


INSERT INTO Sala
VALUES
('1', '1', '2D', '300'),
('2', '2', '3D', '400'),
('3', '3', '2D', '200'),
('4', '4', '3D', '400'),
('5', '5', '3D', '300'),
('6', '6', '2D', '200'),
; 

INSERT INTO descuento --Suponemos un precio de $700 para 2D y $1000 para 3D
VALUES    --Tabla pensando en 3D
('1', 'Lunes', '20.0','800'),
('2', 'Martes','15.0','850'),
('1', 'Miercoles', '20.0','800'),
('2', 'Jueves','15.0','850'),
('1', 'Viernes', '10.0','900'),
('2', 'Sabado','10.0','900'),
('1', 'Domingo', '10.0','900'),
;

INSERT INTO Butaca 
VALUES 
('1', '1', '12','0','1'),
('2', '1', '5','1','1')
;'2')
;

INSERT INTO TarjetaCredito
VALUES
('1', '1526152615264859', '50000', '2000', 'Santand
('3', '9865457898865', '4D', '50')
;INSERT INTO Usuario 
VALUES
('1', '1', '12','0','1'),
('2', '1', '5','1','1')
ALUES
,',,'