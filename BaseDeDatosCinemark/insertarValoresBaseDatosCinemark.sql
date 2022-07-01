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
('1', '1', '2D', '150'),
('2', '2', '3D', '250'),
('3', '3', '2D', '50'),
('4', '4', '3D', '250'),
('5', '5', '3D', '150'),
('6', '6', '2D', '50'),
; 

INSERT INTO descuento --Suponemos un precio de $700 para 2D y $1000 para 3D
VALUES    --Tabla pensando en 3D
('1', 'Lunes', '20.0','800'),
('2', 'Martes','15.0','850'),
('3', 'Miercoles', '20.0','800'),
('4', 'Jueves','15.0','850'),
('5', 'Viernes', '10.0','900'),
('6', 'Sabado','10.0','900'),
('7', 'Domingo', '10.0','900'),
;

INSERT INTO Butaca 
VALUES 
('1', '6', '6','1',id_sala),
('2', '4','9','1',id_sala),
('3', '8', '15','1',id_sala),
('4', '1','18','1',id_sala),
('5', '5', '9','1',id_sala),
('6', '6','12','1',id_sala),
('7', '3', '5','0',id_sala),
('8', '2', '13','0',id_sala),
('9', '7','10','1',id_sala),
('10', '9', '5','0',id_sala),
;

INSERT INTO TarjetaCredito
VALUES
('1', '1526152615264859', '50000', '2000', 'Santander')
('2', '1526152615264859', '25000', '1500', 'Visa')
('3', '1526152615264859', '80000', '4000', 'MasterCard')
('4', '1526152615264859', '100000', '6000', 'Cabal')
('5', '1526152615264859', '10000', '1000', 'Naranja')
('6', '1526152615264859', '9000', '900', 'SuCredito')
;

INSERT INTO Usuario 
VALUES
('1', 'Mario', 'Ponce','0','mario5@gmail.com','98, 4,17, 15, 30, 30','41327605'), --Revisar si asi se escriben las fechas
('2', 'Leandro', 'Alani','1','Alani23@yahoo.com.ar','72, 9,23, 18, 59, 40','20910483'),
('3', 'Matias', 'Martines','0','Mat88@gmail.com','83, 12,9, 1, 1, 30','33266388'),
('4', 'Valeria', 'Espindola','0','ValEspindola@gmail.com','75, 1,22, 22, 45, 50','27701408'),
('5', 'Viviana', 'Ramires','0','Vivi9@yahoo.com.ar','96, 7,18, 20, 30, 50','40202346'),
('6', 'Tamara', 'Delgado','1','TamaraDel@gmail.com','85, 10,27, 0, 15, 00','35796500'),
;
--Revisar que hacer con las FOREIGN KEYS
INSERT INTO CrearCuenta 
VALUES
('1', 'Mario', 'Ponce','0','41327605','98, 4,17, 15, 30, 30','Cuervo88','gon480','gon480','mario5@gmail.com','masculino','Hoyts Salta',id_usuario),
('2', 'Leandro', 'Alani','1','20910483','72, 9,23, 18, 59, 40','German','qwerty','qwerty','Alani23@yahoo.com.ar','masculino','Cinemark Salta',id_usuario),
('3', 'Matias', 'Martines','0','33266388','83, 12,9, 1, 1, 30','IceWelder','123456','123456','Mat88@gmail.com','otro','Hoyts Salta',id_usuario),
('4', 'Valeria', 'Espindola','0','27701408','75, 1,22, 22, 45, 50','Valeria303','abc123','abc123','ValEspindola@gmail.com','prefiero no indicar','Hoyts Salta',id_usuario),
('5', 'Viviana', 'Ramires','0','40202346','96, 7,18, 20, 30, 50','Vivian','password','password','Vivi9@yahoo.com.ar','femenino','Cinemark Salta',id_usuario),
('6', 'Tamara', 'Delgado','1','35796500','85, 10,27, 0, 15, 00','Palmerita25','Tamara190','Tamara190','TamaraDel@gmail.com','femenino','Cinemark Salta',id_usuario),
;

INSERT INTO InicioSesion 
VALUES
('1','Cuervo88','gon480','gon480','mario5@gmail.com',id_crearCuenta,id_usuario,id_tarjetaCredito),
('2','German','qwerty','qwerty','Alani23@yahoo.com.ar',id_crearCuenta,id_usuario,id_tarjetaCredito),
('3','IceWelder','123456','123456','Mat88@gmail.com',id_crearCuenta,id_usuario,id_tarjetaCredito),
('4','Valeria303','abc123','abc123','ValEspindola@gmail.com',id_crearCuenta,id_usuario,id_tarjetaCredito),
('5','Vivian','password','password','Vivi9@yahoo.com.ar',id_crearCuenta,id_usuario,id_tarjetaCredito),
('6','Palmerita25','Tamara190','Tamara190','TamaraDel@gmail.com',id_crearCuenta,id_usuario,id_tarjetaCredito),
;

INSERT INTO Sesion
VALUES
('1', '122, 6,25, 12, 30, 00', id_pelicula,id_sala),
('2', '122, 6,30, 14, 00, 00', id_pelicula,id_sala)
('3', '122, 6,20, 22, 30, 00', id_pelicula, id_sala)
('4', '122, 7,1, 10, 00, 00', id_pelicula, id_sala)
('5', '122, 7,2, 17, 30, 00', id_pelicula, id_sala)
('6', '122, 7,3, 8, 00, 00', id_pelicula, id_sala)
;

INSERT INTO Reserva 
VALUES
('1', '6', id_sesion,id_butaca,id_descuento,id_tarjetaCredito,id_inicioSesion),
('2', '5', id_sesion,id_butaca,id_descuento,id_tarjetaCredito,id_inicioSesion)
('3', '3', id_sesion, id_butaca, id_descuento,id_tarjetaCredito,id_inicioSesion)
('4', '1', id_sesion, id_butaca, id_descuento,id_tarjetaCredito,id_inicioSesion)
('5', '4', id_sesion, id_butaca, id_descuento,id_tarjetaCredito,id_inicioSesion)
('6', '2', id_sesion, id_butaca, id_descuento,id_tarjetaCredito,id_inicioSesion)
;

INSERT INTO Comprobante
VALUES
('1', '122, 6,23, 2, 30, 30', id_reserva,id_sesion),
('2', '122, 6,23, 2, 30, 30', id_reserva,id_sesion)
('3', '122, 6,23, 2, 30, 30', id_reserva, id_sesion)
('4', '122, 6,23, 2, 30, 30', id_reserva, id_sesion)
('5', '122, 6,23, 2, 30, 30', id_reserva, id_sesion)
('6', '122, 6,23, 2, 30, 30', id_reserva, id_sesion)
;
