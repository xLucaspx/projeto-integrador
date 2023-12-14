package controller;

import dao.FornecedorDao;
import models.Fornecedor;

public class FornecedorController {

    private final FornecedorDao dao;

    public FornecedorController(FornecedorDao dao) {
        this.dao = dao;
    }
    
    public void cadastra(Fornecedor fornecedor) {
        dao.cadastra(fornecedor);        
    }
    
}
