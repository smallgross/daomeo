/*
Navicat MySQL Data Transfer

Source Server         : entity
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : entity

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2020-09-01 00:52:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'root', '123');
