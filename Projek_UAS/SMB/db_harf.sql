-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 24, 2024 at 05:27 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_harf`
--

-- --------------------------------------------------------

--
-- Table structure for table `jenis _jahitan`
--

CREATE TABLE `jenis _jahitan` (
  `KD Jenis` int(20) NOT NULL,
  `Jenis Jahitan` varchar(50) NOT NULL,
  `Harga` int(50) NOT NULL,
  `Pengerjaan` varchar(50) NOT NULL,
  `Keterangan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `pelanngan`
--

CREATE TABLE `pelanngan` (
  `KD Jenis` int(20) NOT NULL,
  `Jenis Jahitan` varchar(50) NOT NULL,
  `Harga` int(50) NOT NULL,
  `Pengerjaan` varchar(50) NOT NULL,
  `Keterangan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `penerimaan`
--

CREATE TABLE `penerimaan` (
  `ID Oder` int(11) NOT NULL,
  `ID Pelanggan` int(11) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Masuk` varchar(50) NOT NULL,
  `Keluar` varchar(50) NOT NULL,
  `Total` int(50) NOT NULL,
  `Pembayaran` int(50) NOT NULL,
  `Jenis Jahitan` varchar(50) NOT NULL,
  `Pengerjaan` varchar(50) NOT NULL,
  `Harga` int(50) NOT NULL,
  `Keterangan` text NOT NULL,
  `Status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `pengguna`
--

CREATE TABLE `pengguna` (
  `ID Pengguna` int(20) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` int(20) NOT NULL,
  `Hak akses` varchar(20) NOT NULL,
  `Keterangan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `pesan_pelanggan`
--

CREATE TABLE `pesan_pelanggan` (
  `No` int(11) NOT NULL,
  `Permintaan Jahitan` int(11) NOT NULL,
  `Harga` int(11) NOT NULL,
  `Pengerjaan` int(11) NOT NULL,
  `Keterangan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `transaksi_belum`
--

CREATE TABLE `transaksi_belum` (
  `Tanggal transaksi` int(20) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Jenis Jahitan` varchar(50) NOT NULL,
  `Total Harga` int(50) NOT NULL,
  `Keterangan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `transaksi_sudah`
--

CREATE TABLE `transaksi_sudah` (
  `Tanggal transaksi` int(30) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Jenis Jahitan` varchar(50) NOT NULL,
  `Total Harga` int(50) NOT NULL,
  `Keterangan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
