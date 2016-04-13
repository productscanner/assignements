drop table if exists comics;
CREATE TABLE `comics` (
  `comicId` int(11) unsigned NOT NULL,
  `comic_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`comicId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
 
 drop table if exists characterDetails;
CREATE TABLE `characterDetails` (
  `comicId` int(11) unsigned NOT NULL,
  `character_name` varchar(20) DEFAULT NULL,
  `character_power` varchar(5) DEFAULT NULL,
  `character_city` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`comicId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

