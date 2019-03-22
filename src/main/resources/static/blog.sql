CREATE DATABASE  IF NOT EXISTS `sjk` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `sjk`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: sjk
-- ------------------------------------------------------
-- Server version	5.6.40-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `blog_idauto`
--

DROP TABLE IF EXISTS `blog_idauto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `blog_idauto` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blog_idauto`
--

LOCK TABLES `blog_idauto` WRITE;
/*!40000 ALTER TABLE `blog_idauto` DISABLE KEYS */;
INSERT INTO `blog_idauto` VALUES (35);
/*!40000 ALTER TABLE `blog_idauto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `isbn` varchar(45) DEFAULT NULL,
  `anthor` varchar(45) DEFAULT NULL,
  `author` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (1,'1','1','1',''),(2,'2','2','2',''),(3,NULL,NULL,NULL,''),(4,NULL,NULL,NULL,''),(5,NULL,NULL,NULL,''),(6,NULL,NULL,NULL,''),(7,NULL,NULL,NULL,''),(8,NULL,NULL,NULL,''),(9,NULL,NULL,NULL,''),(10,NULL,NULL,NULL,''),(11,NULL,NULL,NULL,'');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `classcount`
--

DROP TABLE IF EXISTS `classcount`;
/*!50001 DROP VIEW IF EXISTS `classcount`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `classcount` AS SELECT 
 1 AS `classname`,
 1 AS `totalcount`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `comment_idauto`
--

DROP TABLE IF EXISTS `comment_idauto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comment_idauto` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment_idauto`
--

LOCK TABLES `comment_idauto` WRITE;
/*!40000 ALTER TABLE `comment_idauto` DISABLE KEYS */;
INSERT INTO `comment_idauto` VALUES (32);
/*!40000 ALTER TABLE `comment_idauto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guest_idauto`
--

DROP TABLE IF EXISTS `guest_idauto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `guest_idauto` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guest_idauto`
--

LOCK TABLES `guest_idauto` WRITE;
/*!40000 ALTER TABLE `guest_idauto` DISABLE KEYS */;
INSERT INTO `guest_idauto` VALUES (9);
/*!40000 ALTER TABLE `guest_idauto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (3);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seq_oa_person`
--

DROP TABLE IF EXISTS `seq_oa_person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `seq_oa_person` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seq_oa_person`
--

LOCK TABLES `seq_oa_person` WRITE;
/*!40000 ALTER TABLE `seq_oa_person` DISABLE KEYS */;
INSERT INTO `seq_oa_person` VALUES (170009);
/*!40000 ALTER TABLE `seq_oa_person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_blog`
--

DROP TABLE IF EXISTS `tb_blog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_blog` (
  `blogid` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) NOT NULL,
  `blogtitle` varchar(45) DEFAULT NULL,
  `blogcontent` longtext,
  `blogdate` varchar(45) DEFAULT NULL,
  `blogimg` varchar(45) DEFAULT NULL,
  `classname` varchar(45) DEFAULT NULL,
  `looknum` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`blogid`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_blog`
--

LOCK TABLES `tb_blog` WRITE;
/*!40000 ALTER TABLE `tb_blog` DISABLE KEYS */;
INSERT INTO `tb_blog` VALUES (1,170001,'陌上花开，可缓缓归矣1','昨晚上做梦了，我本不想记下，可是又怕这种似乎有点真实的感觉就这样溜走，枕头湿了...我也记不得我是在梦中哭过还是...... &shy;在一个小餐馆，男孩叫了一份鱼香茄子、麻婆...','18-12-02/22:21','/images/1.jpg','每日一说',NULL),(2,170002,'最后的午餐','昨晚上做梦了，我本不想记下，可是又怕这种似乎有点真实的感觉就这样溜走，枕头湿了...我也记不得我是在梦中哭过还是...... &shy;在一个小餐馆，男孩叫了一份鱼香茄子、麻婆...','18-12-02/22:25','/images/2.jpg','每日一说',NULL),(3,170003,'丢掉心结，重拾自己','昨晚上做梦了，我本不想记下，可是又怕这种似乎有点真实的感觉就这样溜走，枕头湿了...我也记不得我是在梦中哭过还是...... &shy;在一个小餐馆，男孩叫了一份鱼香茄子、麻婆...','18-12-02/22:25','/images/3.jpg','每日一说',NULL),(4,170003,'你是什么人便会遇上什么人','昨晚上做梦了，我本不想记下，可是又怕这种似乎有点真实的感觉就这样溜走，枕头湿了...我也记不得我是在梦中哭过还是...... &shy;在一个小餐馆，男孩叫了一份鱼香茄子、麻婆...','18-12-02/22:25','/images/4.jpg','每日一说',NULL),(10,170001,'陌上花开，可缓缓归矣2','有时就为了一句狠话，像心头一口毒钉，永远麻痺着亲密感情交流。恶言，真要慎出，平日多誠心爱语，乃最简易之佈施。','18-01-02/22:25','/images/5.jpg','每日一说',NULL),(11,170001,'最后的午餐','爱情没有永远，地老天荒也走不完，生命终结的末端，苦短情长。站在岁月的边端，那些美丽的定格，心伤的绝恋，都被四季的掩埋，一去不返。徒剩下这荒芜的花好月圆，一路相随，流离天涯背负了谁的思念？','18-11-02/22:25','/images/6.jpg','那年今日',NULL),(12,170001,'丢掉心结，重拾自己','昨晚上做梦了，我本不想记下，可是又怕这种似乎有点真实的感觉就这样溜走，枕头湿了...我也记不得我是在梦中哭过还是...... &shy;在一个小餐馆，男孩叫了一份鱼香茄子、麻婆...','18-12-01/22:25','/images/7.jpg','那年今日',NULL),(13,170002,'丢掉心结，重拾自己','昨晚上做梦了，我本不想记下，可是又怕这种似乎有点真实的感觉就这样溜走，枕头湿了...我也记不得我是在梦中哭过还是...... &shy;在一个小餐馆，男孩叫了一份鱼香茄子、麻婆...','18-12-02/22:25','/images/8.jpg','那年今日',NULL),(14,170002,'丢掉心结，重拾自己','昨晚上做梦了，我本不想记下，可是又怕这种似乎有点真实的感觉就这样溜走，枕头湿了...我也记不得我是在梦中哭过还是...... &shy;在一个小餐馆，男孩叫了一份鱼香茄子、麻婆...','18-12-02/22:25','/images/9.jpg','那年今日',NULL),(21,170001,'你是什么人便会遇上什么人','还在为浪漫的求婚词而烦恼不知道该怎么说吗？女孩子都有着浪漫的小情怀，对于求婚更是抱着满满的浪漫期待，也希望在求婚那一天对方可以给自己一个最浪漫的求婚词。','18-10-02/22:25','/images/11.jpg','那年今日',NULL),(22,170001,'擦肩而过','《擦肩而过》文/清河鱼 编绘/天朝羽打开一扇窗，我不曾把你想得平常。看季节一一过往。你停留的那个地方，是否依然花儿开放？在夜里守靠着梦中的，想那仿佛前世铭刻进心肠的','18-02-02/22:25','/images/12.jpg','每日一说',NULL),(28,170001,'最后的午餐','<p><span style=\"font-family: &quot;Microsoft YaHei&quot;, Arial, Helvetica, sans-serif; font-size: 15px; background-color: rgba(255, 255, 255, 0.8); color: rgb(251, 213, 181);\">爱情没有永远，地老天荒也走不完，生命终结的末端，苦短情长。站在岁月的边端，那些美丽的定格，心伤的绝恋，都被四季的掩埋，一去不返。徒剩下这荒芜的花好月圆，一路相随，流离天涯背负了谁的思念？</span></p>','18-12-02/22:25','/images/12.jpg','每日一说',NULL),(31,170001,'你是什么人便会遇上什么人','<p>我遇上了世界上最傻最可爱的大鑫鑫</p>','18-12-03/19:56','/images/1.jpg','那年今日',NULL),(32,170001,'陌上花开','<p>陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开陌上花开</p>','18-12-03/19:57','/images/1.jpg','那年今日',NULL);
/*!40000 ALTER TABLE `tb_blog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_class`
--

DROP TABLE IF EXISTS `tb_class`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_class` (
  `classid` int(11) NOT NULL,
  `classtype` int(1) DEFAULT NULL,
  `classname` varchar(45) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  PRIMARY KEY (`classid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_class`
--

LOCK TABLES `tb_class` WRITE;
/*!40000 ALTER TABLE `tb_class` DISABLE KEYS */;
INSERT INTO `tb_class` VALUES (1,1,'每日一说',170001),(2,1,'那年今日',170001),(3,1,'每日一说',170002),(4,1,'那年今日',170002),(5,1,'每日一说',170003),(6,1,'那年今日',170003);
/*!40000 ALTER TABLE `tb_class` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_comment`
--

DROP TABLE IF EXISTS `tb_comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_comment` (
  `comtid` int(11) NOT NULL AUTO_INCREMENT,
  `blogid` int(11) DEFAULT NULL,
  `comtdate` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `comtcontent` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  `replyuserid` int(11) DEFAULT NULL,
  PRIMARY KEY (`comtid`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_comment`
--

LOCK TABLES `tb_comment` WRITE;
/*!40000 ALTER TABLE `tb_comment` DISABLE KEYS */;
INSERT INTO `tb_comment` VALUES (1,1,'2018-9-3','hello',170001,NULL),(2,1,'2018-9-3','hello',170002,170001),(3,2,'2018-9-4','hello boy',170002,NULL),(4,2,'2018-10-3','hello girl',170001,170002),(8,1,'2018-1-1','nihao',170001,170002),(30,32,'18-12-16/14:54','123',170001,NULL),(31,32,'18-12-16/14:56','123',170001,NULL);
/*!40000 ALTER TABLE `tb_comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_gallery`
--

DROP TABLE IF EXISTS `tb_gallery`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_gallery` (
  `galleryid` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) NOT NULL,
  `desc` varchar(45) DEFAULT NULL,
  `cover` varchar(45) DEFAULT NULL,
  `looknum` varchar(45) DEFAULT NULL,
  `classname` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`galleryid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_gallery`
--

LOCK TABLES `tb_gallery` WRITE;
/*!40000 ALTER TABLE `tb_gallery` DISABLE KEYS */;
INSERT INTO `tb_gallery` VALUES (1,170001,'别让这些闹心的套路，毁了你的网页设计!','/images/1.jpg','12','自拍'),(2,170001,'陌上花开，可缓缓归矣','/images/2.jpg','23','风景'),(3,170001,'别让这些闹心的套路，毁了你的网页设计!','/images/3.jpg','12','自拍'),(4,170001,'陌上花开，可缓缓归矣','/images/4.jpg','11','风景'),(5,170002,'别让这些闹心的套路，毁了你的网页设计!','/images/5.jpg','24','风景'),(6,170002,'陌上花开，可缓缓归矣','/images/6.jpg','1','自拍'),(7,170002,'别让这些闹心的套路，毁了你的网页设计!','/images/7.jpg','2','自拍'),(8,170001,'陌上花开，可缓缓归矣','/images/8.jpg','3','风景'),(9,170001,'别让这些闹心的套路，毁了你的网页设计!','/images/9.jpg','4','风景');
/*!40000 ALTER TABLE `tb_gallery` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_guest`
--

DROP TABLE IF EXISTS `tb_guest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_guest` (
  `guestid` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) DEFAULT NULL,
  `gcontent` longtext,
  `date` varchar(45) DEFAULT NULL,
  `touserid` int(11) DEFAULT NULL,
  `reply` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`guestid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_guest`
--

LOCK TABLES `tb_guest` WRITE;
/*!40000 ALTER TABLE `tb_guest` DISABLE KEYS */;
INSERT INTO `tb_guest` VALUES (2,170002,'你好，明天','2018-9-1',170001,'你好！'),(4,170002,'123','18-12-04/19:49',170002,NULL),(5,170002,'123','18-12-04/19:49',170002,NULL),(6,170002,'123','18-12-04/19:49',170002,NULL),(8,170001,'123','18-12-09/18:33',170001,NULL);
/*!40000 ALTER TABLE `tb_guest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_photo`
--

DROP TABLE IF EXISTS `tb_photo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_photo` (
  `photoid` int(11) NOT NULL AUTO_INCREMENT,
  `photo` varchar(45) DEFAULT NULL,
  `photodesc` varchar(45) DEFAULT NULL,
  `galleryid` int(11) DEFAULT NULL,
  PRIMARY KEY (`photoid`)
) ENGINE=InnoDB AUTO_INCREMENT=1235 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_photo`
--

LOCK TABLES `tb_photo` WRITE;
/*!40000 ALTER TABLE `tb_photo` DISABLE KEYS */;
INSERT INTO `tb_photo` VALUES (1,'/images/1.jpg','《古剑》小师妹迪丽热巴清新写真宛若小仙女',1),(2,'/images/12.jpg','《古剑》小师妹迪丽热巴清新写真宛若小仙女',1),(3,'/images/2.jpg','《古剑》小师妹迪丽热巴清新写真宛若小仙女',3),(4,'/images/3.jpg','《古剑》小师妹迪丽热巴清新写真宛若小仙女',3),(5,'/images/4.jpg','《古剑》小师妹迪丽热巴清新写真宛若小仙女',3),(6,'/images/5.jpg','《古剑》小师妹迪丽热巴清新写真宛若小仙女',1),(7,'/images/6.jpg','《古剑》小师妹迪丽热巴清新写真宛若小仙女',1),(8,'/images/7.jpg','《古剑》小师妹迪丽热巴清新写真宛若小仙女',1),(9,'/images/2.jpg','《古剑》小师妹迪丽热巴清新写真宛若小仙女',2),(12,'/images/4.jpg','《古剑》小师妹迪丽热巴清新写真宛若小仙女',2),(13,'/images/6.jpg','《古剑》小师妹迪丽热巴清新写真宛若小仙女',2),(14,'/images/12.jpg','《古剑》小师妹迪丽热巴清新写真宛若小仙女',2),(1234,'http://localhost:8084/qi2.jpg',NULL,NULL);
/*!40000 ALTER TABLE `tb_photo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_user`
--

DROP TABLE IF EXISTS `tb_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `nickname` varchar(45) DEFAULT NULL,
  `password` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `phone` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `userimg` varchar(45) CHARACTER SET latin1 DEFAULT 'upload/user.png',
  `age` int(11) DEFAULT NULL,
  `sex` varchar(45) DEFAULT '男',
  `address` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=170038 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_user`
--

LOCK TABLES `tb_user` WRITE;
/*!40000 ALTER TABLE `tb_user` DISABLE KEYS */;
INSERT INTO `tb_user` VALUES (170001,'hanhong','韩红','7a4917eb7c5227fde336ab6d82cf2df9','110','upload/user.png',23,'女',NULL),(170002,'wangqiang','王强','80517666206d5bae23c2d43affd697dd','120','upload/user.png',32,'男',NULL),(170003,'skt','张晓军','3c6f287ec524d5c4d1b8254028da11f8','120','upload/user.png',32,'男',NULL),(170004,'halou','王丽丽','01d0476ed41290c298a6e3c46e27432c','136','upload/user.png',25,'女',NULL),(170005,'斗鱼',NULL,'douyu','123',NULL,NULL,NULL,NULL),(170037,'asd','123','3190ba9171534f90b435d7d1cf770ffa',NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `tb_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_visitor`
--

DROP TABLE IF EXISTS `tb_visitor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_visitor` (
  `visitorid` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  `item` varchar(45) DEFAULT NULL,
  `touserid` int(11) DEFAULT NULL,
  PRIMARY KEY (`visitorid`)
) ENGINE=InnoDB AUTO_INCREMENT=458 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_visitor`
--

LOCK TABLES `tb_visitor` WRITE;
/*!40000 ALTER TABLE `tb_visitor` DISABLE KEYS */;
INSERT INTO `tb_visitor` VALUES (224,170003,'18-12-02/23:01','blog',170001),(417,170002,'18-12-09/18:26','blog',170001),(441,170001,'18-12-11/08:36','blog',170005),(455,170001,'18-12-11/09:08','blog',170003),(457,170001,'18-12-11/09:08','blog',170002);
/*!40000 ALTER TABLE `tb_visitor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tp_address`
--

DROP TABLE IF EXISTS `tp_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tp_address` (
  `address_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `add_info` varchar(255) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tp_address`
--

LOCK TABLES `tp_address` WRITE;
/*!40000 ALTER TABLE `tp_address` DISABLE KEYS */;
/*!40000 ALTER TABLE `tp_address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `typecount`
--

DROP TABLE IF EXISTS `typecount`;
/*!50001 DROP VIEW IF EXISTS `typecount`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `typecount` AS SELECT 
 1 AS `classname`,
 1 AS `userid`,
 1 AS `totalCount`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `user_idauto`
--

DROP TABLE IF EXISTS `user_idauto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_idauto` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_idauto`
--

LOCK TABLES `user_idauto` WRITE;
/*!40000 ALTER TABLE `user_idauto` DISABLE KEYS */;
INSERT INTO `user_idauto` VALUES (170038);
/*!40000 ALTER TABLE `user_idauto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `view_comment`
--

DROP TABLE IF EXISTS `view_comment`;
/*!50001 DROP VIEW IF EXISTS `view_comment`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `view_comment` AS SELECT 
 1 AS `comtid`,
 1 AS `userid`,
 1 AS `replyuserid`,
 1 AS `comtdate`,
 1 AS `comtcontent`,
 1 AS `username`,
 1 AS `userimg`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `visitor_idauto`
--

DROP TABLE IF EXISTS `visitor_idauto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `visitor_idauto` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `visitor_idauto`
--

LOCK TABLES `visitor_idauto` WRITE;
/*!40000 ALTER TABLE `visitor_idauto` DISABLE KEYS */;
INSERT INTO `visitor_idauto` VALUES (458);
/*!40000 ALTER TABLE `visitor_idauto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `classcount`
--

/*!50001 DROP VIEW IF EXISTS `classcount`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `classcount` AS select `tb_class`.`classname` AS `classname`,(select count(0) from `tb_blog` where (`tb_class`.`classname` = `tb_blog`.`classname`)) AS `totalcount` from `tb_class` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `typecount`
--

/*!50001 DROP VIEW IF EXISTS `typecount`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `typecount` AS select `tb_class`.`classname` AS `classname`,`tb_class`.`userid` AS `userid`,(select count(0) from `tb_blog` where ((`tb_class`.`classname` = `tb_blog`.`classname`) and (`tb_class`.`userid` = `tb_blog`.`userid`))) AS `totalCount` from `tb_class` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `view_comment`
--

/*!50001 DROP VIEW IF EXISTS `view_comment`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `view_comment` AS select `tb_comment`.`comtid` AS `comtid`,`tb_comment`.`userid` AS `userid`,`tb_comment`.`replyuserid` AS `replyuserid`,`tb_comment`.`comtdate` AS `comtdate`,`tb_comment`.`comtcontent` AS `comtcontent`,`tb_user`.`username` AS `username`,`tb_user`.`userimg` AS `userimg` from (`tb_comment` join `tb_user` on((`tb_comment`.`userid` = `tb_user`.`userid`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-03-18 22:29:37
