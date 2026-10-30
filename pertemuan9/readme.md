# JOBSHEET - PERULANGAN 1

**Identitas Mahasiswa:**
* **Nama:** Ahmad Naufal Febriansyah
* **NIM:** 264107020071
* **Kelas / No. Presensi:** TI-1D / 03

---

## 1: TUJUAN PRAKTIKUM
1. Mahasiswa dapat menjelaskan format penulisan program perulangan (for, while, dan do-while)
2. Mahasiswa dapat mengimplementasikan flowchart perulangan menggunakan bahasa pemrograman Java

## 2: PRAKTIKUM

### 2.1 Percobaan 1: Studi Kasus Nilai Mahasiswa di SIAKAD – Perulangan FOR

#### 2.1.1 Kode program

[SiakadFor03](SiakadFor03.java) 

#### 2.1.2 Hasil Running

![experiment1](rec/exp1.gif) 

#### 2.1.3 Pertanyaan

##### Soal

1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program
Percobaan 1!
2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang
terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?
3. Jelaskan fungsi dan alur kerja dari potongan kode berikut!
    ```java
    if (nilai > tertinggi) {
      tertinggi = nilai;
    }
    if (nilai < terendah) {
      terendah = nilai;
    }
    ```
4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa
mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60).
Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi
dan terendah

##### Jawaban

2. Karena nilai tersebut akan dibandikan dengan nilai awal sehingga nilai awal akan dibandingkan akan dibandingkan lagi dengan nilai selanjutnya
3. Saat nilai pertama dimasukkan, maka nilai tersebut akan dibandingkan dengan nilai awal tertinggi dan terendah, jika nilai tersebut > 0 dan < 100 maka nilai tersebut akan dimasukkan ke variabel terendah dan tertinggi yang akan dibandingkan pada loop selanjutnya
4. 

### 2.2 Percobaan 2: Studi Kasus Nilai Mahasiswa di SIAKAD – Perulangan WHILE

#### 2.2.1 Kode program

[SiakadWhile03](SiakadWhile03.java)

#### 2.2.2 Hasil Running

![experiment2](rec/exp2.gif) 

#### 2.2.3 Pertanyaan

##### Soal

1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:
    ```java
    if (nilai < 0 || nilai > 100) {
      System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!")
      continue;
    }
    ```
    1. nilai < 0 || nilai > 100
    2. continue
2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya
dituliskan di awal perulangan WHILE?
3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE
akan berjalan?
4. Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A,
program menampilkan pesan tambahan "Bagus, pertahankan nilainya"

##### Jawaban 

1. Kode tersebut berfungsi sebagai validator dari nilai yang akan dimasukkan yang mana nilai harus positif dan kurang dari 100, jika nilai tidak valid maka program akan meminta input lagi sampai nilai valid
2. Agar i bisa terupdate setelah semua output selesai, jika posisinya dirubah pada awal while maka output nilai mahasiswa tidak sesuai dengan loop ke i
3. Perulangan while akan berjalan 19 kali.
4. 

### 2.3 Percobaan 3: Studi Kasus Transaksi di Kafe – Perulangan DO-WHILE

#### 2.3.1 Kode program

[CafeDoWhile03](CafeDoWhile03.java) 

#### 2.3.2 Hasil Running

![experiment3](rec/exp3.gif) 

#### 2.3.3 Pertanyaan

##### Soal

1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali
adalah “batal”, maka berapa kali perulangan dilakukan?
2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!
3. Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE?
4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen
inisialisasi dan update?

##### Jawaban 

1. Maka program akan keluar dari do while
2. Kondisi berhenti hanya ada pada ketika user memasukkan cancel pada input nama
3. Fungsi dari penggunaan true pada kondisi teresebut adalah untuk do while terus berjalan sampai bertemu break
4. Karena kondisi agar do while tersebut berupa true sehingga do while terus berjalan

## 3. TUGAS MANDIRI

1. [CinemaTickets03](CinemaTickets03.java) 
2. [Parking03](Parking03.java) 
