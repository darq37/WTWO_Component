package com.umcs;

public abstract class DekoratorNagrody implements Nagroda {

    private Nagroda nagroda;

    public DekoratorNagrody() {
    }

    public DekoratorNagrody(Nagroda nagroda) {
        this.nagroda = nagroda;
    }

    public double obliczNagrode() {
        return nagroda.obliczNagrode();
    }
}
