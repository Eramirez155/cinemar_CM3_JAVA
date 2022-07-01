INSERT INTO Tipo_Pelicula
VALUES
('1', 'Castellano', '2D', '0'), 
('2', 'Castellano','3D', '0'), 
('3', 'Ingles', '2D', '1'),  
('4', 'Ingles', '3D', '1'),  
('5', 'Portuges', '3D', '1'),  
('6', 'Portugues', '2D', '1') 
;    

INSERT INTO Clasificacion
VALUES
('1','ATP','Apta para todo publico'),
('2','+16','Para mayores de 16'),
('3','+13','Para mayores de 13'),
('4','+18','Para mayores de 18')
;


INSERT INTO Pelicula
VALUES
('1', 'Spiderman','Tras descubrirse la identidad secreta de Peter Parker como Spider-Man, la vida del joven se vuelve una locura', 'Aventura','2h 28m','Tom Holland, Tobey Maguire, Andrew Garfield','Jon Watts', '1', '1'),
('2', 'Lightyear', 'Buzz Lightyear se embarca en una aventura intergaláctica con un grupo de reclutas ambiciosos y su compañero robot.', 'Accion','1h 45m','Reparto: Chris Evans, Keke Palmer, Efren Ramirez', 'Angus MacLane','2','1'),
('3', 'El telefono negro', 'Un homicida sádico y enmascarado mantiene a Finney, un niño de 13 años, secuestrado en un sótano incomunicado', 'Terror', '1h 42m','Mason Thames,Finney Shaw, Madeleine McGraw','Scott Derrickson', '3', '2'),
('4', 'Thor Amor y duelo', 'Secuela de Thor: Ragnarok en la que el Dios del Trueno contará con Lady Thor como acompañante', 'Ciencia ficción', '2hs','Chris Hemsworth, Christian Bale, Natalie Portman','Taika Kaw', '4', '3'),
('5', 'minions' ,'En los años 70, Gru crece siendo un gran admirador de "Los salvajes seis", un supergrupo de villanos.', 'Animación', '1h 30m','Steve Carell, Jean-Claude Van Damme, Taraji P. Henson','Kyle Balda', '5', '1'),
('6', 'Dog un salvaje viaje', 'Un miembro del Ejército, junto a una perra llamada Lulu, recorre la costa del Pacífico para llegar al funeral de un soldado.', 'Drama', '1h 41m','Channing Tatum, Jane Adams, Qorianka Kilcher','Reid Carolin', '6', '4')
;

INSERT INTO Sala
VALUES
('1', '1', '2D', '150'),
('2', '2', '3D', '400'),
('3', '3', '2D', '200'),
('4', '4', '3D', '250'),
('5', '5', '3D', '150'),
('6', '6', '2D', '50')
; 

INSERT INTO descuento -- Suponemos un precio de $700 para 2D y $1000 para 3D
VALUES    -- Tabla pensando en 3D
('1', 'Lunes', '20.0','800'),
('2', 'Martes','15.0','850'),
('3', 'Miercoles', '20.0','800'),
('4', 'Jueves','15.0','850'),
('5', 'Viernes', '10.0','900'),
('6', 'Sabado','10.0','900'),
('7', 'Domingo', '10.0','900')
;

INSERT INTO Butaca 
VALUES 
('1', '6', '6','1','1'),
('2', '4','9','1','2'),
('3', '8', '15','1','3'),
('4', '1','18','1','4'),
('5', '5', '9','1','5'),
('6', '6','12','1','6'),
('7', '3', '5','0','1'),
('8', '2', '13','0','2'),
('9', '7','10','1','3'),
('10', '9', '5','0','4')
;

INSERT INTO TarjetaCredito
VALUES
('1', '1526152615264859', '50000', '2000', 'Santander'),
('2', '1526152615264859', '25000', '1500', 'Visa'),
('3', '1526152615264859', '80000', '4000', 'MasterCard'),
('4', '1526152615264859', '100000', '6000', 'Cabal'),
('5', '1526152615264859', '10000', '1000', 'Naranja'),
('6', '1526152615264859', '9000', '900', 'SuCredito')
;

INSERT INTO Usuario 
VALUES
('1', 'Mario', 'Ponce','0','mario5@gmail.com','2001-03-18','41327605'), -- Revisar si asi se escriben las fechas
('2', 'Leandro', 'Alani','1','Alani23@yahoo.com.ar','1975-04-03','20910483'),
('3', 'Matias', 'Martines','0','Mat88@gmail.com','1980-02-25','33266388'),
('4', 'Valeria', 'Espindola','0','ValEspindola@gmail.com','1975-05-10','27701408'),
('5', 'Viviana', 'Ramires','0','Vivi9@yahoo.com.ar','1997-09-30','40202346'),
('6', 'Tamara', 'Delgado','1','TamaraDel@gmail.com','1991-11-19','35796500')
;

INSERT INTO CrearCuenta 
VALUES
('1', 'Mario', 'Ponce','41327605','2001-03-18','Cuervo88','gon480','gon480','mario5@gmail.com','masculino','Hoyts Salta','1'),
('2', 'Leandro', 'Alani','20910483','1975-04-03','German','qwerty','qwerty','Alani23@yahoo.com.ar','masculino','Cinemark Salta','2'),
('3', 'Matias', 'Martines','33266388','1980-02-25','IceWelder','123456','123456','Mat88@gmail.com','otro','Hoyts Salta','3'),
('4', 'Valeria', 'Espindola','27701408','1975-05-10','Valeria303','abc123','abc123','ValEspindola@gmail.com','prefiero no indicar','Hoyts Salta','4'),
('5', 'Viviana', 'Ramires','40202346','1997-09-30','Vivian','password','password','Vivi9@yahoo.com.ar','femenino','Cinemark Salta','5'),
('6', 'Tamara', 'Delgado','35796500','1991-11-19','Palmerita25','Tamara190','Tamara190','TamaraDel@gmail.com','femenino','Cinemark Salta','6')
;

INSERT INTO InicioSesion 
VALUES
('1','Cuervo88','gon480','gon480','mario5@gmail.com','1','1','1'),
('2','German','qwerty','qwerty','Alani23@yahoo.com.ar','2','2','2'),
('3','IceWelder','123456','123456','Mat88@gmail.com','3','3','3'),
('4','Valeria303','abc123','abc123','ValEspindola@gmail.com','4','4','4'),
('5','Vivian','password','password','Vivi9@yahoo.com.ar','5','5','5'),
('6','Palmerita25','Tamara190','Tamara190','TamaraDel@gmail.com','6','6','6')
;

INSERT INTO Sesion
VALUES -- Agregar horario de la sesion
('1', '2022-07-20', '1','1'),
('2', '2022-07-21', '2','2'),
('3', '2022-07-20', '3', '3'),
('4', '2022-08-03', '4', '4'),
('5', '2022-07-28', '5', '5'),
('6', '2022-07-28', '6', '6')
;


INSERT INTO Reserva 
VALUES
('1', '6', '1','1','3','1','1'),
('2', '5', '2','2','4','2','2'),
('3', '3', '3','3','3','3','3'),
('4', '1', '4', '4','3','4','4'),
('5', '4', '5', '5','4','5','5'),
('6', '2', '6', '6','4','6','6')
;


INSERT INTO Comprobante
VALUES
('1', '2022-07-15', '1','1'),
('2', '2022-07-16', '2','2'),
('3', '2022-07-15', '3', '3'),
('4', '2022-07-29', '4', '4'),
('5', '2022-07-23', '5', '5'),
('6', '2022-07-23', '6', '6')
;














