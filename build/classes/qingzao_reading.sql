/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : qingzao_reading

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2019-04-03 19:11:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` varchar(50) NOT NULL COMMENT '管理员id',
  `admin_password` varchar(50) NOT NULL COMMENT '管理员密码',
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------

-- ----------------------------
-- Table structure for answer_record
-- ----------------------------
DROP TABLE IF EXISTS `answer_record`;
CREATE TABLE `answer_record` (
  `answer_record_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `question_id` bigint(20) NOT NULL COMMENT '题目id',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `time` datetime NOT NULL COMMENT '答题时间',
  `result` varchar(5) NOT NULL COMMENT '用户的选择',
  PRIMARY KEY (`answer_record_id`),
  KEY `question_id` (`question_id`),
  KEY `user_question` (`user_id`),
  CONSTRAINT `question_id` FOREIGN KEY (`question_id`) REFERENCES `question` (`question_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `user_question` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of answer_record
-- ----------------------------

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `comment_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '评论id',
  `video_id` bigint(20) DEFAULT NULL COMMENT '视频id',
  `from_user_id` bigint(20) DEFAULT NULL COMMENT '评论的用户id',
  `to_user_id` bigint(20) DEFAULT NULL COMMENT '回复的用户id',
  `topic_type` varchar(10) DEFAULT NULL COMMENT '主题类型',
  `cotent` varchar(255) DEFAULT NULL COMMENT '评论内容',
  `comment_date` datetime DEFAULT NULL COMMENT '评论时间',
  `topic_id` varchar(255) DEFAULT NULL COMMENT '主题',
  PRIMARY KEY (`comment_id`),
  KEY `video_comment` (`video_id`),
  KEY `user_comment` (`from_user_id`),
  CONSTRAINT `user_comment` FOREIGN KEY (`from_user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `video_comment` FOREIGN KEY (`video_id`) REFERENCES `video` (`video_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('1', '1', '1', null, '1', '真好看', '2019-03-25 18:17:54', '1');
INSERT INTO `comment` VALUES ('2', '1', '3', '1', '1', '确实好看', '2019-03-26 18:18:28', '1');

-- ----------------------------
-- Table structure for lecturer
-- ----------------------------
DROP TABLE IF EXISTS `lecturer`;
CREATE TABLE `lecturer` (
  `lecturer_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '讲师id',
  `lecturer_name` varchar(50) DEFAULT NULL COMMENT '讲师姓名',
  `lecturer_head_portrait_url` text COMMENT '讲师头像url',
  `lecturer_introduction` text COMMENT '讲师介绍',
  PRIMARY KEY (`lecturer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of lecturer
-- ----------------------------
INSERT INTO `lecturer` VALUES ('1', '苏子棚', 'szp.jpg', '讲师介绍');

-- ----------------------------
-- Table structure for playing
-- ----------------------------
DROP TABLE IF EXISTS `playing`;
CREATE TABLE `playing` (
  `playing_id` bigint(20) NOT NULL COMMENT 'id；=1234',
  `video_id` bigint(20) NOT NULL,
  `picture_url` text NOT NULL,
  PRIMARY KEY (`playing_id`),
  KEY `video_playing` (`video_id`),
  CONSTRAINT `video_playing` FOREIGN KEY (`video_id`) REFERENCES `video` (`video_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of playing
-- ----------------------------
INSERT INTO `playing` VALUES ('1', '1', 'szp.jpg');
INSERT INTO `playing` VALUES ('2', '1', 'szp.jpg');
INSERT INTO `playing` VALUES ('3', '1', 'szp.jpg');
INSERT INTO `playing` VALUES ('4', '1', 'szp.jpg');

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `question_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '题目id',
  `video_id` bigint(20) NOT NULL COMMENT '视频id',
  `question _content` varchar(200) NOT NULL COMMENT '题干',
  `option_a` varchar(100) DEFAULT NULL COMMENT '选项a',
  `option_b` varchar(100) DEFAULT NULL COMMENT '选项b',
  `option_c` varchar(100) DEFAULT NULL COMMENT '选项c',
  `option_d` varchar(100) DEFAULT NULL COMMENT '选项d',
  `answer` varchar(100) DEFAULT NULL COMMENT '答案',
  `answer_analysis` varchar(100) DEFAULT NULL COMMENT '答案解析',
  PRIMARY KEY (`question_id`),
  KEY `video_question` (`video_id`),
  CONSTRAINT `video_question` FOREIGN KEY (`video_id`) REFERENCES `video` (`video_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of question
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户id,用户唯一标识',
  `user_student_id` bigint(20) NOT NULL COMMENT '用户的学号=user_id+100000',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户姓名',
  `user_birthday` date DEFAULT NULL COMMENT '出生年月',
  `user_sex` varchar(10) DEFAULT NULL COMMENT '用户性别',
  `user_phone` varchar(12) DEFAULT NULL COMMENT '用户手机号',
  `user_head_portrait_url` text COMMENT '用户头像url',
  `user_is_it_vip` varchar(3) NOT NULL COMMENT '用户是否是vip;1标识是；0标识不是',
  `user_vip_expiration_time` datetime DEFAULT NULL COMMENT '用户vip到期时间',
  `user_invited_user_id` bigint(20) DEFAULT NULL COMMENT '被邀请的用户id,就是邀请本用户的那个用户id',
  `user_integral` decimal(10,0) unsigned zerofill NOT NULL DEFAULT '0000000000' COMMENT '用户积分',
  `user_money` decimal(10,2) unsigned zerofill NOT NULL DEFAULT '00000000.00' COMMENT '用户余额',
  `user_wechat_number` varchar(50) DEFAULT NULL COMMENT '用户微信号',
  `user_type` varchar(3) NOT NULL COMMENT '用户类型;0标识“假“用户；1标识“真”用户',
  `user_password` varchar(50) DEFAULT NULL,
  `user_grade` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '100001', '苏子棚', '1996-05-15', '男', '13167351123', 'szp.jpg', '1', '2019-03-31 18:33:53', null, '0000000000', '00000000.00', null, '1', 'e10adc3949ba59abbe56e057f20f883e', null);
INSERT INTO `user` VALUES ('2', '100002', null, '2019-03-22', null, '13131232333', 'szp.jpg', '1', null, '1', '0000000000', '00000000.00', null, '0', null, null);
INSERT INTO `user` VALUES ('3', '100001', '用户1', null, null, '13167351124', 'szp.jpg', '0', null, null, '0000000000', '00000000.00', null, '1', '4QrcOUm6Wau+VuBX8g+IPg==', null);
INSERT INTO `user` VALUES ('4', '100002', '用户3', null, null, '13167351125', 'szp.jpg', '0', null, null, '0000000000', '00000000.00', null, '1', '4QrcOUm6Wau+VuBX8g+IPg==', null);
INSERT INTO `user` VALUES ('5', '100003', '用户4', null, null, '13167351126', 'szp.jpg', '0', null, null, '0000000000', '00000000.00', null, '1', '4QrcOUm6Wau+VuBX8g+IPg==', null);
INSERT INTO `user` VALUES ('6', '100004', '用户5', null, null, '13167351127', 'szp.jpg', '0', null, null, '0000000000', '00000000.00', null, '1', '4QrcOUm6Wau+VuBX8g+IPg==', null);
INSERT INTO `user` VALUES ('7', '100005', '用户6', null, null, '13167351128', 'szp.jpg', '0', null, null, '0000000000', '00000000.00', null, '1', '4QrcOUm6Wau+VuBX8g+IPg==', null);
INSERT INTO `user` VALUES ('8', '100006', '用户7', null, null, '13167351129', 'szp.jpg', '0', null, null, '0000000000', '00000000.00', null, '1', '4QrcOUm6Wau+VuBX8g+IPg==', null);
INSERT INTO `user` VALUES ('9', '100007', '用户8', null, null, '13167351130', 'szp.jpg', '0', null, null, '0000000000', '00000000.00', null, '1', '4QrcOUm6Wau+VuBX8g+IPg==', null);
INSERT INTO `user` VALUES ('10', '100008', '用户9', null, null, '13167351131', 'szp.jpg', '0', null, null, '0000000000', '00000000.00', null, '1', '4QrcOUm6Wau+VuBX8g+IPg==', null);
INSERT INTO `user` VALUES ('11', '100009', '用户10', null, null, '', 'szp.jpg', '0', null, null, '0000000000', '00000000.00', null, '1', '1B2M2Y8AsgTpgAmY7PhCfg==', null);
INSERT INTO `user` VALUES ('12', '100010', '用户11', null, null, '13167351132', 'szp.jpg', '0', null, null, '0000000000', '00000000.00', null, '1', '4QrcOUm6Wau+VuBX8g+IPg==', null);
INSERT INTO `user` VALUES ('13', '100011', '用户12', null, null, '555555555', 'szp.jpg', '0', null, null, '0000000000', '00000000.00', null, '1', '4QrcOUm6Wau+VuBX8g+IPg==', null);
INSERT INTO `user` VALUES ('14', '100012', '用户13', null, null, '12312312312', 'szp.jpg', '0', null, null, '0000000000', '00000000.00', null, '1', 'ICy5YqxZB1uWSwcVLSNLcA==', null);
INSERT INTO `user` VALUES ('15', '100013', '用户14', null, null, '15850785726', 'szp.jpg', '0', null, null, '0000000000', '00000000.00', null, '1', '4QrcOUm6Wau+VuBX8g+IPg==', null);
INSERT INTO `user` VALUES ('19', '100015', '用户16', null, null, '13251359103', 'szp.jpg', '0', null, null, '0000000000', '00000000.00', null, '1', 'e10adc3949ba59abbe56e057f20f883e', null);
INSERT INTO `user` VALUES ('20', '100015', '用户16', null, null, '15600227095', 'szp.jpg', '0', null, null, '0000000000', '00000000.00', null, '1', 'e10adc3949ba59abbe56e057f20f883e', null);

-- ----------------------------
-- Table structure for user_collection
-- ----------------------------
DROP TABLE IF EXISTS `user_collection`;
CREATE TABLE `user_collection` (
  `user_collection_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `video_id` bigint(20) NOT NULL COMMENT '视频id',
  `time` datetime NOT NULL COMMENT '收藏的时间',
  `number` int(11) NOT NULL COMMENT '播放次数',
  PRIMARY KEY (`user_collection_id`),
  KEY `user_collection` (`user_id`),
  KEY `video_collection` (`video_id`),
  CONSTRAINT `user_collection` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `video_collection` FOREIGN KEY (`video_id`) REFERENCES `video` (`video_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_collection
-- ----------------------------
INSERT INTO `user_collection` VALUES ('4', '1', '1', '2019-03-26 18:15:19', '110');

-- ----------------------------
-- Table structure for user_history
-- ----------------------------
DROP TABLE IF EXISTS `user_history`;
CREATE TABLE `user_history` (
  `user_history_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `video_id` bigint(20) NOT NULL COMMENT '视频id',
  `time` datetime NOT NULL COMMENT '时间',
  `number` int(11) NOT NULL COMMENT '播放次数',
  PRIMARY KEY (`user_history_id`),
  KEY `user_id` (`user_id`),
  KEY `video_id` (`video_id`),
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `video_id` FOREIGN KEY (`video_id`) REFERENCES `video` (`video_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_history
-- ----------------------------
INSERT INTO `user_history` VALUES ('1', '1', '1', '2019-03-26 16:24:52', '110');
INSERT INTO `user_history` VALUES ('2', '1', '5', '2019-04-02 21:44:57', '188');

-- ----------------------------
-- Table structure for user_login_log
-- ----------------------------
DROP TABLE IF EXISTS `user_login_log`;
CREATE TABLE `user_login_log` (
  `user_login_log_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `login_time` datetime DEFAULT NULL COMMENT '用户登陆或登出时间',
  `operation_type` varchar(3) NOT NULL COMMENT '操作类型;1标识登陆；0标识登出',
  `phone_model` varchar(50) DEFAULT NULL COMMENT '手机型号/设备号，手机标识。',
  PRIMARY KEY (`user_login_log_id`),
  KEY `user_login` (`user_id`),
  CONSTRAINT `user_login` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_login_log
-- ----------------------------

-- ----------------------------
-- Table structure for user_vip_log
-- ----------------------------
DROP TABLE IF EXISTS `user_vip_log`;
CREATE TABLE `user_vip_log` (
  `user_vip_log_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `increased_vip_duration` int(11) NOT NULL COMMENT '增加的vip时长',
  `time` datetime NOT NULL COMMENT '时间',
  `operation_type` varchar(5) CHARACTER SET big5 NOT NULL COMMENT '获得VIP时长的操作类型;0标识分享用户获得的vip时长；1标识花钱获得vip时长',
  PRIMARY KEY (`user_vip_log_id`),
  KEY `user_vip` (`user_id`),
  CONSTRAINT `user_vip` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_vip_log
-- ----------------------------

-- ----------------------------
-- Table structure for verify_code
-- ----------------------------
DROP TABLE IF EXISTS `verify_code`;
CREATE TABLE `verify_code` (
  `user_phone` varchar(12) NOT NULL COMMENT '用户手机号',
  `verify_code` varchar(9) NOT NULL COMMENT '验证码',
  `data` datetime NOT NULL COMMENT '时间',
  PRIMARY KEY (`user_phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of verify_code
-- ----------------------------
INSERT INTO `verify_code` VALUES ('13167351123', '981385', '2019-04-03 08:24:55');
INSERT INTO `verify_code` VALUES ('13251359103', '174417', '2019-04-03 18:11:12');

-- ----------------------------
-- Table structure for video
-- ----------------------------
DROP TABLE IF EXISTS `video`;
CREATE TABLE `video` (
  `video_id` bigint(20) NOT NULL COMMENT '视频id',
  `video_url` text NOT NULL COMMENT '视频url',
  `video_cover_url` text NOT NULL COMMENT '视频封面url',
  `sound_url` text NOT NULL COMMENT '音频url',
  `name` varchar(100) NOT NULL COMMENT '视频名字',
  `short_introduction` varchar(100) NOT NULL COMMENT '视频短介绍',
  `introduction` varchar(255) NOT NULL COMMENT '视频介绍',
  `lecturer_id` bigint(20) NOT NULL COMMENT '讲师id',
  `video_type` varchar(5) NOT NULL COMMENT '视频类型；0标识亲近文学；1标识益智科普',
  `video_year` varchar(5) NOT NULL COMMENT '视频分类的年级',
  `number_of_readers` bigint(20) unsigned NOT NULL COMMENT '阅读人数',
  `time` datetime NOT NULL COMMENT '上架时间',
  `parental_guidance` varchar(255) DEFAULT NULL COMMENT '家长导读',
  `publish_time` datetime NOT NULL COMMENT '可见时间',
  `recommend` tinyint(2) unsigned NOT NULL DEFAULT '0' COMMENT '是否推荐',
  PRIMARY KEY (`video_id`),
  KEY `lecturer_video` (`lecturer_id`),
  CONSTRAINT `lecturer_video` FOREIGN KEY (`lecturer_id`) REFERENCES `lecturer` (`lecturer_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of video
-- ----------------------------
INSERT INTO `video` VALUES ('1', 'douyin.mp4', 'szp.jpg', 'douyin.mp4', '清早读书', '短介绍', '介绍', '1', '0', '1', '1000', '2019-04-05 22:06:42', '家长导读', '2019-03-01 19:40:17', '1');
INSERT INTO `video` VALUES ('2', 'douyin.mp4', 'szp.jpg', 'douyin.mp4', '清早读书2', '短介绍', '介绍', '1', '0', '2', '2000', '2019-03-20 22:40:22', '家长导读', '2019-04-01 19:40:37', '1');
INSERT INTO `video` VALUES ('3', 'douyin.mp4', 'szp.jpg', 'douyin.mp4', '清早读书3', '短介绍', '介绍', '1', '0', '3', '2000', '2019-03-20 22:40:22', '家长导读', '2019-03-29 10:36:37', '0');
INSERT INTO `video` VALUES ('4', 'douyin.mp4', 'szp.jpg', 'douyin.mp4', '清早读书4', '短介绍', '介绍', '1', '1', '4', '2000', '2019-03-20 22:40:22', '家长导读', '2019-04-03 19:40:37', '1');
INSERT INTO `video` VALUES ('5', 'douyin.mp4', 'szp.jpg', 'douyin.mp4', '清早读书5', '短介绍', '介绍', '1', '1', '4', '2000', '2019-03-20 22:40:22', '家长导读', '2019-04-01 09:40:37', '1');
INSERT INTO `video` VALUES ('6', 'douyin.mp4', 'szp.jpg', 'douyin.mp4', '清早读书6', '短介绍', '介绍', '1', '1', '4', '2000', '2019-03-20 22:40:22', '家长导读', '2019-04-01 19:40:37', '1');
INSERT INTO `video` VALUES ('7', 'douyin.mp4', 'szp.jpg', 'douyin.mp4', '清早读书7', '短介绍', '介绍', '1', '1', '4', '2000', '2019-03-20 22:40:22', '家长导读', '2019-04-01 19:40:37', '1');
