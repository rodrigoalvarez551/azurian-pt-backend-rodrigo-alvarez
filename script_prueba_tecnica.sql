/*
SQLyog Community Edition- MySQL GUI v8.05 
MySQL - 5.7.33 : Database - app-bd
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`app-bd` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `app-bd`;

/*Table structure for table `auto` */

DROP TABLE IF EXISTS `auto`;

CREATE TABLE `auto` (
  `id` bigint(20) NOT NULL,
  `fabricacion` int(11) DEFAULT NULL,
  `fabricante_id` bigint(20) DEFAULT NULL,
  `modelo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKgymw02a237aumdwir8mkme3o2` (`fabricante_id`),
  CONSTRAINT `FKgymw02a237aumdwir8mkme3o2` FOREIGN KEY (`fabricante_id`) REFERENCES `fabricante` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `auto` */

insert  into `auto`(`id`,`fabricacion`,`fabricante_id`,`modelo`) values (1,2020,1,'A45'),(2,2021,2,'M3'),(3,2018,1,'Clase C');

/*Table structure for table `fabricante` */

DROP TABLE IF EXISTS `fabricante`;

CREATE TABLE `fabricante` (
  `id` bigint(20) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `fabricante` */

insert  into `fabricante`(`id`,`nombre`) values (1,'Mercedez'),(2,'BMW');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
