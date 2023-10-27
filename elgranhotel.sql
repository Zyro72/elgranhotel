-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-10-2023 a las 23:25:55
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
-- Base de datos: `elgranhotel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `Numero` int(11) NOT NULL,
  `Tipohabitacion` int(11) NOT NULL,
  `Piso` int(11) NOT NULL,
  `Estado` tinyint(1) NOT NULL,
  `Ocupada` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`Numero`, `Tipohabitacion`, `Piso`, `Estado`, `Ocupada`) VALUES
(101, 5, 1, 1, 0),
(102, 1, 1, 1, 1),
(103, 1, 1, 1, 0),
(104, 2, 1, 1, 0),
(105, 4, 1, 1, 0),
(106, 5, 1, 1, 0),
(107, 5, 1, 1, 0),
(108, 5, 1, 1, 0),
(109, 6, 1, 0, 0),
(201, 2, 2, 1, 0),
(202, 2, 2, 1, 0),
(203, 3, 2, 1, 1),
(204, 4, 2, 1, 0),
(205, 5, 2, 1, 0),
(206, 5, 2, 1, 0),
(207, 5, 2, 1, 0),
(208, 6, 2, 1, 1),
(209, 6, 2, 1, 0),
(303, 5, 3, 1, 0),
(306, 6, 3, 1, 0),
(401, 1, 4, 1, 0),
(402, 1, 4, 1, 0),
(403, 1, 4, 1, 0),
(404, 2, 4, 1, 0),
(405, 2, 4, 1, 0),
(406, 3, 4, 1, 0),
(407, 3, 4, 1, 0),
(408, 4, 4, 1, 0),
(409, 5, 4, 1, 0),
(501, 1, 5, 1, 0),
(502, 2, 5, 1, 0),
(503, 3, 5, 1, 0),
(601, 2, 6, 0, 0),
(602, 1, 6, 1, 0),
(701, 1, 7, 1, 0),
(702, 3, 7, 1, 0),
(703, 2, 7, 1, 0),
(704, 2, 7, 1, 0),
(705, 4, 7, 1, 0),
(706, 4, 7, 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

CREATE TABLE `huesped` (
  `idHuesped` int(11) NOT NULL,
  `Dni` int(11) NOT NULL,
  `Apellidoynom` varchar(30) NOT NULL,
  `Direccion` varchar(60) NOT NULL,
  `Correo` varchar(40) NOT NULL,
  `Celular` varchar(20) NOT NULL,
  `Estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='Datos del Huesped';

--
-- Volcado de datos para la tabla `huesped`
--

INSERT INTO `huesped` (`idHuesped`, `Dni`, `Apellidoynom`, `Direccion`, `Correo`, `Celular`, `Estado`) VALUES
(1, 28126572, 'Rodrigo Juan Irusta', 'San Martin 988', 'rirusta@guerrero.com.ar', '3476-155662211', 1),
(4, 17224173, 'Pereyra Miguel', 'Bulevard 1047 depto 2', 'cheche@gmail.com', '1121977690', 1),
(8, 28256530, 'ROBLEDO VIVIANA', 'CENTENO 320', 'VR@GMAIL.COM', '123456', 1),
(10, 123456, 'PEREZ JOSE', 'CENTENO 222', 'PEREZ@PEREZ.COM', '123456', 1),
(11, 10101010, 'DIEZ CUATERNO', 'CUATRO DIEZ', 'DIEZ4@GMAIL.COM', '410410410', 1),
(12, 11111111, 'Once Mario', '11 de noviembre 1211', 'Once@gmail.com', '11 2304 2321', 1),
(13, 12121212, 'CUERVO JOSE', 'LARROQUE 292', 'josecuervo@gmail.com', 'Fijo: 402302', 1),
(14, 13131313, 'RODRIGUEZ MAURO', 'GRAL LOPEZ 2939', 'mauritorod@hotmail.com', '0384-15202012', 1),
(15, 14141414, 'CIRIO JESICA', 'LOS ALAMOS 201', 'jesi_cirio@hotmail.com', '0266-15503034', 1),
(16, 15151515, 'GONZALES SERGIO', 'SAN MARTIN 1120', 'gsergiogonza@arnet.com.ar', '0382-1530242', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `idReserva` int(11) NOT NULL,
  `nrohabitacion` int(11) NOT NULL,
  `idHuesped` int(11) NOT NULL,
  `FechaEntrada` date NOT NULL,
  `FechaSalida` date NOT NULL,
  `ImporteTotal` double NOT NULL,
  `Estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `reserva`
--

INSERT INTO `reserva` (`idReserva`, `nrohabitacion`, `idHuesped`, `FechaEntrada`, `FechaSalida`, `ImporteTotal`, `Estado`) VALUES
(23, 208, 1, '2023-10-25', '2023-10-27', 80000, 1),
(24, 101, 14, '2023-10-25', '2023-10-26', 56000, 0),
(25, 102, 14, '2023-10-25', '2023-10-27', 26000, 1),
(26, 102, 12, '2023-10-27', '2023-11-05', 162004.5, 1),
(27, 203, 13, '2023-10-27', '2023-10-30', 63000, 1),
(28, 306, 15, '2023-10-27', '2023-10-30', 120000, 1),
(29, 205, 15, '2024-01-01', '2024-01-30', 812000, 1),
(30, 407, 12, '2024-02-01', '2024-02-20', 399000, 1),
(31, 409, 14, '2023-10-27', '2023-10-30', 84000, 1),
(33, 203, 12, '2023-10-26', '2023-10-30', 21000, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipodehabitacion`
--

CREATE TABLE `tipodehabitacion` (
  `Codigo` int(11) NOT NULL,
  `Tipo` varchar(20) NOT NULL,
  `Capacidad` int(11) NOT NULL,
  `Cantidadcamas` int(11) NOT NULL,
  `Tipocamas` varchar(20) NOT NULL,
  `Precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='Tipos de Habitaciones';

--
-- Volcado de datos para la tabla `tipodehabitacion`
--

INSERT INTO `tipodehabitacion` (`Codigo`, `Tipo`, `Capacidad`, `Cantidadcamas`, `Tipocamas`, `Precio`) VALUES
(1, 'Standard Simple', 1, 1, 'Simple', 13000),
(2, 'Doble', 2, 2, 'Simple', 19500),
(3, 'Doble', 2, 1, 'Queen', 21000),
(4, 'Triple', 3, 3, 'Simple', 18000),
(5, 'Triple', 3, 2, '1 Simple 1 Queen', 28000),
(6, 'Suit Lujo', 2, 1, 'King', 40000);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`Numero`),
  ADD KEY `Tipohabitacion` (`Tipohabitacion`);

--
-- Indices de la tabla `huesped`
--
ALTER TABLE `huesped`
  ADD PRIMARY KEY (`idHuesped`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idReserva`),
  ADD KEY `nrohabitacion` (`nrohabitacion`),
  ADD KEY `idHuesped` (`idHuesped`);

--
-- Indices de la tabla `tipodehabitacion`
--
ALTER TABLE `tipodehabitacion`
  ADD PRIMARY KEY (`Codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `huesped`
--
ALTER TABLE `huesped`
  MODIFY `idHuesped` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD CONSTRAINT `habitacion_ibfk_1` FOREIGN KEY (`Tipohabitacion`) REFERENCES `tipodehabitacion` (`Codigo`);

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`nrohabitacion`) REFERENCES `habitacion` (`Numero`),
  ADD CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`idHuesped`) REFERENCES `huesped` (`idHuesped`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
