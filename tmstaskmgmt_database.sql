-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.0.17-nt - MySQL Community Edition (GPL)
-- Server OS:                    Win32
-- HeidiSQL Version:             9.5.0.5303
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for tmstaskmgmt
DROP DATABASE IF EXISTS `tmstaskmgmt`;
CREATE DATABASE IF NOT EXISTS `tmstaskmgmt` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `tmstaskmgmt`;

-- Dumping structure for table tmstaskmgmt.access_details
DROP TABLE IF EXISTS `access_details`;
CREATE TABLE IF NOT EXISTS `access_details` (
  `id` bigint(20) NOT NULL auto_increment,
  `access_code` varchar(50) default NULL,
  `access_description` varchar(1000) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table tmstaskmgmt.task_details
DROP TABLE IF EXISTS `task_details`;
CREATE TABLE IF NOT EXISTS `task_details` (
  `id` bigint(20) NOT NULL auto_increment,
  `task_id` varchar(50) default NULL,
  `task_name` varchar(1000) default NULL,
  `taskType` varchar(50) default NULL,
  `task_priority` varchar(50) default NULL,
  `expected_start_date` date default NULL,
  `expected_start_time` varchar(50) default NULL,
  `expected_start_meridies` varchar(50) default NULL,
  `expected_end_date` date default NULL,
  `expected_end_time` varchar(50) default NULL,
  `expected_end_meridies` varchar(50) default NULL,
  `description` varchar(10000) default NULL,
  `status` varchar(50) default NULL,
  `assign_to_user_id` varchar(50) default NULL,
  `assign_start_date` date default NULL,
  `assign_end_date` date default NULL,
  `created_date` date default NULL,
  `updated_date` date default NULL,
  PRIMARY KEY  (`id`),
  KEY `assign_to_user_id` (`assign_to_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table tmstaskmgmt.user_access
DROP TABLE IF EXISTS `user_access`;
CREATE TABLE IF NOT EXISTS `user_access` (
  `id` bigint(20) NOT NULL auto_increment,
  `user_id` varchar(50) NOT NULL,
  `user_access_codes` varchar(500) NOT NULL,
  `last_access_date` date NOT NULL,
  PRIMARY KEY  (`id`),
  KEY `user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table tmstaskmgmt.user_connections
DROP TABLE IF EXISTS `user_connections`;
CREATE TABLE IF NOT EXISTS `user_connections` (
  `id` bigint(20) NOT NULL auto_increment,
  `user_id` varchar(50) default NULL,
  `followers` varchar(5000) default NULL,
  `followers_count` bigint(20) default '0',
  `connections` varchar(5000) default '0',
  `connections_count` bigint(20) default '0',
  `visitors` varchar(5000) default '0',
  `visitors_count` bigint(20) default '0',
  `following` varchar(5000) default '0',
  `following_count` bigint(20) default '0',
  `isFollow` varchar(50) default '0',
  `isConnect` varchar(50) default '0',
  PRIMARY KEY  (`id`),
  KEY `user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table tmstaskmgmt.user_details
DROP TABLE IF EXISTS `user_details`;
CREATE TABLE IF NOT EXISTS `user_details` (
  `id` bigint(20) NOT NULL auto_increment,
  `user_id` varchar(50) NOT NULL default '0',
  `user_first_name` varchar(50) NOT NULL default '0',
  `user_middle_name` varchar(50) default '0',
  `user_last_name` varchar(50) NOT NULL default '0',
  `user_designation` varchar(50) default '0',
  `date_of_birth` date default NULL,
  `gender` varchar(50) default '0',
  `email` varchar(50) NOT NULL default '0',
  `phone` varchar(50) default '0',
  `mobile` varchar(50) default '0',
  `company_name` varchar(256) default '0',
  `country` varchar(256) default '0',
  `city` varchar(256) default '0',
  `pin_code` varchar(50) default '0',
  `isActive` varchar(50) default '0',
  `username` varchar(50) default '0',
  `password` varchar(50) default '0',
  `profile_pic` longblob,
  `about_me` varchar(1000) default '0',
  `created_date` date default NULL,
  `updated_date` date default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
