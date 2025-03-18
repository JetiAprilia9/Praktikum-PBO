/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

/**
 *
 * @author DELL
 */
public class Patient {
    private String id;
    private String name;
    private int age;
    private static int diagnosisCount = 0; // Counter diagnosis

    public Patient(String id, String name, int age) {
        this.id = id;
        this.name = name;
        setAge(age); // Validasi usia
    }

    // Getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int getDiagnosisCount() {
        return diagnosisCount;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
            this.age = age;
        }

    // Cetak info pasien
    public void printPatientInfo() {
        System.out.println("Patient ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Metode untuk menambah diagnosis 
    public void diagnose() {
        diagnosisCount++;
        System.out.println(name + " telah didiagnosis. Total diagnosis: " + diagnosisCount);
    }
}
