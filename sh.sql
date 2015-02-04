/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50619
Source Host           : localhost:3306
Source Database       : shop_icm

Target Server Type    : MYSQL
Target Server Version : 50619
File Encoding         : 65001

Date: 2015-02-02 13:40:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for commodity
-- ----------------------------
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(255) NOT NULL,
  `sales_price` decimal(20,2) DEFAULT '0.00',
  `about` varchar(255) DEFAULT NULL,
  `path` varchar(255) DEFAULT NULL,
  `state` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for purchaseorder
-- ----------------------------
DROP TABLE IF EXISTS `purchaseorder`;
CREATE TABLE `purchaseorder` (
  `poid` int(11) NOT NULL AUTO_INCREMENT,
  `bno` varchar(255) NOT NULL,
  `spid` int(11) DEFAULT NULL,
  `sum` decimal(20,2) DEFAULT NULL,
  `poDate` datetime DEFAULT NULL,
  PRIMARY KEY (`poid`),
  UNIQUE KEY `bno_uq` (`bno`) USING HASH,
  KEY `pOrder4sp` (`spid`),
  CONSTRAINT `pOrder4sp` FOREIGN KEY (`spid`) REFERENCES `supplier` (`spid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for purchaseorderitem
-- ----------------------------
DROP TABLE IF EXISTS `purchaseorderitem`;
CREATE TABLE `purchaseorderitem` (
  `poiid` int(11) NOT NULL AUTO_INCREMENT,
  `poid` int(11) NOT NULL,
  `cid` int(11) NOT NULL,
  `num` decimal(20,3) DEFAULT NULL,
  `unitPrice` decimal(20,2) DEFAULT NULL,
  `sum` decimal(20,2) DEFAULT NULL,
  `comm` tinyblob,
  `poiDate` datetime DEFAULT NULL,
  PRIMARY KEY (`poiid`),
  KEY `poiFromComm` (`cid`),
  KEY `poi2po` (`poid`),
  CONSTRAINT `poi2po` FOREIGN KEY (`poid`) REFERENCES `purchaseorder` (`poid`),
  CONSTRAINT `poiFromComm` FOREIGN KEY (`cid`) REFERENCES `commodity` (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for refund
-- ----------------------------
DROP TABLE IF EXISTS `refund`;
CREATE TABLE `refund` (
  `rid` int(11) NOT NULL,
  `cid` int(11) NOT NULL,
  `num` decimal(10,2) DEFAULT NULL,
  `refundDate` datetime DEFAULT NULL,
  `refund` decimal(20,2) DEFAULT NULL,
  PRIMARY KEY (`rid`),
  KEY `refundComm` (`cid`),
  CONSTRAINT `refundComm` FOREIGN KEY (`cid`) REFERENCES `commodity` (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for salesorder
-- ----------------------------
DROP TABLE IF EXISTS `salesorder`;
CREATE TABLE `salesorder` (
  `soid` int(11) NOT NULL,
  `bno` varchar(255) NOT NULL,
  `poDate` date DEFAULT NULL,
  `sum` decimal(20,2) DEFAULT NULL,
  PRIMARY KEY (`soid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for salesorderitem
-- ----------------------------
DROP TABLE IF EXISTS `salesorderitem`;
CREATE TABLE `salesorderitem` (
  `soiid` int(11) NOT NULL,
  `soid` int(11) NOT NULL,
  `cid` int(11) NOT NULL,
  `num` int(11) DEFAULT NULL,
  `unitPrice` decimal(10,2) DEFAULT NULL,
  `sum` decimal(20,2) DEFAULT NULL,
  `soiDate` datetime DEFAULT NULL,
  PRIMARY KEY (`soiid`),
  KEY `soiFromComm` (`cid`),
  KEY `soi2so` (`soid`),
  CONSTRAINT `soi2so` FOREIGN KEY (`soid`) REFERENCES `salesorder` (`soid`),
  CONSTRAINT `soiFromComm` FOREIGN KEY (`cid`) REFERENCES `commodity` (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for staff
-- ----------------------------
DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff` (
  `staffid` int(11) NOT NULL,
  `uid` int(11) DEFAULT NULL,
  `sname` varchar(255) NOT NULL,
  `gender` varchar(2) NOT NULL,
  `birth` date DEFAULT NULL,
  `post` int(10) DEFAULT NULL,
  `service` tinyint(4) DEFAULT NULL,
  `salary` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`staffid`),
  KEY `u2s` (`uid`),
  CONSTRAINT `u2s` FOREIGN KEY (`uid`) REFERENCES `tuser` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for stock
-- ----------------------------
DROP TABLE IF EXISTS `stock`;
CREATE TABLE `stock` (
  `coid` int(11) NOT NULL,
  `num` int(11) NOT NULL,
  PRIMARY KEY (`coid`),
  CONSTRAINT `co4co` FOREIGN KEY (`coid`) REFERENCES `commodity` (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for supplier
-- ----------------------------
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `spid` int(11) NOT NULL AUTO_INCREMENT,
  `spname` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `contact` varchar(255) DEFAULT NULL,
  `about` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`spid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tuser
-- ----------------------------
DROP TABLE IF EXISTS `tuser`;
CREATE TABLE `tuser` (
  `uid` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `limit` tinyint(8) unsigned DEFAULT NULL,
  `staffid` int(11) DEFAULT NULL,
  PRIMARY KEY (`uid`),
  KEY `userstaff` (`staffid`),
  CONSTRAINT `userstaff` FOREIGN KEY (`staffid`) REFERENCES `staff` (`staffid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
