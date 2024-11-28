CREATE DATABASE IF NOT EXISTS aeropuerto CHARSET=utf8mb4;
USE aeropuerto;

--Bien
CREATE TABLE Tipo(
    id_Tipo INT PRIMARY KEY,
    modelo VARCHAR(20),
    capacidad INT,
    peso INT
)ENGINE=InnoDB;

--Bien
CREATE TABLE Hangar(
    id_Hangar INT PRIMARY KEY,
    cod_Hangar INT,
    capacidad INT
)ENGINE=InnoDB;

--Bien
CREATE TABLE Avion(
    id_Avion INT PRIMARY KEY,
    n_registro INT,
    id_Tipo VARCHAR(20) NOT NULL,
    fecha_registro DATE NOT NULL,
    antiguedad INT,
    matricula CHAR(5),
    id_hangar INT ,
    FOREIGN KEY(id_Tipo) REFERENCES Tipo(modelo)
        ON DELETE RESTRICT
        ON UPDATE CASCADE,
    FOREIGN KEY(id_Hangar) REFERENCES Hangar(cod_hangar)
        ON DELETE SET NULL
        ON UPDATE CASCADE
)ENGINE=InnoDB;

--Bien
CREATE TABLE Propietario(
    id_Propietario INT PRIMARY KEY,
    nss INT,
    nombre VARCHAR(30) NOT NULL,
    telf VARCHAR(30) NOT NULL,
    direccion VARCHAR(50) NOT NULL
)ENGINE=InnoDB;

--Bien
CREATE TABLE Piloto(
    id_Piloto INT PRIMARY KEY,
    n_lic int,
    nss VARCHAR(50),
    nombre VARCHAR(50),
    direccion VARCHAR(50)
)ENGINE=InnoDB;
--Bien
CREATE TABLE Mecanico(
    id_Mecanico INT PRIMARY KEY,
    nss INT,
    direccion VARCHAR(50),
    salario INT,
    turno VARCHAR(50)
)ENGINE=InnoDB;

CREATE TABLE Hablitado (
    id_Hablitado INT PRIMARY KEY,
    id_Mecanico INT ,
    id_modelo INT),
    FOREIGN KEY(id_Mecanico) REFERENCES Mecanico(id_Mecanico)
        ON DELETE CASCADE
        ON UPDATE CASCADE,
    FOREIGN KEY(id_modelo) REFERENCES Tipo(id_Tipo)
        ON DELETE CASCADE
        ON UPDATE CASCADE
)ENGINE=InnoDB;

CREATE TABLE Mantiene(
    id_Mantiene INT PRIMARY KEY,
    cod_trabajo INT,
    fecha DATE NOT NULL,
    n_horas INT,
    id_Mecanico INT ,
    id_Avion INT ,
    FOREIGN KEY(id_Mecanico) REFERENCES Mecanico(id_Mecanico)
        ON DELETE SET DEFAULT
        ON UPDATE CASCADE,
    FOREIGN KEY(id_Avion) REFERENCES Avion(id_Avion)
        ON DELETE SET CASCADE
        ON UPDATE CASCADE
)ENGINE=InnoDB;

CREATE TABLE Compra(
    id_Compra INT PRIMARY KEY,
    fecha DATE NOT NULL,
    id_Avion INT ,
    id_Propietario INT ,
    FOREIGN KEY(id_Avion) REFERENCES Avion(id_Avion)
        ON DELETE SET CASCADE
        ON UPDATE CASCADE,
    FOREIGN KEY(id_Propietario) REFERENCES Propietario(id_Propietario)
        ON DELETE SET DEFAULT
        ON UPDATE CASCADE
)ENGINE=InnoDB;

CREATE TABLE Capacitado(
    id_Capacitado INT PRIMARY KEY,
    id_modelo INT,
    id_Piloto INT,
    FOREIGN KEY(id_modelo) REFERENCES Tipo(id_Tipo)
        ON DELETE RESTRICT
        ON UPDATE CASCADE,
    FOREIGN KEY(id_Piloto) REFERENCES Piloto(id_Piloto)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
)ENGINE=InnoDB;