--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'AgeDTO' definition.
--


--
-- SELECT template for table `AgeDTO`
--
SELECT `value`, `ageUnit` FROM `AgeDTO` WHERE 1;

--
-- INSERT template for table `AgeDTO`
--
INSERT INTO `AgeDTO`(`value`, `ageUnit`) VALUES (?, ?);

--
-- UPDATE template for table `AgeDTO`
--
UPDATE `AgeDTO` SET `value` = ?, `ageUnit` = ? WHERE 1;

--
-- DELETE template for table `AgeDTO`
--
DELETE FROM `AgeDTO` WHERE 0;

