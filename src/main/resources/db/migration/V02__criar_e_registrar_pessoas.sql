CREATE TABLE pessoa(
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	ativo TINYINT(1) NOT NULL,
	logradouro VARCHAR(100),
	numero VARCHAR(100),
	complemento VARCHAR(100),
	bairro VARCHAR(100),
	cep VARCHAR(100),
	cidade VARCHAR(100),
	estado VARCHAR(100)

)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa(nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) values("Gustavo Alves", 1, "Rua Valentim Savioli", "29","Casa",  "Jardim Paraventi", "07121-273", "Guarulhos", "São Paulo");
INSERT INTO pessoa(nome, ativo, logradouro, complemento, bairro, cep, cidade, estado) values("Thayna", 1, "Viela Hermonina","Casa", "Vila Galvão", "07121-273", "Guarulhos", "São Paulo");