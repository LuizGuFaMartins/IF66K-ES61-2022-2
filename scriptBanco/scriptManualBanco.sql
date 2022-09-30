CREATE SCHEMA IF NOT EXISTS `forpets` DEFAULT CHARACTER SET utf8 ;
USE `forpets` ;

CREATE TABLE IF NOT EXISTS usuario (
	id_user INT NOT NULL AUTO_INCREMENT,
	login_user VARCHAR(45) NOT NULL,	
	senha_user VARCHAR(45) NOT NULL,
	PRIMARY KEY (id_user) 
);

create table if not exists funcionario(
id_func int primary key not null ,
nome_func varchar(50),
cpf_func int not null,
cargo_func varchar(30),
senha_func varchar(50) not null
);

INSERT INTO usuario (login_user, senha_user ) VALUES ("login", "123456");
INSERT INTO usuario (login_user, senha_user ) VALUES ("login", "123456");
