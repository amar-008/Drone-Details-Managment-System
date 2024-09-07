-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 10, 2022 at 10:58 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dronedb`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(10) NOT NULL,
  `password` varchar(8) NOT NULL,
  `nameofuser` varchar(20) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `ContactNo` bigint(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`, `nameofuser`, `Email`, `ContactNo`) VALUES
('anna', '@nn@3838', 'annamalai', 'annamalaimurugan21@gmail.com', 9345422737),
('arjun', 'ARAM3838', 'annamalai', 'annamalaimurugan21@gmail.com', 9345422737);

-- --------------------------------------------------------

--
-- Table structure for table `drone`
--

CREATE TABLE `drone` (
  `Name` varchar(15) NOT NULL,
  `Model` varchar(10) NOT NULL,
  `Usage` varchar(50) NOT NULL,
  `Wingspan` varchar(30) NOT NULL,
  `Length` varchar(30) NOT NULL,
  `Weight` varchar(30) NOT NULL,
  `Flightcontrol` varchar(50) NOT NULL,
  `Level` varchar(6) NOT NULL,
  `Altitude` varchar(30) NOT NULL,
  `Cruisespeed` varchar(20) NOT NULL,
  `Dashspeed` varchar(20) NOT NULL,
  `Payloadoptions` varchar(50) NOT NULL,
  `Prototype` varchar(50) NOT NULL,
  `Endurance` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `drone`
--

INSERT INTO `drone` (`Name`, `Model`, `Usage`, `Wingspan`, `Length`, `Weight`, `Flightcontrol`, `Level`, `Altitude`, `Cruisespeed`, `Dashspeed`, `Payloadoptions`, `Prototype`, `Endurance`) VALUES
('a', 'a', '', '', '', '', '', '', '', '', '', '', '', ''),
('x', 'x', 'x', 'x', 'x', 'x', 'x', 'Easy', 'x', 'x', 'x', 'x', 'x', 'x'),
('Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Easy', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y'),
('Warrigal', 'UAV2021', 'Marine mapping', '1500 mm', '1200 mm', '5 kg with payload', 'fully autonomous ', 'Medium', '200 ft-1500 ft', '30 knots', '90 knots', 'coloured/high gesture panel', 'Under development 76hrs ', '60-90 min'),
('Great khali', 'UAV2022', 'Environmental mapping', '1690 mm', '1250 mm', '6 kg with payload', 'fully autonomous', 'Hard', '250-1200 ft', '35 knots', '92 knots', 'infrared hi-res imaging', 'Under work of 70 days ', '60-90 minutes');

-- --------------------------------------------------------

--
-- Table structure for table `pilot`
--

CREATE TABLE `pilot` (
  `FirstName` varchar(10) NOT NULL,
  `LastName` varchar(10) NOT NULL,
  `FatherName` varchar(15) NOT NULL,
  `AadharNumber` bigint(12) NOT NULL,
  `DateOfBirth` varchar(10) NOT NULL,
  `ContactNo` bigint(10) NOT NULL,
  `Address` varchar(40) NOT NULL,
  `Gender` varchar(6) NOT NULL,
  `EmailAddress` varchar(30) NOT NULL,
  `Designation` varchar(15) NOT NULL,
  `Salary` int(7) NOT NULL,
  `PilotID` int(6) NOT NULL,
  `AcademicQualification` varchar(20) NOT NULL,
  `Experience` int(2) NOT NULL,
  `DateOfJoinning` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pilot`
--

INSERT INTO `pilot` (`FirstName`, `LastName`, `FatherName`, `AadharNumber`, `DateOfBirth`, `ContactNo`, `Address`, `Gender`, `EmailAddress`, `Designation`, `Salary`, `PilotID`, `AcademicQualification`, `Experience`, `DateOfJoinning`) VALUES
('anna', 'malai', 'murugan', 321654987321, '21.09.2003', 3216549872, 'asdfghjkl;', 'Male', 'anna@gmail.com', 'vbnmlk', 12365, 2001, 'B.E(cse)', 2, '2.09.2026');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `Username` varchar(20) NOT NULL,
  `User_Password` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`Username`, `User_Password`) VALUES
('anna', '@nn@3838'),
('arjun', 'ARAM3838');

-- --------------------------------------------------------

--
-- Table structure for table `workers`
--

CREATE TABLE `workers` (
  `FirstName` varchar(10) NOT NULL,
  `LastName` varchar(10) NOT NULL,
  `FatherName` varchar(15) NOT NULL,
  `Aadhar` bigint(12) NOT NULL,
  `DateOfBirth` varchar(10) NOT NULL,
  `ContactNo` bigint(10) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Gender` varchar(6) NOT NULL,
  `EmailAddress` varchar(40) NOT NULL,
  `Designation` varchar(15) NOT NULL,
  `Salary` int(7) NOT NULL,
  `StaffID` varchar(6) NOT NULL,
  `AcademicQualification` varchar(20) NOT NULL,
  `Experience` int(2) NOT NULL,
  `DateOfJoinning` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `workers`
--

INSERT INTO `workers` (`FirstName`, `LastName`, `FatherName`, `Aadhar`, `DateOfBirth`, `ContactNo`, `Address`, `Gender`, `EmailAddress`, `Designation`, `Salary`, `StaffID`, `AcademicQualification`, `Experience`, `DateOfJoinning`) VALUES
('annamalai', 'karthick', 'murugan', 123456789123, '21/.9/2003', 1236549872, '19,pookara street,MNM', 'Male', 'anna@gmail.com', 'System analyst', 30000, '2001', 'B.E(CSE)', 5, '21/09/2021');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
