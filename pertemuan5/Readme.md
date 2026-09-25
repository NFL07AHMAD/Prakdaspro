# JOBSHEET 5 - SELECTION

**Identitas Mahasiswa:**
* **Nama:** Ahmad Naufal Febriansyah
* **NIM:** 264107020071
* **Kelas / No. Presensi:** TI-1D / 03

---
## 1: TUJUAN PRAKTIKUM

1. Mahasiswa mampu menyelesaikan permasalahan/studi kasus menggunakan sintaks
pemilihan sederhana
2. Mahasiswa mampu menerapkan sintaks pemilihan sederhana ke dalam program Java

---
## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Penerapan IF dan IF-ELSE untuk Mencetak KRS

#### 2.1.1 Kode Program Java

[SelectionIfAttendance03.java](experiment1/SelectionIfAttendance03.java) 

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi

**Pertanyaan 1:** Nilai apa yang harus dimasukkan agar kedua baris di dalam blok IF ikut tercetak? Jelaskan mengapa hanya nilai tersebut yang diterima!
**Jawab:** Nilai yang harus dimasukkan adalah nilai `true`

**Pertanyaan 2:** Jalankan program, lalu masukkan false. Baris mana saja yang tercetak dan baris mana yang tidak? Jelaskan alur eksekusinya ketika kondisi IF bernilai false!
**Jawab:** Tidak ada yang tercetak

**Pertanyaan 3:** Jalankan program, lalu masukkan TRUE (huruf kapital) dan ya. Apa yang terjadi pada masing-masing input? Jika program berhenti dengan error, jelaskan penyebabnya!
**Jawab:** Program akan menjalankan statement pada kondisi true

---

### 2.2 Percobaan 2: SWITCH-CASE untuk Mencetak KRS

#### 2.2.1 Kode Program Java

[SelectionIfElseAttendance03.java](experiment2/SelectionIfAttendance03.java) 

#### 2.2.2 Jawaban Pertanyaan / Pertanyaan Refleksi

**Pertanyaan 1:** Hapus perintah break; pada case 5, lalu compile dan jalankan kembali program dengan masukan 5. Tuliskan keluaran yang muncul, lalu jelaskan apa fungsi break pada struktur SWITCH-CASE berdasarkan hasil percobaan Anda! Kembalikan kode seperti semula setelah selesai.
**Jawab:** Case 6 akan ikut dijalankan

**Pertanyaan 2:** Jalankan program dengan masukan 10, lalu dengan masukan 0. Apa keluaran yang muncul pada kedua percobaan tersebut? Berdasarkan hasil itu, jelaskan peran default dan apa yang akan terjadi pada program jika bagian default dihapus!
**Jawab:** Ganti tipe data variabel semester menjadi double, lalu compile programnya. Apakah
program berhasil dicompile? Tuliskan pesan error yang muncul dan jelaskan
penyebabnya. Sebutkan tipe data apa saja yang boleh digunakan sebagai ekspresi pada
switch!

## Experiment 2 
1. Case 6 akan ikut dijalankan
2. Program akan menjalankan statement di blok default
3. Akan muncul error karena switch hanya dapat berfungsi untuk tipe data diskrit
