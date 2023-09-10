package br.com.lucasbdourado.userapi.service;

import br.com.lucasbdourado.userapi.domain.User;
import java.util.List;

import java.sql.SQLException;

public interface IUserService {

    List<User> getAll() throws SQLException;

}
