package br.com.lucasbdourado.userapi.dao;

import br.com.lucasbdourado.userapi.domain.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements IUserDAO {

    /**
     * @return 
     * @throws SQLException
     */
    @Override
    public List<User> getAll() throws SQLException {
        List<User> userList = new ArrayList<>();

        userList.add(new User(1L, "Lucas", "lucasdourado@teste.com", "123456"));
        userList.add(new User(2L, "Lucas", "lucasdourado@teste.com", "123456"));
        userList.add(new User(3L, "Lucas", "lucasdourado@teste.com", "123456"));
        userList.add(new User(4L, "Lucas", "lucasdourado@teste.com", "123456"));
        userList.add(new User(5L, "Lucas", "lucasdourado@teste.com", "123456"));

        return userList;
    }
}
