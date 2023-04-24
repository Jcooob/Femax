-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: femax
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `vivienda`
--

DROP TABLE IF EXISTS `vivienda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vivienda` (
  `id_vivienda` int NOT NULL AUTO_INCREMENT,
  `ciudad` varchar(45) NOT NULL,
  `distrito` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `referencia` varchar(45) DEFAULT NULL,
  `id_tipo_vivienda` int DEFAULT NULL,
  `id_tipo_alquiler` int DEFAULT NULL,
  `id_persona` int DEFAULT NULL,
  `estado` varchar(45) DEFAULT NULL,
  `precio` varchar(10) DEFAULT NULL,
  `moneda` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_vivienda`),
  KEY `id_tipo_vivienda_idx` (`id_tipo_vivienda`),
  KEY `id_tipo_alquiler_idx` (`id_tipo_alquiler`),
  KEY `id_persona_idx` (`id_persona`),
  CONSTRAINT `id_persona` FOREIGN KEY (`id_persona`) REFERENCES `persona` (`id_persona`),
  CONSTRAINT `id_tipo_alquiler` FOREIGN KEY (`id_tipo_alquiler`) REFERENCES `tipo_alquiler` (`id_tipo_alquiler`),
  CONSTRAINT `id_tipo_vivienda` FOREIGN KEY (`id_tipo_vivienda`) REFERENCES `tipo_vivienda` (`id_tipo_vivienda`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vivienda`
--

LOCK TABLES `vivienda` WRITE;
/*!40000 ALTER TABLE `vivienda` DISABLE KEYS */;
INSERT INTO `vivienda` VALUES (18,'Lima','Miraflores','Calle los cedros 670','A 2 cuadras del parque Kennedy',1,2,18,'Libre','450 000.00','Dolares'),(20,'Arequipa','Cerro Colorado','Calle 28 de julio 325','A 1 cuadra de plaza Las Americas',2,2,34,'Libre','80 000.00','Dolares'),(21,'Arequipa','Cayma','Calle los arces 512','A 4 cuadras de la Av. Ejercito',2,2,35,'Libre','150 000.00','Dolares'),(22,'Arequipa','Selva Alegre','Calle los manzanos 560','Cerca al mercado',5,4,32,'Libre','350.00','Soles'),(23,'Mollendo','Cecado','Calle La Mar 420','A 1 cuadra del mercado',1,2,35,'Libre','40 000.00','Dolares');
/*!40000 ALTER TABLE `vivienda` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-10 18:14:42
