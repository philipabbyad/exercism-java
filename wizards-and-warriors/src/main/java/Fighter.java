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
        int damagePointsDealt = wizard.isVulnerable() ? 10 : 6;
        return damagePointsDealt;
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
        int damagePointsDealt = isSpellPrepared ? 12 : 3;
        return damagePointsDealt;
    }

    void prepareSpell() {
        isSpellPrepared = true;
    }

}