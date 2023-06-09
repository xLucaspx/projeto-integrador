CREATE DATABASE IF NOT EXISTS projeto_integrador;
USE projeto_integrador;

CREATE TABLE fornecedor (
    cnpj VARCHAR(14) PRIMARY KEY,
    razao_social VARCHAR(45) NOT NULL,
    nome_fantasia VARCHAR(45) NOT NULL,
    email VARCHAR(45) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    cep VARCHAR(8) NOT NULL,
    endereco VARCHAR(45) NOT NULL,
    numero SMALLINT NOT NULL,
    complemento VARCHAR(45),
    bairro VARCHAR(45) NOT NULL,
    cidade VARCHAR(45) NOT NULL,
    uf VARCHAR(2) NOT NULL
);

CREATE TABLE produto (
    codigo VARCHAR(50) PRIMARY KEY,
    descricao VARCHAR(50) NOT NULL,
    preco_custo DECIMAL(7 , 2 ) NOT NULL,
    preco_venda DECIMAL(7 , 2 ) NOT NULL,
    formato VARCHAR(3) NOT NULL,
    quantidade INT NOT NULL,
    imposto DECIMAL(4 , 2 ) NOT NULL
);

CREATE TABLE nota_compra (
    numero VARCHAR(9) PRIMARY KEY,
    data_compra VARCHAR(10) NOT NULL,
    fornecedor VARCHAR(14) NOT NULL,
    CONSTRAINT FK_fornecedor_compra FOREIGN KEY (fornecedor)
        REFERENCES fornecedor (cnpj)
);

CREATE TABLE item_nota_compra (
    numero_nota VARCHAR(9) NOT NULL,
    codigo_produto VARCHAR(50) NOT NULL,
    quantidade INT NOT NULL,
    preco DECIMAL(7 , 2 ) NOT NULL,
    imposto DECIMAL(4 , 2 ) NOT NULL,
    PRIMARY KEY (numero_nota , codigo_produto),
    KEY codigo_produto (codigo_produto),
    CONSTRAINT FK_numero_nota_compra FOREIGN KEY (numero_nota)
        REFERENCES nota_compra (numero),
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
    preco DECIMAL(7 , 2 ),
    PRIMARY KEY (numero_nota , codigo_produto),
    KEY codigo_Produto (codigo_produto),
    CONSTRAINT FK_numero_nota_venda FOREIGN KEY (numero_nota)
        REFERENCES nota_venda (numero),
    CONSTRAINT FK_codigo_produto_venda FOREIGN KEY (codigo_produto)
        REFERENCES produto (codigo)
);
