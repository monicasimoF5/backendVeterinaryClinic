package com.example.veterinary_clinic.services;


import com.example.veterinary_clinic.dtos.PetRequest;
import com.example.veterinary_clinic.entities.Pet;
import com.example.veterinary_clinic.repositories.PetRepository;

public class PetServices {
    private final PetRepository petRepository;

    public PetServices(PetRepository petRepository){
        this.petRepository = petRepository;
    }

    /*public Pet createPet(PetRequest petRequest){

    } */
}
