package br.com.codandosimples.dao;

import br.com.codandosimples.model.Categoria;
import br.com.codandosimples.model.Despesa;

import java.util.List;
import java.util.Optional;

public class DespesaDAO implements IDespesaDAO {

    @Override
    public Despesa save(Despesa despesa) {

        return null;
    }

    @Override
    public Despesa update(Despesa despesa) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<Despesa> findAll() {
        return null;
    }

    @Override
    public Optional<Despesa> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Despesa> findByCategoria(Categoria categoria) {
        return null;
    }
}
