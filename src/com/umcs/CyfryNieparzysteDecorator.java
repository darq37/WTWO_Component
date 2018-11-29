package com.umcs;

public class CyfryNieparzysteDecorator extends DekoratorNagrody{
    public CyfryNieparzysteDecorator(Nagroda nagroda) {
        super(nagroda);
    }

    @Override
    public double obliczNagrode(Customer customer) {
        return super.obliczNagrode() + nagrodaJesliCyfryNieparzyste(customer);
    }

    private double nagrodaJesliCyfryNieparzyste(Customer customer) {
        Long pesel = customer.getPesel();
        if (allDigitsUneven(pesel)) {
            return 50;
        }
        return 0;
    }

    private boolean allDigitsUneven(Long pesel) {
        Long temp = pesel;
        while (temp > 0) {
            long digit = pesel % 10;
            if (digit % 2 == 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }

}
