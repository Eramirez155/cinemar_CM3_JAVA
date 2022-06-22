DROP DATABASE IF EXISTS Cinemark;
CREATE DATABASE Cinemark CHARACTER SET utf8mb4;
USE Cinemark;

CREATE TABLE sesion(
id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
id_pelicula VARCHAR (20),
fecha DATE,
horario VARCHAR (10)
); 




CREATE TABLE pelicula(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
titulo_Pelicula VARCHAR(15),
sinopsis VARCHAR(100),
genero VARCHAR(10),
duracion VARCHAR(10),
actores VARCHAR (100),
director VARCHAR (15),
id_tipo_pelicula INT NOT NULL,
id_clasificacion INT NOT NULL,
FOREIGN KEY pelicula (id_tipo_pelicula) REFERENCES tipo_pelicula (id),
FOREIGN KEY pelcula (id_clasificacion) REFERENCES clasificacion(id)
);




CREATE TABLE tipo_pelicula(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
idioma VARCHAR(15),
formato VARCHAR(3)
);


CREATE TABLE clasificacion(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
descripcion VARCHAR (6)
);


CREATE TABLE pago(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
email VARCHAR(20) NOT NULL,
nombreDelTitular VARCHAR(20) NOT NULL,
dniDelTitular VARCHAR(8) NOT NULL,
numeroDeTarjeta INT(16) UNSIGNED NOT NULL,
codigoDeSeguridad INT (3) UNSIGNED NOT NULL,
fechaDeVencimiento DATE NOT NULL,
aceptarTerminos BOOLEAN NOT NULL
);


CREATE TABLE butaca(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
fila VARCHAR (1) NOT NULL,
numero INT (2) NOT NULL,
disponibilidad BOOLEAN,
id_pago INT NOT NULL,
FOREIGN KEY butaca (id_pago) REFERENCES pago (id)
);



ALTER TABLE butaca ADD id_sala INT NOT NULL,
ADD FOREIGN KEY  (id_sala) REFERENCES sala (id);

CREATE TABLE sala(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
numero INT (1) NOT NULL,
capacidad INT (3) NOT NULL
);



CREATE TABLE reserva(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
cantidadDeEntradas INT NOT NULL,
id_sala INT NOT NULL,
id_descuentos INT NOT NULL,
FOREIGN KEY  (id_sala) REFERENCES sala (id),
FOREIGN KEY reserva (id_descuentos) REFERENCES descuentos (id)
);



CREATE TABLE descuentos(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
dias VARCHAR (7) NOT NULL,
membresia BOOLEAN NOT NULL,
porcentaje FLOAT
);

CREATE TABLE comprobnte(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
fecha TIME,


)










