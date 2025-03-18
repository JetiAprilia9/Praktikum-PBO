package Unguided;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import Unguided.Doctor;
import Unguided.Patient;
import Unguided.Appointment;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dokter dan pasien
        Doctor doc1 = new Doctor("d045", "Dr. Jeti", "Dermatology");
        Doctor doc2 = new Doctor("d38", "Dr. Irvan", "Psychiatry");
        Patient pat1 = new Patient("P001", "Budi", 25);
        Patient pat2 = new Patient ("P099", "Ica", 67);
        Patient pat3 = new Patient ("007", "Gebi", 44);

        // Membuat janji temu
        Appointment appointment1 = new Appointment(doc1, pat1, "17 Maret 2025");
        Appointment appointment2 = new Appointment(doc1, pat2, "8 Februari 2026");
        Appointment appointment3 = new Appointment(doc2, pat3, "7 April 2025");

        // Cetak informasi
        doc1.printDoctorInfo();
        doc2.printDoctorInfo();
        pat1.printPatientInfo();
        pat2.printPatientInfo();
        pat3.printPatientInfo();
        appointment1.printAppointmentInfo();
        appointment2.printAppointmentInfo();
        appointment3.printAppointmentInfo();
        
        // Diagnosa pasien
        pat1.diagnose();
        pat2.diagnose();
        pat3.diagnose();
    }
}

