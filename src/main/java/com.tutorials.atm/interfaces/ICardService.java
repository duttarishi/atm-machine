package com.tutorials.atm.interfaces;

import com.tutorials.atm.models.Card;
import com.tutorials.atm.models.User;

public interface ICardService {
    public void generateCard(User user);
    public void changePin(Card card);
    public void cardValidation(Card card);
}
