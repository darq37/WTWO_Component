package com.umcs;

public class BirthdayPrizeDecorator extends DekoratorNagrody {
    public BirthdayPrizeDecorator(Nagroda nagroda) {
        super(nagroda);
    }

    @Override
    public double obliczNagrode(Customer customer) {
        return super.obliczNagrode() + prizeIfBirthday(customer);
    }

    private double prizeIfBirthday(Customer customer) {
        Long pesel = customer.getPesel();
        if (hasBirthday(pesel)) {
            return 100;
        }
        return 0;
    }

    private boolean hasBirthday(Long pesel) {
        return true;
    }
}
