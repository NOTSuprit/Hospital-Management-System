package com.project.sb.hospitalManagement.repository;

import com.project.sb.hospitalManagement.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByPatient_IdOrderByAppointmentTimeDesc(Long patientId);
}