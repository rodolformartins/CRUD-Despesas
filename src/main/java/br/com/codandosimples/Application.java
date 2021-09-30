package br.com.codandosimples;

import br.com.codandosimples.dao.DespesaDAO;
import br.com.codandosimples.model.Categoria;
import br.com.codandosimples.model.Despesa;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        DespesaDAO dao = new DespesaDAO();

        Despesa despesa = new Despesa();

        despesa.setDescricao("Viagem com Uber");
        despesa.setCategoria(Categoria.TRANSPORTE);
        despesa.setValor(30);
        despesa.setData(LocalDate.of(2021, 5, 15));

        Despesa despesaInserida = dao.save(despesa);
        System.out.println("Foi inserida a despesa com id: " + despesa.getId());
    }
}
