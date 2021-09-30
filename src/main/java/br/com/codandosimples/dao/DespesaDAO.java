package br.com.codandosimples.dao;

//importando outras classes
import br.com.codandosimples.infra.ConnectionFactory;
import br.com.codandosimples.model.Categoria;
import br.com.codandosimples.model.Despesa;

//Importando as bibliotecas
import java.sql.*;
import java.util.List;
import java.util.Optional;


//Criando a classe de acesso ao banco de dados DAO: Data Access Object
//Recebe a interface IDespesaDAO para implementar os métodos: save, update, delete, listar, buscar por id, buscar por categoria.

public class DespesaDAO implements IDespesaDAO {

    @Override
    public Despesa save(Despesa despesa) {
        try (Connection connection = ConnectionFactory.getConnection()) {
            String sql = "INSERT INTO Despesa (descricao, valor, data, categoria) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, despesa.getDescricao());
            preparedStatement.setDouble(2, despesa.getValor());
            preparedStatement.setDate(3, java.sql.Date.valueOf(despesa.getData()));
            preparedStatement.setString(4, despesa.getCategoria().toString());

            preparedStatement.executeUpdate();

            ResultSet resultset = preparedStatement.getGeneratedKeys();
            resultset.next();

            Long generatedId = resultset.getLong("id");
            despesa.setId(generatedId);

        } catch (SQLException ex) {
           throw new RuntimeException(ex);
        }
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
