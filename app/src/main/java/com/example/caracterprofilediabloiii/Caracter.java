package com.example.caracterprofilediabloiii;

public class Caracter {
    int pimgclass;
    String classe;
    String force;
    String dexterity;
    String intelligence;
    String vitality;
    String damage;
    String recovery;

    public Caracter(int pimgclasse, String classe, String force, String dexterity, String intelligence, String vitality, String damage, String recovery) {
        this.pimgclass = pimgclasse;
        this.classe = classe;
        this.force = force;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.vitality = vitality;
        this.damage = damage;
        this.recovery = recovery;
    }

    public int getPimgclass() {
        return pimgclass;
    }

    public void setPimgclass(int pimgclass) {
        this.pimgclass = pimgclass;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getForce() {
        return force;
    }

    public void setForce(String force) {
        this.force = force;
    }

    public String getDexterity() {
        return dexterity;
    }

    public void setDexterity(String dexterity) {
        this.dexterity = dexterity;
    }

    public String getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(String intelligence) {
        this.intelligence = intelligence;
    }

    public String getVitality() {
        return vitality;
    }

    public void setVitality(String vitality) {
        this.vitality = vitality;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getRecovery() {
        return recovery;
    }

    public void setRecovery(String recovery) {
        this.recovery = recovery;
    }

    @Override
    public String toString() {
        return this.pimgclass + " \n " + this.classe + " \n " + this.force + " \n " + this.dexterity + " \n " + this.intelligence + " \n " + this.vitality + " \n " + this.damage + " \n " + this.recovery;
    }

}