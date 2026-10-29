# JOBSHEET - PERULANGAN 1

**Identitas Mahasiswa:**
* **Nama:** Ahmad Naufal Febriansyah
* **NIM:** 264107020071
* **Kelas / No. Presensi:** TI-1D / 03

---

## 1: TUJUAN PRAKTIKUM

1. Memahami konsep perulangan bersarang pada algoritma
2. memahami alur perulangan bersarang
3. mengenal sintaks perulangan bersarang
4. mampu menerapkan perulangan bersarang untuk menyelesaikan studi kasus
sederhana.

## 2. hasil percobaan & analisis

### 2.1 percobaan 1: review perulangan 1

#### 2.1.1 kode program

#### 2.1.2 hasil running

#### 2.1.3 pertanyaan
##### Soal:
1. jika inisialisasi i = 1 diubah menjadi i = 0 tanpa mengubah kondisi, berapa karakter *
yang tercetak ketika n = 5? jelaskan.
2. jika kondisi i <= n diganti menjadi i < n, berapa kali perulangan dijalankan saat n = 5?
mengajavpa hasilnya berbeda?
3. prediksi output potongan kode berikut ketika n = 9, kemudian buktikan dengan mengganti perulangan FOR pada program Anda dan menjalankannya.
      ```java
      for (int i = 2; i <= n; i += 2) {
        system.out.print(i + " ");
      }
      ```
    modifikasi kode tersebut agar mencetak bilangan ganjil positif yang tidak melebihi n.
4. Jelaskan mengapa perubahan increment i++ menjadi i-- (dengan kondisi tetap i <= n)
membuat perulangan berjalan terus-menerus dan tidak berhenti dalam waktu wajar
untuk n positif. Jangan menjalankan versi tersebut; jika terlanjur berjalan, hentikan
program dengan menekan Ctrl + C pada terminal.
##### Jawab:


### 2.2 Percobaan 2: Pola Bintang Persegi Panjang (Nested FOR)

#### 2.2.1 Kode Program

#### 2.2.2 Hasil Running

#### 2.2.3 Pertanyaan

##### Soal
1. Tentukan fungsi variabel `i` dan `j` pada program tersebut.
2. Berapa kali outer loop, inner loop, dan perintah `print("*")` dijalankan untuk baris = 4
dan kolom = 7?
3. Apa yang terjadi jika batas perulangan luar dan dalam ditukar (outer menggunakan
kolom, inner menggunakan baris)? Gunakan baris = 3 dan kolom = 6 untuk menjelaskan.
4. Jelaskan akibat penghapusan  `System.out.println();` setelah inner loop.
5. Modifikasi program agar karakter yang dicetak adalah `#`, lalu commit dan push perubahan
ke GitHub.

### 2.3 Percobaan 3: Debugging Bintang Segitiga – Nested WHILE

#### 2.3.1 Kode Program

#### 2.3.2 Hasil Running

#### 2.3.3 Pertanyaan

##### Soal

1. Sebutkan ketidaksesuaian output awal dan minimal dua perbaikan yang diperlukan untuk
menghasilkan pola segitiga bertingkat.
2. Jelaskan peran variabel i dan j. Mengapa nilai j harus diinisialisasi kembali ke 0 pada
setiap iterasi outer loop? Apa yang terjadi jika j tidak di-reset?
3. Jelaskan perubahan inisialisasi, kondisi, dan perubahan nilai (update) pada outer loop
yang diperlukan untuk membentuk segitiga terbalik.

### 2.4 Percobaan 4: Studi Kasus Nilai Tugas Proyek Kelompok

#### 2.4.1 Kode Program

#### 2.4.2 Hasil Running

#### 2.4.3 Pertanyaan

##### Soal

1. Mengapa totalNilai perlu di-reset di dalam outer loop, tetapi rataTertinggi tidak
boleh di-reset pada setiap kelompok?
2. Untuk 3 kelompok dan 2 penilai (tanpa input yang salah), berapa kali badan perulangan
FOR dijalankan secara keseluruhan?
3. Apa yang terjadi jika totalNilai dideklarasikan sebagai int dan rata-rata dihitung
menggunakan pembagian dua bilangan bulat? Berikan contoh nilai.
4. Mengapa rataTertinggi diberi nilai awal -1, bukan 0? Berikan contoh input yang
membuat hasil salah apabila nilai awalnya 0.
5. Program ini memiliki tiga tingkat perulangan. Sebutkan masing-masing jenis perulangan
beserta perannya.

## 3: TUGAS
