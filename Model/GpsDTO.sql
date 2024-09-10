--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'GpsDTO' definition.
--


--
-- SELECT template for table `GpsDTO`
--
SELECT `latitude`, `longitude` FROM `GpsDTO` WHERE 1;

--
-- INSERT template for table `GpsDTO`
--
INSERT INTO `GpsDTO`(`latitude`, `longitude`) VALUES (?, ?);

--
-- UPDATE template for table `GpsDTO`
--
UPDATE `GpsDTO` SET `latitude` = ?, `longitude` = ? WHERE 1;

--
-- DELETE template for table `GpsDTO`
--
DELETE FROM `GpsDTO` WHERE 0;

