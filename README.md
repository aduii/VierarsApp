# ViersApp

App para el reciclaje

![](https://imgur.com/F5sZjO9.png)

### Lo necesario

````sql
CREATE DATABASE Vierars_db;

USE Vierars_db;

-- tables
-- Table: Ciudad
CREATE TABLE Ciudad (
    idCiudad int NOT NULL AUTO_INCREMENT,
    nombre varchar(50) NOT NULL,
    idPais int NOT NULL,
    CONSTRAINT Ciudad_pk PRIMARY KEY (idCiudad)
);

-- Table: Compra
CREATE TABLE Compra (
    idCompra int NOT NULL AUTO_INCREMENT,
    idUsuario int NOT NULL,
    idReciclador int NOT NULL,
    fecha date NOT NULL,
    tipo_de_pago varchar(10) NOT NULL,
    monto_total double(8,2) NOT NULL,
    CONSTRAINT Compra_pk PRIMARY KEY (idCompra)
);

-- Table: Detalle_compra
CREATE TABLE Detalle_compra (
    idMaterialRreciclado int NOT NULL,
    idCompra int NOT NULL,
    precio_final double(8,2) NOT NULL,
    CONSTRAINT Detalle_compra_pk PRIMARY KEY (idMaterialRreciclado,idCompra)
);

-- Table: Distrito
CREATE TABLE Distrito (
    idDistrito int NOT NULL AUTO_INCREMENT,
    nombre varchar(50) NOT NULL,
    idCiudad int NOT NULL,
    CONSTRAINT Distrito_pk PRIMARY KEY (idDistrito)
);

-- Table: MateriaReciclado
CREATE TABLE MateriaReciclado (
    idMaterialRreciclado int NOT NULL AUTO_INCREMENT,
    idUsuario int NOT NULL,
    nombre varchar(50) NOT NULL,
    descripcion varchar(200) NULL,
    foto varchar(200) NULL,
    precio double(8,2) NOT NULL,
    peso double(8,2) NULL,
    idTipo int NULL,
    CONSTRAINT MateriaReciclado_pk PRIMARY KEY (idMaterialRreciclado)
);

-- Table: Pais
CREATE TABLE Pais (
    idPais int NOT NULL AUTO_INCREMENT,
    nombre varchar(50) NOT NULL,
    CONSTRAINT Pais_pk PRIMARY KEY (idPais)
);

-- Table: Tipo
CREATE TABLE Tipo (
    idTipo int NOT NULL AUTO_INCREMENT,
    nombre varchar(50) NOT NULL,
    tarifa_kilo double(8,2) NOT NULL,
    CONSTRAINT Tipo_pk PRIMARY KEY (idTipo)
);

-- Table: Usuario
CREATE TABLE Usuario (
    idUsuario int NOT NULL AUTO_INCREMENT,
    nombre varchar(50) NOT NULL,
    apellidos varchar(50) NULL,
    nickname varchar(50) NULL,
    email varchar(50) NULL,
    password varchar(50) NULL,
    idDistrito int NOT NULL,
    direccion varchar(100) NULL,
    puntos int NULL,
    tipo int NOT NULL,
    CONSTRAINT Usuario_pk PRIMARY KEY (idUsuario)
);

-- foreign keys
-- Reference: Ciudad_Pais (table: Ciudad)
ALTER TABLE Ciudad ADD CONSTRAINT Ciudad_Pais FOREIGN KEY Ciudad_Pais (idPais)
    REFERENCES Pais (idPais);

-- Reference: Compra_Reciclador (table: Compra)
ALTER TABLE Compra ADD CONSTRAINT Compra_Reciclador FOREIGN KEY Compra_Reciclador (idReciclador)
    REFERENCES Usuario (idUsuario);

-- Reference: Compra_Usuario (table: Compra)
ALTER TABLE Compra ADD CONSTRAINT Compra_Usuario FOREIGN KEY Compra_Usuario (idUsuario)
    REFERENCES Usuario (idUsuario);

-- Reference: Detalle_compra_Compra (table: Detalle_compra)
ALTER TABLE Detalle_compra ADD CONSTRAINT Detalle_compra_Compra FOREIGN KEY Detalle_compra_Compra (idCompra)
    REFERENCES Compra (idCompra);

-- Reference: Detalle_compra_MateriaReciclado (table: Detalle_compra)
ALTER TABLE Detalle_compra ADD CONSTRAINT Detalle_compra_MateriaReciclado FOREIGN KEY Detalle_compra_MateriaReciclado (idMaterialRreciclado)
    REFERENCES MateriaReciclado (idMaterialRreciclado);

-- Reference: Distrito_Ciudad (table: Distrito)
ALTER TABLE Distrito ADD CONSTRAINT Distrito_Ciudad FOREIGN KEY Distrito_Ciudad (idCiudad)
    REFERENCES Ciudad (idCiudad);

-- Reference: MateriaReciclado_Tipo (table: MateriaReciclado)
ALTER TABLE MateriaReciclado ADD CONSTRAINT MateriaReciclado_Tipo FOREIGN KEY MateriaReciclado_Tipo (idTipo)
    REFERENCES Tipo (idTipo);

-- Reference: MateriaReciclado_Usuario (table: MateriaReciclado)
ALTER TABLE MateriaReciclado ADD CONSTRAINT MateriaReciclado_Usuario FOREIGN KEY MateriaReciclado_Usuario (idUsuario)
    REFERENCES Usuario (idUsuario);

-- Reference: Usuario_Distrito (table: Usuario)
ALTER TABLE Usuario ADD CONSTRAINT Usuario_Distrito FOREIGN KEY Usuario_Distrito (idDistrito)
    REFERENCES Distrito (idDistrito);

````
#### Script para insertar en la base de datos

````sql

INSERT INTO Pais(nombre) VALUES('Perú');
INSERT INTO Ciudad(nombre, idPais) VALUES('Lima',1);
INSERT INTO Distrito(nombre, idCiudad) VALUES('El agustino', 1);
INSERT INTO Distrito(nombre, idCiudad) VALUES('San isidro', 1);
INSERT INTO Usuario(nombre, apellidos, nickname, email, password, idDistrito, direccion, puntos, tipo) VALUES('Andy','Eulogio Sulluchuco', 'andygeek', 'andy.eulogio@gmail.com', '12345678', 1, 'Jr. Lima', 5, 1);
INSERT INTO Compra(idUsuario,idReciclador,fecha, tipo_de_pago, monto_total) VALUES(1,1,'2019-1-13','Efectivo',12.5);
INSERT INTO Tipo(nombre,tarifa_kilo) VALUES('Carton', 0.5);
INSERT INTO MateriaReciclado(idUsuario,nombre,descripcion,foto,precio,peso,idTipo) VALUES(1,'Carton','Material reciclable','foto',15.5,25.3,1);

````

También tienen que cambiar las direcciones de su base de datos en la clase **DataBaseConfiguration.java** dentro del package **com.opensource.vierarsapp.configurations**

