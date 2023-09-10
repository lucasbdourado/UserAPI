package br.com.lucasbdourado.userapi.dao;

import br.com.lucasbdourado.userapi.domain.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {

    List<User> getAll() throws SQLException;
}
