/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50548
Source Host           : localhost:3306
Source Database       : mymaven

Target Server Type    : MYSQL
Target Server Version : 50548
File Encoding         : 65001

Date: 2018-08-29 00:04:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'admin', 'admin', '2018-08-28 23:05:20');
INSERT INTO `t_user` VALUES ('2', 'user', 'user', '2018-08-08 23:05:34');
