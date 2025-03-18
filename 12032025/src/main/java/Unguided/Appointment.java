/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

import Unguided.Doctor;
import Unguided.Patient;

/**
 *
 * @author DELL
 */
public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private String date;

    public Appointment(Doctor doctor, Patient patient, String date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    // Getter
    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getDate() {
        return date;
    }

    // Setter
    public void setDate(String date) {
        this.date = date;
    }

    // Method tambahan: Cetak info janji temu
    public void printAppointmentInfo() {
        System.out.println("Appointment Date: " + date);
        System.out.println("Doctor: " + doctor.getName() + " (Specialty: " + doctor.getSpecialty() + ")");
        System.out.println("Patient: " + patient.getName() + " (Age: " + patient.getAge() + ")");
    }
}
