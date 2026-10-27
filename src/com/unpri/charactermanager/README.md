## TP5 — Character Manager Sprint #2

### A. Implementasi Core

Fitur yang telah dibuat:
- `equals()` membandingkan nama karakter tanpa membedakan huruf besar dan kecil.
- `addCharacter()` menolak nama duplikat.
- `findByName()` mencari karakter berdasarkan nama.
- `removeCharacter()` menghapus karakter.
- `getTotalCharacters()` menghitung karakter tersimpan.
- `getAllCharacters()` mengembalikan salinan daftar (*defensive copy*).

### B. Mini-Challenge

- `getAverageLevel()` menghitung rata-rata level dan mengembalikan `0.0` jika daftar kosong.
- `findByType()` mencari semua karakter berdasarkan tipe.
- Kedua method diuji di `Main.java`.

### C. Fitur Analitik Mandiri: `findStrongest()`

Method `findStrongest()` mencari karakter dengan level tertinggi menggunakan perulangan. Jika daftar kosong, method mengembalikan `null`.

Method ini tidak mengekspos `ArrayList` internal. Javadoc ditambahkan untuk menjelaskan fungsi method. Kompleksitas waktunya adalah **O(n)**.

### D. Analisis Reference dan Rancangan

Dokumen Google Docs:

[Analisis Java Visual TP5 — Mutiara Fitri Salbilla Harahap](https://docs.google.com/document/d/1o4Im_KTtBT_OWK9e1uAWJdorHlE3pxxnPVVwNMmw6es/edit?usp=sharing)

### Bukti Pengujian

Lampirkan screenshot terminal yang menunjukkan:

1. CRUD dan penolakan nama duplikat.
2. Eksperimen defensive copy.
3. Rata-rata level dan pencarian berdasarkan tipe.
4. Hasil `findStrongest()`.
5. Eksperimen reference dan pengujian daftar kosong.
