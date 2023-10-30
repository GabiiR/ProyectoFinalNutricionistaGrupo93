-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-10-2023 a las 03:42:05
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyectofinalnutricionistagrupo93`
--
CREATE DATABASE IF NOT EXISTS `proyectofinalnutricionistagrupo93` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `proyectofinalnutricionistagrupo93`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comida`
--

CREATE TABLE `comida` (
  `idComida` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `detalle` varchar(50) NOT NULL,
  `cantCalorias` float NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `comida`
--

INSERT INTO `comida` (`idComida`, `nombre`, `detalle`, `cantCalorias`, `estado`) VALUES
(1, 'Tomate', 'Son ricos en vitamina C y potasio.', 50, 1),
(2, 'Arroz', 'Arroz hervido sin queso', 350, 1),
(3, 'Pollo hervido', 'pollo hervido sin sal', 400, 1),
(4, 'carne roja', 'carne vacuna a la plancha', 350, 1),
(5, 'sopa', 'sopa de verduras', 200, 1),
(6, 'caldo de carne roja', 'caldo con carne roja y verduras', 450, 1),
(7, 'caldo de pescado', 'sopa de pescado con verduras', 500, 1),
(8, 'ensalada simple', 'tomate y lechuga', 150, 1),
(9, 'ensalada doble', 'tomate lechuga y zanahoria', 155, 1),
(10, 'ensalada rusa', 'ensalada de papas zanahorias y arvejas', 450, 1),
(11, 'te con leche', 'te comun con leche', 200, 1),
(12, 'te solo', 'te comun solo', 30, 1),
(13, 'cafe solo', 'cafe solo sin azucar', 50, 1),
(14, 'cafe solo dulce', 'cafe solo con azucar', 150, 1),
(15, 'leche sola', 'leche sin azucar', 150, 1),
(16, 'leche sola dulce', 'leche sola con azucar', 250, 1),
(17, 'cafe con leche', 'cafe con leche sin azucar', 200, 1),
(18, 'cafe con leche dulce', 'cafe con leche con azucar', 275, 1),
(19, 'yogurt con cereales', 'un vaso de yogurt y cereales', 350, 1),
(20, 'leche con cereales', 'vaso de leche con cereales sin azucar', 375, 1),
(21, 'papas solas', 'papas hervidas sin sal', 355, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dieta`
--

CREATE TABLE `dieta` (
  `idDieta` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `idPaciente` int(11) NOT NULL,
  `fechaInicial` date DEFAULT NULL,
  `fechaFinal` date DEFAULT NULL,
  `pesoInicial` double DEFAULT NULL,
  `pesoObjetivo` double DEFAULT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dieta`
--

INSERT INTO `dieta` (`idDieta`, `nombre`, `idPaciente`, `fechaInicial`, `fechaFinal`, `pesoInicial`, `pesoObjetivo`, `estado`) VALUES
(0, 'dieta 1', 1, '2023-10-10', '2023-12-21', 120, 75, 1),
(1, 'dieta 2', 3, '2023-07-20', '2023-09-21', 125, 85, 1),
(2, 'dieta 3', 5, '2023-08-09', '2023-09-20', 115, 85, 1),
(3, 'dieta 7', 6, '2023-08-17', '2023-09-20', 140, 75, 1),
(4, 'dieta 4', 2, '2023-07-11', '2023-09-06', 125, 75, 1),
(5, 'dieta 5', 4, '2023-08-15', '2023-10-17', 130, 85, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dietacomida`
--

CREATE TABLE `dietacomida` (
  `idDietaComida` int(11) NOT NULL,
  `idComida` int(11) NOT NULL,
  `idDieta` int(11) NOT NULL,
  `horario` varchar(50) NOT NULL,
  `porcion` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dietacomida`
--

INSERT INTO `dietacomida` (`idDietaComida`, `idComida`, `idDieta`, `horario`, `porcion`, `estado`) VALUES
(1, 6, 3, 'almuerzo', 2, 1),
(2, 2, 2, 'cena', 1, 1),
(5, 1, 1, 'cena', 2, 1),
(15, 15, 0, 'DESAYUNO', 2, 1),
(16, 4, 0, 'ALMUERZO', 1, 1),
(17, 13, 0, 'MERIENDA', 1, 1),
(18, 7, 0, 'CENA', 2, 1),
(19, 19, 0, 'SNACK', 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial`
--

CREATE TABLE `historial` (
  `idHistorial` int(11) NOT NULL,
  `idPaciente` int(11) NOT NULL,
  `peso` float NOT NULL,
  `fecha` date NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `historial`
--

INSERT INTO `historial` (`idHistorial`, `idPaciente`, `peso`, `fecha`, `estado`) VALUES
(1, 1, 120, '2023-08-22', 1),
(2, 1, 110, '2023-08-30', 1),
(3, 3, 115, '2023-08-22', 1),
(4, 2, 110, '2023-09-04', 1),
(5, 5, 105, '2023-10-11', 1),
(6, 6, 115, '2023-10-19', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `idPaciente` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `dni` int(8) NOT NULL,
  `domicilio` varchar(30) NOT NULL,
  `telefono` int(11) NOT NULL,
  `pesoActual` double NOT NULL,
  `pesoDeseado` double NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `fechaFin` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`idPaciente`, `nombre`, `dni`, `domicilio`, `telefono`, `pesoActual`, `pesoDeseado`, `estado`, `fechaFin`) VALUES
(1, 'Alberto Juarez', 1234123, 'San martin 542', 112233, 85, 70, 1, '2023-10-10'),
(2, 'Tomas Fedez', 7777777, 'Castillo 465', 37946523, 95, 70, 1, '2023-10-18'),
(3, 'Juan Perez', 1231234, 'Peron 333', 3333333, 105, 80, 1, '2023-10-10'),
(4, 'Luis Castelo', 1122334, 'Paris 345', 12341234, 115.5, 80, 1, '2023-11-15'),
(5, 'Julio Sosa', 4442223, 'Larrea 1546', 11545555, 105, 110.5, 1, '2023-12-12'),
(6, 'Martin Karadajian', 2223335, 'Martirena 2245', 11552236, 115, 85, 1, '2023-10-25'),
(7, 'Marisa Sosa', 5412635, 'Calle 4 N785', 21532568, 110, 75, 1, '2023-10-17'),
(8, 'Sara Nogal', 2564813, 'Blas Parera 454', 45133685, 115, 75, 1, '2023-12-15'),
(9, 'Silvia Gomez', 4587963, 'Las Heras 4758', 46586213, 110, 75, 1, '2023-11-28');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comida`
--
ALTER TABLE `comida`
  ADD PRIMARY KEY (`idComida`);

--
-- Indices de la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD PRIMARY KEY (`idDieta`),
  ADD UNIQUE KEY `idPaciente` (`idPaciente`);

--
-- Indices de la tabla `dietacomida`
--
ALTER TABLE `dietacomida`
  ADD PRIMARY KEY (`idDietaComida`),
  ADD KEY `dietacomida_ibfk_1` (`idComida`),
  ADD KEY `dietacomida_ibfk_2` (`idDieta`);

--
-- Indices de la tabla `historial`
--
ALTER TABLE `historial`
  ADD PRIMARY KEY (`idHistorial`),
  ADD KEY `historial_ibfk_1` (`idPaciente`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`idPaciente`),
  ADD UNIQUE KEY `Dni` (`dni`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comida`
--
ALTER TABLE `comida`
  MODIFY `idComida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de la tabla `dietacomida`
--
ALTER TABLE `dietacomida`
  MODIFY `idDietaComida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de la tabla `historial`
--
ALTER TABLE `historial`
  MODIFY `idHistorial` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `idPaciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD CONSTRAINT `dieta_ibfk_1` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`idPaciente`);

--
-- Filtros para la tabla `dietacomida`
--
ALTER TABLE `dietacomida`
  ADD CONSTRAINT `dietacomida_ibfk_1` FOREIGN KEY (`idComida`) REFERENCES `comida` (`idComida`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `dietacomida_ibfk_2` FOREIGN KEY (`idDieta`) REFERENCES `dieta` (`idDieta`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `historial`
--
ALTER TABLE `historial`
  ADD CONSTRAINT `historial_ibfk_1` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`idPaciente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
