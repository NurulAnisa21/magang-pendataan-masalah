-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 11 Sep 2019 pada 04.38
-- Versi Server: 10.1.9-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `beacukai`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `data`
--

CREATE TABLE `data` (
  `kd_data` varchar(60) NOT NULL,
  `divisi` varchar(11) NOT NULL,
  `notadinas` varchar(50) NOT NULL,
  `tanggal` date NOT NULL,
  `aplikasi` varchar(255) NOT NULL,
  `pemanfaatan` varchar(255) NOT NULL,
  `jeniskegiatan` varchar(255) NOT NULL,
  `kendala` varchar(255) NOT NULL,
  `penanganan` varchar(255) NOT NULL,
  `keterangan` varchar(255) NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `data`
--

INSERT INTO `data` (`kd_data`, `divisi`, `notadinas`, `tanggal`, `aplikasi`, `pemanfaatan`, `jeniskegiatan`, `kendala`, `penanganan`, `keterangan`, `status`) VALUES
('ID-000001', 'PDADD', 'notadinas123456789', '2019-09-10', 'CEISA Pembendaharaan', 'pemanfaatan', 'jenis kegiatan', 'kendala', 'penanganan', 'keterangan', 'Proses'),
('ID-000002', 'PDADD', 'notadinas 1234354646', '2019-09-10', 'CEISA Pembendaharaan', 'test', 'test', 'test', 'test', 'test', 'Proses'),
('ID-000003', 'PDAD', 'notadinas343535', '2019-09-10', 'CEISA Pembendaharaan', 'test', 'test', 'test', 'test', 'test', 'Proses'),
('ID-000004', 'PDADD', 'input123', '2019-09-10', 'CEISA Pembendaharaan', 'a', 'a', 'adasdad', 'a', 'a', 'pending'),
('ID-000005', 'PDADD', '234143fddfg', '2019-09-10', 'CEISA TPB', 'fdg', 'sfdg', 'sfg', 'dsg', 'sfgsdfg', 'Proses');

-- --------------------------------------------------------

--
-- Struktur dari tabel `profile`
--

CREATE TABLE `profile` (
  `no` int(11) NOT NULL,
  `id_log` varchar(50) NOT NULL,
  `divisi` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `profile`
--

INSERT INTO `profile` (`no`, `id_log`, `divisi`) VALUES
(1, 'BC-01', 'PDAD'),
(2, 'BC-02', 'PDADD');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user_log`
--

CREATE TABLE `user_log` (
  `no` int(11) NOT NULL,
  `id_log` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `level` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `user_log`
--

INSERT INTO `user_log` (`no`, `id_log`, `password`, `level`) VALUES
(1, 'BC-01', 'admin', 'admin'),
(2, 'BC-02', 'pegawai', 'pegawai');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data`
--
ALTER TABLE `data`
  ADD PRIMARY KEY (`kd_data`);

--
-- Indexes for table `profile`
--
ALTER TABLE `profile`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `user_log`
--
ALTER TABLE `user_log`
  ADD PRIMARY KEY (`no`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `profile`
--
ALTER TABLE `profile`
  MODIFY `no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `user_log`
--
ALTER TABLE `user_log`
  MODIFY `no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
