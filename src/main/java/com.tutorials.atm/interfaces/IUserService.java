package com.tutorials.atm.interfaces;

import com.tutorials.atm.models.User;

public interface IUserService {
    public void applyCard(User user);
    public void insertCard(User user);
}
