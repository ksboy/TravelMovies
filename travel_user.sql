CREATE DATABASE IF NOT EXISTS travel;
CREATE TABLE IF NOT EXISTS user
(
    userid INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);
CREATE UNIQUE INDEX user_userid_uindex ON user (userid);
CREATE UNIQUE INDEX user_username_uindex ON user (username);
ALTER TABLE user COMMENT = '”√ªß';
