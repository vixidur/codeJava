-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 03, 2024 lúc 07:05 AM
-- Phiên bản máy phục vụ: 10.4.32-MariaDB
-- Phiên bản PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qlmaytinh`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tt_maytinh`
--

CREATE TABLE `tt_maytinh` (
  `mamay` int(11) NOT NULL,
  `tenmay` varchar(1000) DEFAULT NULL,
  `hedieuhanh` varchar(30) DEFAULT NULL,
  `hangsx` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `tt_maytinh`
--

INSERT INTO `tt_maytinh` (`mamay`, `tenmay`, `hedieuhanh`, `hangsx`) VALUES
(7, 'Trần Văn Chiên', 'Trần Văn Chiên', 'Trần Văn Chiên'),
(8, 'Dell XPS 9226', 'Windows 11', 'Dell'),
(9, 'Macbook Air M3', 'MacOS', 'Macbook'),
(444, 'Asus Tuf Gaming', 'Windows 11', 'Asus'),
(4450, 'DEll Inspiron 7447', 'Windows 10', 'Dell'),
(44530, 'Acer Nitro V', 'Windows 11', 'Acer'),
(44549, 'Dell XPS Workstation', 'Linux', 'Dell'),
(44560909, 'HP Elitebook', 'Windows 10', 'HP'),
(2147483647, 'ThinkPad X1 Nano 2K ', 'Windows 11', 'Thankpad');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `tt_maytinh`
--
ALTER TABLE `tt_maytinh`
  ADD PRIMARY KEY (`mamay`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
