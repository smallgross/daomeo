/*
Navicat MySQL Data Transfer

Source Server         : entity
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : entity

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2020-09-01 00:52:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for province
-- ----------------------------
DROP TABLE IF EXISTS `province`;
CREATE TABLE `province` (
  `name` varchar(255) NOT NULL,
  `nums` int(200) NOT NULL COMMENT '增长数值'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of province
-- ----------------------------
INSERT INTO `province` VALUES ('北京', '888888');
INSERT INTO `province` VALUES ('伤害', '33242888');
INSERT INTO `province` VALUES ('天君', '45878888');
INSERT INTO `province` VALUES ('合水', '4878888');
INSERT INTO `province` VALUES ('广州', '888888888');
INSERT INTO `province` VALUES ('天安门', '4888888');
INSERT INTO `province` VALUES ('李四', '2323');
