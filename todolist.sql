/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : todolist

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 08/12/2021 23:34:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for task
-- ----------------------------
DROP TABLE IF EXISTS `task`;
CREATE TABLE `task`  (
  `Id` int NOT NULL,
  `Name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `UserId` int NOT NULL,
  `TaskListId` int NOT NULL,
  `Description` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `StartTime` datetime NULL DEFAULT NULL,
  `EndTime` datetime NULL DEFAULT NULL,
  `State` int NOT NULL,
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of task
-- ----------------------------
INSERT INTO `task` VALUES (2, '吃饭', 3, 2, 'hello', '2021-11-12 00:00:00', '2021-11-13 00:00:00', 1);
INSERT INTO `task` VALUES (3, '跑步50000米', 1, 1, '跑步100m', '2021-12-08 13:57:44', '3922-01-30 14:19:35', 1);

-- ----------------------------
-- Table structure for tasklist
-- ----------------------------
DROP TABLE IF EXISTS `tasklist`;
CREATE TABLE `tasklist`  (
  `Id` int NOT NULL,
  `Name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `UserId` int NOT NULL,
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tasklist
-- ----------------------------
INSERT INTO `tasklist` VALUES (1, '工作', 1);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `Id` int NOT NULL,
  `Name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '张三', '123456');
INSERT INTO `user` VALUES (2, '李四', '123456');
INSERT INTO `user` VALUES (3, 'lucy', '111111');
INSERT INTO `user` VALUES (4, 'Mike', '111111');
INSERT INTO `user` VALUES (5, '王五', '123456');
INSERT INTO `user` VALUES (6, 'Didi', '111111');

SET FOREIGN_KEY_CHECKS = 1;
