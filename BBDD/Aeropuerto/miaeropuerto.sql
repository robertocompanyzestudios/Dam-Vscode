dROP DATABASE IF EXISTS aeropuerto;
CREATE DATABASE IF NOT EXISTS aeropuerto CHARSET=utf8mb4;
USE aeropuerto;

--Bien
CREATE TABLE tipo(
    id_tipo INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    modelo VARCHAR(20),
    capacidad INT,
    peso INT
)ENGINE=InnoDB;

--Bien
CREATE TABLE hangar(
    id_hangar INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    cod_hangar INT,
    capacidad INT
)ENGINE=InnoDB;

--Bien
CREATE TABLE avion(
    id_avion INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    n_registro INT,
    id_tipo VARCHAR(20) NOT NULL,
    fecha_registro DATE NOT NULL,
    antiguedad INT,
    matricula CHAR(5),
    id_hangar INT ,
    FOREIGN KEY(id_tipo) REFERENCES tipo(modelo),
    FOREIGN KEY(id_hangar) REFERENCES hangar(cod_hangar)
)ENGINE=InnoDB;

--Bien
CREATE TABLE propietario(
    id_propietario INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nss INT,
    nombre VARCHAR(30) NOT NULL,
    telf VARCHAR(30) NOT NULL,
    direccion VARCHAR(50) NOT NULL
)ENGINE=InnoDB;

--Bien
CREATE TABLE piloto(
    id_piloto INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    n_lic int,
    nss VARCHAR(50),
    nombre VARCHAR(50),
    direccion VARCHAR(50)
)ENGINE=InnoDB;
--Bien
CREATE TABLE mecanico(
    id_mecanico INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nss INT,
    direccion VARCHAR(50),
    salario INT,
    turno VARCHAR(50)
)ENGINE=InnoDB;

CREATE TABLE habilitado (
    id_habilitado INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_mecanico INT ,
    id_modelo INT,
    FOREIGN KEY(id_mecanico) REFERENCES mecanico(id_mecanico)
        ON DELETE CASCADE
        ON UPDATE CASCADE,
    FOREIGN KEY(id_modelo) REFERENCES tipo(id_tipo)
        ON DELETE CASCADE
        ON UPDATE CASCADE
)ENGINE=InnoDB;

CREATE TABLE mantiene(
    id_mantiene INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    cod_trabajo INT,
    fecha DATE NOT NULL,
    n_horas INT,
    id_mecanico INT ,
    id_avion INT ,
    FOREIGN KEY(id_mecanico) REFERENCES mecanico(id_mecanico)
        ON DELETE SET DEFAULT
        ON UPDATE CASCADE,
    FOREIGN KEY(id_avion) REFERENCES avion(id_avion)
        ON DELETE SET CASCADE
        ON UPDATE CASCADE
)ENGINE=InnoDB;

CREATE TABLE compra(
    id_compra INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    fecha DATE NOT NULL,
    id_avion INT ,
    id_propietario INT ,
    FOREIGN KEY(id_avion) REFERENCES avion(id_avion)
        ON DELETE SET CASCADE
        ON UPDATE CASCADE,
    FOREIGN KEY(id_propietario) REFERENCES propietario(id_propietario)
        ON DELETE SET DEFAULT
        ON UPDATE CASCADE
)ENGINE=InnoDB;

CREATE TABLE capacitado(
    id_capacitado INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_modelo INT,
    id_piloto INT,
    FOREIGN KEY(id_modelo) REFERENCES tipo(id_tipo)
        ON DELETE RESTRICT
        ON UPDATE CASCADE,
    FOREIGN KEY(id_piloto) REFERENCES piloto(id_piloto)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
)ENGINE=InnoDB;