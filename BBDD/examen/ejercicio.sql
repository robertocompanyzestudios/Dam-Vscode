CREATE DATABASE IF NOT EXISTS veterinario CHARSET=utf8mb4;
USE veterinario;

CREATE TABLE cliente (
    nif INT NOT NULL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido1 VARCHAR(50) NOT NULL,
    apellido2 VARCHAR(50) NOT NULL,
    telefono VARCHAR(15) NOT NULL,
    email VARCHAR(50),
    num_calle INT NOT NULL,
    cod_postal VARCHAR(10) NOT NULL,
    ciudad VARCHAR(50) NOT NULL,
    descuento INT NOT NULL,
    explotacion_ganadera BOOLEAN NOT NULL,
    comunicaciones_comerciales BOOLEAN NOT NULL
) ENGINE=InnoDB;

CREATE TABLE especies (
    id_especies INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    reduccion INT NOT NULL
) ENGINE=InnoDB;

CREATE TABLE animales (
    id_animales INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    color VARCHAR(50) NOT NULL,
    peso FLOAT,
    id_especies INT NOT NULL,
    nif INT,
    FOREIGN KEY(id_especies) REFERENCES especies(id_especies) ON DELETE RESTRICT,
    FOREIGN KEY(nif) REFERENCES cliente(nif) ON DELETE CASCADE
) ENGINE=InnoDB;

CREATE TABLE facturas (
    numero_factura INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    total_iva FLOAT NOT NULL,
    total_base FLOAT NOT NULL,
    fecha DATE NOT NULL,
    nif INT NOT NULL,
    FOREIGN KEY(nif) REFERENCES cliente(nif) ON DELETE CASCADE
) ENGINE=InnoDB;

CREATE TABLE servicios_ofertados (
    id_servicios_ofertados INT UNSIGNED AUTO_INCREMENT NOT NULL PRIMARY KEY,
    precio INT NOT NULL,
    concepto VARCHAR(255) NOT NULL,
    id_especies INT NOT NULL,
    FOREIGN KEY(id_especies) REFERENCES especies(id_especies) ON DELETE CASCADE
) ENGINE=InnoDB;

CREATE TABLE servicios_prestados (
    id_servicios_prestados INT UNSIGNED AUTO_INCREMENT NOT NULL PRIMARY KEY,
    fecha TIMESTAMP NOT NULL,
    cantidad INT NOT NULL,
    id_animales INT NOT NULL,
    id_servicios_ofertados INT NOT NULL,
    impuesto INT,
    precio_unitario FLOAT,
    porcentaje_iva INT,
    FOREIGN KEY(id_animales) REFERENCES animales(id_animales) ON DELETE CASCADE,
    FOREIGN KEY(id_servicios_ofertados) REFERENCES servicios_ofertados(id_servicios_ofertados) ON DELETE CASCADE
) ENGINE=InnoDB;

