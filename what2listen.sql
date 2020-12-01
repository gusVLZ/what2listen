-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.21 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for what2listen
CREATE DATABASE IF NOT EXISTS `what2listen2` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `what2listen`;

-- Dumping structure for table what2listen.genre
CREATE TABLE IF NOT EXISTS `genre` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `active` bit(1) NOT NULL DEFAULT b'1',
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- Dumping data for table what2listen.genre: ~15 rows (approximately)
DELETE FROM `genre`;
/*!40000 ALTER TABLE `genre` DISABLE KEYS */;
INSERT INTO `genre` (`id`, `name`, `created_at`, `updated_at`, `active`) VALUES
	(1, 'Rock', '2020-11-02 22:43:53', NULL, b'1'),
	(2, 'Punk', '2020-11-02 22:47:42', NULL, b'1'),
	(3, 'Pop rock', '2020-11-02 22:47:42', NULL, b'1'),
	(4, 'Rock clássico', '2020-11-02 22:47:42', NULL, b'1'),
	(5, 'Acústica', '2020-11-02 22:47:42', NULL, b'1'),
	(6, 'Hard rock', '2020-11-02 22:47:42', NULL, b'1'),
	(7, 'Heavy metal', '2020-11-02 22:47:42', NULL, b'1'),
	(8, 'Punk rock', '2020-11-02 22:47:42', NULL, b'1'),
	(9, 'Reggae', '2020-11-02 22:47:42', NULL, b'1'),
	(10, 'Dance', '2020-11-02 22:47:42', NULL, b'1'),
	(11, 'Metal clássico', '2020-11-02 22:47:42', NULL, b'1'),
	(12, 'Alternativa/Indie', '2020-11-02 22:47:42', NULL, b'1'),
	(13, 'Glam rock', '2020-11-02 22:47:42', NULL, b'1'),
	(14, 'R&B/soul', '2020-11-02 22:47:42', NULL, b'1'),
	(15, 'Pop', '2020-11-02 23:03:39', NULL, b'1');
/*!40000 ALTER TABLE `genre` ENABLE KEYS */;

-- Dumping structure for table what2listen.song
CREATE TABLE IF NOT EXISTS `song` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `artist` varchar(50) NOT NULL,
  `album` varchar(50) DEFAULT NULL,
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `active` bit(1) NOT NULL DEFAULT b'1',
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table what2listen.song: ~27 rows (approximately)
DELETE FROM `song`;
/*!40000 ALTER TABLE `song` DISABLE KEYS */;
INSERT INTO `song` (`id`, `name`, `artist`, `album`, `created_at`, `updated_at`, `active`) VALUES
	(1, 'Smells Like Teen Spirit', 'Nirvana', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(2, 'Imagine', 'John Lennon', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(3, 'One', 'U2', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(4, 'Billie Jean', 'Michael Jackson', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(5, 'Bohemian Rhapsody', 'Queen', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(6, 'Hey Jude', 'The Beatles', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(7, 'Like A Rolling Stone', 'Bob Dylan', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(8, '(I Can’t Get No) Satisfaction', 'Rolling Stones', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(9, 'God Save The Queen', 'Sex Pistols', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(10, 'Sweet Child O’Mine', 'Guns N’ Roses', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(11, 'London Calling', 'The Clash', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(12, 'Hotel California', 'The Eagles', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(13, 'Your Song', 'Elton John', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(14, 'Stairway To Heaven', 'Led Zeppelin', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(15, 'The Twist', 'Chubby Checker', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(16, 'Live Forever', 'Oasis', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(17, 'I Will Always Love You', 'Whitney Houston', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(18, 'Life On Mars?', 'David Bowie', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(19, 'Heartbreak Hotel', 'Elvis Presley', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(20, 'Over The Rainbow', 'Judy Garland', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(21, 'What’s Goin’ On', 'Marvin Gaye', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(22, 'Be My Baby', 'The Ronettes', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(23, 'Creep', 'Radiohead', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(24, 'Respect', 'Aretha Franklin', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(25, 'Family Affair', 'Sky And The Family Stone', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(26, 'Yesterday', 'The Beatles', NULL, '2020-11-02 22:57:11', NULL, b'1'),
	(27, 'teste', 'teste', NULL, '2020-11-02 23:17:12', NULL, b'1');
/*!40000 ALTER TABLE `song` ENABLE KEYS */;

-- Dumping structure for table what2listen.song_rate
CREATE TABLE IF NOT EXISTS `song_rate` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `id_user` int NOT NULL,
  `id_song` int NOT NULL,
  `rate` tinyint NOT NULL,
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `active` bit(1) NOT NULL DEFAULT b'1',
  PRIMARY KEY (`id`),
  KEY `id` (`id`),
  KEY `id_user` (`id_user`),
  KEY `id_song` (`id_song`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- Dumping data for table what2listen.song_rate: ~37 rows (approximately)
DELETE FROM `song_rate`;
/*!40000 ALTER TABLE `song_rate` DISABLE KEYS */;
INSERT INTO `song_rate` (`id`, `id_user`, `id_song`, `rate`, `created_at`, `updated_at`, `active`) VALUES
	(1, 1, 1, 5, '2020-11-13 02:01:54', '2020-11-13 02:01:54', b'1'),
	(2, 1, 1, 4, '2020-11-26 01:04:44', '2020-11-26 01:04:44', b'1'),
	(3, 1, 2, 5, '2020-11-26 22:05:44', '2020-11-26 22:05:44', b'1'),
	(5, 2, 5, 5, '2020-11-26 22:10:31', '2020-11-26 22:10:34', b'1'),
	(6, 2, 2, 4, '2020-11-26 22:10:31', NULL, b'1'),
	(7, 3, 3, 5, '2020-11-26 22:10:31', NULL, b'1'),
	(8, 3, 1, 3, '2020-11-26 22:10:31', NULL, b'1'),
	(13, 1, 15, 3, '2020-12-01 03:35:33', '2020-12-01 03:35:33', b'1'),
	(14, 1, 17, 3, '2020-12-01 03:35:48', '2020-12-01 03:35:48', b'1'),
	(15, 1, 4, 4, '2020-12-01 03:36:11', '2020-12-01 03:36:11', b'1'),
	(16, 1, 11, 4, '2020-12-01 03:42:39', '2020-12-01 03:42:39', b'1'),
	(17, 1, 19, 3, '2020-12-01 03:42:42', '2020-12-01 03:42:42', b'1'),
	(18, 1, 9, 2, '2020-12-01 03:42:44', '2020-12-01 03:42:44', b'1'),
	(19, 1, 12, 3, '2020-12-01 03:42:46', '2020-12-01 03:42:46', b'1'),
	(20, 1, 23, 5, '2020-12-01 03:42:49', '2020-12-01 03:42:49', b'1'),
	(21, 1, 26, 5, '2020-12-01 03:42:51', '2020-12-01 03:42:51', b'1'),
	(22, 1, 20, 5, '2020-12-01 03:42:54', '2020-12-01 03:42:54', b'1'),
	(23, 1, 8, 2, '2020-12-01 03:42:56', '2020-12-01 03:42:56', b'1'),
	(24, 1, 14, 1, '2020-12-01 03:42:58', '2020-12-01 03:42:58', b'1'),
	(25, 1, 7, 3, '2020-12-01 03:43:00', '2020-12-01 03:43:00', b'1'),
	(26, 1, 22, 2, '2020-12-01 03:43:02', '2020-12-01 03:43:02', b'1'),
	(27, 5, 5, 4, '2020-12-01 03:44:32', '2020-12-01 03:44:32', b'1'),
	(28, 5, 11, 4, '2020-12-01 04:06:58', '2020-12-01 04:06:58', b'1'),
	(29, 14, 7, 4, '2020-12-01 04:09:51', '2020-12-01 04:09:51', b'1'),
	(30, 1, 10, 3, '2020-12-01 21:47:14', '2020-12-01 21:47:14', b'1'),
	(31, 1, 6, 4, '2020-12-01 21:47:16', '2020-12-01 21:47:16', b'1'),
	(32, 1, 21, 4, '2020-12-01 21:47:18', '2020-12-01 21:47:18', b'1'),
	(33, 1, 24, 3, '2020-12-01 21:47:20', '2020-12-01 21:47:20', b'1'),
	(34, 1, 25, 2, '2020-12-01 21:47:22', '2020-12-01 21:47:22', b'1'),
	(35, 1, 18, 3, '2020-12-01 21:47:23', '2020-12-01 21:47:23', b'1'),
	(36, 1, 13, 3, '2020-12-01 21:47:25', '2020-12-01 21:47:25', b'1'),
	(37, 1, 16, 5, '2020-12-01 21:47:28', '2020-12-01 21:47:28', b'1'),
	(38, 1, 5, 4, '2020-12-01 21:47:29', '2020-12-01 21:47:29', b'1'),
	(39, 1, 3, 4, '2020-12-01 21:47:31', '2020-12-01 21:47:31', b'1'),
	(40, 6, 2, 5, '2020-12-01 22:17:44', '2020-12-01 22:17:44', b'1'),
	(41, 6, 26, 5, '2020-12-01 22:17:51', '2020-12-01 22:17:51', b'1'),
	(42, 15, 23, 3, '2020-12-01 22:26:53', '2020-12-01 22:26:53', b'1');
/*!40000 ALTER TABLE `song_rate` ENABLE KEYS */;

-- Dumping structure for table what2listen.song_x_genre
CREATE TABLE IF NOT EXISTS `song_x_genre` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `id_song` int NOT NULL,
  `id_genre` int NOT NULL,
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `active` bit(1) NOT NULL DEFAULT b'1',
  PRIMARY KEY (`id`),
  KEY `id` (`id`),
  KEY `id_song` (`id_song`),
  KEY `id_genre` (`id_genre`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- Dumping data for table what2listen.song_x_genre: ~40 rows (approximately)
DELETE FROM `song_x_genre`;
/*!40000 ALTER TABLE `song_x_genre` DISABLE KEYS */;
INSERT INTO `song_x_genre` (`id`, `id_song`, `id_genre`, `created_at`, `updated_at`, `active`) VALUES
	(1, 1, 12, '2020-11-03 00:02:49', NULL, b'1'),
	(2, 1, 2, '2020-11-03 00:02:49', NULL, b'1'),
	(3, 1, 1, '2020-11-03 00:02:49', NULL, b'1'),
	(4, 2, 1, '2020-11-03 00:02:49', NULL, b'1'),
	(5, 3, 3, '2020-11-03 00:02:49', NULL, b'1'),
	(6, 4, 15, '2020-11-03 00:02:49', NULL, b'1'),
	(7, 5, 4, '2020-11-03 00:02:49', NULL, b'1'),
	(8, 5, 1, '2020-11-03 00:02:49', NULL, b'1'),
	(9, 6, 3, '2020-11-03 00:02:49', NULL, b'1'),
	(10, 6, 15, '2020-11-03 00:02:49', NULL, b'1'),
	(11, 7, 5, '2020-11-03 00:02:49', NULL, b'1'),
	(12, 8, 1, '2020-11-03 00:02:49', NULL, b'1'),
	(13, 9, 4, '2020-11-03 00:02:49', NULL, b'1'),
	(14, 9, 1, '2020-11-03 00:02:49', NULL, b'1'),
	(15, 10, 7, '2020-11-03 00:02:49', NULL, b'1'),
	(16, 10, 6, '2020-11-03 00:02:49', NULL, b'1'),
	(17, 10, 1, '2020-11-03 00:02:49', NULL, b'1'),
	(18, 11, 9, '2020-11-03 00:02:49', NULL, b'1'),
	(19, 11, 8, '2020-11-03 00:02:49', NULL, b'1'),
	(20, 11, 10, '2020-11-03 00:02:49', NULL, b'1'),
	(21, 12, 1, '2020-11-03 00:02:49', NULL, b'1'),
	(22, 13, 1, '2020-11-03 00:02:49', NULL, b'1'),
	(23, 14, 6, '2020-11-03 00:02:49', NULL, b'1'),
	(24, 14, 1, '2020-11-03 00:02:49', NULL, b'1'),
	(25, 14, 11, '2020-11-03 00:02:49', NULL, b'1'),
	(26, 15, 15, '2020-11-03 00:02:49', NULL, b'1'),
	(27, 16, 12, '2020-11-03 00:02:49', NULL, b'1'),
	(28, 17, 15, '2020-11-03 00:02:49', NULL, b'1'),
	(29, 18, 13, '2020-11-03 00:02:49', NULL, b'1'),
	(30, 18, 1, '2020-11-03 00:02:49', NULL, b'1'),
	(31, 19, 1, '2020-11-03 00:02:49', NULL, b'1'),
	(32, 19, 15, '2020-11-03 00:02:49', NULL, b'1'),
	(33, 19, 4, '2020-11-03 00:02:49', NULL, b'1'),
	(34, 20, 5, '2020-11-03 00:02:49', NULL, b'1'),
	(35, 21, 14, '2020-11-03 00:02:49', NULL, b'1'),
	(36, 22, 1, '2020-11-03 00:02:49', NULL, b'1'),
	(37, 23, 15, '2020-11-03 00:02:49', NULL, b'1'),
	(38, 24, 14, '2020-11-03 00:02:49', NULL, b'1'),
	(39, 25, 14, '2020-11-03 00:02:49', NULL, b'1'),
	(40, 26, 15, '2020-11-03 00:02:49', NULL, b'1');
/*!40000 ALTER TABLE `song_x_genre` ENABLE KEYS */;

-- Dumping structure for table what2listen.user_table
CREATE TABLE IF NOT EXISTS `user_table` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `email` varchar(200) NOT NULL,
  `password` varchar(50) NOT NULL,
  `active` bit(1) NOT NULL DEFAULT b'1',
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table what2listen.user_table: ~11 rows (approximately)
DELETE FROM `user_table`;
/*!40000 ALTER TABLE `user_table` DISABLE KEYS */;
INSERT INTO `user_table` (`id`, `username`, `email`, `password`, `active`, `created_at`, `updated_at`) VALUES
	(1, 'gusVLZ', 'gvnv.2000@gmail.com', '123456', b'1', '2020-11-08 20:30:42', '2020-11-08 20:30:42'),
	(2, 'Guizao', 'guilhermeplays@outlook.com', '123456', b'1', NULL, NULL),
	(3, 'Dog123', 'dog123@outlook.com', '123456789', b'1', '2020-11-09 00:56:43', '2020-11-09 00:56:43'),
	(4, 'Bibizao', 'gabriel.guedes07@hotmail.com', 'gubonito', b'1', '2020-11-09 01:23:49', '2020-11-09 01:23:49'),
	(5, 'cy', 'cy@cy.com', '123', b'1', '2020-11-29 04:32:30', '2020-11-29 04:32:30'),
	(6, 'Howks', 'guilhermelamana@outlook.com', '123456', b'1', '2020-11-30 00:01:12', '2020-11-30 00:01:12'),
	(9, 'Skwoh', 'guilhermelamana@outlook.com', '123456', b'1', '2020-11-30 00:11:50', '2020-11-30 00:11:50'),
	(11, 'terminamo', '', 'sapoha', b'1', '2020-12-01 03:44:57', '2020-12-01 03:44:57'),
	(12, 'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa', '22222', 'ewfwr', b'1', '2020-12-01 03:45:36', '2020-12-01 03:45:36'),
	(14, 'nei', '2@2.com', '123', b'1', '2020-12-01 04:09:02', '2020-12-01 04:09:02'),
	(15, 'anderson', 'aaaa', '123', b'1', '2020-12-01 22:26:03', '2020-12-01 22:26:03');
/*!40000 ALTER TABLE `user_table` ENABLE KEYS */;

-- Dumping structure for table what2listen.user_x_genre
CREATE TABLE IF NOT EXISTS `user_x_genre` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_user` int NOT NULL,
  `id_genre` int NOT NULL,
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `active` bit(1) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_genre` (`id_genre`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table what2listen.user_x_genre: ~43 rows (approximately)
DELETE FROM `user_x_genre`;
/*!40000 ALTER TABLE `user_x_genre` DISABLE KEYS */;
INSERT INTO `user_x_genre` (`id`, `id_user`, `id_genre`, `created_at`, `updated_at`, `active`) VALUES
	(184, 1, 9, '2020-12-01 02:46:11', '2020-12-01 02:46:11', b'1'),
	(185, 1, 5, '2020-12-01 02:46:12', '2020-12-01 02:46:12', b'1'),
	(186, 1, 1, '2020-12-01 02:51:16', '2020-12-01 02:51:16', b'1'),
	(187, 1, 2, '2020-12-01 03:44:05', '2020-12-01 03:44:05', b'1'),
	(188, 5, 1, '2020-12-01 04:06:38', '2020-12-01 04:06:38', b'1'),
	(189, 5, 3, '2020-12-01 04:06:39', '2020-12-01 04:06:39', b'1'),
	(190, 5, 5, '2020-12-01 04:06:41', '2020-12-01 04:06:41', b'1'),
	(191, 14, 5, '2020-12-01 04:09:12', '2020-12-01 04:09:12', b'1'),
	(192, 14, 14, '2020-12-01 04:09:17', '2020-12-01 04:09:17', b'1'),
	(193, 14, 1, '2020-12-01 04:09:19', '2020-12-01 04:09:19', b'1'),
	(194, 1, 3, '2020-12-01 21:47:09', '2020-12-01 21:47:09', b'1'),
	(195, 1, 4, '2020-12-01 21:47:09', '2020-12-01 21:47:09', b'1'),
	(196, 1, 6, '2020-12-01 21:47:09', '2020-12-01 21:47:09', b'1'),
	(197, 1, 7, '2020-12-01 21:47:09', '2020-12-01 21:47:09', b'1'),
	(198, 1, 8, '2020-12-01 21:47:09', '2020-12-01 21:47:09', b'1'),
	(199, 1, 10, '2020-12-01 21:47:09', '2020-12-01 21:47:09', b'1'),
	(200, 1, 11, '2020-12-01 21:47:10', '2020-12-01 21:47:10', b'1'),
	(201, 1, 12, '2020-12-01 21:47:10', '2020-12-01 21:47:10', b'1'),
	(202, 1, 13, '2020-12-01 21:47:10', '2020-12-01 21:47:10', b'1'),
	(203, 1, 14, '2020-12-01 21:47:11', '2020-12-01 21:47:11', b'1'),
	(204, 1, 15, '2020-12-01 21:47:11', '2020-12-01 21:47:11', b'1'),
	(205, 6, 1, '2020-12-01 22:17:26', '2020-12-01 22:17:26', b'1'),
	(206, 6, 2, '2020-12-01 22:17:27', '2020-12-01 22:17:27', b'1'),
	(207, 6, 3, '2020-12-01 22:17:27', '2020-12-01 22:17:27', b'1'),
	(208, 6, 5, '2020-12-01 22:17:28', '2020-12-01 22:17:28', b'1'),
	(209, 6, 8, '2020-12-01 22:17:29', '2020-12-01 22:17:29', b'1'),
	(210, 6, 7, '2020-12-01 22:17:30', '2020-12-01 22:17:30', b'1'),
	(211, 6, 11, '2020-12-01 22:17:31', '2020-12-01 22:17:31', b'1'),
	(212, 15, 2, '2020-12-01 22:26:18', '2020-12-01 22:26:18', b'1'),
	(213, 15, 1, '2020-12-01 22:26:22', '2020-12-01 22:26:22', b'1'),
	(214, 15, 7, '2020-12-01 22:26:23', '2020-12-01 22:26:23', b'1'),
	(215, 15, 3, '2020-12-01 22:35:31', '2020-12-01 22:35:31', b'1'),
	(216, 15, 5, '2020-12-01 22:35:32', '2020-12-01 22:35:32', b'1'),
	(217, 15, 8, '2020-12-01 22:35:33', '2020-12-01 22:35:33', b'1'),
	(218, 15, 10, '2020-12-01 22:35:34', '2020-12-01 22:35:34', b'1'),
	(219, 15, 12, '2020-12-01 22:35:35', '2020-12-01 22:35:35', b'1'),
	(220, 15, 14, '2020-12-01 22:35:36', '2020-12-01 22:35:36', b'1'),
	(221, 15, 15, '2020-12-01 22:35:37', '2020-12-01 22:35:37', b'1'),
	(222, 15, 13, '2020-12-01 22:35:38', '2020-12-01 22:35:38', b'1'),
	(223, 15, 11, '2020-12-01 22:35:39', '2020-12-01 22:35:39', b'1'),
	(224, 15, 9, '2020-12-01 22:35:40', '2020-12-01 22:35:40', b'1'),
	(225, 15, 6, '2020-12-01 22:35:41', '2020-12-01 22:35:41', b'1'),
	(226, 15, 4, '2020-12-01 22:35:42', '2020-12-01 22:35:42', b'1');
/*!40000 ALTER TABLE `user_x_genre` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
