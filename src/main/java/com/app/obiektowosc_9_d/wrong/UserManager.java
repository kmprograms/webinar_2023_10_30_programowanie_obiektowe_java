package com.app.obiektowosc_9_d.wrong;

import com.app.obiektowosc_9_d.wrong.impl.UserRepositoryHibernate;

public class UserManager {
    private final UserRepositoryHibernate userRepository;

    public UserManager(UserRepositoryHibernate userRepository) {
        this.userRepository = userRepository;
    }

    public void save(User user) {
        userRepository.save(user);
    }
}
