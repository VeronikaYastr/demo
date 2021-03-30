CREATE TABLE IF NOT EXISTS post
(

    id         varchar(50) NOT NULL PRIMARY KEY,
    name       varchar(20) NOT NULL
);

INSERT INTO post values ('testId', 'Test post');