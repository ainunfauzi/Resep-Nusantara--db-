-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 24 Jun 2020 pada 15.21
-- Versi server: 10.1.36-MariaDB
-- Versi PHP: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `resep`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `masakan`
--

CREATE TABLE `masakan` (
  `id` int(11) NOT NULL,
  `Nama` varchar(20) NOT NULL,
  `pendahuluan` varchar(500) NOT NULL,
  `Resep` varchar(500) NOT NULL,
  `Cara` varchar(500) NOT NULL,
  `foto` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `masakan`
--

INSERT INTO `masakan` (`id`, `Nama`, `pendahuluan`, `Resep`, `Cara`, `foto`) VALUES
(1, 'Ayam Bakar Kecap', '\"Tips untuk memasak ayam bakar yang enak adalah bara api dari arang jangan terlalu besar, agar ayam dapat matang merata dan kulit tidak gosong.\"\r\n\r\n    \"Jangan lupa oleskan sedikit mentega pada saat ayam dibakar agartidak lengket. Selain itu mentega juga dapat membuat aroma lebih harum dan rasa Iebih gurih. Lebih baik dibakar sesaat sebelum disajikan.\"\r\n', 'Bahan Utama:\r\n\r\n    \"-1 ekor ayam, potong menjadi 4 bagian 2 sendok teh garam\"\r\n    \"-1 buah jeruk nipis. peras aimya\"\r\n    \"-250 ml kaldu ayam\"\r\n    \"-2 sdm mentega\"\r\n\r\n    \"Bumbu\"\r\n    \"-7 butir bawang merah\"\r\n    \"-4 siung bawang putih\"\r\n    \"-1/2 sdt ketumbar\"\r\n    \"-1/2 sdt pala bubuk\"\r\n    \"-1/2 sdt merica\"\r\n    \"-1 sdt garam\"\r\n    \"-2 sdm minyak goreng\"\r\n    \"-5 sendok makan kecap manis\"\r\n\r\n    \"Sambal:\"\r\n    \"-5 sendok makan kecap manis\"\r\n    \"-3 buah cabai rawit iris tipis\"\r\n    \"-1 bua', '\"Cara Membuat\"\r\n    \"1. Cuci dan bersihkan ayam, kemudian potong menjadi 4 bagian\"\r\n    \"2. Lumuri dengan perasan air jeruk nipis dan garam. Diamkan sekitar 15 menit\"\r\n    \"3. Haluskan bawang merah, bawang putih dan ketumbar\"\r\n    \"4. Panas minyak dan tumis bumbu halus hingga harum, kemudian tambahkan pala bubuk, merica dan garam.\"\r\n    \"5. Masukkan potongan ayam kemudian tuangkan kaldu ayam dan tambahkan kecap manis, aduk rata. Ungkep hingga ayam menjadi empuk dan masak hingga kaldu habis. Angk', 'ayambkrkcp.jpg'),
(2, 'Ayam Cabe Ijo', '\" Untuk penyajiannya, ayam cabe ijo bisa disajikan bersama nasi putih hangat clan lalapan mentimun.\"\r\n\r\n    \".Bisa juga disajikan seperti di rumah makan padang; sajikan bersama rebusan daun singkong muda. Pasti akan membuat acara santap siang ataupun santap malam di rumah anda terasa sangat istimewa.\"', '\"Bahan Utama:\\n\"\r\n    \"-1 ekor ayam broiler, cuci bersih, potong 8 bagian\\n\"\r\n    \"-1 sdm air jeruk nipis\\n\"\r\n    \"-2 sdt garam\\n\"\r\n    \"-2 sdm minyak goreng untuk menumis\\n\"\r\n    \"-2 lembar daun jeruk\\n\"\r\n    \"-2 buah serai, memarkan pangkalnya\\n\\n\"\r\n\r\n    \"Bumbu Halus\\n\"\r\n    \"-8 butir bawang merah\\n\"\r\n    \"-5 siung bawang putih\\n\"\r\n    \"-10 buah cabai hijau besar\\n\"\r\n    \"-5 buah cabe rawit hijau besar\\n\"\r\n    \"-3 cm jahe\\n\"\r\n    \"-2 cm kunyit\\n\"\r\n    \"-3 butir kemiri\\n\"\r\n    \"-1 sdt garam\\n\"', '\"Cara Membuat\\n\\n\"\r\n    \"1. Lumuri potongan ayam dengan airjeruk nipis dan garam, sisihkan, niarkan selama 15 menit.\\n\"\r\n    \"2. Goreng ayam dalam minyak banyak hingga kuning kecokelatan.\\n\"\r\n    \"3. Tumis seluruh bumbu halus hingga harum dan matang, masukkan daun jeruk dan serai. Kemudian masukkan ayam goreng. Aduk hingga bumbu cabai hijau merata.\\n\"\r\n    \"4. Sajikan hangat.\\n\" \r\n', 'ayamcbeijo.jpg'),
(3, 'Bebek Goreng Cabe Ij', '\" Untuk penyajian yang Iebih berwarna, jangan lupa tambahkan daun selada, tomat, potongan jeruk lemon atau timun. Bahan-bahan pelengkap ini bisa anda sesuaikan dengan selera dan kebutuhan. Selamat mencoba\"', '\"Bahan Utama:\\n\"\r\n    \"-1 ekor bebek, cuci bersih, potong 4 bagian\\n\"\r\n    \"-2 sdm air jeruk nipis\\n\"\r\n    \"-1 butir asam kandis\\n\"\r\n    \"-2 sdt garam\\n\"\r\n    \"-2 sdm minyak goreng \\n\"\r\n    \"-2 lembar daun jeruk\\n\"\r\n    \"-1 batang serai, memarkan\\n\"\r\n    \"-200 ml air\\n\"\r\n    \"-100 ml santan kental\\n\\n\"\r\n\r\n\r\n    \"Bumbu Halus\\n\"\r\n    \"-4 butir bawang merah\\n\"\r\n    \"-2 siung bawang putih\\n\"\r\n    \"-150 gr cabai hijau \\n\"\r\n    \"-5 buah cabe rawit hijau besar\\n\"\r\n    \"-2 cm jahe\\n\"\r\n    \"-2 cm kunyit\\', '\"Cara Membuat\\n\\n\"\r\n    \"1. Lumuri potongan ayam dengan air jeruk nipis, diamkan selama 30 menit.\\n\"\r\n    \"2. Panaskan minyak Goreng ayam, Tumis seluruh bumbu halus hingga harum, tambahkan serai, daun jeruk dan asam kandis, masak hingga bumbu matang.\\n\"\r\n    \"3. Masukkan daging bebek, masak hingga bebek setengah matang. Tuang air dan santan.\\n\"\r\n    \"4. Masak dengan api kecil hingga bebek matang dan kuah berminyak. Angkat.\\n\"\r\n', 'bbkcbeijo.jpg'),
(4, 'Bacem Bebek', '\" Bacem bebek bisa bertahan selama tiga harijika disimpan di dalam freezer. Anda bisa memanasinya ketika akan dihidangkan lagi. Saat menghidangkan jangan Iupa untuk memmisahkan daun salam, Iengkuas dan jahe agar tampilan lebih bersih dan rapi\"', '\"Bahan Utama:\\n\"\r\n    \"-1 ekor bebek, cuci bersih, potong 8 bagian\\n\"\r\n    \"-2 sdm air jeruk nipis\\n\"\r\n    \"-2 Iembar daun salam \\n\"\r\n    \"-1 500 ml air kelapa \\n\"\r\n    \"-2 batang serai, memarkan\\n\"\r\n    \"-50 ml air\\n\"\r\n    \"-100 ml santan kental\\n\\n\"\r\n\r\n\r\n    \"Bumbu Halus\\n\"\r\n    \"-5 butir bawang merah\\n\"\r\n    \"-6 siung bawang putih\\n\"\r\n    \"-2 sdt ketumbar\\n\"\r\n    \"-2 cm lengkuas\\n\"\r\n    \"-1 sdt garam\\n\"\r\n    \"-100 gr gula merah\\n\\n\"', '\"Cara Membuat\\n\\n\"\r\n    \"1. Rendam daging bebek dengan airjeruk nipis, dan garam.\\n\"\r\n    \"2. Masak daging bebek dengan air kelapa, bumbu halus, daun salam, lengkuas, serai, dan jahe sampai matang dan empuk.\\n\"\r\n    \"3. Goreng bebek sampai kecokelatan. Angkat dan sajikan.\\n\"', 'bbkbcm.jpg');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `masakan`
--
ALTER TABLE `masakan`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `masakan`
--
ALTER TABLE `masakan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
