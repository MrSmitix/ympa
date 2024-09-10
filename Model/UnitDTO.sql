--
-- Партнерский API Маркета.
-- Prepared SQL queries for 'UnitDTO' definition.
--


--
-- SELECT template for table `UnitDTO`
--
SELECT `id`, `name`, `fullName` FROM `UnitDTO` WHERE 1;

--
-- INSERT template for table `UnitDTO`
--
INSERT INTO `UnitDTO`(`id`, `name`, `fullName`) VALUES (?, ?, ?);

--
-- UPDATE template for table `UnitDTO`
--
UPDATE `UnitDTO` SET `id` = ?, `name` = ?, `fullName` = ? WHERE 1;

--
-- DELETE template for table `UnitDTO`
--
DELETE FROM `UnitDTO` WHERE 0;

