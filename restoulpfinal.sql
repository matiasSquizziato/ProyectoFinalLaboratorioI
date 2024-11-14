-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-11-2024 a las 23:12:01
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `restoulpfinal`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id_producto` int(11) NOT NULL,
  `codigo` varchar(50) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id_producto`, `codigo`, `nombre`, `cantidad`, `precio`, `estado`) VALUES
(2, '1', 'Asado', 0, 10900.00, 1),
(3, '2', 'Menu Completo', 10000, 14100.00, 1),
(4, '3', 'Matambre', 5, 11900.00, 1),
(5, '4', 'Pollo', 0, 7500.00, 1),
(6, '5', 'Vacio', 20, 10900.00, 1),
(7, '7', 'Milanesas', 9, 11000.00, 1),
(8, '11', 'Medida de Fernet', 20, 3500.00, 1),
(9, '12', 'Cerveza 970cc', 24, 4300.00, 1),
(10, '13', 'Linea Coca 1,25', 24, 3200.00, 1),
(11, '14', 'Linea Pepsi 1,50', 24, 4200.00, 1),
(13, '15', 'Gaseosa 500cc', 24, 2300.00, 1),
(14, '16', 'Vino de la casa', 18, 4700.00, 1),
(15, '17', 'Otro Loco Mas', 18, 7100.00, 1),
(16, '18', 'Las Perdices', 18, 9500.00, 1),
(18, '19', 'Mesa de Galanes(Las Perdices)', 12, 10800.00, 1),
(19, '22', 'Postre', 60, 3300.00, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`),
  ADD UNIQUE KEY `codigo` (`codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
