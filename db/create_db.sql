CREATE SCHEMA projeto_integrador;
USE projeto_integrador;

CREATE TABLE fornecedor (
	cnpj VARCHAR(14) PRIMARY KEY,
	nome VARCHAR(75) NOT NULL,
	email VARCHAR(45) NOT NULL,
	telefone VARCHAR(20) NOT NULL,
	cep VARCHAR(9) NOT NULL,
	endereco VARCHAR(45) NOT NULL,
	numero VARCHAR(10),
	complemento VARCHAR(45),
	bairro VARCHAR(45) NOT NULL,
	cidade VARCHAR(45) NOT NULL,
	uf VARCHAR(2) NOT NULL,
  ativo BOOLEAN NOT NULL DEFAULT TRUE
);

CREATE TABLE produto (
	codigo VARCHAR(50) PRIMARY KEY,
	descricao VARCHAR(50) NOT NULL,
	preco_custo DECIMAL(7, 2) DEFAULT 0,
	preco_venda DECIMAL(7, 2) DEFAULT 0,
	formato ENUM("Unidade", "Kilograma", "Litro") NOT NULL,
	estoque DECIMAL(7, 3) DEFAULT 0,
	ativo BOOLEAN NOT NULL DEFAULT TRUE
);

CREATE TABLE nota_compra (
	numero VARCHAR(9) PRIMARY KEY,
	data_compra DATE NOT NULL,
	fornecedor VARCHAR(14) NOT NULL,
	CONSTRAINT FK_fornecedor_compra FOREIGN KEY (fornecedor)
		REFERENCES fornecedor (cnpj)
);

CREATE TABLE item_nota_compra (
	numero_nota VARCHAR(9) NOT NULL,
	codigo_produto VARCHAR(50) NOT NULL,
	quantidade INT NOT NULL,
	preco DECIMAL(7, 2) NOT NULL,
	PRIMARY KEY (numero_nota , codigo_produto),
	KEY codigo_produto (codigo_produto),
	CONSTRAINT FK_numero_nota_compra FOREIGN KEY (numero_nota)
		REFERENCES nota_compra (numero) ON DELETE CASCADE,
	CONSTRAINT FK_codigo_produto_compra FOREIGN KEY (codigo_produto)
		REFERENCES produto (codigo)
);

CREATE TABLE nota_venda (
	numero INT PRIMARY KEY AUTO_INCREMENT,
	data_venda VARCHAR(10) NOT NULL
);

CREATE TABLE item_nota_venda (
	numero_nota INT NOT NULL,
	codigo_produto VARCHAR(50) NOT NULL,
	quantidade INT NOT NULL,
	preco DECIMAL(7, 2),
	PRIMARY KEY (numero_nota , codigo_produto),
	KEY codigo_Produto (codigo_produto),
	CONSTRAINT FK_numero_nota_venda FOREIGN KEY (numero_nota)
		REFERENCES nota_venda (numero) ON DELETE CASCADE,
	CONSTRAINT FK_codigo_produto_venda FOREIGN KEY (codigo_produto)
		REFERENCES produto (codigo)
);
