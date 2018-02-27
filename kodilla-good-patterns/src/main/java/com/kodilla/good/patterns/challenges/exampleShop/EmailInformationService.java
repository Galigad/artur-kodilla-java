package com.kodilla.good.patterns.challenges.exampleShop;

public class EmailInformationService implements InformationService {
    @Override
    public void inform(User user) {
        String userName = user.getName();
        String email = user.getEmail();
        System.out.println("Użytkownik: " + userName + "\n");
        System.out.println("Twoje zamówienie jest w toku! \n");
    }
}
