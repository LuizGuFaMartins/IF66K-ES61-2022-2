CREATE SCHEMA IF NOT EXISTS `forpets` DEFAULT CHARACTER SET utf8 ;
USE `forpets` ;

CREATE TABLE IF NOT EXISTS usuario (
	id_user INT NOT NULL AUTO_INCREMENT,
	login_user VARCHAR(45) NOT NULL,	
	senha_user VARCHAR(45) NOT NULL,
	PRIMARY KEY (id_user) 
);

INSERT INTO usuario (login_user, senha_user ) VALUES ("login", "123456");
INSERT INTO usuario (login_user, senha_user ) VALUES ("login", "123456");

