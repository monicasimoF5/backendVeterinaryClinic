package com.example.veterinary_clinic.repositories;

import com.example.veterinary_clinic.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository  extends JpaRepository<Patient, Long> {

}
