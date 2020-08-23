/*
Navicat MySQL Data Transfer

Source Server         : entity
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : entity

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2020-08-24 00:56:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `age` varchar(20) NOT NULL,
  `names` varchar(255) NOT NULL,
  `whether` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '测试', '1寄回', '寄回', '是');
INSERT INTO `user` VALUES ('2', '测试2', '1', '寄回', '是');
INSERT INTO `user` VALUES ('3', '测试3', '2', '寄回', '是');
INSERT INTO `user` VALUES ('4', '测试', '寄回', '寄回', '是');
INSERT INTO `user` VALUES ('5', '测试4', '寄回', '寄回', '是');
INSERT INTO `user` VALUES ('6', '测试', '寄回', '寄回', '是');
INSERT INTO `user` VALUES ('7', '测试', '寄回', '寄回', '是');
INSERT INTO `user` VALUES ('8', '测试3', '撤', '寄回', '是');
INSERT INTO `user` VALUES ('9', '测试', '2', '寄回', '是');
INSERT INTO `user` VALUES ('10', '广州店', '撤', '寄回了', '是');
INSERT INTO `user` VALUES ('11', '广州店', '撤', '寄回了', '是');
INSERT INTO `user` VALUES ('12', '罗立强', '寄回', '寄回', '是');
INSERT INTO `user` VALUES ('13', '西安', '撤', '注销', '是');
