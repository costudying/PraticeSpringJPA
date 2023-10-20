create database orderInfo;

grant all privileges on orderInfo.* to ohgiraffers@'%';

use orderInfo;

CREATE TABLE `ORDER_LIST`
(
    `ORDER_ID`    INT AUTO_INCREMENT NOT NULL,
    `ORDER_STATUS`    VARCHAR(100) NOT NULL,
    `ORDER_DATE`    VARCHAR(100) NOT NULL COMMENT '주문일자',
    `ORDER_PRICE`    INT COMMENT '주문금액',
    `ORDERER`    varchar(36) NOT NULL,
    `SIZE`   VARCHAR(200),
 PRIMARY KEY ( `ORDER_ID` )
);


INSERT INTO ORDER_LIST (ORDER_STATUS, ORDER_DATE,ORDER_PRICE,ORDERER,SIZE)
values
('10', '20231010', 30000, '홍길동', 'XL')
,('20', '20231010', 20000, '김길동', 'XL')
,('30', '20231010', 1000, '박길동', 'L')
,('30', '20231013', 10000, '백길동', 'XXL')
,('40', '20231014', 5400, '공길동', 'XXL')
,('50', '20231014', 6600, '공길동', 'XXL')
,('50', '20231014', 35000, '공길동', 'XXL')
,('70', '20231014', 7850, '김길동', 'XL');


CREATE TABLE `ORDER_STATUS`
(
    `STATUS_NUM`    VARCHAR(100) NOT NULL,
    `STATUS`    VARCHAR(100) NOT NULL,
 PRIMARY KEY ( `STATUS_NUM` )
);

INSERT INTO order_status ( STATUS_NUM, STATUS)
values
('10', '제작 요청')
,('20', '제작 반려')
,('30', '제작 승인')
,('40', '결제 완료')
,('50', '제작 중')
,('60', '제작 완료')
,('70', '배송 중')
,('80', '배송 완료')
,('90', '주문 취소');

