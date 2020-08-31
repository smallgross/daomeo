/*
Navicat MySQL Data Transfer

Source Server         : entity
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : entity

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2020-09-01 00:52:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for store
-- ----------------------------
DROP TABLE IF EXISTS `store`;
CREATE TABLE `store` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `age` varchar(20) NOT NULL,
  `names` varchar(255) NOT NULL,
  `whether` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of store
-- ----------------------------
INSERT INTO `store` VALUES ('1', '测试', '1寄回', '寄回', '否');
INSERT INTO `store` VALUES ('2', '测试2', '撤了', '寄回', '否');
INSERT INTO `store` VALUES ('3', '测试3', '2', '寄回124', '是');
INSERT INTO `store` VALUES ('4', '测试', '寄回', '寄回', '是');
INSERT INTO `store` VALUES ('5', '测试4', '寄回', '寄回', '是');
INSERT INTO `store` VALUES ('6', '测试', '寄回', '寄回', '是');
INSERT INTO `store` VALUES ('7', '测试', '寄回', '寄回', '是');
INSERT INTO `store` VALUES ('8', '测试3', '撤', '寄回', '是');
INSERT INTO `store` VALUES ('9', '测试', '2', '寄回', '是');
INSERT INTO `store` VALUES ('10', '广州店', '撤', '寄回了', '是');
INSERT INTO `store` VALUES ('11', '广州店', '撤', '寄回了', '是');
INSERT INTO `store` VALUES ('12', '', '寄回', '寄回', '是');
INSERT INTO `store` VALUES ('13', '安', '撤', '注销', '是');
INSERT INTO `store` VALUES ('14', '', '', '', '是');
