CREATE DATABASE IF NOT EXISTS travel;
CREATE TABLE IF NOT EXISTS user
(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    nickname VARCHAR(50) NOT NULL,
    question VARCHAR(255) NOT NULL,
    answer VARCHAR(255) NOT NULL,
    password VARCHAR(50) NOT NULL,
    avartar VARCHAR(255) DEFAULT 0 NOT NULL,
    age INT,
    gender INT,
    birth_date DATE,
    bio VARCHAR(600),
    tags VARCHAR(300)
);
CREATE UNIQUE INDEX user_id_uindex ON user (id);
CREATE UNIQUE INDEX user_name_uindex ON user (name);

CREATE TABLE IF NOT EXISTS user_follow
(
    self_id INT NOT NULL,
    follow_id INT NOT NULL
);

CREATE TABLE IF NOT EXISTS description
(
    item_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    user_id INT NOT NULL,
    x DOUBLE NOT NULL,
    y DOUBLE NOT NULL,
    place VARCHAR(600),
    visible INT DEFAULT '1' NOT NULL,
    content VARCHAR(600),
    movie VARCHAR(255) NOT NULL,
    thoughts VARCHAR(600),
    tags VARCHAR(600)
);
CREATE UNIQUE INDEX description_item_id_uindex ON description (item_id);

CREATE TABLE IF NOT EXISTS fav_description
(
    user_id INT NOT NULL,
    item_id INT NOT NULL
);

CREATE TABLE IF NOT EXISTS route
(
    user_id INT NOT NULL,
    route_id INT PRIMARY KEY AUTO_INCREMENT,
    item_ids VARCHAR(500) NOT NULL,
    des VARCHAR(500)
);
CREATE UNIQUE INDEX route_route_id_uindex ON route (route_id);
