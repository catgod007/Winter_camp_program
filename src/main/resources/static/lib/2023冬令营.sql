/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50712
 Source Host           : localhost:3306
 Source Schema         : tem7

 Target Server Type    : MySQL
 Target Server Version : 50712
 File Encoding         : 65001

 Date: 25/01/2024 17:59:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin_info
-- ----------------------------
DROP TABLE IF EXISTS `admin_info`;
CREATE TABLE `admin_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '管理员的唯一标识',
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员的用户名',
  `userpass` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员的密码',
  `nickname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员的昵称',
  `role_id` bigint(50) NULL DEFAULT NULL COMMENT '管理员的角色ID',
  `sex` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员的性别',
  `phone` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员的手机号码',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员的邮箱地址',
  `head_img` varchar(10000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '/img/a.jpg' COMMENT '管理员头像',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 32 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'headImg' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin_info
-- ----------------------------
INSERT INTO `admin_info` VALUES (1, 'admin1', '1234', 'Admin1', 1, '男', '17211112222', 'admin1@example.com', '/img/a.jpg');
INSERT INTO `admin_info` VALUES (3, 'admin3', '33', 'Admin3', 3, '女', '33', 'admin3@example.com', '/img/img1705936549227.gif');
INSERT INTO `admin_info` VALUES (4, 'admin4', '1234', 'Admin4', 1, '女', '13656746856', 'admin4@example.com', '/img/a.jpg');
INSERT INTO `admin_info` VALUES (5, '大大怪', '1234', 'Admin5', 2, '男', '15849806785', 'admin5@example.com', '/img/a.jpg');
INSERT INTO `admin_info` VALUES (6, '花花', '1234', 'Admin6', 3, '女', '13567283726', 'admin6@example.com', '/img/a.jpg');
INSERT INTO `admin_info` VALUES (7, '勇敢超超', '1234', 'Admin7', 1, '女', '19257845684', 'admin7@example.com', '/img/a.jpg');
INSERT INTO `admin_info` VALUES (8, 'admin8', '1234', 'Admin8', 2, '男', '13846754487', 'admin8@example.com', '/img/a.jpg');
INSERT INTO `admin_info` VALUES (9, '杰杰无敌', '1234', 'Admin9', 3, '女', '15146893453', 'admin9@example.com', '/img/a.jpg');
INSERT INTO `admin_info` VALUES (10, '菜菜捞捞', '1234', 'Admin10', 1, '男', '15856211236', 'admin10@example.com', '/img/a.jpg');
INSERT INTO `admin_info` VALUES (12, '张三', '1234', 'Admin12', 3, '男', '18936726452', 'admin12@example.com', '/img/a.jpg');
INSERT INTO `admin_info` VALUES (13, '李四', '1234', 'Admin13', 1, '女', '17728938274', 'admin13@example.com', '/img/a.jpg');
INSERT INTO `admin_info` VALUES (14, '花花', '1234', 'Admin11', 2, '女', '13567283726', 'admin11@example.com', '/img/a.jpg');
INSERT INTO `admin_info` VALUES (15, '测试者', '11', 'Admin11', 2, '女', '11', 'admin11@example.com', '/img/img1705936493203.jpg');
INSERT INTO `admin_info` VALUES (16, '花花', '1234', 'Admin11', 2, '女', '13567283726', 'admin11@example.com', '/img/a.jpg');
INSERT INTO `admin_info` VALUES (17, '花花', '1234', 'Admin11', 2, '女', '13567283726', 'admin11@example.com', '/img/a.jpg');
INSERT INTO `admin_info` VALUES (18, '花花', '1234', 'Admin11', 2, '女', '13567283726', 'admin11@example.com', '/img/a.jpg');
INSERT INTO `admin_info` VALUES (19, '花花', '1234', 'Admin11', 2, '女', '13567283726', 'admin11@example.com', '/img/a.jpg');
INSERT INTO `admin_info` VALUES (20, '花花', '1234', 'Admin11', 2, '女', '13567283726', 'admin11@example.com', '/img/a.jpg');
INSERT INTO `admin_info` VALUES (21, '花花', '1234', 'Admin11', 2, '女', '13567283726', 'admin11@example.com', '/img/a.jpg');
INSERT INTO `admin_info` VALUES (31, '小小怪', '888888', '将军', 5, '女', '+8613512324574', '2337563298@qq.com', '/img/a.jpg');

-- ----------------------------
-- Table structure for courses
-- ----------------------------
DROP TABLE IF EXISTS `courses`;
CREATE TABLE `courses`  (
  `id` int(11) NOT NULL,
  `CourseName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `place` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `lessonType` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `credit` int(11) NOT NULL,
  `Techaerld` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of courses
-- ----------------------------

-- ----------------------------
-- Table structure for role_info
-- ----------------------------
DROP TABLE IF EXISTS `role_info`;
CREATE TABLE `role_info`  (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `rolename` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `roleremark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role_info
-- ----------------------------
INSERT INTO `role_info` VALUES (1, '超级管理员', '管理所有');
INSERT INTO `role_info` VALUES (2, '学生管理员', '学生');
INSERT INTO `role_info` VALUES (3, '课程管理员', '管理课程');
INSERT INTO `role_info` VALUES (4, '菜单管理员', '管理菜单页面');
INSERT INTO `role_info` VALUES (5, '教师管理员', '教师');
INSERT INTO `role_info` VALUES (6, '家长管理员', '学生家长');

-- ----------------------------
-- Table structure for roledandmenuld
-- ----------------------------
DROP TABLE IF EXISTS `roledandmenuld`;
CREATE TABLE `roledandmenuld`  (
  `roleId` bigint(20) NOT NULL,
  `menuId` bigint(20) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of roledandmenuld
-- ----------------------------
INSERT INTO `roledandmenuld` VALUES (1, 101);
INSERT INTO `roledandmenuld` VALUES (1, 102);
INSERT INTO `roledandmenuld` VALUES (2, 101);
INSERT INTO `roledandmenuld` VALUES (3, 103);

-- ----------------------------
-- Table structure for student_info
-- ----------------------------
DROP TABLE IF EXISTS `student_info`;
CREATE TABLE `student_info`  (
  `stu_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一标识',
  `username` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学生的姓名',
  `id` int(50) NULL DEFAULT NULL COMMENT '学生的学号',
  `sex` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学生的性别',
  `birthday` date NULL DEFAULT NULL COMMENT '学生的出生日期',
  `phone` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学生的电话号码',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学生的邮箱',
  `address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学生的家庭住址',
  `note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学生的备注信息',
  `status` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学生的状态',
  `level_id` int(11) NULL DEFAULT NULL COMMENT '学生的入学时间',
  `createtime` timestamp NULL DEFAULT '0000-00-00 00:00:00' COMMENT '学生信息的创建时间',
  `role_id` int(11) NULL DEFAULT NULL COMMENT '学生的角色标识',
  PRIMARY KEY (`stu_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 31 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student_info
-- ----------------------------
INSERT INTO `student_info` VALUES (2, '111', 2023003, '男', '2024-01-10', '13673278324234', 'example3@email.com', '广州市天河区品牌', '优秀学生干部', '在读', 2021, '2021-11-07 00:00:00', 2);
INSERT INTO `student_info` VALUES (3, '王琦', 2023004, '男', '2002-01-01', '13673224323', 'example4@email.com', '重庆市合川区', '优秀团支书', '在读', 2022, '2022-11-05 00:00:00', 2);
INSERT INTO `student_info` VALUES (4, '李莉莉', 2023005, '女', '2002-01-06', '19337842983', 'example5@email.com', '重庆市北碚区', '三好学生', '在读', 2022, '2022-11-09 00:00:00', 2);
INSERT INTO `student_info` VALUES (5, '白艳丽', 2023006, '女', '2002-07-20', '18234567823', 'example6@email.com', '重庆市渝北区', '优秀班干部', '在读', 2022, '2022-12-07 00:00:00', 2);
INSERT INTO `student_info` VALUES (6, '包春华22', 2023007, '男', '2024-01-20', '18247525788', 'example7@email.com', '重庆市江北区', '优秀学生', '在读', 2022, '2022-08-07 00:00:00', 2);
INSERT INTO `student_info` VALUES (7, '李阳', 2023008, '男', '2002-01-20', '19037845729', 'example8@email.com', '贵州贵阳', '学生', '在读', 2022, '2022-09-07 00:00:00', 2);
INSERT INTO `student_info` VALUES (8, '杨雯', 2023009, '女', '2002-01-14', '13673325435', 'example9@email.com', '江西南昌', '三好学生', '在读', 2022, '2022-10-07 00:00:00', 2);
INSERT INTO `student_info` VALUES (9, '王亮', 20230010, '男', '2002-03-18', '18364728483', 'example10@email.com', '河北石家庄', '特长生', '在读', 2022, '2022-11-13 00:00:00', 2);
INSERT INTO `student_info` VALUES (27, '叔叔', 2023888, '男', '2024-01-31', '1888888888', 'example@email.com', '重庆市西站', '', NULL, 2020, '0000-00-00 00:00:00', NULL);
INSERT INTO `student_info` VALUES (28, '包春华', 2023666, '女', '2024-01-25', '18247525788', 'example7@email.com', '重庆市巴南区', '呃呃发给大大撒打发时光的对方撒啊大反攻撒大苏打反对法实打实的分别达到VS大苏打发大苏打水水v幅度稍大', NULL, NULL, '0000-00-00 00:00:00', NULL);
INSERT INTO `student_info` VALUES (29, '叔叔88', 2023666, '男', '2024-01-24', '1888888888', 'example7@email.com', '重庆市巴南区', '22222', NULL, 2023, '0000-00-00 00:00:00', NULL);
INSERT INTO `student_info` VALUES (30, '包春华11', 2023667, '男', '2024-01-22', '13800138000', 'example@email.com', '广州市天河区品牌', '111', NULL, 2033, '0000-00-00 00:00:00', NULL);

-- ----------------------------
-- Table structure for teacher_info
-- ----------------------------
DROP TABLE IF EXISTS `teacher_info`;
CREATE TABLE `teacher_info`  (
  `Id` int(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `sex` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `birthday` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '出生日期',
  `grade` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学历',
  `rank` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '职称',
  `jobDate` timestamp NULL DEFAULT '0000-00-00 00:00:00' COMMENT '入职日期',
  `collage` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属院校',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `phone` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `role_id` bigint(20) NULL DEFAULT NULL COMMENT '角色ID',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '教师' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher_info
-- ----------------------------
INSERT INTO `teacher_info` VALUES (1, '123', '女', NULL, '研究生123', '高级工程师', NULL, '123', NULL, '135234321232', 5);
INSERT INTO `teacher_info` VALUES (2, '李老师', '男', '2024-01-20 15:25:41', '研究生', '初级工程师', '2015-06-25 15:30:00', '清华大学', 'password456', '13800138001', 2);
INSERT INTO `teacher_info` VALUES (3, '王老师', '男', '2024-01-20 15:25:50', '研究生', '初级工程师', '2018-12-31 23:59:59', '复旦大学', 'password789', '13800138002', 3);
INSERT INTO `teacher_info` VALUES (4, '赵老师', '女', '2024-01-20 15:25:34', '本科', '高级工程师', '2022-07-25 18:25:43', '浙江大学', 'passwordabc', '13800138003', 4);
INSERT INTO `teacher_info` VALUES (5, '钱老师', '男', '2024-01-20 15:25:31', '本科', '高级工程师', '2021-12-31 23:59:59', '上海交通大学', 'passworddef', '13800138004', 5);
INSERT INTO `teacher_info` VALUES (6, '孙老师', '男', '2024-01-20 15:25:30', '本科', '高级工程师', '2023-07-25 18:25:43', '南京大学', 'passwordghi', '13800138005', 6);
INSERT INTO `teacher_info` VALUES (7, '周老师', '女', '2024-01-20 15:25:55', '研究生', '中级工程师', '2024-06-25 15:30:00', '中山大学', 'passwordjkl', '13800138006', 7);
INSERT INTO `teacher_info` VALUES (8, '吴老师', '女', '2024-01-20 15:25:28', '研究生', '高级工程师', '2025-12-31 23:59:59', '武汉大学', 'passwordmno', '13800138007', 8);
INSERT INTO `teacher_info` VALUES (12, '杨老师', '女', '2024-01-20 15:25:27', '研究生', '高级工程师', '2023-08-25 14:25:43', '北京师范大学', 'password5678', '13800138011', 6);
INSERT INTO `teacher_info` VALUES (14, '蒋老师', '男', '2024-01-20 15:25:59', '研究生', '中级工程师', '2024-02-25 14:25:43', '上海财经大学', 'passwordcdfe', '13800138013', 9);
INSERT INTO `teacher_info` VALUES (15, '侯老师', '男', '2024-01-20 15:25:25', '研究生', '高级工程师', '2022-12-31 23:59:59', '中国人民大学', 'passwordghij', '13800138014', 4);
INSERT INTO `teacher_info` VALUES (16, '韩老师', '女', '2024-01-20 15:25:24', '研究生', '高级工程师', '2026-07-25 18:25:43', '同济大学', 'passwordklmn', '13800138015', 7);
INSERT INTO `teacher_info` VALUES (17, '谢老师', '男', '2024-01-20 15:25:23', '研究生', '高级工程师', '2027-06-25 15:30:00', '四川师范大学', 'passwordopqr', '13800138016', 6);

-- ----------------------------
-- Table structure for time
-- ----------------------------
DROP TABLE IF EXISTS `time`;
CREATE TABLE `time`  (
  `id` int(11) NOT NULL,
  `adminUsername` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `loginIp` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `loginTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `logoutTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `isSafeExit` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of time
-- ----------------------------
INSERT INTO `time` VALUES (1, 'admin1', '192.168.1.1', '2024-01-17 16:00:00', '2024-01-17 18:30:00', 1);
INSERT INTO `time` VALUES (2, 'admin2', '192.168.1.2', '2024-01-17 17:30:00', '2024-01-17 19:45:00', 0);
INSERT INTO `time` VALUES (3, 'admin3', '192.168.1.3', '2024-01-17 18:45:00', '2024-01-17 20:15:00', 1);

SET FOREIGN_KEY_CHECKS = 1;
