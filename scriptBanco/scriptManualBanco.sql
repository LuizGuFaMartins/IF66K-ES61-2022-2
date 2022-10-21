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

CREATE TABLE IF NOT EXISTS cliente (
  id_cli INT NOT NULL AUTO_INCREMENT,
  cpf_cli VARCHAR(20) NOT NULL,
  nome_cli VARCHAR(45) NOT NULL,
  tel_cli VARCHAR(45) NOT NULL,
  cep_cli VARCHAR(45) NOT NULL,
  estado_cli VARCHAR(45) NOT NULL,
  cidade_cli VARCHAR(45) NOT NULL,
  logradouro_cli VARCHAR(45) NOT NULL,
  bairro VARCHAR(45) NOT NULL,
  PRIMARY KEY (id_cli)
);

INSERT INTO cliente (cpf_cli, nome_cli, tel_cli, cep_cli, estado_cli, cidade_cli, logradouro_cli, bairro) 
VALUES ("333.123.789-23", "Jeremias", "(43) 99999-8888", "78945-444", "PR", "Curitiba", "Corguinho", "Fim da rua");
INSERT INTO cliente (cpf_cli, nome_cli, tel_cli, cep_cli, estado_cli, cidade_cli, logradouro_cli, bairro) 
VALUES ("333.123.789-21", "Florildas", "(50) 97777-8888", "78945-444", "PR", "Curitiba", "Corguinho", "Fim da rua");

CREATE TABLE IF NOT EXISTS animal (
  id_ani INT NOT NULL AUTO_INCREMENT,
  nome_ani VARCHAR(45) NOT NULL,
  raca_ani VARCHAR(45) NOT NULL,
  porte_ani VARCHAR(45) NOT NULL,
  dataNasc_ani VARCHAR(45) NOT NULL,
  idade_ani VARCHAR(45) NOT NULL,
  Cliente_id_cli VARCHAR(45) NOT NULL,
  PRIMARY KEY (id_ani)
);

INSERT INTO animal (id_ani, nome_ani, raca_ani, porte_ani, dataNasc_ani, idade_ani, Cliente_id_cli) 
VALUES ("3", "Bolinha", "Labrador", "Medio", "12/12/2012", "9", "3");
INSERT INTO animal (id_ani, nome_ani, raca_ani, porte_ani, dataNasc_ani, idade_ani, Cliente_id_cli) 
VALUES ("11", "Negresco", "Salsicha", "Pequeno", "03/04/2019", "3", "11");