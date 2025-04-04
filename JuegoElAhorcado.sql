CREATE DATABASE JuegoElAhorcado;
USE JuegoElAhorcado;

CREATE TABLE Usuario (
    id_usuario INT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    contrasena VARCHAR(255)
);

CREATE TABLE Administrador (
    id_usuario INT PRIMARY KEY,
    nivel_adm ENUM('1', '2', '3'),
    FOREIGN KEY (id_usuario) REFERENCES Usuario(id_usuario)
);

CREATE TABLE Cuota (
    id_Cuota INT PRIMARY KEY,
    Monto DECIMAL(10,2),
    tipo ENUM('Normal', 'Premium')
);

CREATE TABLE Jugador (
    id_usuario INT PRIMARY KEY,
    id_cuota INT,
    FOREIGN KEY (id_usuario) REFERENCES Usuario(id_usuario),
    FOREIGN KEY (id_cuota) REFERENCES Cuota(id_cuota)
);

CREATE TABLE Juego (
    id_juego INT PRIMARY KEY,
    idioma VARCHAR(50),
    fecha_sistema DATE,
    hora_sistema TIME
);

CREATE TABLE Partida (
    id_partida INT,
    id_juego INT,
    duracion_partida TIME,
    PRIMARY KEY (id_partida, id_juego),
    FOREIGN KEY (id_juego) REFERENCES Juego(id_juego)
);

CREATE TABLE RegistroPartida (
    id_partida INT,
    id_juego INT,
    id_frase INT,
    PRIMARY KEY (id_partida, id_juego, id_frase),
    FOREIGN KEY (id_partida, id_juego) REFERENCES Partida(id_partida, id_juego),
    FOREIGN KEY (id_frase) REFERENCES PalabraFrase(id_frase)
);

CREATE TABLE PalabraFrase (
    id_frase INT PRIMARY KEY,
    idioma VARCHAR(50),
    nombre VARCHAR(100),
    significado TEXT
);

CREATE TABLE Sinonimo (
    id_frase INT,
    id_fraseSinonima INT,
    sinonimo VARCHAR(100),
    PRIMARY KEY (id_frase, id_fraseSinonima),
    FOREIGN KEY (id_frase) REFERENCES PalabraFrase(id_frase),
    FOREIGN KEY (id_fraseSinonima) REFERENCES PalabraFrase(id_frase)
);

CREATE TABLE Historico (
    id_historico INT PRIMARY KEY,
    idFrase INT,
    FOREIGN KEY (idFrase) REFERENCES PalabraFrase(id_frase)
);
