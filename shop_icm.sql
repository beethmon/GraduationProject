/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50619
Source Host           : localhost:3306
Source Database       : shop_icm

Target Server Type    : MYSQL
Target Server Version : 50619
File Encoding         : 65001

Date: 2015-03-04 18:56:27
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
  `ccodes` varchar(13) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=300 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commodity
-- ----------------------------
INSERT INTO `commodity` VALUES ('14', '乐呵呵咖啡(芥末味)', '4.00', null, null, '1', '2474910884234');
INSERT INTO `commodity` VALUES ('15', '乐呵呵奇妙豆(香芋)', '11.95', null, null, '1', '6136576150014');
INSERT INTO `commodity` VALUES ('16', '乐呵呵威化饼(香芋)', '2.46', null, null, '1', '3651988419768');
INSERT INTO `commodity` VALUES ('17', '乐呵呵巧克力(巧克力味)', '11.50', null, null, '1', '5756633038269');
INSERT INTO `commodity` VALUES ('18', '乐呵呵巴菲(薄荷味)', '1.50', null, null, '1', '3182675496480');
INSERT INTO `commodity` VALUES ('19', '乐呵呵巴菲(香蕉味)', '2.42', null, null, '1', '1614763531174');
INSERT INTO `commodity` VALUES ('20', '乐呵呵汽水(西瓜味)', '12.55', null, null, '1', '8919046140850');
INSERT INTO `commodity` VALUES ('21', '乐呵呵瓜子(菠萝味)', '10.77', null, null, '1', '2961050000886');
INSERT INTO `commodity` VALUES ('22', '乐呵呵瓜子(麻辣)', '8.90', null, null, '1', '2154521092404');
INSERT INTO `commodity` VALUES ('23', '乐呵呵甜筒', '2.50', null, null, '1', '5223934710377');
INSERT INTO `commodity` VALUES ('24', '乐呵呵甜筒(芥末味)', '2.38', null, null, '1', '7327672267878');
INSERT INTO `commodity` VALUES ('25', '乐呵呵甜筒(西瓜味)', '10.55', null, null, '1', '0533058705365');
INSERT INTO `commodity` VALUES ('26', '乐呵呵甜筒(香芋)', '9.68', null, null, '1', '3769257379328');
INSERT INTO `commodity` VALUES ('27', '乐呵呵糖果(哈密瓜味)', '12.90', null, null, '1', '2263462274655');
INSERT INTO `commodity` VALUES ('28', '乐呵呵糖果(香芋)', '2.93', null, null, '1', '8905989487627');
INSERT INTO `commodity` VALUES ('29', '乐呵呵花生(芒果味)', '14.28', null, null, '1', '8902031256168');
INSERT INTO `commodity` VALUES ('30', '乐呵呵花生(草莓味)', '11.95', null, null, '1', '8541531793309');
INSERT INTO `commodity` VALUES ('31', '乐呵呵薯条(草莓味)', '1.61', null, null, '-1', '2548350873575');
INSERT INTO `commodity` VALUES ('32', '乐呵呵薯片', '9.74', null, null, '1', '0857312259920');
INSERT INTO `commodity` VALUES ('33', '乐呵呵薯片(巧克力味)', '8.94', null, null, '1', '0990440030001');
INSERT INTO `commodity` VALUES ('34', '乐呵呵薯片(薄荷味)', '3.03', null, null, '1', '6375342809341');
INSERT INTO `commodity` VALUES ('35', '乐呵呵蛋糕', '3.36', null, null, '1', '7462179782652');
INSERT INTO `commodity` VALUES ('36', '乐呵呵蛋糕(咖喱味)', '11.45', null, null, '-1', '6858037972224');
INSERT INTO `commodity` VALUES ('37', '乐呵呵雪糕(咖喱味)', '11.72', null, null, '1', '2817768177486');
INSERT INTO `commodity` VALUES ('38', '乐呵呵面包(草莓味)', '9.15', null, null, '1', '6651344561403');
INSERT INTO `commodity` VALUES ('39', '乐呵呵饼干(菠萝味)', '9.12', null, null, '1', '0704384723996');
INSERT INTO `commodity` VALUES ('40', '乐派冰棍(薄荷味)', '5.85', null, null, '1', '5277810527842');
INSERT INTO `commodity` VALUES ('41', '乐派冰棍(西瓜味)', '4.89', null, null, '1', '7870208349247');
INSERT INTO `commodity` VALUES ('42', '乐派冰棍(香草味)', '9.36', null, null, '1', '8138973125642');
INSERT INTO `commodity` VALUES ('43', '乐派咖啡', '4.52', null, null, '1', '4725743479190');
INSERT INTO `commodity` VALUES ('44', '乐派咖啡(草莓味)', '10.68', null, null, '1', '8069730973820');
INSERT INTO `commodity` VALUES ('45', '乐派咖啡(香芋)', '0.40', null, null, '1', '5721206604710');
INSERT INTO `commodity` VALUES ('46', '乐派奇妙豆', '8.35', null, null, '1', '6067528302585');
INSERT INTO `commodity` VALUES ('47', '乐派威化饼(芥末味)', '11.15', null, null, '1', '2843687200364');
INSERT INTO `commodity` VALUES ('48', '乐派威化饼(香芋)', '6.76', null, null, '1', '7780304433549');
INSERT INTO `commodity` VALUES ('49', '乐派威化饼(麻辣)', '1.18', null, null, '-1', '2846934248087');
INSERT INTO `commodity` VALUES ('50', '乐派巴菲', '6.19', null, null, '1', '5377360387036');
INSERT INTO `commodity` VALUES ('51', '乐派巴菲(黄瓜味)', '14.54', null, null, '1', '9021500563474');
INSERT INTO `commodity` VALUES ('52', '乐派牛奶(巧克力味)', '0.81', null, null, '1', '8249593853658');
INSERT INTO `commodity` VALUES ('53', '乐派瓜子(哈密瓜味)', '3.23', null, null, '1', '1364146135223');
INSERT INTO `commodity` VALUES ('54', '乐派甜筒(芥末味)', '11.79', null, null, '1', '8583599752003');
INSERT INTO `commodity` VALUES ('55', '乐派甜筒(麻辣)', '13.54', null, null, '1', '2255800862799');
INSERT INTO `commodity` VALUES ('56', '乐派薯条(咖喱味)', '0.14', null, null, '-1', '9487304037269');
INSERT INTO `commodity` VALUES ('57', '乐派薯片(香蕉味)', '3.67', null, null, '1', '0792451645292');
INSERT INTO `commodity` VALUES ('58', '乐派薯片(黄瓜味)', '5.32', null, null, '1', '0005227059569');
INSERT INTO `commodity` VALUES ('59', '乐派蛋糕(巧克力味)', '10.47', null, null, '1', '7962138797905');
INSERT INTO `commodity` VALUES ('60', '乐派蛋糕(芒果味)', '11.70', null, null, '1', '8285276348936');
INSERT INTO `commodity` VALUES ('61', '乐派蛋糕(香芋)', '11.40', null, null, '1', '8779202704937');
INSERT INTO `commodity` VALUES ('62', '乐派蛋糕(香草味)', '1.95', null, null, '1', '6587853409957');
INSERT INTO `commodity` VALUES ('63', '乐派酸奶(巧克力味)', '8.80', null, null, '1', '1207870187451');
INSERT INTO `commodity` VALUES ('64', '乐派雪糕', '14.31', null, null, '1', '5560607138674');
INSERT INTO `commodity` VALUES ('65', '五洲奇妙豆(西瓜味)', '10.06', null, null, '1', '2302347757332');
INSERT INTO `commodity` VALUES ('66', '五洲奇妙豆(香草味)', '10.72', null, null, '1', '9640502109253');
INSERT INTO `commodity` VALUES ('67', '五洲威化饼(麻辣)', '9.59', null, null, '1', '1561282249574');
INSERT INTO `commodity` VALUES ('68', '五洲巧克力(香芋)', '6.91', null, null, '1', '2954061211222');
INSERT INTO `commodity` VALUES ('69', '五洲巴菲', '1.21', null, null, '1', '9235347956740');
INSERT INTO `commodity` VALUES ('70', '五洲巴菲(香芋)', '8.87', null, null, '1', '7649078386479');
INSERT INTO `commodity` VALUES ('71', '五洲牛奶', '1.18', null, null, '1', '7784060320856');
INSERT INTO `commodity` VALUES ('72', '五洲瓜子', '6.94', null, null, '1', '2911802861621');
INSERT INTO `commodity` VALUES ('73', '五洲薯条(麻辣)', '5.81', null, null, '1', '4253869892855');
INSERT INTO `commodity` VALUES ('74', '五洲薯片', '6.88', null, null, '1', '2183114241606');
INSERT INTO `commodity` VALUES ('75', '五洲薯片(巧克力味)', '5.78', null, null, '1', '5783914070228');
INSERT INTO `commodity` VALUES ('76', '五洲蛋糕(黄瓜味)', '0.49', null, null, '1', '0728167283880');
INSERT INTO `commodity` VALUES ('77', '五洲酸奶(哈密瓜味)', '9.81', null, null, '1', '2019847001379');
INSERT INTO `commodity` VALUES ('78', '五洲酸奶(巧克力味)', '13.35', null, null, '1', '4725147568831');
INSERT INTO `commodity` VALUES ('79', '五洲酸奶(菠萝味)', '9.18', null, null, '1', '1223426056467');
INSERT INTO `commodity` VALUES ('80', '五洲饼干', '8.05', null, null, '1', '5882819444794');
INSERT INTO `commodity` VALUES ('81', '嘉顿冰棍(芒果味)', '6.15', null, null, '1', '0625484925827');
INSERT INTO `commodity` VALUES ('82', '嘉顿奇妙豆', '4.04', null, null, '1', '6368427371806');
INSERT INTO `commodity` VALUES ('83', '嘉顿奇妙豆(芒果味)', '2.60', null, null, '1', '2592243288285');
INSERT INTO `commodity` VALUES ('84', '嘉顿威化饼(黄瓜味)', '12.03', null, null, '1', '2838615882269');
INSERT INTO `commodity` VALUES ('85', '嘉顿巴菲(芥末味)', '9.25', null, null, '1', '4670096739809');
INSERT INTO `commodity` VALUES ('86', '嘉顿汽水(巧克力味)', '1.29', null, null, '1', '7501265605359');
INSERT INTO `commodity` VALUES ('87', '嘉顿牛奶(麻辣)', '6.33', null, null, '1', '0449123696136');
INSERT INTO `commodity` VALUES ('88', '嘉顿瓜子(咖喱味)', '7.94', null, null, '1', '7317880597495');
INSERT INTO `commodity` VALUES ('89', '嘉顿瓜子(菠萝味)', '5.11', null, null, '1', '4688183310035');
INSERT INTO `commodity` VALUES ('90', '嘉顿糖果', '13.44', null, null, '1', '8002469193141');
INSERT INTO `commodity` VALUES ('91', '嘉顿糖果(薄荷味)', '8.98', null, null, '-1', '6513294163823');
INSERT INTO `commodity` VALUES ('92', '嘉顿糖果(香草味)', '11.99', null, null, '1', '6817515935442');
INSERT INTO `commodity` VALUES ('93', '嘉顿花生(香芋)', '5.95', null, null, '1', '3434170366419');
INSERT INTO `commodity` VALUES ('94', '嘉顿薯条(芒果味)', '11.32', null, null, '1', '2788459699712');
INSERT INTO `commodity` VALUES ('95', '嘉顿薯片(巧克力味)', '2.63', null, null, '1', '3818688638213');
INSERT INTO `commodity` VALUES ('96', '嘉顿薯片(草莓味)', '1.26', null, null, '1', '0348378900171');
INSERT INTO `commodity` VALUES ('97', '嘉顿蛋糕(黄瓜味)', '3.96', null, null, '1', '5210631211642');
INSERT INTO `commodity` VALUES ('98', '嘉顿酸奶', '11.19', null, null, '1', '9580959750464');
INSERT INTO `commodity` VALUES ('99', '嘉顿酸奶(香草味)', '2.36', null, null, '1', '4633958384316');
INSERT INTO `commodity` VALUES ('100', '嘉顿面包', '7.46', null, null, '1', '3997929876643');
INSERT INTO `commodity` VALUES ('101', '嘉顿面包(香芋)', '12.28', null, null, '1', '9176680106967');
INSERT INTO `commodity` VALUES ('102', '大哥大咖啡(咖喱味)', '9.89', null, null, '1', '5989084642627');
INSERT INTO `commodity` VALUES ('103', '大哥大咖啡(香蕉味)', '13.08', null, null, '1', '1202898307705');
INSERT INTO `commodity` VALUES ('104', '大哥大威化饼', '7.94', null, null, '1', '5635970225688');
INSERT INTO `commodity` VALUES ('105', '大哥大巧克力(麻辣)', '13.12', null, null, '1', '0549364727504');
INSERT INTO `commodity` VALUES ('106', '大哥大巴菲(西瓜味)', '7.14', null, null, '1', '8371052079832');
INSERT INTO `commodity` VALUES ('107', '大哥大汽水', '0.65', null, null, '1', '6792667771292');
INSERT INTO `commodity` VALUES ('108', '大哥大汽水(哈密瓜味)', '8.21', null, null, '1', '4268927206008');
INSERT INTO `commodity` VALUES ('109', '大哥大汽水(巧克力味)', '3.96', null, null, '1', '2231564128117');
INSERT INTO `commodity` VALUES ('110', '大哥大汽水(薄荷味)', '5.80', null, null, '1', '1496930230415');
INSERT INTO `commodity` VALUES ('111', '大哥大瓜子', '3.28', null, null, '1', '6167140320548');
INSERT INTO `commodity` VALUES ('112', '大哥大甜筒', '10.62', null, null, '1', '3461427169280');
INSERT INTO `commodity` VALUES ('113', '大哥大糖果', '12.87', null, null, '1', '3023552910222');
INSERT INTO `commodity` VALUES ('114', '大哥大花生(香草味)', '11.20', null, null, '1', '8885452579551');
INSERT INTO `commodity` VALUES ('115', '大哥大薯条(草莓味)', '10.05', null, null, '1', '5665708648699');
INSERT INTO `commodity` VALUES ('116', '大哥大薯条(麻辣)', '9.60', null, null, '1', '9187963768881');
INSERT INTO `commodity` VALUES ('117', '大哥大蛋糕(哈密瓜味)', '11.52', null, null, '1', '6434054417001');
INSERT INTO `commodity` VALUES ('118', '大哥大酸奶(芥末味)', '14.02', null, null, '1', '7977042885460');
INSERT INTO `commodity` VALUES ('119', '大哥大面包(哈密瓜味)', '13.32', null, null, '1', '0749964468552');
INSERT INTO `commodity` VALUES ('120', '大哥大饼干', '6.19', null, null, '1', '8137569070143');
INSERT INTO `commodity` VALUES ('121', '大哥大饼干(黄瓜味)', '4.47', null, null, '1', '7439905292814');
INSERT INTO `commodity` VALUES ('122', '大家乐冰棍(薄荷味)', '3.39', null, null, '1', '1166945148788');
INSERT INTO `commodity` VALUES ('123', '大家乐咖啡(草莓味)', '4.98', null, null, '1', '6060453809344');
INSERT INTO `commodity` VALUES ('124', '大家乐威化饼', '12.33', null, null, '1', '1001621155708');
INSERT INTO `commodity` VALUES ('125', '大家乐巧克力', '5.72', null, null, '1', '9148496709696');
INSERT INTO `commodity` VALUES ('126', '大家乐巧克力(草莓味)', '12.50', null, null, '1', '3050517168221');
INSERT INTO `commodity` VALUES ('127', '大家乐巴菲(麻辣)', '12.14', null, null, '1', '7671773377190');
INSERT INTO `commodity` VALUES ('128', '大家乐汽水(香芋)', '1.41', null, null, '1', '1974262246586');
INSERT INTO `commodity` VALUES ('129', '大家乐瓜子(香草味)', '4.30', null, null, '1', '9426392039604');
INSERT INTO `commodity` VALUES ('130', '大家乐甜筒(菠萝味)', '6.20', null, null, '1', '8939364335872');
INSERT INTO `commodity` VALUES ('131', '大家乐糖果', '4.02', null, null, '-1', '0397272597861');
INSERT INTO `commodity` VALUES ('132', '大家乐花生(香蕉味)', '8.64', null, null, '1', '6373274312530');
INSERT INTO `commodity` VALUES ('133', '大家乐蛋糕', '10.97', null, null, '1', '6853141901294');
INSERT INTO `commodity` VALUES ('134', '大家乐酸奶(巧克力味)', '14.41', null, null, '1', '9295223282817');
INSERT INTO `commodity` VALUES ('135', '大家乐雪糕', '12.49', null, null, '1', '3404728294602');
INSERT INTO `commodity` VALUES ('136', '大家乐饼干(咖喱味)', '4.06', null, null, '1', '7786247214955');
INSERT INTO `commodity` VALUES ('137', '大家乐饼干(香芋)', '14.54', null, null, '1', '9317007930828');
INSERT INTO `commodity` VALUES ('138', '姥姥家冰棍(咖喱味)', '12.11', null, null, '1', '4014804752665');
INSERT INTO `commodity` VALUES ('139', '姥姥家咖啡(菠萝味)', '2.08', null, null, '1', '3112219178382');
INSERT INTO `commodity` VALUES ('140', '姥姥家威化饼', '11.73', null, null, '1', '5678685665827');
INSERT INTO `commodity` VALUES ('141', '姥姥家威化饼(哈密瓜味)', '7.21', null, null, '1', '6470103057057');
INSERT INTO `commodity` VALUES ('142', '姥姥家威化饼(香芋)', '13.00', null, null, '1', '1787293336823');
INSERT INTO `commodity` VALUES ('143', '姥姥家巧克力(哈密瓜味)', '10.39', null, null, '1', '7546444794683');
INSERT INTO `commodity` VALUES ('144', '姥姥家汽水(香芋)', '1.78', null, null, '1', '1484206775940');
INSERT INTO `commodity` VALUES ('145', '姥姥家牛奶(西瓜味)', '14.62', null, null, '1', '0909445381019');
INSERT INTO `commodity` VALUES ('146', '姥姥家瓜子(香蕉味)', '7.76', null, null, '1', '2257959860090');
INSERT INTO `commodity` VALUES ('147', '姥姥家花生(薄荷味)', '8.95', null, null, '1', '5106758294152');
INSERT INTO `commodity` VALUES ('148', '姥姥家花生(黄瓜味)', '3.36', null, null, '1', '0529708580907');
INSERT INTO `commodity` VALUES ('149', '姥姥家薯条(黄瓜味)', '4.53', null, null, '1', '6825324651298');
INSERT INTO `commodity` VALUES ('150', '姥姥家薯片(香蕉味)', '1.12', null, null, '1', '6274666814752');
INSERT INTO `commodity` VALUES ('151', '姥姥家蛋糕(薄荷味)', '2.57', null, null, '1', '2152069062880');
INSERT INTO `commodity` VALUES ('152', '姥姥家蛋糕(西瓜味)', '0.67', null, null, '1', '9399664831108');
INSERT INTO `commodity` VALUES ('153', '姥姥家酸奶', '8.32', null, null, '-1', '7747347274230');
INSERT INTO `commodity` VALUES ('154', '姥姥家面包(草莓味)', '6.33', null, null, '1', '0917073691467');
INSERT INTO `commodity` VALUES ('155', '姥姥家饼干(黄瓜味)', '2.99', null, null, '1', '8384004821128');
INSERT INTO `commodity` VALUES ('156', '家园冰棍(菠萝味)', '9.92', null, null, '1', '4786433092964');
INSERT INTO `commodity` VALUES ('157', '家园威化饼', '0.84', null, null, '1', '8162308275034');
INSERT INTO `commodity` VALUES ('158', '家园巧克力', '7.91', null, null, '1', '3483250877161');
INSERT INTO `commodity` VALUES ('159', '家园巴菲', '11.69', null, null, '1', '3720934417171');
INSERT INTO `commodity` VALUES ('160', '家园汽水(草莓味)', '9.94', null, null, '1', '0541545625249');
INSERT INTO `commodity` VALUES ('161', '家园瓜子(西瓜味)', '11.75', null, null, '1', '4866914241527');
INSERT INTO `commodity` VALUES ('162', '家园甜筒(麻辣)', '9.12', null, null, '1', '9455416249187');
INSERT INTO `commodity` VALUES ('163', '家园花生(香蕉味)', '5.52', null, null, '-1', '5986619189608');
INSERT INTO `commodity` VALUES ('164', '家园薯条', '8.91', null, null, '1', '8328708865605');
INSERT INTO `commodity` VALUES ('165', '家园薯片', '1.53', null, null, '1', '2712819488655');
INSERT INTO `commodity` VALUES ('166', '家园酸奶(黄瓜味)', '1.01', null, null, '1', '5776989028585');
INSERT INTO `commodity` VALUES ('167', '家园面包', '0.68', null, null, '-1', '2690777128856');
INSERT INTO `commodity` VALUES ('168', '家园面包(草莓味)', '7.17', null, null, '1', '9748408130964');
INSERT INTO `commodity` VALUES ('169', '家园面包(麻辣)', '12.76', null, null, '1', '3707849569237');
INSERT INTO `commodity` VALUES ('170', '家园饼干', '13.60', null, null, '1', '4319472783630');
INSERT INTO `commodity` VALUES ('171', '家园饼干(香蕉味)', '7.69', null, null, '1', '0861565528366');
INSERT INTO `commodity` VALUES ('172', '家园饼干(黄瓜味)', '11.73', null, null, '1', '9816346779797');
INSERT INTO `commodity` VALUES ('173', '徐福记咖啡', '0.77', null, null, '-1', '3389754552318');
INSERT INTO `commodity` VALUES ('174', '徐福记咖啡(草莓味)', '9.34', null, null, '1', '7105460806802');
INSERT INTO `commodity` VALUES ('175', '徐福记奇妙豆(香蕉味)', '11.25', null, null, '1', '5091338474607');
INSERT INTO `commodity` VALUES ('176', '徐福记威化饼(薄荷味)', '11.53', null, null, '1', '7019385731277');
INSERT INTO `commodity` VALUES ('177', '徐福记巴菲(薄荷味)', '12.39', null, null, '1', '7001109602208');
INSERT INTO `commodity` VALUES ('178', '徐福记牛奶(巧克力味)', '0.44', null, null, '-1', '4636659898245');
INSERT INTO `commodity` VALUES ('179', '徐福记甜筒(麻辣)', '10.29', null, null, '1', '4119964926802');
INSERT INTO `commodity` VALUES ('180', '徐福记糖果(香草味)', '3.62', null, null, '1', '2763631948314');
INSERT INTO `commodity` VALUES ('181', '徐福记花生(咖喱味)', '12.19', null, null, '1', '6199221239704');
INSERT INTO `commodity` VALUES ('182', '徐福记薯条', '7.75', null, null, '1', '8196298224701');
INSERT INTO `commodity` VALUES ('183', '徐福记薯条(芥末味)', '0.18', null, null, '1', '0351586947668');
INSERT INTO `commodity` VALUES ('184', '徐福记雪糕(菠萝味)', '8.83', null, null, '1', '0467712431238');
INSERT INTO `commodity` VALUES ('185', '徐福记饼干', '4.02', null, null, '1', '2184605888499');
INSERT INTO `commodity` VALUES ('186', '思源冰棍(芒果味)', '14.13', null, null, '1', '9896086957621');
INSERT INTO `commodity` VALUES ('187', '思源冰棍(香蕉味)', '5.34', null, null, '1', '1654886299076');
INSERT INTO `commodity` VALUES ('188', '思源咖啡(咖喱味)', '14.06', null, null, '1', '6416549899547');
INSERT INTO `commodity` VALUES ('189', '思源咖啡(巧克力味)', '7.38', null, null, '1', '6248436078156');
INSERT INTO `commodity` VALUES ('190', '思源奇妙豆(香草味)', '2.83', null, null, '1', '5236804838812');
INSERT INTO `commodity` VALUES ('191', '思源奇妙豆(黄瓜味)', '2.95', null, null, '1', '9933956071897');
INSERT INTO `commodity` VALUES ('192', '思源威化饼', '8.51', null, null, '1', '3390232161643');
INSERT INTO `commodity` VALUES ('193', '思源巧克力(芥末味)', '10.52', null, null, '1', '3283795310163');
INSERT INTO `commodity` VALUES ('194', '思源巴菲(香蕉味)', '13.17', null, null, '1', '0875239733044');
INSERT INTO `commodity` VALUES ('195', '思源汽水', '14.54', null, null, '1', '7768169892405');
INSERT INTO `commodity` VALUES ('196', '思源牛奶(巧克力味)', '9.23', null, null, '1', '2773602220746');
INSERT INTO `commodity` VALUES ('197', '思源瓜子(巧克力味)', '8.34', null, null, '1', '2854206875607');
INSERT INTO `commodity` VALUES ('198', '思源糖果(菠萝味)', '6.51', null, null, '1', '8066306113852');
INSERT INTO `commodity` VALUES ('199', '思源糖果(薄荷味)', '0.11', null, null, '1', '0435568162464');
INSERT INTO `commodity` VALUES ('200', '思源花生(草莓味)', '3.04', null, null, '1', '0535911394034');
INSERT INTO `commodity` VALUES ('201', '思源花生(西瓜味)', '4.54', null, null, '1', '0830781485253');
INSERT INTO `commodity` VALUES ('202', '思源薯条', '8.76', null, null, '1', '7349505064642');
INSERT INTO `commodity` VALUES ('203', '思源薯条(芥末味)', '14.71', null, null, '-1', '9363668357435');
INSERT INTO `commodity` VALUES ('204', '思源薯条(薄荷味)', '4.02', null, null, '1', '6827004658381');
INSERT INTO `commodity` VALUES ('205', '思源蛋糕(草莓味)', '10.25', null, null, '1', '0195439585459');
INSERT INTO `commodity` VALUES ('206', '思源蛋糕(西瓜味)', '2.43', null, null, '1', '6915880323121');
INSERT INTO `commodity` VALUES ('207', '思源酸奶(香芋)', '14.71', null, null, '1', '2801144481930');
INSERT INTO `commodity` VALUES ('208', '思源面包(香草味)', '9.18', null, null, '1', '5780797246089');
INSERT INTO `commodity` VALUES ('209', '思源饼干(黄瓜味)', '1.43', null, null, '1', '5138564940111');
INSERT INTO `commodity` VALUES ('210', '普通的咖啡', '3.20', null, null, '1', '1041040255255');
INSERT INTO `commodity` VALUES ('211', '普通的咖啡(哈密瓜味)', '14.24', null, null, '1', '8041142774435');
INSERT INTO `commodity` VALUES ('212', '普通的奇妙豆', '8.08', null, null, '1', '7029231169343');
INSERT INTO `commodity` VALUES ('213', '普通的奇妙豆(咖喱味)', '13.42', null, null, '1', '6715512066785');
INSERT INTO `commodity` VALUES ('214', '普通的威化饼(菠萝味)', '8.95', null, null, '1', '0344265795653');
INSERT INTO `commodity` VALUES ('215', '普通的巧克力', '12.44', null, null, '1', '8446672998929');
INSERT INTO `commodity` VALUES ('216', '普通的汽水(菠萝味)', '4.94', null, null, '1', '0775849855375');
INSERT INTO `commodity` VALUES ('217', '普通的汽水(香芋)', '8.59', null, null, '-1', '2515501944213');
INSERT INTO `commodity` VALUES ('218', '普通的牛奶(哈密瓜味)', '8.22', null, null, '1', '2950388715307');
INSERT INTO `commodity` VALUES ('219', '普通的牛奶(香蕉味)', '1.49', null, null, '1', '2442854656754');
INSERT INTO `commodity` VALUES ('220', '普通的甜筒(咖喱味)', '14.36', null, null, '1', '9198066714444');
INSERT INTO `commodity` VALUES ('221', '普通的糖果', '13.33', null, null, '1', '0822208154699');
INSERT INTO `commodity` VALUES ('222', '普通的花生(巧克力味)', '11.62', null, null, '1', '5397810484405');
INSERT INTO `commodity` VALUES ('223', '普通的薯条(香草味)', '10.96', null, null, '1', '8284878396994');
INSERT INTO `commodity` VALUES ('224', '普通的薯片(香草味)', '8.27', null, null, '1', '6286450452947');
INSERT INTO `commodity` VALUES ('225', '普通的薯片(香蕉味)', '14.43', null, null, '1', '9186872296491');
INSERT INTO `commodity` VALUES ('226', '普通的蛋糕(芒果味)', '1.37', null, null, '1', '0570896489117');
INSERT INTO `commodity` VALUES ('227', '普通的雪糕', '7.31', null, null, '1', '3804581104234');
INSERT INTO `commodity` VALUES ('228', '美味奇妙豆(薄荷味)', '4.18', null, null, '1', '8327961292736');
INSERT INTO `commodity` VALUES ('229', '美味威化饼', '14.55', null, null, '1', '9579752836264');
INSERT INTO `commodity` VALUES ('230', '美味汽水(香芋)', '2.83', null, null, '1', '8685438018312');
INSERT INTO `commodity` VALUES ('231', '美味瓜子(草莓味)', '10.47', null, null, '1', '3524360750089');
INSERT INTO `commodity` VALUES ('232', '美味甜筒', '6.25', null, null, '1', '6671153903013');
INSERT INTO `commodity` VALUES ('233', '美味甜筒(咖喱味)', '3.84', null, null, '1', '1888933159068');
INSERT INTO `commodity` VALUES ('234', '美味甜筒(巧克力味)', '14.11', null, null, '1', '7275742972543');
INSERT INTO `commodity` VALUES ('235', '美味糖果(咖喱味)', '7.95', null, null, '1', '6953480029160');
INSERT INTO `commodity` VALUES ('236', '美味花生', '5.41', null, null, '1', '9516966808103');
INSERT INTO `commodity` VALUES ('237', '美味花生(芒果味)', '9.34', null, null, '1', '9702938356432');
INSERT INTO `commodity` VALUES ('238', '美味薯片(菠萝味)', '6.27', null, null, '1', '8751700113722');
INSERT INTO `commodity` VALUES ('239', '美味薯片(香草味)', '9.86', null, null, '1', '6301073612163');
INSERT INTO `commodity` VALUES ('240', '美味蛋糕', '4.37', null, null, '1', '4510876509640');
INSERT INTO `commodity` VALUES ('241', '美味雪糕(草莓味)', '11.16', null, null, '1', '8129570399164');
INSERT INTO `commodity` VALUES ('242', '美味面包(菠萝味)', '3.45', null, null, '1', '5283387375017');
INSERT INTO `commodity` VALUES ('243', '艾萨克冰棍', '2.97', null, null, '1', '2015430185831');
INSERT INTO `commodity` VALUES ('244', '艾萨克冰棍(咖喱味)', '14.10', null, null, '1', '2408551970953');
INSERT INTO `commodity` VALUES ('245', '艾萨克冰棍(薄荷味)', '8.21', null, null, '1', '3350408418403');
INSERT INTO `commodity` VALUES ('246', '艾萨克咖啡(西瓜味)', '9.61', null, null, '1', '6975905779315');
INSERT INTO `commodity` VALUES ('247', '艾萨克威化饼', '10.19', null, null, '1', '1446263779506');
INSERT INTO `commodity` VALUES ('248', '艾萨克巧克力(芥末味)', '11.55', null, null, '1', '3782081232769');
INSERT INTO `commodity` VALUES ('249', '艾萨克巴菲(草莓味)', '0.27', null, null, '1', '8413272815196');
INSERT INTO `commodity` VALUES ('250', '艾萨克汽水(麻辣)', '5.78', null, null, '1', '0172553625444');
INSERT INTO `commodity` VALUES ('251', '艾萨克甜筒(黄瓜味)', '9.12', null, null, '1', '5341051633928');
INSERT INTO `commodity` VALUES ('252', '艾萨克糖果(菠萝味)', '6.10', null, null, '1', '7531577009158');
INSERT INTO `commodity` VALUES ('253', '艾萨克薯条(菠萝味)', '14.32', null, null, '-1', '3994080038579');
INSERT INTO `commodity` VALUES ('254', '艾萨克蛋糕(西瓜味)', '14.77', null, null, '-1', '3756095947285');
INSERT INTO `commodity` VALUES ('255', '艾萨克酸奶(咖喱味)', '1.69', null, null, '1', '9640915047236');
INSERT INTO `commodity` VALUES ('256', '艾萨克酸奶(香草味)', '0.82', null, null, '1', '0374154645457');
INSERT INTO `commodity` VALUES ('257', '艾萨克饼干(黄瓜味)', '4.97', null, null, '1', '3118822856813');
INSERT INTO `commodity` VALUES ('258', '雀巢冰棍(香芋)', '5.80', null, null, '1', '0993794289279');
INSERT INTO `commodity` VALUES ('259', '雀巢咖啡(哈密瓜味)', '1.72', null, null, '1', '6981054059783');
INSERT INTO `commodity` VALUES ('260', '雀巢咖啡(巧克力味)', '2.26', null, null, '1', '8682183671779');
INSERT INTO `commodity` VALUES ('261', '雀巢奇妙豆(香草味)', '14.89', null, null, '1', '1662665997564');
INSERT INTO `commodity` VALUES ('262', '雀巢奇妙豆(黄瓜味)', '11.78', null, null, '1', '6302485194461');
INSERT INTO `commodity` VALUES ('263', '雀巢威化饼(香草味)', '0.67', null, null, '1', '7721841809215');
INSERT INTO `commodity` VALUES ('264', '雀巢汽水(黄瓜味)', '10.07', null, null, '1', '2423282199829');
INSERT INTO `commodity` VALUES ('265', '雀巢瓜子(哈密瓜味)', '11.18', null, null, '1', '0211414056885');
INSERT INTO `commodity` VALUES ('266', '雀巢甜筒(巧克力味)', '10.82', null, null, '1', '5231083021110');
INSERT INTO `commodity` VALUES ('267', '雀巢甜筒(黄瓜味)', '3.44', null, null, '1', '7225704249317');
INSERT INTO `commodity` VALUES ('268', '雀巢花生(香草味)', '5.54', null, null, '1', '7356296294809');
INSERT INTO `commodity` VALUES ('269', '雀巢薯片', '7.06', null, null, '1', '6602995237959');
INSERT INTO `commodity` VALUES ('270', '雀巢薯片(黄瓜味)', '14.08', null, null, '1', '3909181219225');
INSERT INTO `commodity` VALUES ('271', '雀巢酸奶(西瓜味)', '8.47', null, null, '1', '3405987025034');
INSERT INTO `commodity` VALUES ('272', '雀巢雪糕(香芋)', '0.07', null, null, '1', '2146245654445');
INSERT INTO `commodity` VALUES ('273', '雀巢饼干', '10.83', null, null, '1', '2550838962393');
INSERT INTO `commodity` VALUES ('274', '鲜味冰棍(咖喱味)', '11.21', null, null, '1', '5441785466358');
INSERT INTO `commodity` VALUES ('275', '鲜味冰棍(芒果味)', '13.36', null, null, '1', '9956400336717');
INSERT INTO `commodity` VALUES ('276', '鲜味冰棍(香芋)', '3.87', null, null, '1', '8274792090183');
INSERT INTO `commodity` VALUES ('277', '鲜味咖啡(咖喱味)', '6.60', null, null, '1', '9222850496146');
INSERT INTO `commodity` VALUES ('278', '鲜味咖啡(菠萝味)', '10.79', null, null, '1', '5962264435359');
INSERT INTO `commodity` VALUES ('279', '鲜味咖啡(薄荷味)', '12.71', null, null, '1', '7522309723776');
INSERT INTO `commodity` VALUES ('280', '鲜味奇妙豆', '14.73', null, null, '1', '5448444167643');
INSERT INTO `commodity` VALUES ('281', '鲜味巧克力(薄荷味)', '10.24', null, null, '1', '3807512963148');
INSERT INTO `commodity` VALUES ('282', '鲜味巴菲', '10.95', null, null, '1', '9040757626061');
INSERT INTO `commodity` VALUES ('283', '鲜味巴菲(麻辣)', '9.63', null, null, '1', '9117554278586');
INSERT INTO `commodity` VALUES ('284', '鲜味牛奶(巧克力味)', '5.45', null, null, '1', '5162935151271');
INSERT INTO `commodity` VALUES ('285', '鲜味牛奶(香蕉味)', '11.75', null, null, '1', '2818725403388');
INSERT INTO `commodity` VALUES ('286', '鲜味瓜子(香草味)', '9.30', null, null, '1', '8138414795032');
INSERT INTO `commodity` VALUES ('287', '鲜味瓜子(麻辣)', '13.73', null, null, '1', '8617198145322');
INSERT INTO `commodity` VALUES ('288', '鲜味甜筒(哈密瓜味)', '5.03', null, null, '1', '6706748890383');
INSERT INTO `commodity` VALUES ('289', '鲜味糖果(香芋)', '8.87', null, null, '1', '9132241828627');
INSERT INTO `commodity` VALUES ('290', '鲜味薯片(菠萝味)', '13.63', null, null, '1', '8069333950682');
INSERT INTO `commodity` VALUES ('291', '鲜味蛋糕', '4.07', null, null, '1', '0841984802972');
INSERT INTO `commodity` VALUES ('292', '鲜味酸奶(香芋)', '7.77', null, null, '1', '5509021918810');
INSERT INTO `commodity` VALUES ('293', '鲜味酸奶(黄瓜味)', '10.24', null, null, '1', '3859613027705');
INSERT INTO `commodity` VALUES ('294', '鲜味雪糕', '14.89', null, null, '1', '9858240195666');
INSERT INTO `commodity` VALUES ('295', '鲜味雪糕(芥末味)', '4.18', null, null, '1', '4702049489998');
INSERT INTO `commodity` VALUES ('296', '鲜味面包', '3.96', null, null, '1', '0041846290049');
INSERT INTO `commodity` VALUES ('297', '鲜味面包(草莓味)', '11.97', null, null, '1', '3859580498526');
INSERT INTO `commodity` VALUES ('298', '鲜味饼干(哈密瓜味)', '8.59', null, null, '1', '8821099375423');

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
  `state` tinyint(4) DEFAULT '0',
  PRIMARY KEY (`poid`),
  UNIQUE KEY `bno_uq` (`bno`) USING HASH,
  KEY `pOrder4sp` (`spid`),
  CONSTRAINT `pOrder4sp` FOREIGN KEY (`spid`) REFERENCES `supplier` (`spid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of purchaseorder
-- ----------------------------

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
  `poiDate` datetime DEFAULT NULL,
  PRIMARY KEY (`poiid`),
  KEY `poi2po` (`poid`),
  KEY `poiFromComm` (`cid`),
  CONSTRAINT `poiFromComm` FOREIGN KEY (`cid`) REFERENCES `commodity` (`cid`),
  CONSTRAINT `poi2po` FOREIGN KEY (`poid`) REFERENCES `purchaseorder` (`poid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of purchaseorderitem
-- ----------------------------

-- ----------------------------
-- Table structure for refund
-- ----------------------------
DROP TABLE IF EXISTS `refund`;
CREATE TABLE `refund` (
  `rid` int(11) NOT NULL,
  `cid` int(11) NOT NULL,
  `num` decimal(20,3) DEFAULT NULL,
  `refundDate` datetime DEFAULT NULL,
  `refund` decimal(20,2) DEFAULT NULL,
  PRIMARY KEY (`rid`),
  KEY `refundComm` (`cid`),
  CONSTRAINT `refundComm` FOREIGN KEY (`cid`) REFERENCES `commodity` (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of refund
-- ----------------------------

-- ----------------------------
-- Table structure for salesorder
-- ----------------------------
DROP TABLE IF EXISTS `salesorder`;
CREATE TABLE `salesorder` (
  `soid` int(11) NOT NULL AUTO_INCREMENT,
  `bno` varchar(255) NOT NULL,
  `poDate` datetime DEFAULT NULL,
  `sum` decimal(20,2) DEFAULT NULL,
  PRIMARY KEY (`soid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of salesorder
-- ----------------------------
INSERT INTO `salesorder` VALUES ('1', 'ALX584A2', '2015-03-02 14:59:49', '8.00');
INSERT INTO `salesorder` VALUES ('2', 'DSL168D', '2015-03-02 15:00:49', '16.00');

-- ----------------------------
-- Table structure for salesorderitem
-- ----------------------------
DROP TABLE IF EXISTS `salesorderitem`;
CREATE TABLE `salesorderitem` (
  `soiid` int(11) NOT NULL AUTO_INCREMENT,
  `soid` int(11) NOT NULL,
  `cid` int(11) NOT NULL,
  `num` decimal(20,3) DEFAULT NULL,
  `unitPrice` decimal(10,2) DEFAULT NULL,
  `sum` decimal(20,2) DEFAULT NULL,
  `soiDate` datetime DEFAULT NULL,
  PRIMARY KEY (`soiid`),
  KEY `soiFromComm` (`cid`),
  KEY `soi2so` (`soid`),
  CONSTRAINT `soi2so` FOREIGN KEY (`soid`) REFERENCES `salesorder` (`soid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `soiFromComm` FOREIGN KEY (`cid`) REFERENCES `commodity` (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of salesorderitem
-- ----------------------------
INSERT INTO `salesorderitem` VALUES ('3', '1', '14', '2.000', '4.00', '8.00', '2015-03-02 14:59:49');
INSERT INTO `salesorderitem` VALUES ('4', '2', '14', '4.000', '4.00', '16.00', '2015-03-02 15:01:23');

-- ----------------------------
-- Table structure for staff
-- ----------------------------
DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff` (
  `staffid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL,
  `sname` varchar(255) NOT NULL,
  `gender` varchar(2) NOT NULL,
  `birth` date DEFAULT NULL,
  `post` varchar(255) DEFAULT NULL,
  `service` tinyint(4) DEFAULT NULL,
  `salary` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`staffid`),
  KEY `u2s` (`uid`),
  CONSTRAINT `u2s` FOREIGN KEY (`uid`) REFERENCES `tuser` (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of staff
-- ----------------------------
INSERT INTO `staff` VALUES ('1', '3', '张三', '男', '1989-07-27', '经理', '1', '4000');
INSERT INTO `staff` VALUES ('2', '6', '李四', '男', '1990-01-09', '采购经理', '1', '3000');
INSERT INTO `staff` VALUES ('3', '4', '王红', '女', '1992-01-03', '仓库管理', '1', '2500');
INSERT INTO `staff` VALUES ('4', '5', '马思', '女', '1990-05-05', '销售', '1', '2000');
INSERT INTO `staff` VALUES ('5', null, '李志', '难', '1988-08-08', '销售', '-1', '2200');

-- ----------------------------
-- Table structure for stock
-- ----------------------------
DROP TABLE IF EXISTS `stock`;
CREATE TABLE `stock` (
  `coid` int(11) NOT NULL,
  `num` decimal(20,3) NOT NULL,
  PRIMARY KEY (`coid`),
  CONSTRAINT `co4co` FOREIGN KEY (`coid`) REFERENCES `commodity` (`cid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stock
-- ----------------------------
INSERT INTO `stock` VALUES ('14', '216.000');
INSERT INTO `stock` VALUES ('15', '478.000');
INSERT INTO `stock` VALUES ('16', '417.000');
INSERT INTO `stock` VALUES ('17', '207.000');
INSERT INTO `stock` VALUES ('18', '522.000');
INSERT INTO `stock` VALUES ('19', '265.000');
INSERT INTO `stock` VALUES ('20', '315.000');
INSERT INTO `stock` VALUES ('21', '287.000');
INSERT INTO `stock` VALUES ('22', '201.000');
INSERT INTO `stock` VALUES ('23', '416.000');
INSERT INTO `stock` VALUES ('24', '257.000');
INSERT INTO `stock` VALUES ('25', '197.000');
INSERT INTO `stock` VALUES ('26', '373.000');
INSERT INTO `stock` VALUES ('27', '348.000');
INSERT INTO `stock` VALUES ('28', '85.000');
INSERT INTO `stock` VALUES ('29', '202.000');
INSERT INTO `stock` VALUES ('30', '286.000');
INSERT INTO `stock` VALUES ('31', '366.000');
INSERT INTO `stock` VALUES ('32', '417.000');
INSERT INTO `stock` VALUES ('33', '203.000');
INSERT INTO `stock` VALUES ('34', '277.000');
INSERT INTO `stock` VALUES ('35', '199.000');
INSERT INTO `stock` VALUES ('36', '334.000');
INSERT INTO `stock` VALUES ('37', '450.000');
INSERT INTO `stock` VALUES ('38', '261.000');
INSERT INTO `stock` VALUES ('39', '548.000');
INSERT INTO `stock` VALUES ('40', '179.000');
INSERT INTO `stock` VALUES ('41', '416.000');
INSERT INTO `stock` VALUES ('42', '125.000');
INSERT INTO `stock` VALUES ('43', '293.000');
INSERT INTO `stock` VALUES ('44', '243.000');
INSERT INTO `stock` VALUES ('45', '436.000');
INSERT INTO `stock` VALUES ('46', '429.000');
INSERT INTO `stock` VALUES ('47', '486.000');
INSERT INTO `stock` VALUES ('48', '114.000');
INSERT INTO `stock` VALUES ('49', '438.000');
INSERT INTO `stock` VALUES ('50', '361.000');
INSERT INTO `stock` VALUES ('51', '415.000');
INSERT INTO `stock` VALUES ('52', '198.000');
INSERT INTO `stock` VALUES ('53', '266.000');
INSERT INTO `stock` VALUES ('54', '471.000');
INSERT INTO `stock` VALUES ('55', '262.000');
INSERT INTO `stock` VALUES ('56', '446.000');
INSERT INTO `stock` VALUES ('57', '93.000');
INSERT INTO `stock` VALUES ('58', '285.000');
INSERT INTO `stock` VALUES ('59', '334.000');
INSERT INTO `stock` VALUES ('60', '101.000');
INSERT INTO `stock` VALUES ('61', '378.000');
INSERT INTO `stock` VALUES ('62', '509.000');
INSERT INTO `stock` VALUES ('63', '358.000');
INSERT INTO `stock` VALUES ('64', '291.000');
INSERT INTO `stock` VALUES ('65', '91.000');
INSERT INTO `stock` VALUES ('66', '113.000');
INSERT INTO `stock` VALUES ('67', '74.000');
INSERT INTO `stock` VALUES ('68', '152.000');
INSERT INTO `stock` VALUES ('69', '191.000');
INSERT INTO `stock` VALUES ('70', '274.000');
INSERT INTO `stock` VALUES ('71', '147.000');
INSERT INTO `stock` VALUES ('72', '201.000');
INSERT INTO `stock` VALUES ('73', '379.000');
INSERT INTO `stock` VALUES ('74', '236.000');
INSERT INTO `stock` VALUES ('75', '437.000');
INSERT INTO `stock` VALUES ('76', '534.000');
INSERT INTO `stock` VALUES ('77', '169.000');
INSERT INTO `stock` VALUES ('78', '353.000');
INSERT INTO `stock` VALUES ('79', '259.000');
INSERT INTO `stock` VALUES ('80', '531.000');
INSERT INTO `stock` VALUES ('81', '187.000');
INSERT INTO `stock` VALUES ('82', '242.000');
INSERT INTO `stock` VALUES ('83', '533.000');
INSERT INTO `stock` VALUES ('84', '123.000');
INSERT INTO `stock` VALUES ('85', '364.000');
INSERT INTO `stock` VALUES ('86', '153.000');
INSERT INTO `stock` VALUES ('87', '128.000');
INSERT INTO `stock` VALUES ('88', '296.000');
INSERT INTO `stock` VALUES ('89', '362.000');
INSERT INTO `stock` VALUES ('90', '390.000');
INSERT INTO `stock` VALUES ('91', '221.000');
INSERT INTO `stock` VALUES ('92', '439.000');
INSERT INTO `stock` VALUES ('93', '107.000');
INSERT INTO `stock` VALUES ('94', '336.000');
INSERT INTO `stock` VALUES ('95', '205.000');
INSERT INTO `stock` VALUES ('96', '292.000');
INSERT INTO `stock` VALUES ('97', '240.000');
INSERT INTO `stock` VALUES ('98', '349.000');
INSERT INTO `stock` VALUES ('99', '474.000');
INSERT INTO `stock` VALUES ('100', '175.000');
INSERT INTO `stock` VALUES ('101', '147.000');
INSERT INTO `stock` VALUES ('102', '100.000');
INSERT INTO `stock` VALUES ('103', '386.000');
INSERT INTO `stock` VALUES ('104', '407.000');
INSERT INTO `stock` VALUES ('105', '408.000');
INSERT INTO `stock` VALUES ('106', '140.000');
INSERT INTO `stock` VALUES ('107', '308.000');
INSERT INTO `stock` VALUES ('108', '276.000');
INSERT INTO `stock` VALUES ('109', '163.000');
INSERT INTO `stock` VALUES ('110', '306.000');
INSERT INTO `stock` VALUES ('111', '382.000');
INSERT INTO `stock` VALUES ('112', '127.000');
INSERT INTO `stock` VALUES ('113', '351.000');
INSERT INTO `stock` VALUES ('114', '360.000');
INSERT INTO `stock` VALUES ('115', '545.000');
INSERT INTO `stock` VALUES ('116', '181.000');
INSERT INTO `stock` VALUES ('117', '197.000');
INSERT INTO `stock` VALUES ('118', '80.000');
INSERT INTO `stock` VALUES ('119', '350.000');
INSERT INTO `stock` VALUES ('120', '423.000');
INSERT INTO `stock` VALUES ('121', '90.000');
INSERT INTO `stock` VALUES ('122', '350.000');
INSERT INTO `stock` VALUES ('123', '304.000');
INSERT INTO `stock` VALUES ('124', '423.000');
INSERT INTO `stock` VALUES ('125', '176.000');
INSERT INTO `stock` VALUES ('126', '140.000');
INSERT INTO `stock` VALUES ('127', '249.000');
INSERT INTO `stock` VALUES ('128', '288.000');
INSERT INTO `stock` VALUES ('129', '541.000');
INSERT INTO `stock` VALUES ('130', '148.000');
INSERT INTO `stock` VALUES ('131', '240.000');
INSERT INTO `stock` VALUES ('132', '447.000');
INSERT INTO `stock` VALUES ('133', '332.000');
INSERT INTO `stock` VALUES ('134', '228.000');
INSERT INTO `stock` VALUES ('135', '492.000');
INSERT INTO `stock` VALUES ('136', '335.000');
INSERT INTO `stock` VALUES ('137', '475.000');
INSERT INTO `stock` VALUES ('138', '153.000');
INSERT INTO `stock` VALUES ('139', '158.000');
INSERT INTO `stock` VALUES ('140', '124.000');
INSERT INTO `stock` VALUES ('141', '438.000');
INSERT INTO `stock` VALUES ('142', '147.000');
INSERT INTO `stock` VALUES ('143', '100.000');
INSERT INTO `stock` VALUES ('144', '486.000');
INSERT INTO `stock` VALUES ('145', '543.000');
INSERT INTO `stock` VALUES ('146', '65.000');
INSERT INTO `stock` VALUES ('147', '296.000');
INSERT INTO `stock` VALUES ('148', '533.000');
INSERT INTO `stock` VALUES ('149', '412.000');
INSERT INTO `stock` VALUES ('150', '529.000');
INSERT INTO `stock` VALUES ('151', '199.000');
INSERT INTO `stock` VALUES ('152', '415.000');
INSERT INTO `stock` VALUES ('153', '496.000');
INSERT INTO `stock` VALUES ('154', '294.000');
INSERT INTO `stock` VALUES ('155', '142.000');
INSERT INTO `stock` VALUES ('156', '261.000');
INSERT INTO `stock` VALUES ('157', '453.000');
INSERT INTO `stock` VALUES ('158', '88.000');
INSERT INTO `stock` VALUES ('159', '300.000');
INSERT INTO `stock` VALUES ('160', '530.000');
INSERT INTO `stock` VALUES ('161', '323.000');
INSERT INTO `stock` VALUES ('162', '154.000');
INSERT INTO `stock` VALUES ('163', '327.000');
INSERT INTO `stock` VALUES ('164', '540.000');
INSERT INTO `stock` VALUES ('165', '524.000');
INSERT INTO `stock` VALUES ('166', '237.000');
INSERT INTO `stock` VALUES ('167', '452.000');
INSERT INTO `stock` VALUES ('168', '392.000');
INSERT INTO `stock` VALUES ('169', '175.000');
INSERT INTO `stock` VALUES ('170', '272.000');
INSERT INTO `stock` VALUES ('171', '215.000');
INSERT INTO `stock` VALUES ('172', '210.000');
INSERT INTO `stock` VALUES ('173', '91.000');
INSERT INTO `stock` VALUES ('174', '61.000');
INSERT INTO `stock` VALUES ('175', '470.000');
INSERT INTO `stock` VALUES ('176', '117.000');
INSERT INTO `stock` VALUES ('177', '65.000');
INSERT INTO `stock` VALUES ('178', '289.000');
INSERT INTO `stock` VALUES ('179', '472.000');
INSERT INTO `stock` VALUES ('180', '96.000');
INSERT INTO `stock` VALUES ('181', '180.000');
INSERT INTO `stock` VALUES ('182', '287.000');
INSERT INTO `stock` VALUES ('183', '69.000');
INSERT INTO `stock` VALUES ('184', '409.000');
INSERT INTO `stock` VALUES ('185', '440.000');
INSERT INTO `stock` VALUES ('186', '533.000');
INSERT INTO `stock` VALUES ('187', '507.000');
INSERT INTO `stock` VALUES ('188', '520.000');
INSERT INTO `stock` VALUES ('189', '409.000');
INSERT INTO `stock` VALUES ('190', '490.000');
INSERT INTO `stock` VALUES ('191', '356.000');
INSERT INTO `stock` VALUES ('192', '512.000');
INSERT INTO `stock` VALUES ('193', '384.000');
INSERT INTO `stock` VALUES ('194', '480.000');
INSERT INTO `stock` VALUES ('195', '288.000');
INSERT INTO `stock` VALUES ('196', '297.000');
INSERT INTO `stock` VALUES ('197', '315.000');
INSERT INTO `stock` VALUES ('198', '427.000');
INSERT INTO `stock` VALUES ('199', '266.000');
INSERT INTO `stock` VALUES ('200', '493.000');
INSERT INTO `stock` VALUES ('201', '290.000');
INSERT INTO `stock` VALUES ('202', '455.000');
INSERT INTO `stock` VALUES ('203', '190.000');
INSERT INTO `stock` VALUES ('204', '181.000');
INSERT INTO `stock` VALUES ('205', '377.000');
INSERT INTO `stock` VALUES ('206', '479.000');
INSERT INTO `stock` VALUES ('207', '140.000');
INSERT INTO `stock` VALUES ('208', '372.000');
INSERT INTO `stock` VALUES ('209', '504.000');
INSERT INTO `stock` VALUES ('210', '108.000');
INSERT INTO `stock` VALUES ('211', '144.000');
INSERT INTO `stock` VALUES ('212', '359.000');
INSERT INTO `stock` VALUES ('213', '307.000');
INSERT INTO `stock` VALUES ('214', '354.000');
INSERT INTO `stock` VALUES ('215', '281.000');
INSERT INTO `stock` VALUES ('216', '291.000');
INSERT INTO `stock` VALUES ('217', '50.000');
INSERT INTO `stock` VALUES ('218', '393.000');
INSERT INTO `stock` VALUES ('219', '462.000');
INSERT INTO `stock` VALUES ('220', '215.000');
INSERT INTO `stock` VALUES ('221', '261.000');
INSERT INTO `stock` VALUES ('222', '279.000');
INSERT INTO `stock` VALUES ('223', '439.000');
INSERT INTO `stock` VALUES ('224', '459.000');
INSERT INTO `stock` VALUES ('225', '159.000');
INSERT INTO `stock` VALUES ('226', '330.000');
INSERT INTO `stock` VALUES ('227', '376.000');
INSERT INTO `stock` VALUES ('228', '212.000');
INSERT INTO `stock` VALUES ('229', '287.000');
INSERT INTO `stock` VALUES ('230', '76.000');
INSERT INTO `stock` VALUES ('231', '311.000');
INSERT INTO `stock` VALUES ('232', '328.000');
INSERT INTO `stock` VALUES ('233', '482.000');
INSERT INTO `stock` VALUES ('234', '513.000');
INSERT INTO `stock` VALUES ('235', '421.000');
INSERT INTO `stock` VALUES ('236', '352.000');
INSERT INTO `stock` VALUES ('237', '418.000');
INSERT INTO `stock` VALUES ('238', '113.000');
INSERT INTO `stock` VALUES ('239', '248.000');
INSERT INTO `stock` VALUES ('240', '499.000');
INSERT INTO `stock` VALUES ('241', '462.000');
INSERT INTO `stock` VALUES ('242', '413.000');
INSERT INTO `stock` VALUES ('243', '433.000');
INSERT INTO `stock` VALUES ('244', '319.000');
INSERT INTO `stock` VALUES ('245', '476.000');
INSERT INTO `stock` VALUES ('246', '261.000');
INSERT INTO `stock` VALUES ('247', '518.000');
INSERT INTO `stock` VALUES ('248', '529.000');
INSERT INTO `stock` VALUES ('249', '478.000');
INSERT INTO `stock` VALUES ('250', '179.000');
INSERT INTO `stock` VALUES ('251', '57.000');
INSERT INTO `stock` VALUES ('252', '531.000');
INSERT INTO `stock` VALUES ('253', '244.000');
INSERT INTO `stock` VALUES ('254', '113.000');
INSERT INTO `stock` VALUES ('255', '63.000');
INSERT INTO `stock` VALUES ('256', '432.000');
INSERT INTO `stock` VALUES ('257', '500.000');
INSERT INTO `stock` VALUES ('258', '237.000');
INSERT INTO `stock` VALUES ('259', '280.000');
INSERT INTO `stock` VALUES ('260', '429.000');
INSERT INTO `stock` VALUES ('261', '314.000');
INSERT INTO `stock` VALUES ('262', '327.000');
INSERT INTO `stock` VALUES ('263', '342.000');
INSERT INTO `stock` VALUES ('264', '257.000');
INSERT INTO `stock` VALUES ('265', '113.000');
INSERT INTO `stock` VALUES ('266', '140.000');
INSERT INTO `stock` VALUES ('267', '128.000');
INSERT INTO `stock` VALUES ('268', '488.000');
INSERT INTO `stock` VALUES ('269', '535.000');
INSERT INTO `stock` VALUES ('270', '121.000');
INSERT INTO `stock` VALUES ('271', '455.000');
INSERT INTO `stock` VALUES ('272', '307.000');
INSERT INTO `stock` VALUES ('273', '396.000');
INSERT INTO `stock` VALUES ('274', '223.000');
INSERT INTO `stock` VALUES ('275', '305.000');
INSERT INTO `stock` VALUES ('276', '548.000');
INSERT INTO `stock` VALUES ('277', '109.000');
INSERT INTO `stock` VALUES ('278', '514.000');
INSERT INTO `stock` VALUES ('279', '387.000');
INSERT INTO `stock` VALUES ('280', '125.000');
INSERT INTO `stock` VALUES ('281', '279.000');
INSERT INTO `stock` VALUES ('282', '261.000');
INSERT INTO `stock` VALUES ('283', '156.000');
INSERT INTO `stock` VALUES ('284', '166.000');
INSERT INTO `stock` VALUES ('285', '503.000');
INSERT INTO `stock` VALUES ('286', '99.000');
INSERT INTO `stock` VALUES ('287', '323.000');
INSERT INTO `stock` VALUES ('288', '65.000');
INSERT INTO `stock` VALUES ('289', '90.000');
INSERT INTO `stock` VALUES ('290', '436.000');
INSERT INTO `stock` VALUES ('291', '475.000');
INSERT INTO `stock` VALUES ('292', '364.000');
INSERT INTO `stock` VALUES ('293', '486.000');
INSERT INTO `stock` VALUES ('294', '194.000');
INSERT INTO `stock` VALUES ('295', '113.000');
INSERT INTO `stock` VALUES ('296', '319.000');
INSERT INTO `stock` VALUES ('297', '181.000');
INSERT INTO `stock` VALUES ('298', '59.000');

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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of supplier
-- ----------------------------
INSERT INTO `supplier` VALUES ('4', '健康饮食批发', 'xx路xx号', null, null);
INSERT INTO `supplier` VALUES ('5', '快乐零售', 'xx路xx号', null, null);
INSERT INTO `supplier` VALUES ('6', '多多多批发', 'xx路xx号', null, null);
INSERT INTO `supplier` VALUES ('7', '有家商店', 'xx路xx号', null, null);
INSERT INTO `supplier` VALUES ('8', '宜家家居', 'xx路xx号', null, null);

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
  KEY `userstaff` (`staffid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tuser
-- ----------------------------
INSERT INTO `tuser` VALUES ('2', 'admin', 'admin', '7', null);
INSERT INTO `tuser` VALUES ('3', 'saki', '123456', '4', null);
INSERT INTO `tuser` VALUES ('4', 'losee', '123456', '2', null);
INSERT INTO `tuser` VALUES ('5', 'blue', '123456', '1', null);
INSERT INTO `tuser` VALUES ('6', 'alis', '123456', '3', null);

-- ----------------------------
-- View structure for statusofsales
-- ----------------------------
DROP VIEW IF EXISTS `statusofsales`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER  VIEW `statusofsales` AS SELECT
salesorderitem.cid,
Sum(salesorderitem.num) AS num,
salesorderitem.unitPrice,
Sum(salesorderitem.sum) AS sum,
CONVERT(salesorderitem.soiDate, DATE) AS soiDate,
commodity.cname,
commodity.sales_price,
commodity.about,
commodity.path,
commodity.state,
commodity.ccodes
FROM
salesorderitem
INNER JOIN commodity ON salesorderitem.cid = commodity.cid
GROUP BY
CONVERT(salesorderitem.soiDate, DATE) ;
