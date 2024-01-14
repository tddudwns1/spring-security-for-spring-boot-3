DROP TABLE IF EXISTS member;
create table member
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    userid varchar(255) not null,
    pw varchar(255) not null,
    roles varchar(255) not null,
    unique (userid)
);