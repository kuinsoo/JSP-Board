CREATE TABLE BOARD.POST
(
    NO VARCHAR2(50) PRIMARY KEY NOT NULL,
    TITLE VARCHAR2(90) NOT NULL,
    CONTENT CLOB,
    RDATE DATE,
    WRITER VARCHAR2(14),
    BOARDNO VARCHAR2(50),
    RECURSION VARCHAR2(50),
    GROUPNO VARCHAR2(50),
    CONSTRAINT FK_MEMBER_TO_POST FOREIGN KEY (WRITER) REFERENCES BOARD.MEMBER (ID),
    CONSTRAINT FK_BOARD_TO_POST FOREIGN KEY (BOARDNO) REFERENCES BOARD.BOARD (NO) ON DELETE CASCADE,
    CONSTRAINT FK_POST_TO_POST FOREIGN KEY (RECURSION) REFERENCES BOARD.POST (NO)
);
COMMENT ON COLUMN BOARD.POST.NO IS '게시글번호';
COMMENT ON COLUMN BOARD.POST.TITLE IS '제목';
COMMENT ON COLUMN BOARD.POST.CONTENT IS '내용';
COMMENT ON COLUMN BOARD.POST.RDATE IS '작성일시';
COMMENT ON COLUMN BOARD.POST.WRITER IS '작성자 ID';
COMMENT ON COLUMN BOARD.POST.BOARDNO IS '게시판번호';
COMMENT ON COLUMN BOARD.POST.RECURSION IS '부모게시글번호';
INSERT INTO BOARD.POST (NO, TITLE, CONTENT, RDATE, WRITER, BOARDNO, RECURSION, GROUPNO) VALUES ('11', '제목은 지금 달려갑니다.', '이렇게 우리는 만났습니다.', TO_DATE('2018-10-18 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'sally', '51', null, '11');
INSERT INTO BOARD.POST (NO, TITLE, CONTENT, RDATE, WRITER, BOARDNO, RECURSION, GROUPNO) VALUES ('12', '제목은 지금 달려갑니다.', '이렇게 우리는 만났습니다.', TO_DATE('2018-10-18 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'sally', '51', null, '12');
INSERT INTO BOARD.POST (NO, TITLE, CONTENT, RDATE, WRITER, BOARDNO, RECURSION, GROUPNO) VALUES ('13', '제목은 지금 달려갑니다.', '이렇게 우리는 만났습니다.', TO_DATE('2018-10-18 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'sally', '51', null, '13');
INSERT INTO BOARD.POST (NO, TITLE, CONTENT, RDATE, WRITER, BOARDNO, RECURSION, GROUPNO) VALUES ('15', '지금 달려갑니다.', '이렇게 우리는 만났습니다.', TO_DATE('2018-10-18 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'james', '51', '11', null);
INSERT INTO BOARD.POST (NO, TITLE, CONTENT, RDATE, WRITER, BOARDNO, RECURSION, GROUPNO) VALUES ('16', '지금 달려갑니다.', '이렇게 우리는 만났습니다.', TO_DATE('2018-10-18 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'moon', '51', '12', null);
INSERT INTO BOARD.POST (NO, TITLE, CONTENT, RDATE, WRITER, BOARDNO, RECURSION, GROUPNO) VALUES ('17', '지금 달려갑니다.', '이렇게 우리는 만났습니다.', TO_DATE('2018-10-18 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'moon', '51', '13', null);
INSERT INTO BOARD.POST (NO, TITLE, CONTENT, RDATE, WRITER, BOARDNO, RECURSION, GROUPNO) VALUES ('18', '지금 달려갑니다.', '이렇게 우리는 만났습니다.', TO_DATE('2018-10-18 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'cony', '51', '11', null);
INSERT INTO BOARD.POST (NO, TITLE, CONTENT, RDATE, WRITER, BOARDNO, RECURSION, GROUPNO) VALUES ('19', '지금 달려갑니다.', '이렇게 우리는 만났습니다.', TO_DATE('2018-10-18 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'xxxx1', '51', '13', null);
INSERT INTO BOARD.POST (NO, TITLE, CONTENT, RDATE, WRITER, BOARDNO, RECURSION, GROUPNO) VALUES ('20', '지금 달려갑니다.', '이렇게 우리는 만났습니다.', TO_DATE('2018-10-18 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'xxxx2', '51', '11', null);
INSERT INTO BOARD.POST (NO, TITLE, CONTENT, RDATE, WRITER, BOARDNO, RECURSION, GROUPNO) VALUES ('21', '지금 달려갑니다.', '이렇게 우리는 만났습니다.', TO_DATE('2018-10-18 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'brown', '51', '12', null);
INSERT INTO BOARD.POST (NO, TITLE, CONTENT, RDATE, WRITER, BOARDNO, RECURSION, GROUPNO) VALUES ('22', '지금 달려갑니다.', '이렇게 우리는 만났습니다.', TO_DATE('2018-10-18 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'brown', '51', '20', null);
INSERT INTO BOARD.POST (NO, TITLE, CONTENT, RDATE, WRITER, BOARDNO, RECURSION, GROUPNO) VALUES ('23', '지금 달려갑니다.', '이렇게 우리는 만났습니다.', TO_DATE('2018-10-18 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'brown', '51', '19', null);
INSERT INTO BOARD.POST (NO, TITLE, CONTENT, RDATE, WRITER, BOARDNO, RECURSION, GROUPNO) VALUES ('24', '지금 달려갑니다.', '이렇게 우리는 만났습니다.', TO_DATE('2018-10-18 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 'brown', '51', '19', null);