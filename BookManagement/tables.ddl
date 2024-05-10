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

COMMENT ON TABLE bookmas IS '���Ѓ}�X�^';
COMMENT ON COLUMN bookmas.book_id_seq  IS '����ID';
COMMENT ON COLUMN bookmas.name  IS '����';
COMMENT ON COLUMN bookmas.author  IS '���Җ�';
COMMENT ON COLUMN bookmas.publisher  IS '�o�Ŏ�';
COMMENT ON COLUMN bookmas.note  IS '���e���L';
COMMENT ON COLUMN bookmas.isbn  IS 'ISBN';
COMMENT ON COLUMN bookmas.category_class  IS '�J�e�S���敪';
COMMENT ON COLUMN bookmas.regdate IS '�o�^��';
COMMENT ON COLUMN bookmas.lendstatus_class  IS '�ݏo��ԋ敪';
COMMENT ON COLUMN bookmas.lend_userid  IS '�ݏo���[�UID';
COMMENT ON COLUMN bookmas.lend_date  IS '�ݏo���t';
COMMENT ON COLUMN bookmas.deadline_date  IS '�ԋp����';
COMMENT ON COLUMN bookmas.res_status_class  IS '�\���ԋ敪';
COMMENT ON COLUMN bookmas.res_userid  IS '�\�񃆁[�UID';

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

COMMENT ON TABLE usermas IS '���[�U�}�X�^';
COMMENT ON COLUMN usermas.user_id_seq  IS '���[�UID';
COMMENT ON COLUMN usermas.password  IS '�p�X���[�h';
COMMENT ON COLUMN usermas.name  IS '���[�U��';
COMMENT ON COLUMN usermas.mail  IS '���[��';
COMMENT ON COLUMN usermas.tel  IS '�d�b�ԍ�';
COMMENT ON COLUMN usermas.role_class  IS '�����敪';
COMMENT ON COLUMN usermas.startdate  IS '�J�n��';
COMMENT ON COLUMN usermas.enddate  IS '�I����';

create table history(
book_id_seq number,
user_id_seq number,
lend_date date,
return_date date
);
COMMENT ON TABLE history IS '����';
COMMENT ON COLUMN history.book_id_seq  IS '����ID';
COMMENT ON COLUMN history.user_id_seq  IS '���[�UID';
COMMENT ON COLUMN history.lend_date  IS '�ݏo���t';
COMMENT ON COLUMN history.return_date  IS '�ԋp���t';

commit;