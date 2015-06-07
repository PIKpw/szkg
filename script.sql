CREATE TABLE `users`(
  `username` varchar (50) NOT NULL,
  `password` varchar (50) NOT NULL,
  `enabled` boolean NOT NULL,
  PRIMARY KEY (`username`)
) DEFAULT CHARSET=utf8;
commit;

CREATE TABLE `authorities` (
  `username` varchar (50) NOT NULL,
  `authority` varchar (50) NOT NULL,
  CONSTRAINT fk_authorities_users foreign key(username) references users(username)
) DEFAULT CHARSET=utf8;

create unique index ix_auth_username on
  authorities (username, authority);
commit;

CREATE TABLE `Games` (
  `id` int(5) unsigned NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(50) NOT NULL,
  `name` varchar(40) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  `wishList` BOOLEAN NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_USERS_USERNAME` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
) DEFAULT CHARSET=utf8;
commit;

CREATE TABLE `Categories` (
  `id` int(5) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) DEFAULT CHARSET=utf8;
commit;

CREATE TABLE `GameCategories` (
  `game_id` int(5) unsigned NOT NULL,
  `category_id` int(5) unsigned NOT NULL,
  PRIMARY KEY (`game_id`,`category_id`),
  CONSTRAINT `FK_CATEGORY_ID` FOREIGN KEY (`category_id`) REFERENCES `Categories` (`id`),
  CONSTRAINT `FK_GAME_ID` FOREIGN KEY (`game_id`) REFERENCES `Games` (`id`)
) DEFAULT CHARSET=utf8;
commit;

CREATE TABLE `GameImages` (
  `game_id` int(5) unsigned NOT NULL,
  `image` BLOB,
  PRIMARY KEY (`game_id`),
  CONSTRAINT `FK_IMG_GAME_ID` FOREIGN KEY (`game_id`) REFERENCES `Games` (`id`)
) DEFAULT CHARSET=utf8;
commit;

insert into users(username, password, enabled) values
  ("mikolaj", "pass", true);

insert into authorities(username, authority) values
  ("mikolaj", "ROLE_USER");

insert into users(username, password, enabled) values
  ("user", "pass", true);

insert into authorities(username, authority) values
  ("user", "ROLE_USER");

commit;