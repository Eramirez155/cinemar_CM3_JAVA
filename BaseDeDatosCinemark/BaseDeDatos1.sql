DROP DATABASE IF EXISTS Cinemark;
CREATE DATABASE Cinemark CHARACTER SET utf8mb4;
USE Cinemark;


CREATE TABLE tipo_pelicula(
id_tipo_pelicula INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
idioma VARCHAR(15),
formato VARCHAR(3),
subtitulada BOOLEAN
);

CREATE TABLE Clasificacion(
id_clasificacion INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
identificador INTEGER,
descripcion VARCHAR (6)
);

CREATE TABLE Pelicula(
id_pelicula INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
titulo_Pelicula VARCHAR(15),
sinopsis VARCHAR(100),
genero VARCHAR(10),
duracion VARCHAR(10),
actores VARCHAR (100),
director VARCHAR (15),
id_tipo_pelicula INT NOT NULL,
id_clasificacion INT NOT NULL,
FOREIGN KEY (id_tipo_pelicula) REFERENCES tipo_pelicula (id_tipo_pelicula),
FOREIGN KEY (id_clasificacion) REFERENCES clasificacion(id_clasificacion)
);


CREATE TABLE Descuento(
id_descuento INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
dia VARCHAR (7) NOT NULL,
porcentaje FLOAT
);


CREATE TABLE Reserva(
id_reserva INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
cantidadDeEntradas INT NOT NULL,
id_sesion INT NOT NULL,
id_butaca INT NOT NULL,
id_descuento INT NOT NULL,
id_tarjetaCredito INT NOT NULL,
id_usuario INT NOT NULL,
FOREIGN KEY  (id_descuento) REFERENCES  Descuento (id_descuento)
-- FOREIGN KEY  (id_butaca) REFERENCES Butaca (id_butacas)
-- FOREIGN KEY (id_) REFERENCES descuentos (id)
);

CREATE TABLE Butaca(
id_butacas INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
fila VARCHAR (1) NOT NULL,
numero INT (2) NOT NULL,
reservada BOOLEAN,
id_sala INT NOT NULL
-- FOREIGN KEY (id_sala) REFERENCES Sala (id_sala)
);

CREATE TABLE Sala(
id_sala INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
numero INT (1) NOT NULL,
formato VARCHAR (2),
capacidad INT (3) NOT NULL,
id_butacas INT NOT NULL,
FOREIGN KEY (id_butacas) REFERENCES Butaca (id_butacas)
);

CREATE TABLE Sesion(
id_sesion INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
fecha DATE,
id_pelicula INT NOT NULL,
id_sala INT NOT NULL,
FOREIGN KEY (id_pelicula) REFERENCES Pelicula (id_pelicula),
FOREIGN KEY (id_sala) REFERENCES Sala (id_sala)
); 



CREATE TABLE Usuario(
id_usuario INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(50) NOT NULL,
apellido VARCHAR(50) NOT NULL,
email VARCHAR(50) NOT NULL,
fecha_nacimiento DATE NOT NULL,
dni INT
); 


CREATE TABLE TarjetaCredito(
id_tarjetaCredito INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
numero INT NOT NULL,
balance DOUBLE NOT NULL,
limite DOUBLE NOT NULL,
id_usuario INT NOT NULL,
banco VARCHAR (50) NOT NULL,
FOREIGN KEY (id_usuario) REFERENCES Usuario (id_usuario)
);

-- ALTER Reserva ADD FOREIGN KEY (id_butaca) REFERENCES Butaca (id_butacas)











-- ALTER TABLE butaca ADD id_sala INT NOT NULL,
-- ADD FOREIGN KEY  (id_sala) REFERENCES sala (id);









-- CREATE TABLE comprobnte(
-- id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
-- fecha TIME,


-- )










