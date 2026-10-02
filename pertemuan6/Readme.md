# JOBSHEET 6 - PEMILIHAN 2

**Identitas Mahasiswa:**
* **Nama:** Ahmad Naufal Febriansyah
* **NIM:** 264107020071

---
## 1: TUJUAN PRAKTIKUM

1. Mahasiswa mampu menyelesaikan permasalahan/studi kasus menggunakan sintaks pemilihan bersarang
2. Mahasiswa mampu menerapkan sintaks pemilihan bersarang ke dalam program Jawa
3. Mahasiswa mampu menerapkan operator logika &&, ||, dan ! pada struktur pemilihan

---
## 1: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Nested IF untuk Mengecek Syarat Ujian Skripsi

#### 2.1.1 Kode Program Java

[NestedThesisExam03.java](experiment1/NestedThesisExam03.java) 

#### 2.1.2 Hasil Running

![experiment1](rec/experiment1.svg) 

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi

* **Pertanyaan 1:** Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen? Mengapa demikian?
    * **Jawab:** Kode akan menjalankan statement di blok ELSE karena pada kondisi IF mengecek apakah `noPenalty` memiliki nilai `yes` sehingga ketika memasukkan nilai `no` akan menjalankan kode di blok ELSE

* **Pertanyaan 2:** Jelaskan maksud dari potongan kode berikut!  `if (guidanceCount1 >= 8 && guidanceCount2 >= 4) {`{:.java}
    * **Jawab:** Kode tersebut adalah kondisi dalam IF yang mengecek apakah variable guidanceCount1 lebih dari sama dengan 8 **dan* guidanceCount lebih dari sama dengan 4. Karena dalam kondisi tersebut terdapat operator &&, maka kedua kondisi variable harus bernilai `true` agar bisa menghasilkan `true`

* **Pertanyaan 3:** Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara runtut untuk semua kondisi!
    * **Jawab:** 
        1. Alur yang pertama adalah mengecek apakah variable `noPenalty` memiliki nilai `yes`. Jika variable `noPenalty` tidak bernilai `yes` maka kode akan menjalankan statement `message = "Failed! The student still has an outstanding penalty";`. Jika variable `noPenalty` bernilai `yes` maka program akan masuk ke nested IF-ELSE. 
        2. Alur kedua adalah mengecek apakah variable `guidanceCount1` bernilai lebih dari sama dengan 8 dan variable `guidanceCount2` bernilai lebih dari sama dengan 4 yang mana jika kondisi tersebut menghasilkan `true` maka akan menjalankan statement `message = "All requirements met. The student may register for the thesis exam;`.
        3. Jika kondisi tersebut tidak bernilai true maka program akan mengecek kondisi pada ELSE-IF yaitu mengecek apakah variable `guidanceCount1` bernilai kurang dari 8 dan `guidanceCount2` bernilai kurang dari 4. Jika kondisi tersebut bernilai true maka akan menjalankan statement `message = "Failed! Guidance sessions with Supervisor 1 are below 8 and Supervisor 2 are below 4";`.
        4. Jika kondisi tersebut tidak bernilai true maka program akan mengecek kondisi pada ELSE-IF berikutnya yaitu mengecek apakah variable `guidanceCount1` kurang dari 8. Jika kondisi tersebut bernilai true maka akan menjalankan statement `message = "Failed! Guidance sessions with Supervisor 1 have not reached 8";`{:.java}.
        5. Jika kondisi tersebut tidak bernilai true maka akan menjalan statement pada blok ELSE yaitu `message = "Failed! Guidance sessions with Supervisor 2 have not reached 4";`{:.java} 

### 2.2 Percobaan 2: Operator Logika untuk Menentukan Akses WiFi Kampus

#### 2.2.1 Kode Program Java



#### 2.2.2 Hasil Running



#### 2.2.3 Jawaban Pertanyaan / Pertanyaan Refleksi

* **Pertanyaan 1:**  Jelaskan fungsi operator ||, &&, dan ! pada kondisi program tersebut.
    * **Jawab:** Operator || berfungsi sebagai operator dengan rule OR yaitu minimal satu kondisi bernilai true untuk menghasilkan nilai true. Operator && berfungsi sebagai operator dengan rule AND yang kondisinya harus bernilai true semua agar menghasilkan nilai true. Operator ! berfungsi untuk menegasikan suatu kondisi

* **Pertanyaan 2:**  Mengapa pengguna dosen tetap dapat memperoleh akses ketika nilai mahasiswa = false?
    * **Jawab:** Karena dalam kondisi IF terdapat operator OR

* **Pertanyaan 3:**  Ubah operator || menjadi &&. Jalankan kembali program menggunakan data uji 1 dan 2. Apa yang terjadi dan mengapa?
    * **Jawab:** Pada data uji 1 dan 2 program menampilkan Akses wifi ditolak karena operator && mengharuskan dua kondisi bernilai true agar menghasilkan nilai true

* **Pertanyaan 4:**  Pada ekspresi mahasiswa || dosen, kapan kondisi dosen tidak perlu dievaluasi? Jelaskan berdasarkan short-circuit evaluation.
    * **Jawab:** Saat variable mahasiswa bernilai true karena operator || menghasilkan nilai true jika salah satu kondisi bernilai true. Karena program tau jika dengan kondisi mahasiswa true akan menghasilkan nilai true maka program tidak akan mengevaluasi kondisi dosen

* **Pertanyaan 5:** Pada ekspresi (mahasiswa || dosen) && !akunDiblokir, kapan kondisi !akunDiblokir tidak perlu dievaluasi? Jelaskan.
    * **Jawab:** Saat kondisi (mahasiswa || dosen) bernilai false. Karena operator && mengharuskan dua kondisi bernilai true agar menghasilkan nilai true jadi !akunDiblokir tidak dievaluasi karena dengan kondisi (mahasiswa || dosen) bernilai false, keseluruhan kondisi akan bernilai false

### 2.3 Percobaan 3: Nested IF dan Operator Logika untuk Menentukan Akses Laboratorium

#### 2.3.1 Kode Program Java



#### 2.3.2 Hasil Running



#### 2.3.3 Jawaban Pertanyaan / Pertanyaan Refleksi

* **Pertanyaan 2:**  Jelaskan fungsi operator &&, ||, dan ! pada program tersebut.
    * **Jawab:** Operator || berfungsi sebagai operator dengan rule OR yaitu minimal satu kondisi bernilai true untuk menghasilkan nilai true. Operator && berfungsi sebagai operator dengan rule AND yang kondisinya harus bernilai true semua agar menghasilkan nilai true. Operator ! berfungsi untuk menegasikan suatu kondisi

* **Pertanyaan 3:** Apakah syarat akses dapat ditulis menjadi satu kondisi: mahasiswaAktif && !sedangDisanksi && (punyaIzinDosen || asistenLab)? Jelaskan apakah keputusan akses akhirnya sama.
    * **Jawab:** Bisa, output yang dihasilkan juga sama karena nested IF sama dengan operator &&

* **Pertanyaan 4:**  Apa keuntungan menggunakan Nested IF pada kasus ini dibandingkan hanya satu IF jika sistem perlu menampilkan alasan penolakan yang berbeda?
    * **Jawab:** Keuntungan dari nested IF adalah memungkinkan menangani salah satu kondisi yang bernilai false

* **Pertanyaan 5:** Buat satu kombinasi masukan yang menyebabkan akses ditolak pada level pertama dan satu kombinasi yang menyebabkan akses ditolak pada level kedua.
    * **Jawab:** 

## 3: TUGAS MANDIRI

### 3.1 Implementasi Kode Tugas
