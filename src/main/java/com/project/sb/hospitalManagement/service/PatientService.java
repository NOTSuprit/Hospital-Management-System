package com.project.sb.hospitalManagement.service;


import com.project.sb.hospitalManagement.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import com.project.sb.hospitalManagement.entity.Patient;

@Service
@NoArgsConstructor
public class PatientService {

    private PatientRepository patientRepository;


    @Transactional //by using this only once database will be called;
    public Patient getPatientById(Long id){
        Patient p1=  patientRepository.findById(id).orElseThrow();
        Patient p2 =patientRepository.findById(id).orElseThrow();
        System.out.println(p1==p2);
        return p1;
    }
}
