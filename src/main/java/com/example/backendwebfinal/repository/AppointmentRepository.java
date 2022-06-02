package com.example.backendwebfinal.repository;

import com.example.backendwebfinal.entity.Appointment;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepository extends CrudRepository<Appointment, Integer> {
}
