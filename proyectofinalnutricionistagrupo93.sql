-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-10-2023 a las 20:32:11
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
  `nombre` varchar(75) NOT NULL,
  `detalle` varchar(75) DEFAULT NULL,
  `cantCalorias` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `comida`
--

INSERT INTO `comida` (`idComida`, `nombre`, `detalle`, `cantCalorias`, `estado`) VALUES
(1, 'tomate', 'vitamina c', 55, 1),
(2, 'naranja', 'vit c', 3, 1),
(3, 'banana', 'potasio', 180, 1),
(4, 'LOPES', 'VIT', 60, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dieta`
--

CREATE TABLE `dieta` (
  `idDieta` int(11) NOT NULL,
  `nombre` varchar(75) NOT NULL,
  `paciente` int(11) DEFAULT NULL,
  `fechaInicial` date NOT NULL,
  `fechaFinal` date NOT NULL,
  `pesoInicial` float NOT NULL,
  `pesoObjetivo` float NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dieta`
--

INSERT INTO `dieta` (`idDieta`, `nombre`, `paciente`, `fechaInicial`, `fechaFinal`, `pesoInicial`, `pesoObjetivo`, `estado`) VALUES
(1, 'dieta1', 1, '2023-10-10', '2023-10-31', 60, 50, 1);

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
(1, 2, 1, 'Almuerzo', 2, 0),
(2, 1, 1, 'snack', 1, 0),
(3, 1, 1, 'DESAYUNO', 1, 0),
(4, 1, 1, 'DESAYUNO', 1, 0),
(5, 1, 1, 'DESAYUNO', 2, 1),
(6, 1, 1, 'DESAYUNO', 2, 1),
(7, 4, 1, 'DESAYUNO', 1, 1),
(8, 2, 1, 'CENA', 99, 1),
(9, 1, 1, 'DESAYUNO', 60, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial`
--

CREATE TABLE `historial` (
  `idHistorial` int(11) NOT NULL,
  `idPaciente` int(11) NOT NULL,
  `peso` double NOT NULL,
  `fecha` date NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `historial`
--

INSERT INTO `historial` (`idHistorial`, `idPaciente`, `peso`, `fecha`, `estado`) VALUES
(1, 1, 50, '2023-10-26', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `idPaciente` int(11) NOT NULL,
  `dni` int(9) NOT NULL,
  `nombre` varchar(75) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `genero` varchar(15) NOT NULL,
  `edad` int(3) NOT NULL,
  `altura` float NOT NULL,
  `pesoActual` double NOT NULL,
  `pesoDeseado` double NOT NULL,
  `domicilio` varchar(100) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `mail` varchar(100) DEFAULT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`idPaciente`, `dni`, `nombre`, `apellido`, `genero`, `edad`, `altura`, `pesoActual`, `pesoDeseado`, `domicilio`, `telefono`, `mail`, `estado`) VALUES
(1, 1234567, 'lopez', 'sa', 'm', 55, 1.8, 66, 99, 'dnaisd', 111, NULL, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comida`
--
ALTER TABLE `comida`
  ADD PRIMARY KEY (`idComida`),
  ADD UNIQUE KEY `nombre_2` (`nombre`,`cantCalorias`);

--
-- Indices de la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD PRIMARY KEY (`idDieta`),
  ADD KEY `idPaciente` (`paciente`);

--
-- Indices de la tabla `dietacomida`
--
ALTER TABLE `dietacomida`
  ADD PRIMARY KEY (`idDietaComida`),
  ADD KEY `idDieta` (`idDieta`),
  ADD KEY `idComida` (`idComida`);

--
-- Indices de la tabla `historial`
--
ALTER TABLE `historial`
  ADD PRIMARY KEY (`idHistorial`),
  ADD KEY `idPaciente` (`idPaciente`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`idPaciente`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comida`
--
ALTER TABLE `comida`
  MODIFY `idComida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `dieta`
--
ALTER TABLE `dieta`
  MODIFY `idDieta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `dietacomida`
--
ALTER TABLE `dietacomida`
  MODIFY `idDietaComida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `historial`
--
ALTER TABLE `historial`
  MODIFY `idHistorial` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `idPaciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD CONSTRAINT `dieta_ibfk_1` FOREIGN KEY (`paciente`) REFERENCES `paciente` (`idPaciente`);

--
-- Filtros para la tabla `dietacomida`
--
ALTER TABLE `dietacomida`
  ADD CONSTRAINT `dietacomida_ibfk_1` FOREIGN KEY (`idDieta`) REFERENCES `dieta` (`idDieta`),
  ADD CONSTRAINT `dietacomida_ibfk_2` FOREIGN KEY (`idComida`) REFERENCES `comida` (`idComida`);

--
-- Filtros para la tabla `historial`
--
ALTER TABLE `historial`
  ADD CONSTRAINT `historial_ibfk_1` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`idPaciente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
