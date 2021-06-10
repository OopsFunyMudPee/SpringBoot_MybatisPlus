DROP TABLE IF EXISTS test_user;
CREATE TABLE test_user
(
    id          BIGINT(20) PRIMARY KEY NOT NULL COMMENT '主键',
    name        VARCHAR(30) DEFAULT NULL COMMENT '姓名',
    age         INT(11)     DEFAULT NULL COMMENT '年龄',
    email       VARCHAR(50) DEFAULT NULL COMMENT '邮箱',
    manager_id  BIGINT(20)  DEFAULT NULL COMMENT '直属上级id',
    create_time DATETIME    DEFAULT NULL COMMENT '创建时间',
    CONSTRAINT manager_fk FOREIGN KEY (manager_id) REFERENCES user (id)
) ENGINE = INNODB
  CHARSET = UTF8;

INSERT INTO test_user (id, name, age, email, manager_id, create_time)
VALUES (1, '大BOSS', 40, 'boss@baomidou.com', NULL, '2021-03-22 09:48:00'),
       (2, '李经理', 40, 'boss@baomidou.com', 1, '2021-01-22 09:48:00'),
       (3, '黄主管', 40, 'boss@baomidou.com', 2, '2021-01-22 09:48:00'),
       (4, '吴组长', 40, 'boss@baomidou.com', 2, '2021-02-22 09:48:00'),
       (5, '小菜', 40, 'boss@baomidou.com', 2, '2021-02-22 09:48:00')