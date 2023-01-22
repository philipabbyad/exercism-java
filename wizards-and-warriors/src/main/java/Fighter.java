abstract class Fighter {

    @Override
    public String toString() {
        return String.format("Fighter is a %s", this.getClass().getName());
    }

    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    int damagePoints(Fighter wizard) {
        throw new UnsupportedOperationException("Please implement Warrior.damagePoints() method");
    }
}

class Wizard extends Fighter {

    boolean isSpellPrepared = false;

    @Override
    boolean isVulnerable() {
        return !isSpellPrepared;
    }

    @Override
    int damagePoints(Fighter warrior) {
        throw new UnsupportedOperationException("Please implement Wizard.damagePoints() method");
    }

    void prepareSpell() {
        isSpellPrepared = true;
    }

}
