package com.careerdevs;

import java.util.ArrayList;
import java.util.List;

public class PetShop {
//    This class will have 3 properties to start. String petshopName, List<Pet> availablePets, List<Pet> soldPets.
//    We’ll need to create a constructor for this Petshop class, but it’ll be a bit different than a traditional constructor.
//    Our constructor will pass in a petshopName ONLY as a constructor parameter. Inside, we’ll initialize both of our ArrayLists as empty.
//    Create getters and setters by hand.
//    Add a buyPet() method and a returnPet() method. Hint: you may have to go back to the Pet class and give it a petId property that will be a unique identifier.

   public String petShopName;
   public List<Pet> availablePets;
   public List<Pet> soldPets;

    public PetShop(String petShopName) {
        this.petShopName = petShopName;
        this.availablePets = new ArrayList<>();
        this.soldPets = new ArrayList<>();
    }

    public String getPetShopName() {
        return petShopName;
    }

    public List<Pet> getAvailablePets() {
        return availablePets;
    }

    public List<Pet> getSoldPets() {
        return soldPets;
    }

    public void setPetShopName(String petShopName) {
        this.petShopName = petShopName;
    }

    public void setAvailablePets(List<Pet> availablePets) {
        this.availablePets = availablePets;
    }

    public void setSoldPets(List<Pet> soldPets) {
        this.soldPets = soldPets;
    }


    public void buyPet(String id) {

        if (availablePets.size() == 0 ) {
            System.out.println("Invalid option selected. No pets available.");
        }

        for (int i = 0; i < availablePets.size(); i++) {
            if(id.equals(availablePets.get(i).getIdTag())) {
                System.out.println("Congratulations you have selected " + availablePets.get(i));
                soldPets.add(availablePets.get(i));
                availablePets.remove(availablePets.get(i));
                break;
            }
        }
    }

    public void returnPet(String id) {

        if (soldPets.size() == 0) {
            System.out.println("Invalid option selected. No pets available");
        }

        for (int i = 0; i < soldPets.size(); i++) {
            if (id.equals(soldPets.get(i).getIdTag())) {
                System.out.println("Thank you, you have returned " + soldPets.get(i));
                availablePets.add(soldPets.get(i));
                soldPets.remove(soldPets.get(i));
                break;
            }
        }
    }
}
