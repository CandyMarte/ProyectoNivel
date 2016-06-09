-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 03, 2016 at 10:22 PM
-- Server version: 5.6.26
-- PHP Version: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ciudadanos`
--

-- --------------------------------------------------------

--
-- Table structure for table `correo_ciudadanos`
--

CREATE TABLE IF NOT EXISTS `correo_ciudadanos` (
  `id` int(11) NOT NULL,
  `correo_electronico` varchar(100) CHARACTER SET utf8 NOT NULL,
  `id_ciudadano` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `datos_ciudadanos`
--

CREATE TABLE IF NOT EXISTS `datos_ciudadanos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(60) CHARACTER SET utf8 NOT NULL,
  `apellido` varchar(80) CHARACTER SET utf8 NOT NULL,
  `sexo` varchar(10) CHARACTER SET utf8 NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `direccion` text CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `telefono_ciudadano`
--

CREATE TABLE IF NOT EXISTS `telefono_ciudadano` (
  `id` int(11) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `id_ciudadano` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `correo_ciudadanos`
--
ALTER TABLE `correo_ciudadanos`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `datos_ciudadanos`
--
ALTER TABLE `datos_ciudadanos`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `telefono_ciudadano`
--
ALTER TABLE `telefono_ciudadano`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `correo_ciudadanos`
--
ALTER TABLE `correo_ciudadanos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `datos_ciudadanos`
--
ALTER TABLE `datos_ciudadanos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `telefono_ciudadano`
--
ALTER TABLE `telefono_ciudadano`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
