﻿/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.7.21-log : Database - user_message
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`user_message` /*!40100 DEFAULT CHARACTER SET utf8 */;

/*Table structure for table `user_message` */

DROP TABLE IF EXISTS `user_message`;

CREATE TABLE `user_message` (
  `user_name` varchar(10) NOT NULL COMMENT '用户名',
  `user_id` int(10) NOT NULL COMMENT '用户学号',
  `password` varchar(6) NOT NULL COMMENT '用户密码',
  `e_mail` varchar(50) NOT NULL COMMENT '用户邮箱',
  `sex` char(2) DEFAULT NULL COMMENT '用户性别',
  `phone_number` bigint(11) DEFAULT NULL COMMENT '用户手机号',
  `major` varchar(50) DEFAULT NULL COMMENT '用户专业',
  `class_number` int(8) DEFAULT NULL COMMENT '用户班级',
  `study_direction` varchar(10) DEFAULT NULL COMMENT '学习方向',
  `age` int(3) DEFAULT NULL COMMENT '用户年龄',
  `birth` date DEFAULT NULL COMMENT '用户年龄',
  `state` int(1) NOT NULL DEFAULT '0' COMMENT '用户状态',
  `label_info` varchar(50) DEFAULT '这人真懒！！什么都没留下......',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `e_mail_index` (`e_mail`),
  UNIQUE KEY `phone_number_index` (`phone_number`),
  KEY `password_index` (`password`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
