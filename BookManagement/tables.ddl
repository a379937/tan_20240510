create table bookmas(
book_id_seq number primary key,
name varchar2(50),
author varchar2(50),
publisher varchar2(50),
note varchar2(300),
isbn varchar2(30),
category_class char(1),
regdate date,
lendstatus_class char(1),
lend_userid  number,
lend_date date,
deadline_date date,
res_status_class char(1),
res_userid number

);
create sequence bookmas_id_seq increment by 1  start with 1000;

COMMENT ON TABLE bookmas IS '書籍マスタ';
COMMENT ON COLUMN bookmas.book_id_seq  IS '書籍ID';
COMMENT ON COLUMN bookmas.name  IS '書名';
COMMENT ON COLUMN bookmas.author  IS '著者名';
COMMENT ON COLUMN bookmas.publisher  IS '出版社';
COMMENT ON COLUMN bookmas.note  IS '内容注記';
COMMENT ON COLUMN bookmas.isbn  IS 'ISBN';
COMMENT ON COLUMN bookmas.category_class  IS 'カテゴリ区分';
COMMENT ON COLUMN bookmas.regdate IS '登録日';
COMMENT ON COLUMN bookmas.lendstatus_class  IS '貸出状態区分';
COMMENT ON COLUMN bookmas.lend_userid  IS '貸出ユーザID';
COMMENT ON COLUMN bookmas.lend_date  IS '貸出日付';
COMMENT ON COLUMN bookmas.deadline_date  IS '返却期限';
COMMENT ON COLUMN bookmas.res_status_class  IS '予約状態区分';
COMMENT ON COLUMN bookmas.res_userid  IS '予約ユーザID';

create table usermas(
user_id_seq number primary key,
password varchar2(10),
name varchar2(50),
mail varchar2(20),
tel  varchar2(20),
role_class char(1),
startdate date,
enddate   date
);
create sequence usermas_id_seq increment by 1  start with 1000;

COMMENT ON TABLE usermas IS 'ユーザマスタ';
COMMENT ON COLUMN usermas.user_id_seq  IS 'ユーザID';
COMMENT ON COLUMN usermas.password  IS 'パスワード';
COMMENT ON COLUMN usermas.name  IS 'ユーザ名';
COMMENT ON COLUMN usermas.mail  IS 'メール';
COMMENT ON COLUMN usermas.tel  IS '電話番号';
COMMENT ON COLUMN usermas.role_class  IS '権限区分';
COMMENT ON COLUMN usermas.startdate  IS '開始日';
COMMENT ON COLUMN usermas.enddate  IS '終了日';

create table history(
book_id_seq number,
user_id_seq number,
lend_date date,
return_date date
);
COMMENT ON TABLE history IS '履歴';
COMMENT ON COLUMN history.book_id_seq  IS '書籍ID';
COMMENT ON COLUMN history.user_id_seq  IS 'ユーザID';
COMMENT ON COLUMN history.lend_date  IS '貸出日付';
COMMENT ON COLUMN history.return_date  IS '返却日付';

commit;