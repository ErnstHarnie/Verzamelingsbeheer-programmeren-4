-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- Machine: localhost
-- Genereertijd: 21 jan 2015 om 13:29
-- Serverversie: 5.6.13
-- PHP-versie: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Databank: `verzamelingendb`
--
CREATE DATABASE IF NOT EXISTS `verzamelingendb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `verzamelingendb`;

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `tbl_categorie`
--

CREATE TABLE IF NOT EXISTS `tbl_categorie` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Naam` varchar(255) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Gegevens worden uitgevoerd voor tabel `tbl_categorie`
--

INSERT INTO `tbl_categorie` (`Id`, `Naam`) VALUES
(1, 'Actie'),
(2, 'Humor'),
(3, 'Avontuur'),
(6, 'Overige'),
(10, 'Fantasie'),
(11, 'hjkhgjk');

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `tbl_type`
--

CREATE TABLE IF NOT EXISTS `tbl_type` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Naam` varchar(255) NOT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `Naam` (`Naam`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Gegevens worden uitgevoerd voor tabel `tbl_type`
--

INSERT INTO `tbl_type` (`Id`, `Naam`) VALUES
(2, 'Boek'),
(1, 'Film'),
(3, 'Postzegels'),
(4, 'Sleutelhangers');

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `tbl_verzameling`
--

CREATE TABLE IF NOT EXISTS `tbl_verzameling` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Naam` varchar(255) NOT NULL,
  `Beschrijving` varchar(4000) NOT NULL,
  `InBezit` bit(1) NOT NULL,
  `CategoryId` int(11) NOT NULL,
  `TypeId` int(11) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `CategoryId` (`CategoryId`),
  KEY `TypeId` (`TypeId`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=72 ;

--
-- Gegevens worden uitgevoerd voor tabel `tbl_verzameling`
--

INSERT INTO `tbl_verzameling` (`Id`, `Naam`, `Beschrijving`, `InBezit`, `CategoryId`, `TypeId`) VALUES
(67, 'Postzegel', 'klein', b'1', 2, 3);

--
-- Beperkingen voor gedumpte tabellen
--

--
-- Beperkingen voor tabel `tbl_verzameling`
--
ALTER TABLE `tbl_verzameling`
  ADD CONSTRAINT `Cid` FOREIGN KEY (`CategoryId`) REFERENCES `tbl_categorie` (`Id`),
  ADD CONSTRAINT `Tid` FOREIGN KEY (`TypeId`) REFERENCES `tbl_type` (`Id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
