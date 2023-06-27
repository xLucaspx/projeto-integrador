USE projeto_integrador;

SELECT
	n.numero AS `Número`,
    data_compra AS `Data`,
	razao_social AS `Fornecedor`,
    descricao AS `Produto`,
    i.quantidade AS `Quantidade`,
    CONCAT("R$ ", FORMAT(preco, 2)) AS `Preço un.`,
    CONCAT("R$ ", FORMAT((i.quantidade * preco), 2)) AS `Total`
FROM nota_compra n
		INNER JOIN
	item_nota_compra i ON n.numero = i.numero_nota
		INNER JOIN
	fornecedor f ON n.fornecedor = f.cnpj
		INNER JOIN
	produto p ON i.codigo_produto = p.codigo
ORDER BY n.numero;
    
SELECT
	n.numero AS `Número`,
    data_venda AS `Data`,
    descricao AS `Produto`,
    i.quantidade AS `Quantidade`,
    CONCAT("R$ ", FORMAT(preco, 2)) AS `Preço un.`,
    CONCAT("R$ ", FORMAT((i.quantidade * preco), 2)) AS `Total`
FROM nota_venda n
		INNER JOIN
	item_nota_compra i ON n.numero = i.numero_nota
		INNER JOIN
	produto p ON i.codigo_produto = p.codigo
ORDER BY n.numero;
