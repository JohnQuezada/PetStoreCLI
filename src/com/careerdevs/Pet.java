package com.careerdevs;

public class Pet {

    public String species;
    public int numberOfLegs;
    public boolean isLandAnimal;

    public Pet(String species, int numberOfLegs, boolean isLandAnimal) {
        this.species = species;
        this.numberOfLegs = numberOfLegs;
        this.isLandAnimal = isLandAnimal;
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

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void setLandAnimal(boolean isLandAnimal) {
        this.isLandAnimal = isLandAnimal;
    }

    @Override
    public String toString() {
        return "Pet{ " + "Species: " + species + ", " + "Number of Legs: " + numberOfLegs + ", " + "Is this pet a land animal: " + isLandAnimal;
    }
}
