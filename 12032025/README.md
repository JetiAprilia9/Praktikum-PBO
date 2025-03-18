# <h1 align="center">Clinic Management System</h1>
<p align="center">Jeti Aprilia</p>
<p align="center">2311110059</p>


## Penjelasan mengenai proyek Clinic Management System

#### Proyek ini adalah implementasi dalam Java untuk sistem manajemen rumah sakit sederhana. Program mencakup pengelolaan dokter, pasien, serta sistem penjadwalan janji temu (appointment).

## Struktur Proyek

### 1. Kelas Doctor

Kelas ini merepresentasikan seorang dokter dalam sistem rumah sakit. Setiap dokter memiliki:
id (String): Identifikasi unik untuk dokter.
name (String): Nama dokter.
specialty (String): Spesialisasi dokter.

Metode:
Constructor: Menerima id, name, dan specialty untuk menginisialisasi objek dokter.
Getter dan Setter: Memungkinkan pengambilan dan perubahan nilai atribut dokter.
```printDoctorInfo()```: Menampilkan informasi dokter ke konsol.

### 2. Kelas Patient

Kelas ini merepresentasikan seorang pasien yang berobat ke rumah sakit. Setiap pasien memiliki:
id (String): Identifikasi unik pasien.
name (String): Nama pasien.
age (int): Umur pasien.

Metode:
Constructor: Menerima id, name, dan age untuk menginisialisasi objek pasien.
Getter dan Setter: Memungkinkan pengambilan dan perubahan nilai atribut pasien.
```printPatientInfo()```: Menampilkan informasi pasien ke konsol.

### 3. Kelas Appointment

Kelas ini merepresentasikan janji temu antara dokter dan pasien. Atributnya meliputi:
doctor (Doctor): Objek dokter yang menangani janji temu.
patient (Patient): Objek pasien yang akan diperiksa.
date (String): Tanggal janji temu.

Metode:
Constructor: Menerima objek doctor, patient, dan date untuk menginisialisasi janji temu.
```printAppointmentInfo()```: Menampilkan informasi janji temu ke konsol.

### 4. Kelas Main

Kelas ini berfungsi sebagai titik masuk utama program dan berisi:
Pembuatan beberapa objek Doctor dan Patient.
Simulasi pembuatan janji temu (Appointment).
Pemanggilan metode ```print...Info()``` untuk menampilkan informasi.

### Kesimpulan
Proyek ini mengimplementasikan prinsip Pemrograman Berorientasi Objek (PBO) untuk sistem manajemen rumah sakit sederhana. Dengan adanya kelas Doctor, Patient, dan Appointment, sistem ini dapat mengelola informasi dokter, pasien, serta jadwal konsultasi dengan lebih terstruktur dan aman. Selain itu, kode yang menggunakan package memungkinkan pengembangan lebih lanjut sesuai kebutuhan, tinggal dipanggil saja. Program ini dapat digunakan sebagai dasar dalam membangun sistem informasi kesehatan yang lebih kompleks.
