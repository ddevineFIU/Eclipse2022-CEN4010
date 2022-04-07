-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: book
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book` (
  `book_id` varchar(255) NOT NULL,
  `author` varchar(100) NOT NULL,
  `bookName` varchar(255) NOT NULL,
  `bookDescrip` varchar(255) NOT NULL,
  `price` decimal(10,0) NOT NULL,
  `genre` varchar(255) NOT NULL,
  `publisher` varchar(45) NOT NULL,
  `yearPublished` int NOT NULL,
  `copiesSold` int NOT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES ('1','Tyler Lewis','Brady The GOAT','Is the legend real?',10,'Documentary','Michelle P. Publishing',2022,36000),('10','J.K Rowling','Harry Potter and the Half-Blood Prince','Harry Potter',30,'Fantasy','Scholastic Inc.',2005,2800000),('11','J.K Rowling','Harry Potter and the Deathly Hallows','Harry Potter',30,'Fantasy','Arthur A. Levine Books',2007,3500000),('2','Jerry Seinfield','On Love and Peace','A world without war',20,'fiction','Geralds Publishing',1996,25000),('3','Tyler Lewis','Up Shits Creek','When life is a mess',26,'Lifestyle','Daily W Publishing',2020,60000),('4','MC Branch','Get Out of Dodge','Sometimes you gotta go.',16,'Non-Fiction','Daily W Publishing',2022,14000),('5','J.K Rowling','Harry Potter and the Philosopher’s Stone','Harry Potter',30,'Fantasy','Scholastic Inc',1997,8400000),('6','J.K Rowling','Harry Potter and the Chamber of Secrets','Harry Potter',30,'Fantasy','Arthur A. Levine Books',1998,3200000),('7','J.K Rowling','Harry Potter and the Prisoner of Azkaban','Harry Potter',30,'Fantasy','Scholastic Inc.',1999,3400000),('8','J.K Rowling','Harry Potter and the Goblet of Fire','Harry Potter',30,'Fantasy','Scholastic Inc.',2000,3000000),('9','J.K Rowling','Harry Potter and the Order of the Phoenix','Harry Potter',30,'Fantasy','Scholastic Inc.',2003,2900000);
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-06 23:51:33
