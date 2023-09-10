package br.com.lucasbdourado.userapi.service;

import br.com.lucasbdourado.userapi.dao.IUserDAO;
import br.com.lucasbdourado.userapi.dao.UserDAO;
import br.com.lucasbdourado.userapi.domain.User;

import java.sql.SQLException;
import java.util.List;

public class UserService implements IUserService {

    private final IUserDAO userDAO;

    public UserService() {
        this.userDAO = new UserDAO();
    }

    /**
     * @return 
     * @throws SQLException
     */
    @Override
    public List<User> getAll() throws SQLException {
        try {
            return userDAO.getAll();
        } catch (SQLException e){
            throw e;
        }
    }
}
