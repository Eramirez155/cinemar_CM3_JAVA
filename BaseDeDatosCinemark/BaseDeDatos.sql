DROP DATABASE IF EXISTS Cinemark;
CREATE DATABASE Cinemark CHARACTER SET utf8mb4;
USE Cinemark;

CREATE TABLE departamento ( id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, nombre VARCHAR(50) NOT NULL );
