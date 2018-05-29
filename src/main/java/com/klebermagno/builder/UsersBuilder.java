/**
 * 29/05/18
 *
 * @author Kleber Vieira e-mail: Klebermagno@gmail.com
 * github klebermagno
 */
package com.klebermagno.builder;

import com.klebermagno.model.User;

import java.util.Collection;

public abstract class UsersBuilder {

     Collection createUsers(Collection users) {
        User firstUser = new User("Carlos", 100);
        User secondUser = new User("Maria", 20);
        User thirdUser = new User("Jose", 20);

        users.add(firstUser);
        users.add(secondUser);
        users.add(thirdUser);

        return users;
    }
}
