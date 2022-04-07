package com.careerdevs;

public class Pet {

    public String species;
    public int numberOfLegs;
    public boolean isLandAnimal;
    public String idTag;

    public Pet(String species, int numberOfLegs, boolean isLandAnimal, String idTag) {
        this.species = species;
        this.numberOfLegs = numberOfLegs;
        this.isLandAnimal = isLandAnimal;
        this.idTag = idTag;
    }

    public String getSpecies() {
        return species;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public boolean isLandAnimal() {
        return isLandAnimal;
    }

    public String getIdTag() { return idTag; }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void setLandAnimal(boolean isLandAnimal) {
        this.isLandAnimal = isLandAnimal;
    }

    public void setIdTag(String idTag) { this.idTag = idTag; }

    @Override
    public String toString() {
        return "Pet{ " + "Species: " + species + ", " + "Number of Legs: " + numberOfLegs + ", " + "Is this pet a land animal: " + isLandAnimal + "idTag " + idTag;
    }
}
