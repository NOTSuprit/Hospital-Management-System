package com.project.sb.hospitalManagement.controller;

import com.project.sb.hospitalManagement.dto.AppointmentResponseDto;
import com.project.sb.hospitalManagement.dto.CreateAppointmentRequestDto;
import com.project.sb.hospitalManagement.dto.PatientResponseDto;
import com.project.sb.hospitalManagement.service.AppointmentService;
import com.project.sb.hospitalManagement.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.context.SecurityContextHolder;
import com.project.sb.hospitalManagement.entity.User;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientController {

    private final PatientService patientService;
    private final AppointmentService appointmentService;

    @PostMapping("/appointments")
    public ResponseEntity<AppointmentResponseDto> createNewAppointment(@RequestBody CreateAppointmentRequestDto createAppointmentRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(appointmentService.createNewAppointment(createAppointmentRequestDto));
    }

    @GetMapping("/profile")
    public ResponseEntity<PatientResponseDto> getPatientProfile() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return ResponseEntity.ok(patientService.getPatientById(user.getId()));
    }

    @GetMapping("/appointments")
    public ResponseEntity<java.util.List<AppointmentResponseDto>> getMyAppointments() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return ResponseEntity.ok(appointmentService.getAllAppointmentsOfPatient(user.getId()));
    }

}
